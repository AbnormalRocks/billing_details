package com.billing.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.billing.dto.RestResponse.httpFail;
import static com.billing.dto.RestResponse.httpOk;
import com.billing.dto.Biller;
import com.billing.dto.RestResponse;
import com.billing.service.BillingService;

@RestController
@RequestMapping(value="/customer")
public class BillingController {
	
	private static Logger logger = LoggerFactory.getLogger(BillingController.class);
	
	@Autowired
	BillingService service;
	
	@RequestMapping(value="/details", method=RequestMethod.POST)
	public ResponseEntity<RestResponse> getBillingDetails(@RequestParam("billerName") String inputString){
		logger.info("/customer/details API called for input string = "+inputString);
		try {
			if(inputString==null||inputString.equalsIgnoreCase("")) {
				return httpFail("Please provide input");
			}
			List<Biller> outputBillerList = service.getBillingDetails(inputString);
			return httpOk(outputBillerList);
		}
		catch(Exception ex) {
			logger.error("Error = "+ex.getMessage());
			return httpFail(ex.getMessage());
		}
	}

}
