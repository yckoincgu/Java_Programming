package objTemplate;


import java.util.Scanner;

public class Cal_01_IO_A {
	char logicOperator='\0';		// control operator for logic design
	double inputNum=0;
	Scanner scanner = new Scanner(System.in);	

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
	        logicOperator = lastOperatorStr.trim().charAt(0);
	        if (!(logicOperator == '=' || logicOperator == '+' || logicOperator == '-' || logicOperator == '*' || logicOperator == '/')) {
	        	System.out.print("Error operator !!!" ); continue;
	        }
	        inputFinished=true;
	       
		}
		return logicOperator;
	}	
	
	

}
