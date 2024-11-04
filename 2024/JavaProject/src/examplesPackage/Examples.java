package examplesPackage;

import java.util.Scanner;


public class Examples {
	Scanner reader = new Scanner(System.in);
	
	public enum ExampleTYpes {
		basicTypes, arraytypes, terminated
	}
	public void EX05() {
	    int first = 10;
	    int second = 20;

	    // add two numbers
	    int sum = first + second;
	    System.out.println(first + " + " + second + " = "  + sum);
	}	
	
	
	public void choiceType() {
        ExampleTYpes choiceType= ExampleTYpes.basicTypes;    
        int choiceTypeValue=1;
    	System.out.println("Execute basic subroutine by inputing 1 \n"
    			+ "Execute array subroutine by inputing 2 \n"
    			+ "Terminate by inputing 0 \n"); 
    	System.out.println();
        choiceTypeValue = reader.nextInt();  
        if ( choiceTypeValue == 1) choiceType= ExampleTYpes.basicTypes;
        if ( choiceTypeValue == 2) choiceType= ExampleTYpes.arraytypes;
        if ( choiceTypeValue == 0) choiceType= ExampleTYpes.terminated;
        System.out.println("test enum name   "+choiceType.name());
        
        
        switch(choiceType.name()) {
       // case "basicTypes"->{mainLoop();}
        case "arraytypes"->{System.out.println("arraytypes ....");} 
        case "terminated"->{
        	System.out.println("No choice types for your");}
        }		
	}
	

}
