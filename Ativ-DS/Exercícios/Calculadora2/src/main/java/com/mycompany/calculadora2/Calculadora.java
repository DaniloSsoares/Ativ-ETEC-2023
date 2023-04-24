/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class Calculadora extends JFrame {

JTextField texto1,texto2;
  JLabel rotulo1,rotulo2,result;
JButton somar,Sub,Mul,Div;
 
public Calculadora(){
    super("Calculadora");
     Container tela = getContentPane();
     setLayout(null);
     
     rotulo1 = new JLabel ("Número A:");
     rotulo2 = new JLabel ("Número B:");
     result = new JLabel("");
     
     texto1 = new JTextField(50);
     texto2 = new JTextField(50);
      
      
      somar = new JButton("+");
      Sub = new JButton("-");
      Mul = new JButton("*");
      Div = new JButton("/");
      
     //aqui está sendo colocado o tamanho e posições das  variaveis rotulo e texto
      rotulo1.setBounds(50,40,80,20);
       rotulo2.setBounds(50,80,80,20);
       
        texto1.setBounds(110,40,100,20);
       texto2.setBounds(110,80,100,20);
       
       result.setBounds(50,120,200,20);
        somar.setBounds(350,40,80,20);
        Sub.setBounds(400,40,80,20);
        Mul.setBounds(450,40,80,20);
        Div.setBounds(500,40,80,20);
       
    somar.addActionListener(
              //Chamando nova ação a ser listada.
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Declarandp Variaveis para fazer os calculos
    int numero1,numero2,soma;
    soma=0;
    numero1 = Integer.parseInt(texto1.getText());
    numero2 = Integer.parseInt(texto2.getText());
    
    soma = numero1 + numero2;
    result.setVisible(true);
    result.setText("A soma é: " +soma);
  }
   }
    );
      somar.addActionListener(
              //Chamando nova ação a ser listada.
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Declarandp Variaveis para fazer os calculos
    int numero1,numero2,soma;
    soma=0;
    numero1 = Integer.parseInt(texto1.getText());
    numero2 = Integer.parseInt(texto2.getText());
    
    soma = numero1 + numero2;
    result.setVisible(true);
    result.setText("A soma é: " +soma);
  }
   }
    );
        somar.addActionListener(
              //Chamando nova ação a ser listada.
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Declarandp Variaveis para fazer os calculos
    int numero1,numero2,soma;
    soma=0;
    numero1 = Integer.parseInt(texto1.getText());
    numero2 = Integer.parseInt(texto2.getText());
    
    soma = numero1 + numero2;
    result.setVisible(true);
    result.setText("A soma é: " +soma);
  }
   }
    );
        
    
    result.setVisible(false);
   
    tela.add(rotulo1);tela.add(rotulo2);
    tela.add(texto1);tela.add(texto2);
    tela.add(result);tela.add(somar);
    tela.add(Sub);
    tela.add(Mul);
    tela.add(Div);
   
    
    
    
         
       setSize(600,450);
        setVisible(true);
        setLocationRelativeTo(null);
}
 
    public static void main(String[] args) {
     Calculadora app = new Calculadora();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}