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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
    String cidades[] = {"Rio de Janeiro","São Paulo","Minas Gerais","Espirito Santo","Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    JLabel rotulo;
  
    
    public Exemplo1(){
    super("Exemplo de Lista e Caixa");
    Container tela = getContentPane();
    ImageIcon icone = new  ImageIcon("src/img/list.png");
    setIconImage(icone.getImage());
    setLayout(null);
       tela.setBackground(new Color(000,000,000));
    
    exibir = new JButton("Exibir");
    rotulo = new JLabel("");
    lista =  new JComboBox(cidades);
    lista.setEditable(true);
    
    lista.setMaximumRowCount(5);
    
    JScrollPane painelRolagem = new JScrollPane(lista);

    
     painelRolagem.setBounds(40,50,180,80);
     exibir.setBounds(270,50,100,30);
     rotulo.setBounds(50,150,200,30);
   
      rotulo.setForeground(Color.orange);
    lista.setForeground(Color.orange);
    lista.setBackground(Color.black);
    lista.setFont(new Font("Times New Roman" , Font.BOLD,16));
    
   exibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
         rotulo.setText("O estado é: " + lista.getSelectedItem().toString());
        String resultados = "Valores selecionados:\n" + lista.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, resultados);
    }
});




tela.add(painelRolagem); 
tela.add(exibir);
tela.add(rotulo);
     
     setSize(400,250);
     setVisible(true);
     setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        Exemplo1 app = new Exemplo1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
