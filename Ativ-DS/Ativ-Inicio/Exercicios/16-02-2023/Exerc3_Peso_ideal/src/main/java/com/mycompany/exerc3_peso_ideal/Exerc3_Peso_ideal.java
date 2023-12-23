/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerc3_peso_ideal;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Exerc3_Peso_ideal {

    public static void main(String[] args) {
      float altura;
       String sexo;
       double pesoIdeal;
        
       JOptionPane.showMessageDialog(null, "Seja bem vindo(a)");
       sexo =JOptionPane.showInputDialog("Informe o sexo (M ou F)");
       altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura em metros"));
         
       pesoIdeal = calcularPesoIdeal(sexo,altura);
       JOptionPane.showMessageDialog(null, "Seu peso ideal deve ser " +pesoIdeal);
    }
    
    static double calcularPesoIdeal(String sx,float alt )
    {
          
    if(sx.equals("M"))
         {
         double pesoIdeal = (72.7*alt)-58;
         return pesoIdeal;
         }
    else if (sx.equals("F"))
        {
         double pesoIdeal = (62.1*alt)-44.7;
         return pesoIdeal;
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Digite M para masculino ou F para ferminino");
             return 0;
        }
     
}
}

          
       
       
