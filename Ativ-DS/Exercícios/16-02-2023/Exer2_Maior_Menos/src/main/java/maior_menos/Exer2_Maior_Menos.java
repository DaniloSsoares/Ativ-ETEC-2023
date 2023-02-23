/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package maior_menos;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Exer2_Maior_Menos {

    public static void main(String[] args) {
        
        
         JOptionPane.showMessageDialog(null,"Digite um número::");
         float nota1, nota2;
         nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));
         nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));
         
        diferença(nota1,nota2);
    }
           static void diferença(float n1, float n2)       
          {
           
           if(n1 > n2){
            JOptionPane.showMessageDialog(null,"Seu valor "+n1+ " (A) é o maior");
           
        }
           
        else  if
         (n1 < n2){
           
            JOptionPane.showMessageDialog(null,"Seu valor "+n2+ " é (B) o maior");
        }
            else  if
         (n1 == n2){
           
            JOptionPane.showMessageDialog(null,"Seu valor A e B são iguais");
          }}}
          
    

