package com.example.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.model.Risk;

@Entity
public class UserCreditRisk implements Serializable {

	private static final long serialVersionUID = 425547257523137255L;
	
    @Column
    @Id
    private String clientName;
    
    @Column
	private Risk riskType;
    
    @Column
	private Double interestRate;
    
    @Column
    private Double creditLimit;

    public UserCreditRisk() { }
    public UserCreditRisk(String name, Risk riskType, Double creditLimit) {
    	
    	this.clientName = name;
    	this.riskType = riskType;
    	this.creditLimit = creditLimit;
    	
    	updateInterestRate();
    }
    
	private void updateInterestRate() {
		switch (riskType) {
		case A:
			interestRate = 0D;
			break;
		case B:
			interestRate = 10D;
			break;
		case C:
			interestRate = 20D;
			break;
		default:
			break;
		}
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
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

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
}
