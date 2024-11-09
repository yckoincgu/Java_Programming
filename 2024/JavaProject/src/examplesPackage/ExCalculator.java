package examplesPackage;

import java.util.Scanner;

public class ExCalculator extends Examples{

	void calEntrancec() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, inputNum=0, product=0;
        char activeOperator ='\0', lastOperator='\0';
        boolean inputNumberTrue=true, Terminated=false;
        String lastOperatorStr="", inputNumString="";

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

    		System.out.print("Enter an operator (+, -, *, /, =): ");
    		activeOperator= lastOperator;
            lastOperatorStr = scanner.next();   
            if (lastOperatorStr.trim().length() > 1) {System.out.println("Bad Operator !!");break;}
            lastOperator = lastOperatorStr.charAt(0);
            if (!(lastOperator == '=' || lastOperator == '+' || lastOperator == '-' || lastOperator == '*' || lastOperator == '/')) {
            	System.out.println("Error operator !!!" );
            	break;
            }
            
            
            if(lastOperator == '=') {
            	switch(activeOperator) {
                	case '\0','+', '-'->{sum=product+calculate(sum, inputNum, activeOperator); Terminated=true; break;}
                	case '*'->{sum=sum+calculate(product, inputNum, activeOperator); Terminated=true; break;}
                	case '/'->{
                		if(inputNum==0) {System.out.println("divisor cannot be 0"); break;}
                		else {sum=sum+calculate(product, inputNum, activeOperator); Terminated=true; break;}
                	}
                }
            }    
            if(Terminated) break;
            
            switch(lastOperator) {
                case '+', '-'->{
                	switch(activeOperator) {
	                	case '\0','+', '-'->{sum=product+calculate(sum, inputNum, activeOperator);}
	                	case '*'->{sum=sum+calculate(product, inputNum, activeOperator); product=0;}
	                	case '/'->{
	                		if(inputNum==0) {System.out.println("divisor cannot be 0"); product=0; break;}
	                		else {sum=sum+calculate(product, inputNum, activeOperator); product=0;}
		                }
                	}
                }	
                case '*', '/'->{
                	switch(activeOperator) {
	                	case '\0','+'->{product=inputNum;}
	                	case '-'->{product=(-1)*inputNum;}
	                	case '*'->{product=calculate(product, inputNum, activeOperator); }
	                	case '/'->{
	                		if(inputNum==0) {System.out.println("divisor cannot be 0"); product=0; break;}
		                		else {product=calculate(product, inputNum, activeOperator);}
		                }
                	}
                
                }
                
            }
            inputNumberTrue=true;
        } // end of while 
        printResult(sum);
        scanner.close();		
		
	}
	void printResult(double sum) {
		System.out.println("Terminated calculation.  sum = " + sum);
	}
	
	
	double calculate(double result, double num, char operatorChar) {
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
