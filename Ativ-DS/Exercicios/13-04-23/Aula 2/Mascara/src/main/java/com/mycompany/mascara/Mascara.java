/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mascara;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.JFormattedTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Danilo
 */

//Extends é usado para importar os comandos do JFrame
public class Mascara extends JFrame{ 

     //Aqui é colocado os nomes das variaveis do JFrame,JTextField,JLabel
  JLabel cep,tel,cpf,data;  
  JTextField textcep,texttel,textcpf,textdata;
  MaskFormatter masccep,masctel,masccpf,mascdata;
  
  public Mascara (){
       //texto que será colocado na aba superior da janela criada.
      super("Exemplo com JTextField");
        //criando uma variável chamada "tela" do tipo "Container" e atribuindo a ela o valor retornado pelo método "getContentPane()"
      Container tela = getContentPane();
      //cor do backgroud da janela
    tela.setBackground(new Color(000,000,000));
     setLayout(null);
     
      //está criando um objeto JLabel com o texto "CEP" etc, e atribuindo-o à variável "cep".
      cep = new JLabel ("CEP:");
      tel= new JLabel ("TEL:");
      cpf = new JLabel ("CPF:");
      data = new JLabel ("DATA:");
      
      //aqui está sendo colocado o tamanho e posições das  variaveis CEP TEL CPF DATA
       cep.setBounds(50,40,100,20);
       tel.setBounds(50,80,100,20);
       cpf.setBounds(50,120,100,20);
       data.setBounds(50,160,100,20);
       
             //aqui está sendo colocado as core do cep,tel,cpf,data
        cep.setForeground(new Color(0,255,0));
          tel.setForeground(new Color(0,255,0));
          cpf.setForeground(new Color(0,255,0));
          data.setForeground(new Color(0,255,0));
          
                //aqui está sendo colocado o tipo de fonte
           cep.setFont(new Font("Courier New",Font.BOLD,18));
         tel.setFont(new Font("Courier New",Font.BOLD,18));
         cpf.setFont(new Font("Courier New",Font.BOLD,18));
         data.setFont(new Font("Courier New",Font.BOLD,18));
       
       // uso do símbolo # para permitir somente valores numéricos e uma chamada ao método set Place holder Character para definiro caractere que será exibido 
         try{
          masccep = new MaskFormatter("##### ###");
          masctel = new MaskFormatter("(##)#### ####");
           masccpf = new MaskFormatter("######## ##");
           mascdata = new MaskFormatter("## /## /####");
          masccep.setPlaceholderCharacter('_');
          masctel.setPlaceholderCharacter('_');
          masccpf.setPlaceholderCharacter('_');
          mascdata.setPlaceholderCharacter('_');
          
      }
         catch(ParseException excp){}
         
         textcep = new JFormattedTextField(masccep);
         texttel = new JFormattedTextField(masctel);
         textcpf = new JFormattedTextField(masccpf);
         textdata = new JFormattedTextField(mascdata);
         
         //aqui está sendo colocado o tamanho e posições das  variaveis CEP TEL CPF DATA so que no texto
                 textcep.setBounds(100,40,100,20);
                 texttel.setBounds(100,80,100,20);
                 textcpf.setBounds(100,120,100,20);
                 textdata.setBounds(120,160,100,20);
                 
                 cep.setBackground(Color.white);
                 tel.setBackground(Color.white);
                 cpf.setBackground( Color.white);
                 data.setBackground(Color.white);
                 
     
                  
                //Adiconando na janela as variaveis
          
                 tela.add(cep);
                 tela.add(tel);
                 tela.add(cpf);
                 tela.add(data);
                 
                 tela.add(textcep);
                 tela.add(texttel);
                 tela.add(textcpf);
                 tela.add(textdata);
                 
    
                    // Tamanho da janela e sua visualição

         setSize(500,300);
         setVisible(true);
         setLocationRelativeTo(null);
         
  }
 public static void main(String args[]){
     //criando uma instância da classe "mascara"
     Mascara  app = new Mascara ();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    }

