/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Media;


import java.util.Scanner;


/**
 *
 * @author dti
 */
public class Media {
    public static float NT1;
    public static float NT2;
    public static float NT3;
    public static float NT4;
    public static float MD;
    public static String Nome;
    
  
    public static Scanner teclado= new Scanner(System.in);
    public static void main (String[]args){
        
        System.out.println("Bem vindo, ao cálculo de Média de MAT.");
        
        System.out.println("Digite seu Nome para continuar.");
        Nome=teclado.nextLine();
        
        System.out.println("Digite sua primeira nota!");
          NT1=teclado.nextFloat();
          
         System.out.println("Digite sua Segunda  nota!");
          NT2=teclado.nextFloat();
        
           System.out.println("Digite sua terceira nota!");
          NT3=teclado.nextFloat();
          
           System.out.println("Digite sua Quarta nota!");
          NT4=teclado.nextFloat();
          
           MD= ((NT1 + NT2 + NT3 + NT4)/4);
           System.out.println(Nome+ " Sua nota  média foi :  " +MD);
}

  
    }

