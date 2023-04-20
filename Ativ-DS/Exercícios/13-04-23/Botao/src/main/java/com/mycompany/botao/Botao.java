
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.botao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Danilo
 */
public class Botao extends JFrame{
JButton botaoSair;
public Botao(){
    super("Exemplo de Botão");
        Container tela = getContentPane();
        setLayout(null);
         botaoSair =new JButton("Sair");
         botaoSair.setBounds(100,50,100,20);
         botaoSair.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 System.exit(0);
             }
               });
       tela.add(botaoSair);
       setSize(300,150);
       setVisible(true);
        setLocationRelativeTo(null);
    
}
    
    public static void main(String[] args) {
       Botao app = new Botao();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
