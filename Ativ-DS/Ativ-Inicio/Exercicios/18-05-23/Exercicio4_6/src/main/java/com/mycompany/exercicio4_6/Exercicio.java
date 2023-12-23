/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4_6;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class Exercicio extends JFrame {
    JTextField texto1,texto2;
    JLabel nome,idade ,sx,inter,civil,estudante;
    JButton limpar,env,sair;
    JComboBox lista,lista2;
    ButtonGroup grupo;
    JRadioButton masc,fem;
    String civ[] = {"Solteiro(a)" , "Casado(a)","Divorciado(a)","Viúvo(a)","Outros (\"Prefiro não dizer\")"};
    JCheckBox Auto,Barc,Avi;
    String cor[] = {"Sem cor" , "Noturno" };
            
   public Exercicio(){
        super("Exemplo de Botões com Diálogos de confirmação");
    Container tela = getContentPane();
     ImageIcon icone = new  ImageIcon("src/img/cadastro.png");
    setIconImage(icone.getImage());
    setResizable(false);
    setLayout(null);
    
       
   nome= new JLabel("Nome:"); 
   idade= new JLabel("Idade:");
   sx= new JLabel("Sexo:");
   inter= new JLabel("Interesses:");
   civil= new JLabel("Estado Civil:");
    estudante= new JLabel("Realizado por Danilo Santos Soares\n 2 DS AMS");
    sair = new JButton("Sair");
   
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
   lista.setMaximumRowCount(5);
   
    lista2=new JComboBox(cor);
     lista2.setMaximumRowCount(2);
     
      limpar.setMnemonic(KeyEvent.VK_L);
      sair.setMnemonic(KeyEvent.VK_S);
   
   grupo = new ButtonGroup();
   grupo.add(masc);
   grupo.add(fem);
    
 nome.setBounds(40,60,70,20);
 idade.setBounds(40,100,70,20);
 sx.setBounds(40,140,70,20);
 inter.setBounds(40,180,300,20);
 civil.setBounds(40,320,150,20);
 estudante.setBounds(40,450,300,20);
 
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
 lista2.setBounds(40,400,150,20);
 
 sair.setBounds(225,400,100,20);
 
env.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
       String resultados = "Seu Cadastro foi realizado: \n" +
                    "\n Nome: " + texto1.getText() +
                    "\n Sua Idade: " + texto2.getText() +
                    "\n Seu Sexo: " + (masc.isSelected() ? "Masculino" : "Feminino") +
                    "\n Seus Interesses: " +
               (Auto.isSelected() ? "Automóveis " : "") +
               (Barc.isSelected() ? "Barcos " : "") +
                (Avi.isSelected() ? "Aviões" : "") +
                    "\n Seu estado civil: " + lista.getSelectedItem();
        JOptionPane.showMessageDialog(null, resultados);
        JOptionPane.showMessageDialog(null, "Obrigado por se Cadastrar!!");
    }
});

limpar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto1.setText("");
            texto2.setText("");
            grupo.clearSelection(); 
            Auto.setSelected(false);
            Barc.setSelected(false); 
            Avi.setSelected(false); 
             lista.setSelectedIndex(-1);
            texto1.requestFocus();}});

lista2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String corSelecionada = lista2.getSelectedItem().toString();

        if (corSelecionada.equals("Sem cor")) {
            getContentPane().setBackground(null);
            texto1.setForeground(new Color(000,000,000));
              texto2.setForeground(new Color(000,000,000));
              nome.setForeground(new Color(000,000,000));
              sx.setForeground(new Color(000,000,000));
              idade.setForeground(new Color(000,000,000));
              inter.setForeground(new Color(000,000,000));
              estudante.setForeground(new Color(000,000,000));
              fem.setForeground(new Color(000,000,000));
              masc.setForeground(new Color(000,000,000));
              limpar.setForeground(new Color(000,000,000));
              env.setForeground(new Color(000,000,000));
              Auto.setForeground(new Color(000,000,000));
              Barc.setForeground(new Color(000,000,000));
              Avi.setForeground(new Color(000,000,000));
              civil.setForeground(new Color(000,000,000));
              lista.setForeground(new Color(000,000,000));
              lista2.setForeground(new Color(000,000,000));
              sair.setForeground(new Color(000,000,000));
              
              texto1.setBackground(new Color(255,255,255));
              texto2.setBackground(new Color(255,255,255));
              masc.setBackground(new Color(255,255,255));
              fem.setBackground(new Color(255,255,255));
               limpar.setBackground(new Color(255,255,255));
              env.setBackground(new Color(255,255,255));
              Auto.setBackground(new Color(255,255,255));
              Barc.setBackground(new Color(255,255,255));
              Avi.setBackground(new Color(255,255,255));
              civil.setBackground(new Color(255,255,255));
               lista.setBackground(new Color(255,255,255));
              lista2.setBackground(new Color(255,255,255));
               sair.setBackground(new Color(255,255,255));
              
        } else if (corSelecionada.equals("Noturno")) {
            getContentPane().setBackground(Color.black);
             texto1.setForeground(new Color(255,255,255));
              texto2.setForeground(new Color(255,255,255));
              nome.setForeground(new Color(255,255,255));
              sx.setForeground(new Color(255,255,255));
              idade.setForeground(new Color(255,255,255));
              inter.setForeground(new Color(255,255,255));
              lista.setForeground(new Color(255,255,255));
              lista2.setForeground(new Color(255,255,255));
              fem.setForeground(new Color(255,255,255));
              masc.setForeground(new Color(255,255,255));
              limpar.setForeground(new Color(255,255,255));
              env.setForeground(new Color(255,255,255));
              Auto.setForeground(new Color(255,255,255));
              Barc.setForeground(new Color(255,255,255));
              Avi.setForeground(new Color(255,255,255));
              civil.setForeground(new Color(255,255,255));
               sair.setForeground(new Color(255,255,255));
                estudante.setForeground(new Color(255,255,255));
              
              texto1.setBackground(new Color(128,128,128));
              texto2.setBackground(new Color(128,128,128));
              lista.setBackground(new Color(128,128,128));
              texto2.setBackground(new Color(128,128,128));
              lista2.setBackground(new Color(128,128,128));
              civil.setBackground(new Color(128,128,128));
              masc.setBackground(new Color(128,128,128));
              fem.setBackground(new Color(128,128,128));
               limpar.setBackground(new Color(128,128,128));
              env.setBackground(new Color(128,128,128));
              Auto.setBackground(new Color(128,128,128));
              Barc.setBackground(new Color(128,128,128));
              Avi.setBackground(new Color(128,128,128));
              civil.setBackground(new Color(128,128,128));
               sair.setBackground(new Color(128,128,128));
              }      
    }
});

   sair.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
            
                           int opcao;
            
                            Object[] botoes = {"Sim","Não"};
                             opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",
                          JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                                    if(opcao==JOptionPane.YES_OPTION)System.exit(0);
              } 
                }
                  );
  
 
     tela.add(nome);tela.add(idade);
     tela.add(inter);tela.add(sx);
     tela.add(civil);tela.add(masc);
     tela.add(fem);tela.add(limpar);
     tela.add(env);tela.add(texto1);
     tela.add(texto2);tela.add(lista);
     tela.add(Auto);tela.add(Barc);
     tela.add(Avi);tela.add(lista2);
     tela.add(sair);tela.add(estudante);
     
     setSize(400,525);
     setLocationRelativeTo(null);
     setVisible(true);
}
 public static void main(String[] args) {
       Exercicio app = new Exercicio();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
     