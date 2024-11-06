package CalculatorPackage;

import java.util.Scanner;

public class ApMain {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, inputNum=0, mulValue=0;
        char operatorChar ='\0';
        boolean inputNumberTrue=true;
        String inputOperator="", inputNumString="";

        while (true) {
        	if (inputNumberTrue) {
        		System.out.print("Enter a number  ");
        		inputNumString = scanner.next();
        		inputNum = Double.parseDouble(inputNumString);
        		if (operatorChar == '\0') {
        			sum=inputNum;
        		}
                if (operatorChar == '+' || operatorChar == '-') {
                	sum=mulValue+calculate(sum, inputNum, operatorChar);
                	mulValue=0;
                	inputNumberTrue=true;
                }
                if (operatorChar == '*' || operatorChar == '/') {
                	mulValue=calculate(mulValue, inputNum, operatorChar);
                	inputNumberTrue=true;
                }
    
                
            	inputNumberTrue=false;                
        		
        	}
        	else {
        		System.out.print("Enter an operator (+, -, *, /, =): ");
                inputOperator = scanner.next();
                operatorChar = inputOperator.charAt(0);
                inputNumberTrue=true;
                if (operatorChar == '=') {
                    System.out.println("Final result: " + sum);
                    break;
                   
                }                  
        	}
        	
        }

        scanner.close();

	}
	
	static double calculate(double result, double num, char operatorChar) {
		
		
        if (operatorChar == '\0') {
            result = num;
        } else {
            switch (operatorChar) {
                case '+', '=':
                    result += num;
                    break;
                case '-':
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
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
