package calculatorPackage;

import java.util.Scanner;
import java.util.ArrayList;

public class Cal_01_IO {
	double inputNum=0, sum = 0, product=0;
	char activeOperator ='\0', lastOperator='\0';	
	private Scanner scanner=null;
	ArrayList<String> expressionList=new ArrayList<>();
	
	
	Cal_01_IO(){
		scanner = new Scanner(System.in);
	}
	
	
	public String getExpressionStr() {
		System.out.print("Enter your arithmetic expression  "); 
		String userInputStr = scanner.nextLine();		
		return userInputStr;
	}
	

		
	

	
	public String reduceArithmeticExpression(String arithmeticExpression) {
		//String arithemeticExpression=inputStr;
		
		if(!arithmeticExpression.contains("=")) return  "Invalid input: ";
		System.out.println("Before reduceArithmeticExpression : "+arithmeticExpression); 	
		for(int i=0; i<arithmeticExpression.length(); i++) {
			if(arithmeticExpression.charAt(i) == '+' || arithmeticExpression.charAt(i) == '-' || arithmeticExpression.charAt(i) == '*' || arithmeticExpression.charAt(i) == '/' || arithmeticExpression.charAt(i) == '=') {
				try {
				    inputNum = Double.parseDouble(arithmeticExpression.substring(0, i));
				    lastOperator=arithmeticExpression.charAt(i);
				    System.out.println("reduceArithmeticExpression : "+arithmeticExpression.substring(0, i)+lastOperator); 				    
				    arithmeticExpression=arithmeticExpression.substring(i+1);
				    
				    break;

				} catch (NumberFormatException e) {
				    System.out.print("Invalid input: ");
				    break;
				    // Handle the error, e.g., prompt the user for input again
				}
			}
		}

		return arithmeticExpression;
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
