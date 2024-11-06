package CalculatorPackage;

import java.util.Scanner;

public class ApMain {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, inputNum=0, mulValue=1;
        char operatorChar ='\0';
        boolean inputNumberLogic=true;
        String inputOperator="", inputNumString="";

        while (true) {
        	if (inputNumberLogic) {
        		System.out.print("Enter a number  ");
        		inputNumString = scanner.next();
        		inputNum = Double.parseDouble(inputNumString);
                if (operatorChar == '+' || operatorChar == '-') {
                	sum=calculate(sum, inputNum, operatorChar);
                }
                if (operatorChar == '*' || operatorChar == '/') {
                	mulValue=calculate(mulValue, inputNum, operatorChar);
                }
                if (operatorChar == '=') {
                	sum=calculate(sum, inputNum, operatorChar);
                    System.out.println("Final result: " + sum);
                    break;
                }                
            	inputNumberLogic=false;                
        		
        	}
        	else {
        		System.out.print("Enter an operator (+, -, *, /, =): ");
                inputOperator = scanner.next();
                operatorChar = inputOperator.charAt(0);
                if (operatorChar == '*' || operatorChar == '/' || operatorChar == '=') {
                	//mulValue=sum; 
                	inputNumberLogic=true;
                	
                }
                if(operatorChar == '+' || operatorChar == '-') {
                	sum=calculate(sum, inputNum, operatorChar);
                	inputNumberLogic=true;
                	mulValue=1;           	
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
