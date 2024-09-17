package midtermii;

import java.util.Scanner;

/**
 *
 * @author eugene
 */
public class App {
    public void get1() {
        
        int integerVariable;
        char characterVariable;
        boolean booleanVariable;
        float floatVariable;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            integerVariable = scanner.nextInt();
            System.out.print("Enter a character: ");
            characterVariable = scanner.next().charAt(0);
            System.out.print("Enter a boolean (true or false): ");
            booleanVariable = scanner.nextBoolean();
            System.out.print("Enter a float: ");
            floatVariable = scanner.nextFloat();
        }

        System.out.println("Entered values:");
        System.out.println("Integer: " + integerVariable);
        System.out.println("Character: " + characterVariable);
        System.out.println("Boolean: " + booleanVariable);
        System.out.println("Float: " + floatVariable);
    }
    public void get2() {
        int userInput;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            userInput = scanner.nextInt();
        }

        if (userInput > 20) {
            System.out.println("Input is greater than 20.");
        } else {
            System.out.println("Input is not greater than 20.");
        }
        
    }

    
    public void get3() {
        int userInput;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            userInput = scanner.nextInt();
        }

        switch (userInput) {
            case 20, 21, 22, 23, 24 -> System.out.println("Input is one of 20, 21, 22, 23, or 24.");
            default -> System.out.println("Input is not 20, 21, 22, 23, or 24.");
        }
        
    }
    
    
    public void get4() {
        int rows = 4; 

        int i = 0;
        while (i < rows) {
            int k = 0;

            while (k < (rows - i)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
        
    }
    
    
    public void get5() {
        int rows = 4; 

        int i = 0;
        while (i < rows) {
            int j = 0;

            while (j < i) {
                System.out.print(" "); 
                j++;
            }

            int k = 0;

            while (k < (rows - i)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
    
    
    
    public void get6() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an arithmetic operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.print("Enter your choice (1, 2, 3, or 4): ");
            int choice = scanner.nextInt();

            double result = 0;
            switch (choice) {
                case 1 -> result = num1 + num2;
                case 2 -> result = num1 - num2;
                case 3 -> result = num1 * num2;
                case 4 -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        return; 
                    }
                }
                default -> {
                    System.out.println("Invalid choice. Please choose 1, 2, 3, or 4.");
                    return;
                }  
            }
            System.out.println("Result: " + result);
           
        }
        
    }      
}
