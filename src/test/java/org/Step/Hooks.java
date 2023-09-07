package org.Step;

import org.base.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {
	
	
	@Before
	public void befr() {
		System.out.println("before test");

	}

	@After
	public void Aftr() {
		System.out.println("After test");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
