/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11155001Ax;

/**
 *
 * @author eugene
 */
public class AX {
    public void blockprint(int x, int y){
        for(int i=0;i<=x;i++) {
            for(int j=0;j<=y;j++){
                if(i%2==0){
                    System.out.print(" ");
                } 
                else { 
                    System.out.print("*");
                }
            }
                
            System.out.print("\n");
        }      
    } 
    
}
