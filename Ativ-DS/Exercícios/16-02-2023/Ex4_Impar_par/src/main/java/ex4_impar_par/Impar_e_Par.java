/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_impar_par;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Impar_e_Par {
      public static void main(String[] args){
           //declaração de variavel
          int num; 
           //Entrando com um valor na variavel num
          num=Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:: "));
          
           //realizando a chamada do  metodo
          if (RestoPorDois(num) ==0)
              JOptionPane.showInputDialog(null," O número é Par. \n");
          else
             JOptionPane.showInputDialog(null," O número é Impar. \n");
 }
       //inicio do metodo
      static int RestoPorDois(int a)
               //retornando para o main.
      {return a % 2;
      }
      }

