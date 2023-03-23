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
    public static void main(String[] args) {
      Vendedor ven = new Vendedor();
       double valorVendido =(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda")));
       ven.calculoComissao(valorVendido);
       JOptionPane.showConfirmDialog(null, ven.getResult());
    }
}
