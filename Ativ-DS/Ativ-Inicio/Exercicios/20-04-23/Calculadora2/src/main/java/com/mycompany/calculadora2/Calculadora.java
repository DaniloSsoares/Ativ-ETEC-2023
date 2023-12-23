/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.text.html.HTML.Tag.S;

/**
 *
 * @author dti
 */
public class Calculadora extends JFrame {

JTextField texto1,texto2;
  JLabel rotulo1,rotulo2,result1,result2;
JButton somar,Sub,Mul,Div, Limpar,Des,Hab,ocultar,aparecer,Sair;
 
public Calculadora(){
    super("Calculadora");
     Container tela = getContentPane();
     ImageIcon icone = new  ImageIcon("src/img/cal.png");
     setIconImage(icone.getImage());
     tela.setBackground(new Color(000,000,000));
     setLayout(null);
     
     rotulo1 = new JLabel ("Número A:");rotulo2 = new JLabel ("Número B:");
     rotulo1.setForeground(new Color(255,255,255)); rotulo2.setForeground(new Color(255,255,255));
     rotulo1.setFont(new Font("Courier New",Font.BOLD,12));rotulo2.setFont(new Font("Courier New",Font.BOLD,12));
     
     
     result1 = new JLabel(""); result2 = new JLabel("");
     
     
     
     Limpar = new JButton("Limpar");Sair =new JButton("Sair");
     Limpar.setForeground(new Color(255,255,255)); Sair.setForeground(new Color(255,255,255));
     Limpar.setBackground(new Color(255,69,0));Sair.setBackground(new Color(255,69,0));
     
     Des=new JButton("Desabilitar");Hab=new JButton("Habilitar");
     Des.setForeground(new Color(255,255,255)); Hab.setForeground(new Color(255,255,255));
     Des.setBackground(new Color(255,69,0));Hab.setBackground(new Color(255,69,0));
     
     ocultar = new JButton("Ocultar");aparecer = new JButton("Exibir");
     ocultar.setForeground(new Color(255,255,255)); aparecer.setForeground(new Color(255,255,255));
     ocultar.setBackground(new Color(255,69,0));aparecer.setBackground(new Color(255,69,0));
     
     
     texto1 = new JTextField(50);
     texto2 = new JTextField(50);
     
     Limpar.setMnemonic(KeyEvent.VK_L);
     ocultar.setMnemonic(KeyEvent.VK_O);
     Hab.setMnemonic(KeyEvent.VK_H);
     Des.setMnemonic(KeyEvent.VK_D);
     Sair.setMnemonic(KeyEvent.VK_S);
     aparecer.setMnemonic(KeyEvent.VK_A);
      
      
      somar = new JButton("+");
      somar.setForeground(new Color(255,255,255));
      somar.setBackground(new Color(255,69,0));
      Sub = new JButton("-");
      Sub.setForeground(new Color(255,255,255));
      Sub.setBackground(new Color(255,69,0));
      Mul = new JButton("*");
      Mul.setForeground(new Color(255,255,255));
      Mul.setBackground(new Color(255,69,0));
      Div = new JButton("/");
      Div.setForeground(new Color(255,255,255));
      Div.setBackground(new Color(255,69,0));
      
     //aqui está sendo colocado o tamanho e posições das  variaveis rotulo e texto
        rotulo1.setBounds(45,40,80,20);
        rotulo2.setBounds(45,80,80,20);
       
        texto1.setBounds(110,40,200,20);
        texto2.setBounds(110,80,200,20);
       
        result1.setBounds(50,120,200,20);
        result2.setBounds(120,120,200,20);
       
        somar.setBounds(350,40,100,20);Sub.setBounds(350,60,100,20);
        Mul.setBounds(350,80,100,20);Div.setBounds(350,100,100,20);
        
        Limpar.setBounds(325,120,150,20);Sair.setBounds(350,250,80,20);
        Des.setBounds(180,200,100,20);Hab.setBounds(80,200,100,20);
        ocultar.setBounds(270,200,80,20);aparecer.setBounds(350,200,80,20);
     
       
    somar.addActionListener(
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
    int numero1,numero2,soma;
    
    numero1 = Integer.parseInt(texto1.getText());
    numero2 = Integer.parseInt(texto2.getText());
    
    soma = numero1 + numero2;
    
        result1.setForeground(new Color(255,69,0 ));
        result1.setText("Resultado::");
        result2.setForeground(Color.white);
        result2.setText("A SOMA é: " +soma);
  }
   }
    );
   
    Sub.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
        int numero1, numero2,subt;

        numero1=Integer.parseInt(texto1.getText());
        numero2=Integer.parseInt(texto2.getText());
        subt=numero1-numero2;
        
        result1.setVisible(true);
         result2.setVisible(true);
         
        result1.setForeground(new Color(255,69,0));
        result1.setText("Resultado::");
        result2.setForeground(Color.white);
        result2.setText("A SUBTRAÇÃO é: " +subt);
        }
         }
          );
    
    Mul.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
        int numero1, numero2,mult;

        numero1=Integer.parseInt(texto1.getText());
        numero2=Integer.parseInt(texto2.getText());
        mult=numero1*numero2;
        
        result1.setVisible(true);
         result2.setVisible(true);
         
        result1.setForeground(new Color(255,69,0));
        result1.setText("Resultado::");
        result2.setForeground(Color.white);
        result2.setText("A SUBTRAÇÃO é: " +mult);
        }
         }
          );
    
    
    Div.addActionListener(
    new ActionListener(){
    public void actionPerformed(ActionEvent e){    
     int numero1, numero2, divi;
     
     numero1 = Integer.parseInt(texto1.getText());
     numero2 = Integer.parseInt(texto2.getText());
     divi = numero1/numero2;
     
     result1.setVisible(true);
     result2.setVisible(true);
     
        result1.setForeground(new Color(255,69,0) );
        result1.setText("Resultado::");
        result2.setForeground(Color.white);
        result2.setText("A SUBTRAÇÃO é: " +divi);
     
        }
    }
    );
   
    result1.setVisible(false);
     result2.setVisible(false);
     
     Limpar.addActionListener(
        new ActionListener(){
    //Chamando nova ação a ser listada.
    public void actionPerformed(ActionEvent e){
  
    texto1.setText(null);
    texto2.setText(null);
    texto1.requestFocus();
    }
     }
       );
       Des.addActionListener((ActionEvent e) -> {
          rotulo1.setEnabled(false);
          rotulo2.setEnabled(false);
          texto1.setEnabled(false);
          texto2.setEnabled(false);
          result1.setEnabled(false);
          result2.setEnabled(false);
      }
       );
     
      Hab.addActionListener((ActionEvent e) -> {
          rotulo1.setEnabled(true);
          rotulo2.setEnabled(true);
          texto1.setEnabled(true);
          texto2.setEnabled(true);
          result1.setEnabled(true);
          result2.setEnabled(true);
      } 
       );
      
          ocultar.addActionListener(    
            new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                 rotulo1.setVisible(false);
                 rotulo2.setVisible(false);
                 texto1.setVisible(false);
                 texto2.setVisible(false);
                 result1.setVisible(false);
                 result2.setVisible(false);
            }
              });
       
               aparecer.addActionListener(
                  new ActionListener(){
                      //Ativando o evento
                      public void actionPerformed(ActionEvent e){
                             rotulo1.setVisible(true);
                             rotulo2.setVisible(true);
                             texto1.setVisible(true);
                             texto2.setVisible(true);
                             result1.setVisible(true);
                             result2.setVisible(true);
                      }
                         }
                           );
             Sair.addActionListener(
             new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 System.exit(0);
             }
               });
      
   
    tela.add(rotulo1);tela.add(rotulo2);
    tela.add(texto1);tela.add(texto2);
    tela.add(result1); tela.add(result2);
          
    tela.add(somar);tela.add(Sub);
    tela.add(Mul);tela.add(Div);
    
    tela.add(Limpar); tela.add(Des);
    tela.add(Hab);tela.add(ocultar);
    tela.add(aparecer);tela.add(Sair);
    
    
         
       setSize(600,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
}
 
    public static void main(String[] args) {
     Calculadora app = new Calculadora();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}