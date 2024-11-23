package calculatorPackage;

import java.util.Scanner;

public class CalculatorIO {
	double inputNum=0, sum = 0, product=0;
	char activeOperator ='\0', lastOperator='\0';	
	private Scanner scanner=null;
	
	public String userInputStr="";
	
	CalculatorIO(){
		scanner = new Scanner(System.in);
	}
	
	
	public String getExpressionStr() {

		System.out.print("Enter your arithmetic expression  "); 
		userInputStr = scanner.nextLine();
		
		return userInputStr;
	}
	
	public String getNumberAndOperator(String inputStr) {
		
		if(!inputStr.contains("=")) return  "Invalid input: ";

		for(int i=0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i) == '+' || inputStr.charAt(i) == '-' || inputStr.charAt(i) == '*' || inputStr.charAt(i) == '/' || inputStr.charAt(i) == '=') {
				try {
				    inputNum = Double.parseDouble(inputStr.substring(0, i));
				    lastOperator=inputStr.charAt(i);
				    System.out.println("Expression : "+inputStr.substring(0, i)+lastOperator); 				    
				    userInputStr=inputStr.substring(i+1);
				    break;

				} catch (NumberFormatException e) {
				    System.out.print("Invalid input: ");
				    break;
				    // Handle the error, e.g., prompt the user for input again
				}
			}
		}

		return userInputStr;
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
			    System.out.print("Invalid input: ");
			    // Handle the error, e.g., prompt the user for input again
			}
			System.out.println();
			
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
	        lastOperator = lastOperatorStr.trim().charAt(0);
	        if (!(lastOperator == '=' || lastOperator == '+' || lastOperator == '-' || lastOperator == '*' || lastOperator == '/')) {
	        	System.out.print("Error operator !!!" ); continue;
	        }
	        inputFinished=true;
	       
		}
		return lastOperator;
	}	
	
	

}
