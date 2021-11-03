package com.mybank.domain;

import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestReportTest {

	
	
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void iniciarBank() throws IOException {
			//creo el directorio data en el proyecto
			File directorio = new File("data");
			boolean creado = directorio.mkdir();
			
			//creo el fichero test.data
			File f2 = new File(directorio,"test.data");
			f2.createNewFile();
			
			//
		}
		
		
		

	

}
