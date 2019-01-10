package com.interest.demo.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import com.interest.demo.model.Risk;

public class UserCreditRiskDto {

	@NotNull
	private String clientName;
	@NotNull
	private Double creditLimit;
	@NotNull
	private Risk riskType;
	@Null
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
