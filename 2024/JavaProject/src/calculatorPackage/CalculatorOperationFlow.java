package calculatorPackage;

public class CalculatorOperationFlow extends CalculatorEngine {
	
	public double xFlow() {
		double result=0;
	    while (true) {
		   	activeOperator=lastOperator;
	    	inputNum=getNumber();
	    	expression += Double.toString(inputNum)+" ";
			lastOperator = getOperator();
			expression += lastOperator+" ";
	        if(expressionTerminate()) {printResult(); break;}
	        if(lastOperator == '+' || lastOperator == '-') sum=expressionGetSum();			// if last operator is '+' or '-'
	        if(lastOperator == '*' || lastOperator == '/') product=expressionGetProduct(); 	// if last operator is '*' or '/'
	        System.out.println("expression = " + expression);
	        System.out.println();
	   } // end of while 		
		
		return result;
	}

}
