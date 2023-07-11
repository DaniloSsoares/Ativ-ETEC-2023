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
//Extends é usado para importar os comandos do JFrame

public class Botao_Limpar extends JFrame {
      //Aqui é colocado os nomes das variaveis do JButton JTextField,JLabel.
JLabel rotulo1,rotulo2;
JTextField text1,text2;
JButton limpar;

public Botao_Limpar(){
        //texto que é criada e será colocado na aba superior da janela 

super("Exemplo Limpar");
    //criando uma variável chamada "tela" do tipo "Container" e atribuindo a ela o valor retornado pelo método "getContentPane()", que faz parte da classe "JFrame" do pacote "javax.swing".
Container tela = getContentPane();
setLayout(null);

     //Variaveis sendo declaradas suas caracteristicas
rotulo1 = new JLabel("1ºNúmero:");
rotulo2 = new JLabel("2ºNúmero:");
text1 = new JTextField(5);
text2 = new JTextField(5);
limpar = new JButton("Limpar");

rotulo1.setBounds(50,20,100,20);rotulo2.setBounds(50,60,100,20);
text1.setBounds(120,20,200,20);text2.setBounds(120,60,200,20);
              limpar.setBounds(150,100,80,20);

 //Adicionar ação da lista que estará dentro do botão
limpar.addActionListener(
        new ActionListener(){
    //Chamando nova ação a ser listada.
    public void actionPerformed(ActionEvent e){
  
    text1.setText(null);
    text2.setText(null);
    text1.requestFocus();
    }
     }
       );

    //Adicionando
      tela.add(rotulo1);tela.add(rotulo2);
        tela.add(text1);tela.add(text2);
                 tela.add(limpar);
                 
             //Propriedades da janela
           setSize(400,250);
           setVisible(true);
           setLocationRelativeTo(null);
}

    public static void main(String[] args) {
        
                //criando uma instância da classe "Botao_Limpar"
        Botao_Limpar app = new Botao_Limpar();
          app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
