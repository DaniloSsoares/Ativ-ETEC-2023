
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
public class frmostrar extends JFrame{
    
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,lblNome,lblmatric,lblrestr,lblperiod,lblcurso,lblserie;
   JButton voltar,sair;    
   
   public frmostrar(String inome, String imatrice, String irestre, String iperioe, String icursoe, String iseriee) {  
           
            
    
    Container tela = getContentPane();
    ImageIcon icone = new  ImageIcon("src/img/cadastre.png");
    setIconImage(icone.getImage());
    setLayout(null);
    
     rotulo1= new JLabel("Nome:"); 
     rotulo2= new JLabel("Matrícula");
     rotulo3= new JLabel("Dados do seu curso::");
     rotulo4= new JLabel("Restrições Médicas::");
     rotulo5= new JLabel("curso::");
     rotulo6= new JLabel("Série::");
     rotulo7= new JLabel("Periodo::");
     
     lblNome = new JLabel(""); 
     lblmatric= new JLabel("");
     lblrestr= new JLabel(" \n");
     lblperiod= new JLabel("");
     lblcurso = new JLabel("");
     lblserie = new JLabel("");
   
     sair = new JButton("Sair");
     voltar= new JButton("Voltar");

      lblNome.setText(inome);
      lblmatric.setText(imatrice);
      lblrestr.setText("<html>" + irestre.replace("\n", "<br>") + "</html>");
      lblperiod.setText(iperioe);
      lblcurso.setText(icursoe);
      lblserie.setText(iseriee);
            
   
      rotulo1.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      rotulo3.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      rotulo4.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      rotulo5.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      rotulo6.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      rotulo7.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      
     
      rotulo1.setForeground(Color.red);
      rotulo2.setForeground(Color.red);
      rotulo3.setForeground(Color.red);
      rotulo4.setForeground(Color.red);
      rotulo5.setForeground(Color.red);
      rotulo6.setForeground(Color.red);
      rotulo7.setForeground(Color.red);
      
      sair.setBounds(100,400,100,20);
      voltar.setBounds(220,400,100,20);
     
    rotulo1.setBounds(40,40,70,20);
    rotulo2.setBounds(40,80,70,20);
    rotulo3.setBounds(40,130,200,20);
    rotulo4.setBounds(40,270,200,20);
    rotulo5.setBounds(40,160,70,20);
    rotulo6.setBounds(40,190,70,20);
    rotulo7.setBounds(40,220,70,20);
    
     lblNome.setBounds(100,40,150,20);
     lblmatric.setBounds(100,80,70,20);
     lblrestr.setBounds(60,300,700,70);
     lblcurso.setBounds(100,160,70,20);
     lblserie.setBounds(100,190,70,20);
     lblperiod.setBounds(100,220,70,20);
     
      sair.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                System.exit(0);  
        }
          }
            );
                
       voltar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
               PassagemDados app = new PassagemDados();
            app.setVisible(true);
            dispose();
            }
        });
            
    tela.add(rotulo1);tela.add(rotulo2);
    tela.add(rotulo3);tela.add(rotulo4);
    tela.add(rotulo5);tela.add(rotulo6);
    tela.add(rotulo7);
    
    tela.add(lblNome);
    tela.add(lblmatric);tela.add(lblrestr);
    tela.add(lblperiod);tela.add(lblcurso);
    tela.add(lblserie);
    
    tela.add(sair);tela.add(voltar);
            
          setSize(450,500);
     setLocationRelativeTo(null);
     setVisible(true);

   }}
     