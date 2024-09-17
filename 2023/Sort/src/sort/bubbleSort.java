/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

import java.util.Random;

/**
 *
 * @author eugene
 */
public class bubbleSort {
    int[] arrayA= new int[10];
    
    private int getRandomnumber(){
        Random rn = new Random();
        int maximum=10000, minimum=1, randomNum;
        
        int n = maximum - minimum + 1;
        int i = rn.nextInt() % n;
        //System.out.print("rn.nextInt() "+rn.nextInt()+"n= "+n+"\n");
        randomNum =  minimum + i;
        return randomNum;
    }
    private void printArray(){
        for(int x:arrayA) System.out.print(x+" ");
    }
    public void initArray(){

        for(int i=0; i<arrayA.length; i++) arrayA[i]=getRandomnumber();
        printArray();
        System.out.print("\n");
    }

    private void swap(int i, int j){
	int temp=0;
	temp=arrayA[i]; arrayA[i]=arrayA[j]; arrayA[j]=temp;
}

    
    public void bubbleSort(){
        int i, j;
	for(i=0; i<arrayA.length; i++) 
	for(j=i+1; j<arrayA.length; j++) 
            if(arrayA[i] > arrayA[j]) swap(i,j);
        printArray();
    }
}
