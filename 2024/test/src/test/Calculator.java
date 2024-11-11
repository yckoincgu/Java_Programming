package test;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> numbers = new Stack<>();
        char operator = '\0';

        while (true) {
            System.out.print("Enter a number or operator (+, -, *, /, =): ");
            String input = scanner.nextLine();

            if (input.equals("=")) {
                break;
            }

            try {
                double num = Double.parseDouble(input);
                numbers.push(num);
            } catch (NumberFormatException e) {
                operator = input.charAt(0);
            }

            if (operator != '\0') {
                if (numbers.size() >= 2) {
                    double num2 = numbers.pop();
                    double num1 = numbers.pop();
                    double result = 0;

                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 == 0) {
                                System.out.println("Error: Division by zero");
                                return;
                            }
                            result = num1 / num2;
                            break;
                    }

                    numbers.push(result);
                    operator = '\0';
                } else {
                    System.out.println("Invalid input: Insufficient numbers");
                }
            }
        }

        if (!numbers.isEmpty()) {
            System.out.println("Result: " + numbers.pop());
        }

        scanner.close();
    }
}