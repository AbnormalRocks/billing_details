package com.billing.service;

import java.util.List;

import com.billing.dto.Biller;

public interface BillingService {

	List<Biller> getBillingDetails(String inputString) throws Exception;

}
