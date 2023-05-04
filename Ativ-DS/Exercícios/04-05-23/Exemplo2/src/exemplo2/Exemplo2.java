/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo2;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dti
 */
public class Exemplo2 extends JFrame {

JLabel rotulo1 rotulo2,rotulo3.,rotulo4,texto;
JcheckBox negrito,italico,normal,negritoitalico;
JradioButton tam1,tam2,tam3,tam4;
ButtonGroup grupo;
String cor[] = {"Sem cor" , " Vermelho" , " Azul" , "Verde" , "Amarelo" ,  "Branco" "Preto"};
JComboBox lista;
Integer estilo , tambofone;

public Exemplo2(){
super ("Exemplo Combo Check Radio Box");
Container tela = getContentPane();
setLayout(null);
rotulo1 = new JLabel("cor");
rotulo2 = new JLabel("Estilo");
rotulo3 = new JLabel("Tamanho");
texto = new JLabel("Programa feito em Java");
lista = new JComboBox("cor");
lista.setMaximumRowCount(7);
negrito =  new JComboBox("Negrito");
italico =  new JComboBox("Italico");
normal =  new JComboBox("Normal");
negritoitalico =  new JComboBox("Negrito Italico");

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
 rotulo3.setBounds(300,20,7,20);
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
