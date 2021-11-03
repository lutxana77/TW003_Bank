package com.mybank.domain;

public class SavingsAccount extends Account{
	
	double interestRate;

	public SavingsAccount(double initBalance,double interest) {
		super(initBalance);
		this.interestRate = interest;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
