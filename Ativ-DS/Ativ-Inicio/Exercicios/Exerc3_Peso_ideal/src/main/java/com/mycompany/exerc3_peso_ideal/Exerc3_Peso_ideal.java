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
        float altura = 0;
       float sexo = 0;
       
        
         JOptionPane.showMessageDialog(null, "Seja bem vindo(a)");
        
         
          altura = Integer.parseInt(JOptionPane.showInputDialog("Digite sua altura"));
          sexo =Integer.parseInt(JOptionPane.showInputDialog("Digite seu sexo (1) para masculino e (2) para ferminino"));
      float resultado=calcularPesoIdeal(altura,sexo);
          JOptionPane.showMessageDialog(null, "Seu peso ideal deve ser " +resultado);

    }
    
    static float calcularPesoIdeal(float alt,float sx ){
       float res=0;
       float cal;
    if(sx  1){
     cal= (72*alt)-58;
     res=cal;
      return res;
    }
    
      else if(sx==2){
       cal=(float) ((62.1*alt)-44.7);
       res=cal;
      return res;
          
    }   
    
    
    }      
