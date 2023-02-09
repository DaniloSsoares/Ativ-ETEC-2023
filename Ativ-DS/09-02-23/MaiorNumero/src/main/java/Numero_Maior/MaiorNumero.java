/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Numero_Maior;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */

public class MaiorNumero {
    
   public static int numeroA;
   public static int numeroB;   
   
        public static Scanner teclado = new Scanner(System.in);
          
          
    public static void main(String[] args) {
                    
        System.out.println("Digite seu prieiro valor de A:");
        numeroA= teclado.nextInt();
        
        System.out.println("Digite seu próximo número de B:");
        numeroB = teclado.nextInt();
        
        if(numeroA > numeroB){
            System.out.print("O maior valor entre os dois é:" +numeroA+ "." );
        }
        else  if
         (numeroA < numeroB){
           System.out.println("O maior valor entre os dois é: " +numeroB+ ".");
           
           }else if
            (numeroA == numeroB){
        System.out.println("Digite novamente pois seus números são iguais");
           }
        }
    }
    

