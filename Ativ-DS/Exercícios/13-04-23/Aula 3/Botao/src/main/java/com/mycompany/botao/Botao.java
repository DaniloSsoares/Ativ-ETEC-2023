
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
//Extends é usado para importar os comandos do JFrame

public class Botao extends JFrame{
           //Aqui é colocado os nomes das variaveis do JButton
      JButton botaoSair;
    public Botao(){      
        //texto qucriada.e será colocado na aba superior da janela 
    super("Exemplo de Botão");
             //criando uma variável chamada "tela" do tipo "Container" e atribuindo a ela o valor retornado pelo método "getContentPane()", que faz parte da classe "JFrame" do pacote "javax.swing".
        Container tela = getContentPane();
        setLayout(null);
        //Variavel sendo declarado suas caracteristicas
         botaoSair =new JButton("Sair");
         botaoSair.setBounds(100,50,100,20);
         
         //Adicionar ação alista que estará dentro do botão
         botaoSair.addActionListener(
                 //Chamando nova ação a ser listada.
         new ActionListener(){
             // performance da ação que o evento público chamara que será o exit.
             public void actionPerformed(ActionEvent e){
                 System.exit(0);
             }
               });
          //adicionando na tela
       tela.add(botaoSair);
       setSize(300,150);
       setVisible(true);
        setLocationRelativeTo(null);
    
}
    
    public static void main(String[] args) {
         //criando uma instância da classe "Botao"
       Botao app = new Botao();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
