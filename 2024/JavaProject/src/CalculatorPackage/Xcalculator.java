package CalculatorPackage;

public class Xcalculator extends CalculatorFundamentals{
	
	 
	public double xOperation() {
		double result=0;
	       while (true) {
	    	   activeOperator=lastOperator;
	        	inputNum=inputNumber();
	        	expression += Double.toString(inputNum)+" ";
	    		lastOperator = inputOperator();
	    		expression += lastOperator+" ";
	            if(terminate()) {printResult(); break;}
	            if(lastOperator == '+' || lastOperator == '-') sum=getSum();			// if last operator is '+' or '-'
	            if(lastOperator == '*' || lastOperator == '/') product=getProduct(); 	// if last operator is '*' or '/'
	        } // end of while 		
		
		return result;
	}
	public boolean terminate() {
		boolean terminated=false;
		
        if(lastOperator == '=') {
        	switch(activeOperator) {
            	case '\0','+', '-'->{sum=product+calculatorEngine(sum, inputNum, activeOperator); }
            	case '*'->{sum=sum+calculatorEngine(product, inputNum, activeOperator);}
            	case '/'->{
            		if(inputNum==0) {System.out.println("divisor cannot be 0"); }
            		else {sum=sum+calculatorEngine(product, inputNum, activeOperator); }
            	}
            }
        	terminated=true;
        	System.out.println(expression + sum);
        }    				
		return terminated;
	}	
	
	public double getSum() {
    	switch(activeOperator) {
        	case '\0','+', '-'->{sum=product+calculatorEngine(sum, inputNum, activeOperator);}
        	case '*'->{sum=sum+calculatorEngine(product, inputNum, activeOperator);}
        	case '/'->{
        		if(inputNum==0) {System.out.println("divisor cannot be 0"); }
        		else {sum=sum+calculatorEngine(product, inputNum, activeOperator);}
            }
    	}
    	product=0;
    	//System.out.println("sum = " + sum+ "    product = "+product);

		return sum;
	}
	
	public double getProduct() {
    	switch(activeOperator) {
        	case '\0','+'->{product=inputNum;}
        	case '-'->{product=(-1)*inputNum;}
        	case '*'->{product=calculatorEngine(product, inputNum, activeOperator); }
        	case '/'->{
        		if(inputNum==0) {System.out.println("divisor cannot be 0"); product=0;}
            		else {product=calculatorEngine(product, inputNum, activeOperator);}
            }
    	}
    	//System.out.println("sum = " + sum+ "    product = "+product);
		return product;
	}
	

	
	

}
