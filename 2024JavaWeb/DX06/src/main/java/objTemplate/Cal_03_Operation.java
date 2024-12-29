package objTemplate;

public class Cal_03_Operation extends Cal_02_EngineParts {
	String expression="";
	
	
	public void printResult() {
		if(!divisionError) System.out.println("Terminated calculation.  sum = " + sum);
	}	 
	
	
	
	public double xFlow() {
		double result=0;
	    while (true) {
		   	activeOperator=logicOperator;
	    	inputNum=getNumber();
	    	expression += Double.toString(inputNum)+" ";
			logicOperator = getOperator();
			expression += logicOperator+" ";
	        if(logicOperator == '=') {finalTerminate(); break;}
	        else if(logicOperator == '+' || logicOperator == '-') sum=getSum_lastOperator();			// if last operator is '+' or '-'
	        else if(logicOperator == '*' || logicOperator == '/') product=getProduct_lastOperator(); 	// if last operator is '*' or '/'
	        else { System.out.println("Expression error !!"); break;}
	        System.out.println("expression = " + expression);
	        System.out.println();
	   } // end of while 		
		
		return result;
	}


}
