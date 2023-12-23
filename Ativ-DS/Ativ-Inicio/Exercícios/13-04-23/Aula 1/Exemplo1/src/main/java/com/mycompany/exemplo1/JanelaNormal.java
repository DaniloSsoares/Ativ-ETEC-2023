/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;
import java.awt.Color;
import java.awt.Container;
  import javax.swing.*;
/**
 *
 * @author dti
 */
public class JanelaNormal extends JFrame {
public JanelaNormal(){
    super("Nossa primeira janela");
    Container tela = getContentPane();
    tela.setBackground(new Color(119,136,153));
    ImageIcon icone = new  ImageIcon("src/img/image.jpeg");
    setIconImage(icone.getImage());
    setSize(300 , 200);
    setResizable(false);
    setLocationRelativeTo(null);
 
    setVisible(true);
}    
    public static void main(String[] args) {
        JanelaNormal app = new JanelaNormal();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
