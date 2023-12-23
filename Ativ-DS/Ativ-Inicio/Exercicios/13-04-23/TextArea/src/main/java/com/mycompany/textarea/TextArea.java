/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.textarea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Danilo
 */
public class TextArea extends JFrame {

   
       JLabel rotulo;
       JTextArea texto;
       JScrollPane painelrolagem;
       JPanel painel;
       
       public TextArea(){
       super("Exemplo com JTextField");
       Container tela = getContentPane();
    tela.setBackground(new Color(000,000,000));
       tela.setLayout(null);
       
       rotulo = new JLabel("Endereço");
       rotulo.setForeground(new Color(0,255,0));
       rotulo.setFont(new Font("Courier New",Font.BOLD,18));
       rotulo.setBounds(50,20,100,20);
       texto = new JTextArea(20,30);
       texto.setBounds(50,20,100,20);
       
       painelrolagem = new JScrollPane(texto);
       painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       painel = new JPanel();
       painel.add(painelrolagem);
       painel.setBounds(40,40,350,340);
       
       tela.add(rotulo);
       tela.add(painel);setSize(500,450);
       setVisible(true);
       setLocationRelativeTo(null);
}

public static void main(String args[]){
TextArea app = new TextArea();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}}
