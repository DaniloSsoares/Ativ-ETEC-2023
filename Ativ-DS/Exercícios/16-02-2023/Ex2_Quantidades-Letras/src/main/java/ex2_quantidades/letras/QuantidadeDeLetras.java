/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_quantidades.letras;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class QuantidadeDeLetras {
      public static void main(String[] args){
          // Declarando a variavel inicial
          int t;
          String p;
          
          //Inicio do metodo
          digite();
          
          // Aqui se realiza a digitação dentro da variavei p
          p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
          
          //Aqui é realizado o 2 metodo sendo o t a variavel resultante do que acontecer dentro do metodo e p o valor que foi digitado anteriomente.
          t = tamanho(p);
          
          //Aqui é o resultado final.
           JOptionPane.showMessageDialog(null,p+ "Possui " +t+"caracteres");
      }
           
             static void digite()
    {//Aqui é realizado a messagem que aparecerá primeiro.
    JOptionPane.showMessageDialog(null,"Digite uma palavra");
    } 
             
    static int tamanho(String x)
            //Aqui é realizado o calculo para o tamho da palavra
    { 
        //Aqui é realizado o retorno do valor digitado para o main.
      return x.length();
    }
}
          

