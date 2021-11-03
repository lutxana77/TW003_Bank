package com.mybank.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.Customer;

public class DataSource {
	
	//atributos
	File datafile;

	
	
	//constructor
	
	public DataSource(String datafilepath) {
		super();
		//valido si existe el archivo y si no existe , lo creo
		File fichero = new File(datafilepath);
		
		try {
			boolean esNuevo = fichero.createNewFile();
			if (esNuevo) {
				this.datafile = fichero;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	//metodos
	public void loadData() {
		
		//escribir los datos de los clientes y las cuentas  en un archivo de texto
		
										     //el true para no sobreescribir
			try(PrintWriter salida = new PrintWriter(new FileWriter(datafile,true));){
			
				salida.println(Bank.getListaClientes().size());
				
				for (Customer c : Bank.getListaClientes()) {	
					
					salida.println(c.getFirstName()+" "+c.getLastName()+" "+c.getNumberAccounts());
					
					for (Account cu : c.getListaCuentas()) {
						
						salida.println(cu);
					}
				}
			salida.flush();
			
			
			}catch(IOException e) {
				System.out.println("No pudo escribir el fichero"+e.getMessage());
			}
		
		
	}
}
