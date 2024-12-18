package calculatorPackage;


public class Cal_02_EngineParts extends Cal_01_IO{
	boolean divisionError=false;
	String expression="";
	Cal_Information cal_information=new Cal_Information();	// information object for final result;
	
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
	
	public Cal_Information finalTerminate() {
		
		cal_information.finalBoolean=true;	// initial setting for final result
    	switch(activeOperator) {
        	case '\0','+', '-'->{
        		//System.out.println("product = "+product+"; sum = "+sum+ "; inputNum = "+inputNum);
        		sum=product+calculatorKernel(sum, inputNum, activeOperator); 
        	 
        	}
        	case '*'->{sum=sum+calculatorKernel(product, inputNum, activeOperator);}
        	case '/'->{
        		if(inputNum==0) {System.out.println("divisor cannot be 0"); divisionError=true;}
        		else {sum=sum+calculatorKernel(product, inputNum, activeOperator); }}
        	default->{
        		System.out.println("Operator error !!"); cal_information.finalBoolean=false;}
        }
    	if(!divisionError) {
    		//printResult();
    		cal_information.finalDouble=sum;
    	}
    	else {
    		System.out.println("Arithmetic expression gets wrong operator.");
    		cal_information.finalBoolean=false;
    	}
    	
    	return cal_information;

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
	
	private void resetGlobalVariables() {
		inputNum=0; sum = 0; product=0;
		activeOperator ='\0'; lastOperator='\0';			
	}
	
	public double getResultOfArithmeticExpression(String arithmeticExpression) {
		
		//System.out.print(" Before getResultOfArithmeticExpression = "+arithmeticExpression+"\n");

		resetGlobalVariables();		// the first step of arithmeticExpression processing
		while(arithmeticExpression.length()>0) {
			activeOperator=lastOperator;
			arithmeticExpression=reduceArithmeticExpression(arithmeticExpression);
	        if(lastOperator == '=') {finalTerminate(); // System.out.print("finalTerminate(), result  = "+cal_information.finalDouble+"\n"); 
	        	break;}
	        else if(lastOperator == '+' || lastOperator == '-') sum=getSum_lastOperator();			// if last operator is '+' or '-'
	        else if(lastOperator == '*' || lastOperator == '/') product=getProduct_lastOperator(); 	// if last operator is '*' or '/'
	        else { System.out.println("Expression error !!"); break;}
	        //System.out.println("arithmeticExpression in getResultOfArithmeticExpression: "+arithmeticExpression);			
		}
		//System.out.print("After reduction, result  = "+cal_information.finalDouble+"\n");
		return cal_information.finalDouble;
	}	
	

}
