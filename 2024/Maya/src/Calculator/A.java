package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> numbers = new ArrayList<>();
    ArrayList<Character> operators = new ArrayList<>();
    boolean divisionError=false;
    
    double result=0.0;
    
    void getNumber() {
    	
        System.out.println("Enter a number:");
        numbers.add(scanner.nextDouble());    	
    	
    }

    String getOp() {
    	String op="";
        System.out.println("Enter a operator (+, -, *, /) or '=':");
        op = scanner.next(); 
        return op;
    }
    
	void j7() {
		String op="";
        System.out.println("        Enter two numbers and an operator to perform operations.");
        System.out.println("        To terminate, enter '='.");
        
        while (numbers.size() < 5) {
    		getNumber();
    		op=getOp(); 
            if (op.equals("=")) {
            	System.out.println("Calculation is terminated.");
                break;
            }    		
            char operator = op.charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                operators.add(operator);
            } else {
                System.out.println("Invalid operator. Please re-enter.");
            }        	
        }
	}    
    
	void hello() {
		System.out.println("A's hello !!!");
	}

}
