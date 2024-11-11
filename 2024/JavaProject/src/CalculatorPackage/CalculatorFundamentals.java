package CalculatorPackage;
import java.util.Scanner;



public class CalculatorFundamentals {
	Scanner scanner=null;
	double inputNum=0;
	String inputNumString="";	
	String lastOperatorStr="";	
	double sum = 0, product=0;
	char activeOperator ='\0', lastOperator='\0';
	
	String expression="";
	
	CalculatorFundamentals(){
		scanner = new Scanner(System.in);
	}
	
	public double inputNumber() {
		boolean inputFinished=false;
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
			System.out.println();
		}
		return inputNum;
	}
	
	public char inputOperator() {
		boolean inputFinished=false;
		while(!inputFinished) {
			System.out.print("Enter an operator (+, -, *, /, =): "); 
	        lastOperatorStr = scanner.next();   
	        if (lastOperatorStr.trim().length() > 1) {System.out.println("Bad Operator !!"); continue;}
	        lastOperator = lastOperatorStr.charAt(0);
	        if (!(lastOperator == '=' || lastOperator == '+' || lastOperator == '-' || lastOperator == '*' || lastOperator == '/')) {
	        	System.out.println("Error operator !!!" ); continue;
	        }
	        inputFinished=true;
	        System.out.println();
		}
		return lastOperator;
	}	
	
	public void printResult() {
		System.out.println("Terminated calculation.  sum = " + sum);
	}	
	
	
	static double calculatorEngine(double result, double num, char operatorChar) {
        if (operatorChar == '\0') {
            result = num;
        } else {
            switch (operatorChar) {
                case '+', '=':
                    result += num; break;
                case '-':
                    result -= num; break;
                case '*':
                    result *= num; break;
                case '/':
                    if (num == 0) {
                        System.out.println("Error: Division by zero");
                        return 0;
                    }
                    result /= num;
                    break;                	
                default:
                    System.out.println("Invalid operator");
            }
        }		
		return result;
		
	}
	

}
