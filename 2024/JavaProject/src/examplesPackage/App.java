package examplesPackage;

import java.util.Scanner;



public class App {

	public static void main(String[] args) {

		enum ExampleTYpes {basicTypes, arraytypes, terminated}
		
        ExampleTYpes choiceType= ExampleTYpes.basicTypes; 
        Scanner reader = new Scanner(System.in);
        int choiceTypeValue=1;

        System.out.println("Execute basic subroutine by inputing 1 \n"
    			+ "Execute array subroutine by inputing 2 \n"
    			+ "Terminate by inputing 0 \n"); 
    	System.out.println();
    	System.out.println("Please choose a type to execite ...");
        choiceTypeValue = reader.nextInt();  
        if ( choiceTypeValue == 0) choiceType= ExampleTYpes.terminated;
        if ( choiceTypeValue == 1) choiceType= ExampleTYpes.basicTypes;
        if ( choiceTypeValue == 2) choiceType= ExampleTYpes.arraytypes;
        
        switch(choiceType.name()) {
        case "basicTypes"->{
        	ExamplesBasic a=new ExamplesBasic();
        	a.EX03();
        	a.EX05();
        }
        case "arraytypes"->{
        	ExamplesArray b=new ExamplesArray();
        	b.EX45();
    		b.EX05();    	
        } 
        case "terminated"->{
        	System.out.println("No choice types for your");}
        }				
		
        reader.close();
       
	}

}
