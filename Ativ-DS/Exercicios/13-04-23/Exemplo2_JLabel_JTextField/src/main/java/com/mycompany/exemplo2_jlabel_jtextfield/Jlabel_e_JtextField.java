/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2_jlabel_jtextfield;

import javax.swing.JLabel;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author dti
 */
public class Jlabel_e_JtextField extends JFrame{
  JLabel rotulo1,rotulo2,rotulo3,rotulo4;  
  JTextField texto1,texto2,texto3,texto4;
  JLabel imagem;
  
  public Jlabel_e_JtextField(){
      super("Exemplo com JTextField");
      Container tela = getContentPane();
       ImageIcon ico = new  ImageIcon("src/img/deku.jpeg");
     setIconImage(ico.getImage());
      setLayout(null);
      
      rotulo1 = new JLabel ("Nome");
      rotulo2 = new JLabel ("Idade");
      rotulo3 = new JLabel ("Telefone");
      rotulo4 = new JLabel ("Celular");
      
      texto1 = new JTextField(50);
      texto2 = new JTextField(3);
      texto3 = new JTextField(10);
      texto4 = new JTextField(10);
      
      rotulo1.setBounds(50,40,80,20);
       rotulo2.setBounds(50,80,80,20);
        rotulo3.setBounds(30,120,80,20);
         rotulo4.setBounds(40,160,80,20);
         
      texto1.setBounds(110,40,80,20);
       texto2.setBounds(110,80,20,20);
        texto3.setBounds(110,120,80,20);
         texto4.setBounds(110,160,80,20);
         
          rotulo1.setForeground(Color.red);
          rotulo2.setForeground(Color.blue);
          rotulo3.setForeground(new Color(70,130,180));
          rotulo4.setForeground(new Color(0,255,255));
          
          rotulo1.setFont(new Font("Arial",Font.BOLD,14));
         rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
         rotulo3.setFont(new Font("Courier New",Font.BOLD,18));
         rotulo4.setFont(new Font("Times New Roman",Font.BOLD,20));
          
         tela.add(rotulo1);
         tela.add(rotulo2);
         tela.add(rotulo3);
         tela.add(rotulo4);
         tela.add(texto1);
         tela.add(texto2);
         tela.add(texto3);
         tela.add(texto4);
         
         
          ImageIcon icone = new ImageIcon("src/img/midoria.png");
          imagem = new JLabel(icone);
          imagem.setBounds(250,30, 200, 150);
          tela.add(imagem);

          
         setSize(500,300);
         setVisible(true);
         setLocationRelativeTo(null);
         
  }
 public static void main(String args[]){
     Jlabel_e_JtextField app = new Jlabel_e_JtextField();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
