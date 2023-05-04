/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author dti
 */
public class Exemplo1 extends JFrame{

    /**
     * @param args the command line arguments
     */
    
   //JList lista;
    JComboBox lista;
    String jogos[] = {" Fortnite","Call of Duty","Batman","Spider man","overwath","Rocket League"};
    JButton exibir;
    JLabel rotulo;
    public Exemplo1(){
    super("Exemplo de Lista e Caixa");
    Container tela = getContentPane();
    setLayout(null);
    
    exibir = new JButton("Exibir");
    rotulo = new JLabel("");
    //lista = new JList(jogos);
    lista =  new JComboBox(jogos);
    //lista.setVisibleRowCount(5);
    lista.setMaximumRowCount(5);
    JScrollPane painelRolagem = new JScrollPane(lista);
  //  lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    
    painelRolagem.setBounds(40,50,150,100);
    exibir.setBounds(270,50,100,30);
    rotulo.setBounds(50,50,100,30);
    lista.setBounds(50,50,150,30);
    
    lista.setForeground(Color.orange);
    lista.setBackground(Color.black);
    lista.setFont(new Font("Times New Roman" , Font.BOLD,16));
    
    
    exibir.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
            rotulo.setText("O jogo é:" +lista.getSelectedItem().toString());
        }});
    
     tela.add(painelRolagem); tela.add(exibir);
     tela.add(rotulo);
     
     setSize(400,250);
     setVisible(true);
    }
    public static void main(String[] args) {
        Exemplo1 app = new Exemplo1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
