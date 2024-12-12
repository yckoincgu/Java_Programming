package calculatorPackage;

import java.util.Scanner;
import java.util.ArrayList;

public class CalculatorIO {
	double inputNum=0, sum = 0, product=0;
	char activeOperator ='\0', lastOperator='\0';	
	private Scanner scanner=null;
	ArrayList<String> expressionList=new ArrayList<>();
	
	
	CalculatorIO(){
		scanner = new Scanner(System.in);
	}
	
	
	public String getExpressionStr() {
		System.out.print("Enter your arithmetic expression  "); 
		String userInputStr = scanner.nextLine();		
		return userInputStr;
	}
	
	public String getRidOffPriority(String priortyExpression) {
		int p=priortyExpression.indexOf('('), 
				q=priortyExpression.indexOf(')', p+1);		// first ')' after '('
		String arithmeticExpression="";
		
		if(p<0) expressionList.add(priortyExpression);
		else if	(q > 0 && q > p)  {
			arithmeticExpression += getRidOffPriority(priortyExpression.substring(0, p));
			arithmeticExpression += getRidOffPriority(priortyExpression.substring(p+1, q));
			if(priortyExpression.length()> q+1) 
				arithmeticExpression += getRidOffPriority(priortyExpression.substring(q+1, priortyExpression.length()+1));}
		else if	(q > 0 && q < p) 
			
		
			String[] y=priortyExpression.split("(");
			String p0=priortyExpression.substring(0, p1);
			if(y[1].indexOf(')') < 0) 
				expressionList.add("Error in expression !!");
			else if(y[1].indexOf(')') > 0 ) {
					expressionList.add(priortyExpression.substring(0, p1));
					expressionList.add(priortyExpression.substring(p1+1, y[1].indexOf(')')));
					
				}
			
			int q1=y[1].indexOf(')');
			if(q1>0) getRidOffPriority(y[1]);
			
			//priortyExpression.indexOf(po)
			
		}
		return priortyExpression; 
	}
	
	public String getArithmeticExpression(String arithmeticExpression) {
		//String arithemeticExpression=inputStr;
		
		if(!arithmeticExpression.contains("=")) return  "Invalid input: ";

		for(int i=0; i<arithmeticExpression.length(); i++) {
			if(arithmeticExpression.charAt(i) == '+' || arithmeticExpression.charAt(i) == '-' || arithmeticExpression.charAt(i) == '*' || arithmeticExpression.charAt(i) == '/' || arithmeticExpression.charAt(i) == '=') {
				try {
				    inputNum = Double.parseDouble(arithmeticExpression.substring(0, i));
				    lastOperator=arithmeticExpression.charAt(i);
				    //System.out.println("Expression : "+arithmeticExpression.substring(0, i)+lastOperator); 				    
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
