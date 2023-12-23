/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Compara_Numero;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class ComparaNumero {
public static int NumA;
public static int NumB;
public static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) {
      
        System.out.println("Digite o valor de A");
          NumA=teclado.nextInt();
          
         
        System.out.println("Digite o valor de B");
        NumB=teclado.nextInt();
        
        if(NumA ==NumB){
            System.out.println("Os  números digitados são iguais sendo:"+ NumA +"-"+ NumB);
            
        } else if(NumA != NumB ){
        
         if(NumA> NumB){
            System.out.print("O maior valor entre os dois é: A sendo" +NumA+ "  ambos numeros são diferentes ." );
        }
        else  if
         (NumA < NumB){
           System.out.println("O maior valor entre os dois é: B sendo " +NumB+ "  ambos numeros são diferentes.");
           
          
        }}
}}
