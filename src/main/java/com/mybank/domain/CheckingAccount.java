package com.mybank.domain;

public class CheckingAccount extends Account {

	double overdraftAmount;

	
	
	public CheckingAccount(double initBalance) {
		super(initBalance);
	}



	public CheckingAccount(double initBalance,double Amount) {
		super(initBalance);
		balance = initBalance;
		this.overdraftAmount= Amount;
	}
	
	@Override
	public boolean drawnwith(double amt) {
		if(overdraftAmount+balance >= amt) {
			balance -=amt;
			return true;
			}
		return false;

	}



	public double getOverdraftAmount() {
		return overdraftAmount;
	}



	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	

}
