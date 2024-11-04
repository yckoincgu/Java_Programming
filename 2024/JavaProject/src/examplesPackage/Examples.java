package examplesPackage;

import java.util.Scanner;

public class Examples {
	
	public void mainLoop() {
		Scanner reader = new Scanner(System.in);;
        int choice=1;
		while (choice !=0) {
			System.out.print("Choose an example by input an integer: ");
			
			choice = reader.nextInt();
	        switch(choice) {
	        	
	        	case 2->{EX02();System.out.println("");	}
	        	case 3->{EX03();System.out.println("");	}
	        	case 87->{EX87();System.out.println("");}
	        	default->{System.out.println("No function for your choice in mainLoop  " + choice);}
	        }
	        				
		}
		reader.close();				
	}
	
	public void EX87() {
	    // create boolean variables
	    boolean booleanValue1 = true;
	    boolean booleanValue2 = false;

	    // convert boolean to string
	    // using valueOf()
	    String stringValue1 = String.valueOf(booleanValue1);
	    String stringValue2 = String.valueOf(booleanValue2);

	    System.out.println(stringValue1);    // true
	    System.out.println(stringValue2);    // true				
	}

	public void EX02() {
	    int first = 10;
	    int second = 20;

	    // add two numbers
	    int sum = first + second;
	    System.out.println(first + " + " + second + " = "  + sum);
	}	
	

	public void EX03() {
        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);		
	}
}
