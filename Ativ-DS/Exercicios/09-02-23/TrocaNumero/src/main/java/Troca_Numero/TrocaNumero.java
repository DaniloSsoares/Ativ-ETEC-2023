/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Troca_Numero;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class TrocaNumero {

    public static int NumA;
    public static int NumB;
    public static int R1;
   
    public static Scanner teclado= new Scanner(System.in);
    
  
       
    public static void main(String[] args) {
        
       
                
             
        
         System.out.println("Digite o valor de A:");
                NumA= teclado.nextInt();
                 System.out.println("Digite o valor de B:");
                NumB= teclado.nextInt();
                
           
               R1=NumA;
                NumA=NumB;
                NumB=R1;
               
               System.out.println("A=" + NumA + "  B=" + NumB);
                
                
    }
           
   
    }
      
    




