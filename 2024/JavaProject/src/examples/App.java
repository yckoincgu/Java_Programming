package examples;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Choose an example by input an integer: ");
        // nextInt() reads the next integer from the keyboard
        int choice = reader.nextInt();
        
        Examples a=new Examples();
        switch(choice) {
        	case 1->{a.EX01();}
        	case 2->{a.EX02();}
        	case 3->{a.EX03();}
        	case 87->{a.EX87();}
        }
        System.out.println("End of your choice " + choice);		
        reader.close();				
		
	}

}
