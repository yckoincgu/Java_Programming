package CalculatorPackage;

import java.util.Scanner;

public class ApMain {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, inputNum=0, mulValue=0;
        char frontOperatorChar ='\0';
        boolean inputNumberTrue=true;
        String frontOperatorStr="", inputNumString="";

        while (true) {
        	if (inputNumberTrue) {
        		System.out.print("Enter a number  ");
        		inputNumString = scanner.next();
        		inputNum = Double.parseDouble(inputNumString);
        		if (frontOperatorChar == '\0') {
        			sum=inputNum;
        		}
                if (frontOperatorChar == '+' || frontOperatorChar == '-') {
                	if(sum == 0 ) sum =inputNum;
                	//else sum=mulValue+calculate(sum, inputNum, frontOperatorChar);
                	mulValue=0;                	
                }
                if (frontOperatorChar == '*' || frontOperatorChar == '/') {
                	if (mulValue == 0) mulValue =inputNum;
                	else mulValue=calculate(mulValue, inputNum, frontOperatorChar);               	
                }
    
                System.out.println("sum = " + sum+ " mulValue = "+mulValue);
            	inputNumberTrue=false;                
        		
        	}
        	else {
        		System.out.print("Enter an operator (+, -, *, /, =): ");
                frontOperatorStr = scanner.next();
                frontOperatorChar = frontOperatorStr.charAt(0);
                inputNumberTrue=true;
                if (frontOperatorChar == '*' || frontOperatorChar == '/') {
                	mulValue=inputNum;
                	System.out.println("sum = " + sum+ " mulValue = "+mulValue);
                }
                	
                if (frontOperatorChar == '=') {
                	if(sum == inputNum) System.out.println("Final result: " + sum);
                    System.out.println("Final result: " + (sum+mulValue));
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
