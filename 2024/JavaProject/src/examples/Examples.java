package examples;

import java.util.Scanner;

public class Examples {
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
	public void EX01() {
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();
        reader.nextLine();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);		
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
