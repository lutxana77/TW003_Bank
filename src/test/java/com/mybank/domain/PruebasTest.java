package com.mybank.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebasTest {

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
	public void testSacarDinero () {
		
		CheckingAccount me= new CheckingAccount(1000,200);
		me.drawnwith(800);
		
		System.out.println(me.balance);
		fail("Not yet implemented");
	}

}
