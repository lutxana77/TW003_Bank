package com.mybank.domain;

public class Pruebas {


	public static void main(String[] args) {
		Customer a = new Customer("mm","gg",new Account(0));
		System.out.println(a.toString());
	}

}
