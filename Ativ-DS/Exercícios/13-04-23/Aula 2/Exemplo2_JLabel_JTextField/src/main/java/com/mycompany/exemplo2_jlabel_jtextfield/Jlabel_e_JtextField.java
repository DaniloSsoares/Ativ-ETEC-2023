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

//Extends é usado para importar os comandos do JFrame
public class Jlabel_e_JtextField extends JFrame{
    //Aqui é colocado os nomes das variaveis do JFrame,JTextField,JLabel
  JLabel rotulo1,rotulo2,rotulo3,rotulo4;  
  JTextField texto1,texto2,texto3,texto4;
  JLabel imagem;
  
  public Jlabel_e_JtextField(){
      //texto qucriada.e será colocado na aba superior da janela 
      super("Exemplo com JTextField");
      
      //criando uma variável chamada "tela" do tipo "Container" e atribuindo a ela o valor retornado pelo método "getContentPane()", que faz parte da classe "JFrame" do pacote "javax.swing".
      Container tela = getContentPane();
      
      //criando uma variável chamada "Ico" do tipo "ImageIco" e atribuindo a ela o valor retornado pelo método "ImageIco()".
       ImageIcon ico = new  ImageIcon("src/img/deku.jpeg");
     setIconImage(ico.getImage());
      setLayout(null);
      
     //está criando um objeto JLabel com o texto "Nome" etc, e atribuindo-o à variável "rotulo".
      rotulo1 = new JLabel ("Nome");
      rotulo2 = new JLabel ("Idade");
      rotulo3 = new JLabel ("Telefone");
      rotulo4 = new JLabel ("Celular");
      
      //está criando um objeto JTextField com uma aba texto, e atribuindo-o à variável "texto".
      texto1 = new JTextField(50);
      texto2 = new JTextField(3);
      texto3 = new JTextField(10);
      texto4 = new JTextField(10);
      
      //aqui está sendo colocado o tamanho e posições das  variaveis rotulo e texto
      rotulo1.setBounds(50,40,80,20);
       rotulo2.setBounds(50,80,80,20);
        rotulo3.setBounds(30,120,80,20);
         rotulo4.setBounds(40,160,80,20);
         
      texto1.setBounds(110,40,80,20);
       texto2.setBounds(110,80,20,20);
        texto3.setBounds(110,120,80,20);
         texto4.setBounds(110,160,80,20);
         
          //Aqui esta sendo colocada a Cor da fonte para a caixa de texto
         texto1.setForeground(Color.gray);
         texto2.setForeground(Color.gray);
         texto3.setForeground(Color.gray);
         texto4.setForeground(Color.gray);
         
        // Alinhamento do texto de uma caixa de texto
         texto1.setHorizontalAlignment(JTextField.LEFT);
         texto2.setHorizontalAlignment(JTextField.RIGHT);
         texto3.setHorizontalAlignment(JTextField.CENTER);
         texto4.setHorizontalAlignment(JTextField.CENTER);
         
           texto2.requestFocus();
           
              //Aqui esta sendo colocada a Cor da fonte para a caixa de texto
          rotulo1.setForeground(Color.red);
          rotulo2.setForeground(Color.blue);
          rotulo3.setForeground(new Color(70,130,180));
          rotulo4.setForeground(new Color(0,255,255));
          
          //Aqui esta sendo colocada o estilo da letra da variavel rotulo
          rotulo1.setFont(new Font("Arial",Font.BOLD,14));
         rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
         rotulo3.setFont(new Font("Courier New",Font.BOLD,18));
         rotulo4.setFont(new Font("Times New Roman",Font.BOLD,20));
         
          //Adiconando na janela as variaveis
         tela.add(rotulo1);
         tela.add(rotulo2);
         tela.add(rotulo3);
         tela.add(rotulo4);
         tela.add(texto1);
         tela.add(texto2);
         tela.add(texto3);
         tela.add(texto4);
         
         //imagem do  midoria
          ImageIcon icone = new ImageIcon("src/img/midoria.png");
          imagem = new JLabel(icone);
          imagem.setBounds(250,30, 200, 150);
          tela.add(imagem);

          //Tamanho da janela e sua visualização
          
         setSize(500,300);
         setVisible(true);
         setLocationRelativeTo(null);
         
  }
 public static void main(String args[]){
     //criando uma instância da classe Jlabel_e_JtextField""Jlabel_e_JtextField"
     Jlabel_e_JtextField app = new Jlabel_e_JtextField();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
