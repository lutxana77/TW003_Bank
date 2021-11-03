package com.mybank.domain;

public class Account {
	
	//Atributos
	double balance;
	
	//Metodos
	public Account(double initBalance) {
		super();
		if(initBalance>0) {
			this.balance = initBalance;
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
	public boolean deposit(double amt) {
		if(amt>0) {return true;}
		return false;
	}
	public boolean drawnwith(double amt) {
		if(balance >= amt) {return true;}
		return false;

	}

}
