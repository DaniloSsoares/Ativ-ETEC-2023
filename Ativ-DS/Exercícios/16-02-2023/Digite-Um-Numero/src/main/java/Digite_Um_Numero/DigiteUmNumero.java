/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Digite_Um_Numero;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class DigiteUmNumero {
    public static void main(String[] args){
        int a;
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));
        dobro(a);
    }
    static void digite()
    {
    JOptionPane.showMessageDialog(null,"Digite um número::");
    } 
    static void dobro(int n)
    { 
       int d = n * 2;
       JOptionPane.showMessageDialog(null,"Dobro de " +n+ " é "+d);
    }
}
