package calculatorPackage;

import java.util.Scanner;

public class CalculatorIO {
	double inputNum=0, sum = 0, product=0;
	char activeOperator ='\0', lastOperator='\0';	
	Scanner scanner=null;
	
	CalculatorIO(){
		scanner = new Scanner(System.in);
	}

	
	public double getNumber() {
		boolean inputFinished=false;
		String inputNumString="";	
		while(!inputFinished) {
			System.out.print("Enter a number  "); 
			inputNumString = scanner.next();
			try {
			    inputNum = Double.parseDouble(inputNumString);
			    inputFinished=true;
			} catch (NumberFormatException e) {
			    System.out.println("Invalid input: Please enter a valid number.");
			    // Handle the error, e.g., prompt the user for input again
			}		
			
		}
		return inputNum;
	}
	
	public char getOperator() {
		boolean inputFinished=false;
		String lastOperatorStr="";	
		while(!inputFinished) {
			System.out.print("Enter an operator (+, -, *, /, =): "); 
	        lastOperatorStr = scanner.next();   
	        if (lastOperatorStr.trim().length() > 1) {System.out.println("Bad Operator !!, Please retyping operator again."); continue;}
	        lastOperator = lastOperatorStr.charAt(0);
	        if (!(lastOperator == '=' || lastOperator == '+' || lastOperator == '-' || lastOperator == '*' || lastOperator == '/')) {
	        	System.out.println("Error operator !!!" ); continue;
	        }
	        inputFinished=true;
	       
		}
		return lastOperator;
	}	
	
	

}
