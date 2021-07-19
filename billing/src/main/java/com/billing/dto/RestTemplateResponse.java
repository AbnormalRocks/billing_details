package com.billing.dto;

import java.util.List;

public class RestTemplateResponse {
	private String status;
	private String message;
	private List<String> resultObj;
	//private List<OuterBillerObject> resultObj;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getResultObj() {
		return resultObj;
	}
	public void setResultObj(List<String> resultObj) {
		this.resultObj = resultObj;
	}
	
	
	
}
