/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4_6;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class Exercicio extends JFrame {
    JTextField texto1,texto2;
    JLabel nome,idade ,sx,inter,civil;
    JButton limpar,env;
    JComboBox lista;
    ButtonGroup grupo;
    JRadioButton masc,fem;
    String civ[] = {"Solteiro(a)" , "Casado(a)"};
    JCheckBox Auto,Barc,Avi;
            
   public Exercicio(){
        super("Exemplo de Botões com Diálogos de confirmação");
    Container tela = getContentPane();
     ImageIcon icone = new  ImageIcon("src/img/images.png");
    setIconImage(icone.getImage());
    setLayout(null);
    
       
   nome= new JLabel("Nome:"); 
   idade= new JLabel("Idade:");
   sx= new JLabel("Sexo:");
   inter= new JLabel("Interesses:");
   civil= new JLabel("Estado Civil:");
   
   masc = new JRadioButton("Masculino");
   fem = new JRadioButton("Ferminino");
   
   texto1 = new JTextField(50);
   texto2 = new JTextField(20);
   
   Auto=new JCheckBox("Automóveis");
    Barc=new JCheckBox("Barcos");
     Avi=new JCheckBox("Aviões");
   
   limpar=new JButton("Limpar os Dados");
   env=new JButton("Enviar Dados");
   
   lista=new JComboBox(civ);
   lista.setMaximumRowCount(2);
   
   grupo = new ButtonGroup();
   grupo.add(masc);
   grupo.add(fem);
    
 nome.setBounds(40,60,70,20);
 idade.setBounds(40,100,70,20);
 sx.setBounds(40,140,70,20);
 inter.setBounds(40,180,300,20);
 civil.setBounds(40,320,150,20);
 
 texto1.setBounds(100,60,250,20);
 texto2.setBounds(100,100,70,20);
 
 Auto.setBounds(40,210,100,20);
 Barc.setBounds(40,240,100,20);
 Avi.setBounds(40,270,100,20);
    
 limpar.setBounds(40,360,150,20);
 env.setBounds(200,360,150,20);
 
 masc.setBounds(100,140,100,20);
 fem.setBounds(200,140,100,20);
 
 lista.setBounds(130,320,150,20);
 
     tela.add(nome);tela.add(idade);
     tela.add(inter);tela.add(sx);
     tela.add(civil);tela.add(masc);
     tela.add(fem);tela.add(limpar);
     tela.add(env);tela.add(texto1);
     tela.add(texto2);tela.add(lista);
     tela.add(Auto);tela.add(Barc);
     tela.add(Avi);
     
     setSize(400,500);
     setLocationRelativeTo(null);
     setVisible(true);
}
 public static void main(String[] args) {
       Exercicio app = new Exercicio();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
     