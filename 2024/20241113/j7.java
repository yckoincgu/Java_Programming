package midterm1113;

import java.util.Scanner;

public class j7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double result = scanner.nextDouble();

        System.out.println("You can perform arithmetic operations (+, -, *, /) with the number.");
        System.out.println("Enter an operator and the next number to continue. Type '=' to get the result.");
        
        while (true) {
          
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            if (operator == '=') {
                System.out.println("Arithmetic Expression: " + result);
                break;  
            }

            System.out.print("Enter the next number: ");
            double num = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result += num;
                    break;
                case '-':
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
                case '/':
                    if (num != 0) {
                        result /= num;
                    } else {
                        System.out.println("Error");
                        continue;  
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    continue; 
            }

            System.out.println("Intermediate result: " + result);
        }

        scanner.close();
    }
}
