/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
 
    public public static void main(String[] args) {
         double N1= 0;
         double N2= 0;
    
        Calculadora cal1 = new Calculadora();
        //Instanciação do objeto cx1
        int op; //declaraçao da varavel de opçoes
        do{ 
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Entrada " +
                    "\n2 - Retirada \n3 - Consultar o saldo \n0 - Sair"));
        
          switch (op) { //abertura da estrutura de swich-case
        case 1:
       
        break;
         case 2:
           N1 JOptionPane.showInputDialog("Digite seu valor A")));
            N2 JOptionPane.showInputDialog("Digite seu valor A")));
        cal1.subtrair(A, B); //Chamada ao método retirar do objeto cx1
        break;
         case 3:
            //Apresentação do conteúdo do atributo saldo 
        JOptionPane.showMessageDialog(null, "Saldo atual: " +cx1.getSaldo());
        break;
         case 0:
             JOptionPane.showMessageDialog(null, "Finalizando programa! " +cx1.getSaldo());
             break;
         default:
             JOptionPane.showMessageDialog(null, "Opção Invaloda!");
  
    }
}
