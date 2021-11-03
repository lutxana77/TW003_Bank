package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	//Atributos
	private String firstName;
	private String lastName;
	private static ArrayList<Account> accounts = new ArrayList<Account>() ;
	
	//Metodos
	public Customer(String firstName, String lastName, Account account) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		accounts.add(account);
	}
	
	public String  getFirstName() {
		return firstName;
	}
	public String  getLastName(){
		return lastName;
	}
	public Account getAccount(int index) {
		return accounts.get(index);
	}
	public void setAccount(Account a) {
		
		accounts.add(a);
	}
	public int getNumberAccounts() {
		return accounts.size();
	}
	public static List<Account> getListaCuentas(){
		return accounts;
	}

	@Override
	public String toString() {//para obtener los datos de un objeto
		return "Customer [firstName=" + firstName + ","
				+ " lastName=" + lastName + ","
				+ " account=" + accounts + "]";
	}
	
	

}
