package com.jrsimo.daw;

import static org.junit.Assert.*;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinStringTest extends TestCase {
	
	
	private BinString binString;
	
	public BinStringTest(String name){
		super(name);
	}

	protected void setUp(){
		
		binString = new BinString();
	}
	
	public void testSumFunction(){
		int expected=0;
		assertEquals(expected, binString.sumar(""));
		expected =100;
		assertEquals(expected, binString.sumar("d"));
		expected= 265;
		assertEquals(expected, binString.sumar("Add"));
	}
	
	

	public void testTotalConversion(){
		
		String expected = "1000001";
		assertEquals(expected, binString.convetir("A"));
	}
}
