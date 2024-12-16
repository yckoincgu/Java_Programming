package examplesPackage;

import java.util.Scanner;


import calculatorPackage.Cal_03_Operation;

enum EX {xbasic, xarray, xterminated, calcuatorV1, xcalculator, expressionCcalculator, priorityCalculator}

public class App {

	public static void main(String[] args) {

		
		EX[] ex=EX.values();

        for(int i=0; i< EX.values().length; i++) {
        	System.out.println(i+" "+ex[i].name()); 
        }
        System.out.println("Choose an integer to run application");        
    
        Scanner reader = new Scanner(System.in);
        int choice;    	
        choice = reader.nextInt();  
        switch(choice) {
	        case 3->{
	        	CalculatorV1 a = new CalculatorV1();
	        	a.calEntrancec();
	        }
	        case 4->{
	        	Cal_03_Operation a=new Cal_03_Operation();
	    		a.xFlow();     	        	
	        }
	        case 5->{
	        	Cal_03_Operation a=new Cal_03_Operation();
	    		a.getResultOfArithmeticExpression(a.getExpressionStr());   
	    		a.printResult();
	        }	  
	        case 6->{
	        	double result=0;
	        	Cal_03_Operation a=new Cal_03_Operation();
	    		
	    		String priortyExpression=a.getExpressionStr(), arithmeticExpression="";	        	
	        	
	    		
	    		int marks=0, marksPosition=-1;
	    		
	    		if(!priortyExpression.contains("(")) {
	    			a.getResultOfArithmeticExpression(priortyExpression);
	    			System.out.print("arithmeticExpression = "+arithmeticExpression+ "\n");	}
	    		else
	    		System.out.println("priority expression final resut = "+
	    		a.getResultOfArithmeticExpression(a.transferPriorityToArithmeticExpression(priortyExpression)));
	    		a.printResult();
	    		//System.out.print("arithmeticExpression = "+arithmeticExpression+"\n");	
	    			
	    		   	        	
	        }		        
	
        }
        
        
				
		
        reader.close();
       
	}

}
