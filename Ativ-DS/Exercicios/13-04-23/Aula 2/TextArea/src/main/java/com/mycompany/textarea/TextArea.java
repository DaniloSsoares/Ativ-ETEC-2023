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
//Extends é usado para importar os comandos do JFrame
public class TextArea extends JFrame {

       //Aqui é colocado os nomes das variaveis do JFrame,JTextField,JLabel,JScrollPane,Jpane
       JLabel rotulo;
       JTextArea texto;
       JScrollPane painelrolagem;
       JPanel painel;
       
       public TextArea(){
       //texto qucriada.e será colocado na aba superior da janela 
       super("Exemplo com JTextField");
         //criando uma variável chamada "tela" do tipo "Container" e atribuindo a ela o valor retornado pelo método "getContentPane()", que faz parte da classe "JFrame" do pacote "javax.swing".
       Container tela = getContentPane();
        //cor do backgroud da janela
    tela.setBackground(new Color(000,000,000));
       tela.setLayout(null);
       //caracteristicas da variavel rotulo
       rotulo = new JLabel("Endereço");
       rotulo.setForeground(new Color(0,255,0));
       rotulo.setFont(new Font("Courier New",Font.BOLD,18));
       rotulo.setBounds(50,20,100,20);
       //Caracteristica da variavel texto
       texto = new JTextArea(20,30);
       texto.setBounds(50,20,100,20);
       
       texto.setLineWrap(true);
       texto.setWrapStyleWord(true);
       //Rolagem
       painelrolagem = new JScrollPane(texto);
       painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       painel = new JPanel();
       painel.add(painelrolagem);
       painel.setBounds(40,40,350,340);
       //Adicionando variaveis na tela
       tela.add(rotulo);
       tela.add(painel);setSize(500,450);
       setVisible(true);
       setLocationRelativeTo(null);
}

public static void main(String args[]){
    //criando uma instância da classe TextArea"

TextArea app = new TextArea();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}}
