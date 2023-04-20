/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.botao_desb_hab;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Danilo
 */

//Extends é usado para importar os comandos do JFrame
public class Botao_Desb_Hab extends JFrame{
     //Aqui é colocado os nomes das variaveis do JButton JTextField,JLabel.
     JLabel Rotulo1,Rotulo2;
     JButton Desab,Habi;

      Botao_Desb_Hab(){
             //texto que é criada e será colocado na aba superior da janela 
      super("Botão Desabilitar e Habilitar");
     //criando uma variável chamada "tela" do tipo "Container" e atribuindo a ela o valor retornado pelo método "getContentPane()", que faz parte da classe "JFrame" do pacote "javax.swing".
      Container tela = getContentPane();
     //Colocando cor de fundo
       tela.setBackground(new Color(000,000,000));
      setLayout(null);
      
          //Variaveis sendo declaradas suas caracteristicas
      Rotulo1 = new JLabel("Rótulo 1"); Rotulo2 = new JLabel("Rótulo 2");
      Rotulo1.setForeground(new Color(0,255,0)); Rotulo2.setForeground(new Color(0,255,0));
      Rotulo1.setFont(new Font("Courier New",Font.BOLD,12));Rotulo2.setFont(new Font("Courier New",Font.BOLD,12));
      Rotulo1.setBounds(50,20,100,20);Rotulo2.setBounds(50,60,100,20);
      
      Desab=new JButton("Desabilitar");Habi=new JButton("Habilitar");
      Desab.setFont(new Font("Courier New",Font.BOLD,12));Habi.setFont(new Font("Courier New",Font.BOLD,12));
      Desab.setBounds(80,100,100,20);Habi.setBounds(250,100,100,20);
      
          //Adicionando eventos de desabilitar
      Desab.addActionListener((ActionEvent e) -> {
          Rotulo1.setEnabled(false);
          Rotulo2.setEnabled(false);
      });
      //Adicionando eventos de habilitar
      Habi.addActionListener((ActionEvent e) -> {
          Rotulo1.setEnabled(true);
          Rotulo2.setEnabled(true);
      });
      
      //Adicionando as variaveis na tela
      tela.add(Rotulo1); tela.add(Rotulo2);
       tela.add(Desab);tela.add(Habi);
       
     //Propriedades da janela
       setSize(400,250);
       setVisible(true);
       setLocationRelativeTo(null);

         }
      
    
    public static void main(String[] args) {
               //criando uma instância da classe "Botao_Desb_Hab"
        Botao_Desb_Hab app = new Botao_Desb_Hab();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
