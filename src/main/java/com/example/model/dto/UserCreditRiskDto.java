package com.example.model.dto;

import com.example.model.Risk;

public class UserCreditRiskDto {

	private String clientName;
	private Double creditLimit;
	private Risk riskType;
	private Double interestRate;
	
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public Risk getRiskType() {
		return riskType;
	}
	public void setRiskType(Risk riskType) {
		this.riskType = riskType;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
}
