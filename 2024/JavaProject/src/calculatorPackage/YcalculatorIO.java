package calculatorPackage;

import java.util.Scanner;

public class YcalculatorIO implements CalculatorInterface{
	double inputNum;
	char activeOperator ='\0', lastOperator='\0';
	String expression="";
	double sum = 0, product=0;
	Scanner scanner = new Scanner(System.in);
	boolean askNumber=true;
	


	@Override
	public double getNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char getOperator() {
		// TODO Auto-generated method stub
		return 0;
	}
}
