package com.project.calc.cal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	@Before
	public void setUp() throws Exception {
		
		//NOTE: Because you can set a double to an integer, then integer as argument is ok
		//to function with double as parameter. 
	}

	@Test
	public void checkInstance() {
		
		// arrange
		Calc calc;
		
		//act
		calc = new Calc();
		
		//assert
		assertNotNull(calc);
		
	}
	
	@Test 
	public void checkInterface() {
		
		ICalc calc;
		
		calc= new Calc();
		
		assertTrue(calc instanceof ICalc);
		
		
	}
	
	
	@Test
	public void checkAddTwoIntegers() {
				
		ICalc calc;		
		calc = new Calc();
		int val1=1;
		int val2=20;
		
		double result=calc.add(val1,val2);
		 
		assertEquals(21, result,0.1);
		 
	}
	
	@Test
	public void checkAddTwoDoubles() {
				
		ICalc calc;		
		calc = new Calc();
		double val1=1.0;
		double val2=20.5;
		
		double result=calc.add(val1,val2);
		 
		assertEquals(21.5, result,0.1);
		 
	}
	
	@Test
	public void checkSusbstractTwoIntegers() {
				
		ICalc calc;		
		calc = new Calc();
		int val1=1;
		int val2=20;
		
		double result=calc.subtract(val1,val2);
		 
		assertEquals(-19, result,0.1);
		 
	}
	
	@Test
	public void checkSusbstractTwoDoubles() {
				
		ICalc calc;		
		calc = new Calc();
		double val1=12.9;
		double val2=20.5;
		
		double result=calc.subtract(val1,val2);
		 
		assertEquals(-7.6, result,0.1);
		 
	}
	
	@Test
	public void checkMultiplyTwoIntegers() {
				
		ICalc calc;		
		calc = new Calc();
		int val1=1;
		int val2=20;
		
		double result=calc.multiply(val1,val2);
		 
		assertEquals(20, result,0.1);
		 
	}
	
	@Test
	public void checkMultiplyTwoDoubles() {
				
		ICalc calc;		
		calc = new Calc();
		double val1=1.5;
		double val2=20.0;
		
		double result=calc.multiply(val1,val2);
		 
		assertEquals(30, result,0.1);
		 
	}
	
	@Test
	public void checkDivideTwoIntegers() {
		
		ICalc calc;		
		calc = new Calc();
		int val1=20;
		int val2=5;
		
		double result=calc.divide(val1,val2);
		 
		assertEquals(4.0, result,0.1);
		 
	}
	
	@Test(expected = ArithmeticException.class)
	public void checkDivideByZero() {
				
		ICalc calc;		
		calc = new Calc();
		int val1=20;
		int val2=0;
		
		calc.divide(val1,val2);
		 
	}
	
	@Test
	public void checkDivideTwoNumberWhenTheResultIsAdouble() {
				
		ICalc calc;		
		calc = new Calc();
		int val1=5;
		int val2=10;
		
		double result=calc.divide(val1,val2);
		 
		assertEquals(0.5, result, 0.1);
		 
	}
	
	@Test
	public void checkDivideTwoDouble() {
				
		ICalc calc;		
		calc = new Calc();
		double val1=10.5;
		double val2=12.0;
		
		double result=calc.divide(val1,val2);
		 
		assertEquals(0.8, result, 0.1);
		 
	}

}
