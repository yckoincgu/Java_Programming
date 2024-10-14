package EX01;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		System.out.println("Hello world !!!");
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);		
        reader.close();

	}

}
