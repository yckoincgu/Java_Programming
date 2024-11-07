package CalculatorPackage;

import java.util.Scanner;

public class ApMain {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, inputNum=0, mulValue=0;
        char frontOperator ='\0', backOperator='\0';
        boolean inputNumberTrue=true, oneItemOnly=true;
        String backOperatorStr="", inputNumString="";

        while (true) {
        	if (inputNumberTrue) {
        		System.out.print("Enter a number  ");
        		inputNumString = scanner.next();
        		try {
        		    inputNum = Double.parseDouble(inputNumString);
        		} catch (NumberFormatException e) {
        		    System.out.println("Invalid input: Please enter a valid number.");
        		    // Handle the error, e.g., prompt the user for input again
        		    break;
        		}
            	inputNumberTrue=false;                
        		
        	}
        	else {
        		System.out.print("Enter an operator (+, -, *, /, =): ");
        		frontOperator= backOperator;
                backOperatorStr = scanner.next();                  
                backOperator = backOperatorStr.charAt(0);
                if (!(backOperator == '=' || backOperator == '+' || backOperator == '-' || backOperator == '*' || backOperator == '/')) {
                	System.out.println("Error operator !!!" );
                	break;
                }
                	
                if      (backOperator == '=' && frontOperator == '\0') {sum=inputNum; System.out.println("Final result: " + sum); break;}
                else if (frontOperator == '+' && backOperator == '=' ) {sum=sum+mulValue+inputNum; System.out.println("Final result = " + (sum)+" sum = "+sum+" mulValue= "+ mulValue); oneItemOnly=false; break;}
                else if (frontOperator == '-' && backOperator == '=' ) {sum=sum+mulValue+(-1)*inputNum; System.out.println("Final result = " + (sum)+" sum = "+sum+" mulValue= "+ mulValue); oneItemOnly=false; break;}
                else if (frontOperator == '*' && backOperator == '=' ) {sum=(mulValue==0)?sum*inputNum:sum+mulValue*inputNum; System.out.println("Final result = " + sum); break;}
                else if (frontOperator == '/' && backOperator == '=' ) {
                	if(inputNum==0) break; 
                	else {sum=(mulValue==0)?sum/inputNum:sum+mulValue/inputNum; System.out.println("Final result = " + sum); break;}}
                else if (frontOperator == '*' && (backOperator == '*' || backOperator == '/') ) {
                	mulValue = mulValue*inputNum; System.out.println("Final result = " + sum);}
                else if (frontOperator == '/' && (backOperator == '*' || backOperator == '/') ) {
                	if(inputNum==0) break; 
                	else {mulValue = mulValue/inputNum; System.out.println("Final result = " + sum);}}
                else if ((frontOperator == '+' || frontOperator == '\0') && (backOperator == '*' || backOperator == '/') ) {mulValue=inputNum;}
                else if (frontOperator == '-' && (backOperator == '*' || backOperator == '/') ) {mulValue=(-1)*inputNum;}       
                else if (backOperator == '+') {
                	sum=mulValue+calculate(sum, inputNum, backOperator); 
                	System.out.println("sum = " + sum+ " mulValue = "+mulValue);
                	mulValue=0;} 
                else if (backOperator == '-') {
                	sum=mulValue+calculate(sum, (-1)*inputNum, backOperator); 
                	System.out.println("sum = " + sum+ " mulValue = "+mulValue);
                	mulValue=0;}                 
                else {System.out.println("Error operation !!!" );}
                inputNumberTrue=true;
           }                  
        }
        System.out.println("Terminated calculation.  sum = " + sum);
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
