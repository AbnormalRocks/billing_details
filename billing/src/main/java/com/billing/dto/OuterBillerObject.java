package com.billing.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OuterBillerObject {
	
	@JsonProperty("Biller")
	private List<Biller> biller;

	public List<Biller> getBiller() {
		return biller;
	}

	public void setBiller(List<Biller> biller) {
		this.biller = biller;
	}

	
	
}
