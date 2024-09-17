/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaryexpression;

/**
 *
 * @author eugene
 */
public class Bpp {
    
void bPrint(int[] bits, int size){
	
    for(int i=0; i<size; i++) System.out.print(bits[i]);
    System.out.println();
	
}

    public void printBinary(int n){
        int bits[]=new int[32];
	int  i, m;
	int  sFlag=-1;
	if (n==0) sFlag =0;
	if (n>0) sFlag  =1;
	if (n<0) sFlag  =2;
	
	switch(sFlag){
            case 0 -> System.out.println("the binary value is 0");
            case 1 -> {
                for(i=31; i>=0; i--){bits[i]= n % 2; n=n/2;}
                bPrint(bits, 32);
            }
            case 2 -> {
                m=-n;
                for(i=31; i>=0; i--){
                    bits[i]= m % 2;
                    m=m/2;}
                bPrint(bits, 32);
                for(i=0; i<32; i++)
                    bits[i]= (bits[i]==1)?0:1;

                bPrint(bits, 32);
                for(i=31; i>=0; i--){
                    if(i==31)
                        if((bits[i]+1)>1) {
                            bits[i-1]=bits[i-1]+1;
                            bits[i]=0; }
                        else bits[i]=1;
                    else
                        if(bits[i]>1)  {
                            bits[i-1]=bits[i-1]+1;
                            bits[i]=0;}
                }
                bPrint(bits, 32);
        }
		default -> System.out.println("Execution error happened");			
						
			
	}

}
}
