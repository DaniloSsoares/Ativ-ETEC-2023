/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Soma_Multipl;





public class SomaMultipl {

public static int R1;
public static int R2;
    
    public static void main(String[] args) {
       
        
      for( int cc=0; cc <=30; cc++){
        
           if( cc % 2 !=0) {
               R1 =R1+cc;	
            
           }
           
           if(cc %2==0){
               R2=R2*cc;	
	
       }              
                        
			
			
      }
      System.out.println("Soma de impar: "+R1);
      System.out.println("multiplicação de Par: "+R2);
    }
}
