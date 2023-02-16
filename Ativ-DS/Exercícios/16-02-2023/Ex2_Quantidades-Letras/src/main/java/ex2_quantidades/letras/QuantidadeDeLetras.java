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
          int t;
          String p;
          digite();
          p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
          t = tamanho(p);
           JOptionPane.showMessageDialog(null,p+ "Possui " +t+"caracteres");
      }
           
             static void digite()
    {
    JOptionPane.showMessageDialog(null,"Digite uma palavra");
    } 
             
    static int tamanho(String x)
    { 
      return x.length();
    }
}
          

