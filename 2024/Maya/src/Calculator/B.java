package Calculator;

public class B extends A{
	
	public void getEachProduct() {
        for (int i = 0; i < operators.size(); i++) {
            if (operators.get(i) == '*' || operators.get(i) == '/') {
                double individualProduct = calculatorKernel(numbers.get(i), numbers.get(i+1), operators.get(i));
                		//operators.get(i) == '*'
                        //? numbers.get(i) * numbers.get(i + 1)
                        //: numbers.get(i) / numbers.get(i + 1);
                numbers.set(i, individualProduct);
                numbers.remove(i + 1);
                operators.remove(i);
                i--;
            }
        }		
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
	
	
	void getSum() {

        for (int i = 0; i < operators.size(); i++) {
        	result = calculatorKernel(result, numbers.get(i+1), operators.get(i));
        	
            //if (operators.get(i) == '+') {
            //    result += numbers.get(i + 1);
            //} else if (operators.get(i) == '-') {
            //    result -= numbers.get(i + 1);
            //}
        }

    }
	

}
