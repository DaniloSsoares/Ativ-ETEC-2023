/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exer5_hipotenusa;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Exer5_Hipotenusa {

    public static void main(String[] args) {
        
         JOptionPane.showMessageDialog(null, "Seja bem vindo(a)");
         
         float resultado=hipotenusa();
         JOptionPane.showMessageDialog(null, "o valor da hipotenusa é: "+resultado);
    }
    static float hipotenusa(){
        float a=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
         float b=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
         
         float A= (float) Math.pow(a, 2);
         float B= (float) Math.pow(b, 2);
         float C= A+B;
         return C;
    }
    
}
