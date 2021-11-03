package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	//Atributos
	private static List<Customer> clientes;
	
	static {
		
		clientes = new ArrayList<Customer>();
	}
	
	
	//Constructor
	private Bank() {
		super();
		
	}
	
	//Metodos
	public static void addCliente(String nombre, String apellido) {		
		clientes.add(new Customer(nombre, apellido, new Account(0)));			
	}

	public int getNumClientes() {
		return clientes.size();
	}

	public static  Customer getCliente(int index) {
		return clientes.get(index);
	}	
	
	public static List<Customer> getListaClientes(){
		return clientes;
	}
		
	
	
}//final main
