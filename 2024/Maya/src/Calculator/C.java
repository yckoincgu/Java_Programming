package Calculator;

public class C extends B{
	
	void calculate() {
		
		getEachProduct();
        if(numbers.size()>0) {
        	result=numbers.get(0);
        	getSum();
        	System.out.println("Result: "+result);}
        else System.out.println("Input error !!!!");
		
	}

}
