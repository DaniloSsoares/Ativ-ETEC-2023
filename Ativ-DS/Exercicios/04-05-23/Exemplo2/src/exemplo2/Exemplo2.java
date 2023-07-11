/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author dti
 */
public class Exemplo2 extends JFrame {

JLabel rotulo1 ,rotulo2,rotulo3,rotulo4,texto;
JCheckBox negrito,italico,normal,negritoitalico;
JRadioButton tam1,tam2,tam3,tam4;
ButtonGroup grupo;
String cor[] = {"Sem cor" , "Vermelho" , "Azul" , "Verde" , "Amarelo" ,  "Branco" ,"Preto"};
JComboBox lista,lista2;
Integer estilo , tamfonte;

public Exemplo2(){
super ("Exemplo Combo Check Radio Box");
Container tela = getContentPane();
ImageIcon icone = new  ImageIcon("src/img/font.png");
    setIconImage(icone.getImage());
    setLayout(null);
     

rotulo1=new JLabel("Cor");
rotulo2=new JLabel("Estilo");
rotulo3=new JLabel("Tamanho");
texto=new JLabel("Programa feito em Java");
lista=new JComboBox(cor);
lista.setMaximumRowCount(7);
lista2=new JComboBox(cor);
lista2.setMaximumRowCount(7);
negrito=new JCheckBox("Negrito");
italico=new JCheckBox("Itálico");
normal=new JCheckBox("Normal");
negritoitalico=new JCheckBox("NegritoItálico");

tam1 = new JRadioButton("12");
tam2 = new JRadioButton("14");
tam3 = new JRadioButton("16");
tam4 = new JRadioButton("18");

grupo = new ButtonGroup();
grupo.add(tam1);
grupo.add(tam2);
grupo.add(tam3);
grupo.add(tam4);



 rotulo1.setBounds(40,20,70,20);
 rotulo2.setBounds(200,20,70,20);
 rotulo3.setBounds(300,20,70,20);
 
 texto.setBounds(100,200,300,20);
 lista.setBounds(40,50,150,20);
  lista2.setBounds(40,90,150,20);
 negrito.setBounds(200,70,100,20);
 italico.setBounds(200,70,100,20);
 normal.setBounds(200,90,100,20);
 negritoitalico.setBounds(200,110,100,20);
 
 tam1.setBounds(350,50,100,20);
 tam2.setBounds(350,70,100,20);
 tam3.setBounds(350,90,100,20);
 tam4.setBounds(350,110,100,20);
 
 estilo=Font.PLAIN;
 
 //coloca cor na fonte
 
 lista.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
       if(lista.getSelectedItem().toString()=="SemCor")
           texto.setForeground(Color.black);
       if(lista.getSelectedItem().toString()=="Vermelho")
           texto.setForeground(Color.red);
       if(lista.getSelectedItem().toString()=="Azul")
           texto.setForeground(Color.blue);
       if(lista.getSelectedItem().toString()=="Verde")
           texto.setForeground(Color.green);
       if(lista.getSelectedItem().toString()=="Amarelo")
           texto.setForeground(Color.yellow);
       if(lista.getSelectedItem().toString()=="Branco")
           texto.setForeground(Color.white);
       if(lista.getSelectedItem().toString()=="Preto")
           texto.setForeground(Color.black);}});
 
 // Coloca cor no fundo
lista2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String corSelecionada = lista2.getSelectedItem().toString();

        if (corSelecionada.equals("Sem cor")) {
            getContentPane().setBackground(null);
        } else if (corSelecionada.equals("Vermelho")) {
            getContentPane().setBackground(Color.RED);
        } else if (corSelecionada.equals("Azul")) {
            getContentPane().setBackground(Color.BLUE);
        } else if (corSelecionada.equals("Verde")) {
            getContentPane().setBackground(Color.GREEN);
        } else if (corSelecionada.equals("Amarelo")) {
            getContentPane().setBackground(Color.YELLOW);
        } else if (corSelecionada.equals("Branco")) {
            getContentPane().setBackground(Color.WHITE);
        } else if (corSelecionada.equals("Preto")) {
            getContentPane().setBackground(Color.BLACK);
        }
         
    }
});

 //coloca a fonte tamanho 12 
 tam1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
     tamfonte=12;
     texto.setFont(new Font("",estilo,tamfonte));}});
             

//coloca a fonte tamanho 12,14,16,18
 tam2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
     tamfonte=14;
     texto.setFont(new Font("",estilo,tamfonte));}});
 
 tam3.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
     tamfonte=16;
     texto.setFont(new Font("",estilo,tamfonte));}});
   
 tam4.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
     tamfonte=18;
     texto.setFont(new Font("",estilo,tamfonte));}});
 
negrito.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    estilo=Font.BOLD;
    normal.setSelected(false);
    italico.setSelected(false);
    negritoitalico.setSelected(false);
    texto.setFont(new Font("",estilo,tamfonte));
    } 
       }
           );     
     //coloca a fonte em italico
   italico.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           estilo=Font.ITALIC;
           normal.setSelected(false);
           negrito.setSelected(false);
           negritoitalico.setSelected(false);
           texto.setFont(new Font("",estilo,tamfonte));
       }
        }
         );
     //COLOCA A FONTE NORMAL
     normal.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             estilo=Font.PLAIN;
             negrito.setSelected(false);
             italico.setSelected(false);
             negritoitalico.setSelected(false);
             texto.setFont(new Font("",estilo,tamfonte));
         }
          }
           );
     
     negritoitalico.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             estilo=Font.BOLD+Font.ITALIC;
             negrito.setSelected(false);
             italico.setSelected(false);
             normal.setSelected(false);
             texto.setFont(new Font("",estilo,tamfonte));
         }
           }
             );
     
     tela.add(rotulo1);tela.add(rotulo2);
     tela.add(rotulo3);tela.add(texto);
     tela.add(negrito);tela.add(italico);
     tela.add(normal);tela.add(negritoitalico);
     tela.add(tam1);tela.add(tam2);
     tela.add(tam3);tela.add(tam4);
     tela.add(lista); tela.add(lista2);
     setSize(500,300);
     setLocationRelativeTo(null);
     setVisible(true);
 }
 

    public static void main(String[] args) {
       Exemplo2 app = new Exemplo2();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
        