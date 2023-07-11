/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.botao_limpar;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Danilo
 */
public class Botao_Limpar extends JFrame {
JLabel rotulo1,rotulo2;
JTextField text1,text2;
JButton limpar;

public Botao_Limpar(){
super("Exemplo Limpar");

Container tela = getContentPane();
setLayout(null);

rotulo1 = new JLabel("1ºNúmero:");
rotulo2 = new JLabel("2ºNúmero:");
text1 = new JTextField(5);
text2 = new JTextField(5);
limpar = new JButton("Limpar");

rotulo1.setBounds(50,20,100,20);rotulo2.setBounds(50,60,100,20);
text1.setBounds(120,20,200,20);text2.setBounds(120,60,200,20);
              limpar.setBounds(150,100,80,20);

limpar.addActionListener(
        new ActionListener(){
    public void actionPerformed(ActionEvent e){
    text1.setText(null);
    text2.setText(null);
    text1.requestFocus();
    }
     }
       );
      tela.add(rotulo1);tela.add(rotulo2);
        tela.add(text1);tela.add(text2);
                 tela.add(limpar);
          
           setSize(400,250);
           setVisible(true);
           setLocationRelativeTo(null);
}

    public static void main(String[] args) {
        Botao_Limpar app = new Botao_Limpar();
          app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
