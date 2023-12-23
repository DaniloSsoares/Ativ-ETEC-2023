/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle_de_comissao;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Principal {
    //Inicio do main
    public static void main(String[] args) {
          //Instancia
      Vendedor ven = new Vendedor();
       //recebendo valor da venda
       double valorVendido =(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda")));
        //recebendo valor da classe vendedor 
       double resutado = ven.calculoComissao(valorVendido);
       
        //Mostrando resultado
     JOptionPane.showMessageDialog(null, ven.getNome()+  " Seu Resulltado é " +resutado);
    }
}
