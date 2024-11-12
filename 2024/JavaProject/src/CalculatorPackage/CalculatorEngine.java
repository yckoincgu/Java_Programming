package CalculatorPackage;


public class CalculatorEngine extends CalculatorIO{
	

	String expression="";
	
	
	public void printResult() {
		System.out.println("Terminated calculation.  sum = " + sum);
	}	
	
	
	double calculatorKernel(double result, double num, char operatorChar) {
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
	
	public boolean expressionTerminate() {
		boolean terminated=false;
		
        if(lastOperator == '=') {
        	switch(activeOperator) {
            	case '\0','+', '-'->{sum=product+calculatorKernel(sum, inputNum, activeOperator); }
            	case '*'->{sum=sum+calculatorKernel(product, inputNum, activeOperator);}
            	case '/'->{
            		if(inputNum==0) {System.out.println("divisor cannot be 0"); }
            		else {sum=sum+calculatorKernel(product, inputNum, activeOperator); }
            	}
            }
        	terminated=true;
        	System.out.println(expression + sum);
        }    				
		return terminated;
	}	
	
	public double expressionGetSum() {
    	switch(activeOperator) {
        	case '\0','+', '-'->{sum=product+calculatorKernel(sum, inputNum, activeOperator);}
        	case '*'->{sum=sum+calculatorKernel(product, inputNum, activeOperator);}
        	case '/'->{
        		if(inputNum==0) {System.out.println("divisor cannot be 0"); }
        		else {sum=sum+calculatorKernel(product, inputNum, activeOperator);}
            }
    	}
    	product=0;
    	//System.out.println("sum = " + sum+ "    product = "+product);

		return sum;
	}
	
	public double expressionGetProduct() {
    	switch(activeOperator) {
        	case '\0','+'->{product=inputNum;}
        	case '-'->{product=(-1)*inputNum;}
        	case '*'->{product=calculatorKernel(product, inputNum, activeOperator); }
        	case '/'->{
        		if(inputNum==0) {System.out.println("divisor cannot be 0"); product=0;}
            		else {product=calculatorKernel(product, inputNum, activeOperator);}
            }
    	}
    	//System.out.println("sum = " + sum+ "    product = "+product);
		return product;
	}	

}
