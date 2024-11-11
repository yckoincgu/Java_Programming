package CalculatorPackage;

import java.util.Scanner;

public class YcalculatorBase implements CalculatorInterface{
	double inputNum;
	char activeOperator ='\0', lastOperator='\0';
	String expression="";
	double sum = 0, product=0;
	Scanner scanner = new Scanner(System.in);
	boolean askNumber=true;
	
	public void inputOfCalclulator() {

         if(askNumber) {
    		 System.out.println("Enter a number  "); 
    		 String inputString = scanner.nextLine();        	 
             inputNum = Double.parseDouble(inputString);
             expression += Double.toString(inputNum)+" ";
             askNumber=false;} 
         else {
        	 activeOperator=lastOperator;
        	 System.out.print("Enter an operator (+, -, *, /, =): "); 
        	 String inputString = scanner.nextLine();   
        	 lastOperator = inputString.charAt(0);
        	 expression += lastOperator+" ";
        	 askNumber=true;
         }
	}
	
	double calculatorEngine(double result, double num, char operatorChar) {
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
