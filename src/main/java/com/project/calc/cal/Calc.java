package com.project.calc.cal;

import org.springframework.stereotype.Service;

@Service
public class Calc implements ICalc {

	public double add(double val1, double val2) {
		
		return val1+val2;
		
	}

	public double subtract(double val1, double val2) {
		
		return val1-val2;
	}

	public double multiply(double val1, double val2) {
		
		return val1*val2;
	}

	public double divide(double val1, double val2){
		if(val2==0)
			throw new ArithmeticException();
		
		return val1/val2;
	}

}
