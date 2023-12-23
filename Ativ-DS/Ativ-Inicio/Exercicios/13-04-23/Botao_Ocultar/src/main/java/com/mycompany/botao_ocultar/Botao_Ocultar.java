/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.botao_ocultar;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Danilo
 */
     public class Botao_Ocultar extends JFrame{
         JLabel rotulo1,rotulo2;
          JButton ocultar,exibir;
           public Botao_Ocultar(){
           super("Exemplodeocultareexibircomponente");
             Container tela = getContentPane();
             tela.setBackground(new Color(000,000,000));
               setLayout(null);

      rotulo1 = new JLabel("Rótulo1");
      rotulo2 = new JLabel("Rótulo2");
      ocultar = new JButton("Ocultar");
      exibir = new JButton("Exibir");

      rotulo1.setBounds(50,20,100,20);rotulo2.setBounds(50,60,100,20);
       rotulo1.setForeground(new Color(0,255,0)); rotulo2.setForeground(new Color(0,255,0));
       rotulo1.setFont(new Font("Courier New",Font.BOLD,18));rotulo2.setFont(new Font("Courier New",Font.BOLD,18));
      ocultar.setBounds(100,100,80,20);exibir.setBounds(250,100,80,20);
                   ocultar.addActionListener(
        
                          
                              
            new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                rotulo1.setVisible(false);
                 rotulo2.setVisible(false);
            }
              });

               exibir.addActionListener(
                  new ActionListener(){
                      public void actionPerformed(ActionEvent e){
                          rotulo1.setVisible(true);
                             rotulo2.setVisible(true);
                      }
                         }
                           );
               
               tela.add(rotulo1);tela.add(rotulo2);
               tela.add(ocultar);tela.add(exibir);
               
               setSize(400,250);
               setVisible(true);
               setLocationRelativeTo(null);
           }
           

    public static void main(String[] args) {
      Botao_Ocultar app = new Botao_Ocultar();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
