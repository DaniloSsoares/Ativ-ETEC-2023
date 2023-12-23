/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.botao.mostrar;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Danilo
 */
//Extends é usado para importar os comandos do JFrame

public class BotaoMostrar extends JFrame{
   //Aqui é colocado os nomes das variaveis do JButton Jpassoword,JLabel.
    JPasswordField caixa;
    JLabel rotulo, exibir;
    JButton mostrar;
    
    public BotaoMostrar(){
        //texto qucriada.e será colocado na aba superior da janela 
    super("Exemplo de Passoword");
    //criando uma variável chamada "tela" do tipo "Container" e atribuindo a ela o valor retornado pelo método "getContentPane()", que faz parte da classe "JFrame" do pacote "javax.swing".
Container tela = getContentPane();
setLayout(null);
        //Variaveis sendo declarado suas caracteristicas
rotulo = new JLabel("Senha:");
caixa = new JPasswordField(10);
exibir = new JLabel("A senha digtada é: ");
mostrar = new JButton ("Mostrar");
exibir.setVisible(false);

rotulo.setBounds(50,60,200,20);
caixa.setBounds(50,60,200,20);
exibir.setBounds(50,120,200,20);
mostrar.setBounds(150,100,80,20);

 //Adicionar ação alista que estará dentro do botão
mostrar.addActionListener((ActionEvent e) -> {
    String senha = new String(caixa .getPassword());
    exibir.setVisible(true);
    exibir.setText(senha);
    });
 //adicionando na tela
tela.add(rotulo);
tela.add(caixa);
tela.add(exibir);
tela.add(mostrar);
setSize(400,250);
setVisible(true);
setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
         //criando uma instância da classe "BotaoMostrar"
     BotaoMostrar app = new BotaoMostrar();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
