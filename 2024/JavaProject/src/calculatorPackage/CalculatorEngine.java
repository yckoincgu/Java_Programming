package calculatorPackage;


public class CalculatorEngine extends CalculatorIO{
	boolean divisionError=false;
	String expression="";
	
	public void printResult() {
		if(!divisionError) System.out.println("Terminated calculation.  sum = " + sum);
	}	
	
	double calculatorKernel(double result, double num, char operatorChar) {
        if (operatorChar == '\0') {
            result = num;} 
        else {
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
                        divisionError=true;
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
	
	public void finalTerminate() {
		
    	switch(activeOperator) {
        	case '\0','+', '-'->{sum=product+calculatorKernel(sum, inputNum, activeOperator); }
        	case '*'->{sum=sum+calculatorKernel(product, inputNum, activeOperator);}
        	case '/'->{
        		if(inputNum==0) {System.out.println("divisor cannot be 0"); divisionError=true;}
        		else {sum=sum+calculatorKernel(product, inputNum, activeOperator); }
        	}
        }
    	if(!divisionError) printResult();
    	else System.out.println("Arithmetic expression gets wrong operator.");

	}	
	
	public double getSum_lastOperator() {
    	switch(activeOperator) {
        	case '\0','+', '-'->{sum=product+calculatorKernel(sum, inputNum, activeOperator);}
        	case '*'->{sum=sum+calculatorKernel(product, inputNum, activeOperator);}
        	case '/'->{
        		if(inputNum==0) {System.out.println("divisor cannot be 0"); divisionError=true; }
        		else {sum=sum+calculatorKernel(product, inputNum, activeOperator);}
            }
    	}
    	product=0;
    	//System.out.println("sum = " + sum+ "    product = "+product);

		return sum;
	}
	
	public double getProduct_lastOperator() {
    	switch(activeOperator) {
        	case '\0','+'->{product=inputNum;}
        	case '-'->{product=(-1)*inputNum;}
        	case '*'->{product=calculatorKernel(product, inputNum, activeOperator); }
        	case '/'->{
        		if(inputNum==0) {System.out.println("divisor cannot be 0"); product=0; divisionError=true;}
            		else {product=calculatorKernel(product, inputNum, activeOperator);}
            }
    	}
		return product;
	}	

}
