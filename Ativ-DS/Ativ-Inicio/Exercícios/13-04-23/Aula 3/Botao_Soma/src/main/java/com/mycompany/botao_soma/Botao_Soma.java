/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.botao_soma;

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
public class Botao_Soma extends JFrame{
    //Aqui é colocado os nomes das variaveis do JButton JTextField,JLabel.
JLabel rotulo1,rotulo2,exibir;
JTextField text1,text2;
JButton somar;

public Botao_Soma(){
    //texto que é criada e será colocado na aba superior da janela 
    super("Exemplo de soma");
    //criando uma variável chamada "tela" do tipo "Container" e atribuindo a ela o valor retornado pelo método "getContentPane()", que faz parte da classe "JFrame" do pacote "javax.swing".
    Container tela = getContentPane();
    setLayout(null);
     //Variaveis sendo declaradas suas caracteristicas
    rotulo1 = new JLabel("1 Número");
    rotulo2 = new JLabel("2 Número");
    text1 = new JTextField(5);
    text2 = new JTextField(5);
    exibir = new JLabel("");
    somar = new JButton("Somar");
    
    
    rotulo1.setBounds(50,20,100,20);rotulo2.setBounds(50,60,100,20);
    text1.setBounds(120,20,200,20);text2.setBounds(120,60,200,20);
    exibir.setBounds(50,120,200,20);somar.setBounds(150,100,80,20);
    
    //Adicionar ação da lista que estará dentro do botão
    somar.addActionListener(
              //Chamando nova ação a ser listada.
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Declarandp Variaveis para fazer os calculos
    int numero1,numero2,soma;
    soma=0;
    numero1 = Integer.parseInt(text1.getText());
    numero2 = Integer.parseInt(text2.getText());
    //Somando os valores
    soma = numero1 + numero2;
    exibir.setVisible(true);
    exibir.setText("A soma é: " +soma);
  }
   }
    );
    //Exibindo
    exibir.setVisible(false);
    //Adicionando
    tela.add(rotulo1);tela.add(rotulo2);
    tela.add(text1);tela.add(text2);
    tela.add(exibir);tela.add(somar);
    
    //Propriedades da janela
    setSize(400,250);
setVisible(true);
setLocationRelativeTo(null);
}

    public static void main(String[] args) {
        //criando uma instância da classe "Botao_Soma"
        Botao_Soma app = new Botao_Soma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
