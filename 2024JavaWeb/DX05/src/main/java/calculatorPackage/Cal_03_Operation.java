package calculatorPackage;

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

	public String transferPriorityToArithmeticExpression(String priortyExpression) {
		String arithmeticExpression="";
		int marks=0, marksPosition=-1;
		if(priortyExpression.isBlank()) return "";
		if(!priortyExpression.contains("(")) return priortyExpression;
		for(int i=0; i<priortyExpression.length(); i++ ) {
			if(priortyExpression.charAt(i) == '(') {if(marks == 0) marksPosition=i; marks++; }
			if(priortyExpression.charAt(i) == ')') {
				marks--;
				if(marks == 0) { 
					
					//System.out.print("Before arithmeticExpression = "+priortyExpression.substring(0, marksPosition)+priortyExpression.substring(marksPosition+1,i)+priortyExpression.substring(i+1,priortyExpression.length())+"\n");
					arithmeticExpression=
						priortyExpression.substring(0, marksPosition)+
						(priortyExpression.substring(marksPosition+1,i).contains("(")?
							Double.toString(getResultOfArithmeticExpression((transferPriorityToArithmeticExpression(priortyExpression.substring(marksPosition+1,i))+"="))):
							Double.toString(getResultOfArithmeticExpression((priortyExpression.substring(marksPosition+1,i)+"="))))+
						transferPriorityToArithmeticExpression(priortyExpression.substring(i+1,priortyExpression.length())); 
					//System.out.println("(transferPriorityToArithmeticExpression(priortyExpression.substring(marksPosition+1,i))+\"=\") : "+(transferPriorityToArithmeticExpression(priortyExpression.substring(marksPosition+1,i))+"="));
					//System.out.println("priortyExpression.substring(marksPosition+1,i) : "+priortyExpression.substring(marksPosition+1,i)+"="+"\n");
					//System.out.println("priortyExpression.substring(i+1,priortyExpression.length()) : "+priortyExpression.substring(i+1,priortyExpression.length()));
					//System.out.print("getResultOfArithmeticExpression : "+getResultOfArithmeticExpression(priortyExpression.substring(marksPosition+1,i)+"="));
					
				}
			}
			
		}	
		//System.out.print("After arithmeticExpression = "+arithmeticExpression+"\n");
		
		return arithmeticExpression;
	}		
	

	
	public double zFlow() {
		double result=0;
		String priortyExpression=getExpressionStr(),
		  	   arithmeticExpression=transferPriorityToArithmeticExpression(priortyExpression);

		return getResultOfArithmeticExpression(arithmeticExpression);
	}	
}
