package com.billing.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.billing.dto.Biller;
import com.billing.dto.OuterBillerObject;
import com.billing.dto.RestTemplateResponse;
import com.billing.service.BillingService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BillingServiceImpl implements BillingService{
	
	@Value("${billerUrl}")
	String billerUrl;

	public List<Biller> getBillingDetails(String inputString) throws Exception {
		List<Biller> outputBillerList = new ArrayList<Biller>();
	
		// calling external biller API
		RestTemplate restTemplate = new RestTemplate();
        Map map = new HashMap<String, Object>();
        ObjectMapper mapper = new ObjectMapper();
        HttpEntity<Object> postReq = new HttpEntity(map);
        ResponseEntity<Object> response = restTemplate.postForEntity(billerUrl, postReq, Object.class);
        String responseBody = mapper.writeValueAsString(response.getBody());
        RestTemplateResponse responseObject = mapper.readValue(responseBody, new TypeReference<RestTemplateResponse>(){});
        List<OuterBillerObject> resultObj = mapper.readValue(responseObject.getResultObj().toString(), new TypeReference<List<OuterBillerObject>>(){});
        
        // filter those billers whose name starts with given inputString
        for(OuterBillerObject outerBillerObject : resultObj) {
        	for(Biller biller : outerBillerObject.getBiller()) {
        		if(null!=biller.getBlrName()&&this.containsString(biller.getBlrName(), inputString)) {
        			
        			// add this biller to output list
        			outputBillerList.add(biller);
        		}
        	}
        }
        return outputBillerList;
	}

	
	// check biller name with input string
	private boolean containsString(String blrName, String inputString) {
		if(blrName==null||blrName.length()<inputString.length()) {
			return false;
		}
		String subString = blrName.substring(0, inputString.length());
		if(subString.equals(inputString)) {
			return true;
		}
		else {
			return false;
		}
	}

}
