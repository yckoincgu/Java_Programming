package objTemplate;

public class Cal_03_Expression extends Cal_02_EngineParts {
	
	
	public String getExpressionStr() {
		System.out.print("Enter your arithmetic expression  "); 
		String userInputStr = scanner.nextLine();		
		return userInputStr;
	}
	
	public String reduceArithmeticExpression(String arithmeticExpression) {
		//String arithemeticExpression=inputStr;
		
		if(!arithmeticExpression.contains("=")) return  "Invalid input: ";
		//System.out.println("Before reduceArithmeticExpression : "+arithmeticExpression); 	
		for(int i=0; i<arithmeticExpression.length(); i++) {
			if(arithmeticExpression.charAt(i) == '+' || arithmeticExpression.charAt(i) == '-' || arithmeticExpression.charAt(i) == '*' || arithmeticExpression.charAt(i) == '/' || arithmeticExpression.charAt(i) == '=') {
				try {
				    inputNum = Double.parseDouble(arithmeticExpression.substring(0, i));
				    logicOperator=arithmeticExpression.charAt(i);
				    //System.out.println("reduceArithmeticExpression : "+arithmeticExpression.substring(0, i)+lastOperator); 				    
				    arithmeticExpression=arithmeticExpression.substring(i+1);
				    
				    break;

				} catch (NumberFormatException e) {
				    System.out.print("Invalid input: ");
				    break;
				    // Handle the error, e.g., prompt the user for input again
				}
			}
		}

		return arithmeticExpression;
	}	
	
	public double getResultOfArithmeticExpression(String arithmeticExpression) {
		
		//System.out.print(" Before getResultOfArithmeticExpression = "+arithmeticExpression+"\n");

		resetGlobalVariables();		// the first step of arithmeticExpression processing
		while(arithmeticExpression.length()>0) {
			activeOperator=logicOperator;
			arithmeticExpression=reduceArithmeticExpression(arithmeticExpression);
	        if(logicOperator == '=') {finalTerminate(); // System.out.print("finalTerminate(), result  = "+cal_information.finalDouble+"\n"); 
	        	break;}
	        else if(logicOperator == '+' || logicOperator == '-') sum=getSum_lastOperator();			// if last operator is '+' or '-'
	        else if(logicOperator == '*' || logicOperator == '/') product=getProduct_lastOperator(); 	// if last operator is '*' or '/'
	        else { System.out.println("Expression error !!"); break;}
	        //System.out.println("arithmeticExpression in getResultOfArithmeticExpression: "+arithmeticExpression);			
		}
		//System.out.print("After reduction, result  = "+cal_information.finalDouble+"\n");
		return cal_information.finalDouble;
	}	
	

}
