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
	        if(lastOperator == '=') {finalTerminate(); break;}
	        else if(lastOperator == '+' || lastOperator == '-') sum=getSum_lastOperator();			// if last operator is '+' or '-'
	        else if(lastOperator == '*' || lastOperator == '/') product=getProduct_lastOperator(); 	// if last operator is '*' or '/'
	        else { System.out.println("Expression error !!"); break;}
	        System.out.println("expression = " + expression);
	        System.out.println();
	   } // end of while 		
		
		return result;
	}

	public double yFlow() {
		double result=0;
		String userInputStr=getExpressionStr();
		
		while(userInputStr.length()>0) {
			activeOperator=lastOperator;
			userInputStr=getNumberAndOperator(userInputStr);
	        if(lastOperator == '=') {finalTerminate(); break;}
	        else if(lastOperator == '+' || lastOperator == '-') sum=getSum_lastOperator();			// if last operator is '+' or '-'
	        else if(lastOperator == '*' || lastOperator == '/') product=getProduct_lastOperator(); 	// if last operator is '*' or '/'
	        else { System.out.println("Expression error !!"); break;}
	        System.out.println();			
		}
		
		;
		return result;
	}
}
