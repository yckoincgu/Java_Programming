package Calculator;

public class B extends A{
	
	public void getProduct() {
        for (int i = 0; i < operators.size(); i++) {
            if (operators.get(i) == '*' || operators.get(i) == '/') {
                double intermediateResult = operators.get(i) == '*'
                        ? numbers.get(i) * numbers.get(i + 1)
                        : numbers.get(i) / numbers.get(i + 1);


                numbers.set(i, intermediateResult);
                numbers.remove(i + 1);
                operators.remove(i);
                i--;
            }
        }		
	}
	
	
	void getSum() {

        for (int i = 0; i < operators.size(); i++) {
            if (operators.get(i) == '+') {
                result += numbers.get(i + 1);
            } else if (operators.get(i) == '-') {
                result -= numbers.get(i + 1);
            }
        }

    }
	

}
