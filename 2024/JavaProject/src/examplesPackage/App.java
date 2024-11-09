package examplesPackage;

import java.util.Scanner;


enum EX {xbasic, xarray, xterminated, xcalculator}

public class App {

	public static void main(String[] args) {

		
		EX[] ex=EX.values();

        for(int i=0; i< EX.values().length; i++) {
        	System.out.println(i+" "+ex[i].name()); 
        }
        System.out.println("Choose an integer to run x_application");        
    
        Scanner reader = new Scanner(System.in);
        int choice;    	
        choice = reader.nextInt();  
        switch(choice) {
	        case 3->{
	        	ExCalculator a = new ExCalculator();
	        	a.calEntrancec();
	        }
        }
        
        
				
		
        reader.close();
       
	}

}
