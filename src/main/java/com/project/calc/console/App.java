package com.project.calc.console;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import com.project.calc.cal.Calc;

public class App {
	
	private final static String[] OPERATIONS=  {"+","-","*","/"};

	public static void main(String[] args) {
				
	    Scanner scanner =  new Scanner(System.in);
	    scanner.useLocale(Locale.ENGLISH);
	    
	    System.out.print("Enter the operation (+ - * /): ");
	    
	    String operation = scanner.next();
	    
	    if(validateOperation(operation)){
	    
		    System.out.print("Enter the first number: ");
		
		    double firstNumber = scanner.nextDouble();
		    
		    System.out.print("Enter the second number: ");
		 
		    double secondNumber = scanner.nextDouble();
 
		    execute(operation,firstNumber,secondNumber);
		    
	    }else{
	    	
	    	System.out.println(String.format(" The operation '%s' is not supported.", operation));
	    	
	    }
	    
	    scanner.close();

	}
	
	
	private static boolean  validateOperation(String operation) {
		
		return Arrays.asList(App.OPERATIONS).contains(operation);
		
	}

	private static void execute(String operation, double firstNumber, double secondNumber) {
		
		Calc calc= new Calc(); 
		switch(operation){
		
			case "+":
				System.out.println(String.format(" The result is: %.3f .", calc.add(firstNumber, secondNumber)));
			break;
			
			case "-":
				System.out.println(String.format(" The result is: %.3f .", calc.subtract(firstNumber, secondNumber)));
			break;
			
			case "*":
				System.out.println(String.format(" The result is: %.3f .", calc.multiply(firstNumber, secondNumber)));
			break;
			
			case "/":				
				System.out.println(String.format(" The result is: %.3f .",calc.divide(firstNumber, secondNumber)));
			break;
			
		}
		
	}

}
