/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exer4_menu;

import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Exer4_Menu {

    public static void main(String[] args) {
           float a, b ,numero;
        
        
                 JOptionPane.showMessageDialog(null, "Seja bem vindo(a)");
                 JOptionPane.showMessageDialog(null, "seus calculos são");
                  JOptionPane.showMessageDialog(null, "(1)para Soma;\n (2)para Subtração;\n (3)para Divisão;\n (4)para Multiplicação;\n "
                          + "(5)para Resto da Divisão;\n (6)para Dobro;\n (7)para Quadrado;\n (8)para Cubo;\n (9)para Raiz Quadrada;\n (0)Sair\n");
                  
                  numero =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do tipo de calculo:"));
                     a=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
                      b=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
                      
                     calculos(numero, a, b);
               }
    static void calculos(float num,float A,float B){
        if(num == 1){
        float S = A+B;
         JOptionPane.showMessageDialog(null, "seus resultado da soma é "+S);
        }
        else if(num==2){
         float Sub = A-B;
         JOptionPane.showMessageDialog(null, "seus resultado da subtração é "+Sub);
        }
          else if(num==3){
         float D = A/B;
         JOptionPane.showMessageDialog(null, "seus resultado da divisão é "+D);
        }
         else if(num==4){
         float M = A*B;
         JOptionPane.showMessageDialog(null, "seus resultado da multiplicação é "+M);
        } 
        else if(num==5){
         float RD = A%B;
         JOptionPane.showMessageDialog(null, "seus resultado do resto é "+RD);
        }
        else if(num==6){
         float Do = A*2;
         float Dob = B*2;
         JOptionPane.showMessageDialog(null, "seus resultado do Dobro é "+Do+ "      "+Dob);
        } 
        else if(num==7){
          float s = A+B;
          float Q= s*s;
         JOptionPane.showMessageDialog(null, "seus resultado do Quadrado é "+Q);
        } 
        else if(num==8){
         float V = A*3;
          float C=B*3;
         JOptionPane.showMessageDialog(null, "seus resultado do Cubo é "+ V+"   "+C);
        } 
        else if(num==9){
          float r = (float) Math.sqrt(A);
          float R = (float) Math.sqrt(B);
         JOptionPane.showMessageDialog(null, "seus resultado da Raiz quadrada é "+r+ "    " +R);
        }
        else {
         JOptionPane.showMessageDialog(null, "Obrigado você chegou no final dos calculo ");
         exit(0);
         
    
    }
}
}
    

