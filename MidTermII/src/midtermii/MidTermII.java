/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermii;

import java.util.Scanner;

/**
 *
 * @author eugene
 */
public class MidTermII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        App x=new App();
        
        x.get6();
       

    }
    
    
    public void getGreeting() {
        System.out.printf("getGreeting");
        
        person a=new person("Aaron","B11155001");
        System.out.println(a.name);
        person b=new person("Mary","B11155002");
        System.out.println(b.name);
        Employee c=new Employee("John","B11155003");
        System.out.println(c.name);
        //return "Hello";
             
}
  
    
}
