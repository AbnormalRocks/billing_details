package com.billing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Biller {
	
	@JsonProperty("BlrName")
	private String blrName;
	@JsonProperty("AdhocPayment")
	private Integer adhocPayment;
	@JsonProperty("BillerDescription")
	private String billerDescription;
	@JsonProperty("BlrId")
	private String blrId;
	@JsonProperty("BillerValue")
	private String billerValue;
	@JsonProperty("SupportBillValidation")
	private String supportBillValidation;
	@JsonProperty("BlrCatName")
	private String blrCatName;
	@JsonProperty("BlrCatId")
	private Integer blrCatId;
	@JsonProperty("BillAcceptanceType")
	private Integer billAcceptanceType;
	@JsonProperty("PaymentAmtExactness")
	private String paymentAmtExactness;
	public String getBlrName() {
		return blrName;
	}
	public void setBlrName(String blrName) {
		this.blrName = blrName;
	}
	public Integer getAdhocPayment() {
		return adhocPayment;
	}
	public void setAdhocPayment(Integer adhocPayment) {
		this.adhocPayment = adhocPayment;
	}
	public String getBillerDescription() {
		return billerDescription;
	}
	public void setBillerDescription(String billerDescription) {
		this.billerDescription = billerDescription;
	}
	public String getBlrId() {
		return blrId;
	}
	public void setBlrId(String blrId) {
		this.blrId = blrId;
	}
	public String getBillerValue() {
		return billerValue;
	}
	public void setBillerValue(String billerValue) {
		this.billerValue = billerValue;
	}
	public String getSupportBillValidation() {
		return supportBillValidation;
	}
	public void setSupportBillValidation(String supportBillValidation) {
		this.supportBillValidation = supportBillValidation;
	}
	public String getBlrCatName() {
		return blrCatName;
	}
	public void setBlrCatName(String blrCatName) {
		this.blrCatName = blrCatName;
	}
	public Integer getBlrCatId() {
		return blrCatId;
	}
	public void setBlrCatId(Integer blrCatId) {
		this.blrCatId = blrCatId;
	}
	public Integer getBillAcceptanceType() {
		return billAcceptanceType;
	}
	public void setBillAcceptanceType(Integer billAcceptanceType) {
		this.billAcceptanceType = billAcceptanceType;
	}
	public String getPaymentAmtExactness() {
		return paymentAmtExactness;
	}
	public void setPaymentAmtExactness(String paymentAmtExactness) {
		this.paymentAmtExactness = paymentAmtExactness;
	}
	
	
}
