/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermiii;

import java.util.Scanner;

/**
 *
 * @author hlpss
 */
public class A {
    public String getGreeting(){
         
        System.out.println("Hello World!");
        return"Hello World!";
    }
    
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
    }
    
}
