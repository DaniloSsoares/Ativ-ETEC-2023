/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciomenu;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author danil
 */
public class Sobre {
    public static class Inicial extends JDialog {
      private JButton sair,voltar;
       private JLabel rotulo1, rotulo2,rotulo3,Nm,dtent;
       String nome;
       int ds,dia,mes,ano,hh,mm,ss,h;
       Calendar data;
       Calendar hora;
       DecimalFormat formato;
       String diasemana[]={"Domingo","Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sábado"};
       String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

       
         public Inicial(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            ImageIcon icone = new ImageIcon("src/img/logo.jpeg");
            setIconImage(icone.getImage());
            tela1.setLayout(null);
            
            
        rotulo1 = new JLabel();
        rotulo2 = new JLabel();
        rotulo3 = new JLabel();
        Nm = new JLabel("Danilo Santos Soares 2ºDS AMS");
        dtent = new JLabel("Entrega: 26/06/2023");
        
        Nm.setBounds(50,100,280,20);
        dtent.setBounds(50,220,280,20);
        rotulo1.setBounds(50,130,280,20);
        rotulo2.setBounds(50,160,280,20);
        rotulo3.setBounds(50,190,280,20);

            sair = new JButton("Sair");
            sair.setBounds(50, 250, 100, 20);
            sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
            System.exit(0);
                }
                 }
                  );
            tela1.add(sair);

            voltar = new JButton("voltar");
            voltar.setBounds(155, 250, 100, 20);
            voltar.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evento) {
             ExercicioMenu Exer = new ExercicioMenu();
             Exer.setVisible(true);
             dispose();
                }
                 }
                  );
    data=Calendar.getInstance();
    ds=data.get(Calendar.DAY_OF_WEEK);
    dia=data.get(Calendar.DAY_OF_MONTH);
    mes=data.get(Calendar.MONTH);
    ano=data.get(Calendar.YEAR);
    rotulo1.setText("Data: "+ds+" "+dia+" / "+(mes+1)+" / "+ano);
    rotulo2.setText("Data: "+diasemana[ds-1]+ ", " +dia+ " de "+meses[mes]+" de "+ano);
                  
        ActionListener tarefa =(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        HORAS();
        }
          }
            );
            javax.swing.Timer time=new javax.swing.Timer(1000,tarefa);
            time.start();
   
           tela1.add(voltar);
           tela1.add(rotulo1);
           tela1.add(rotulo2);
           tela1.add(rotulo3);
           tela1.add(Nm);
           tela1.add(dtent);
           Color foregroundColor = new Color(255, 0, 0); 
           Color backgroundColor = new Color(0, 0, 0); 

            getContentPane().setBackground(backgroundColor);
            rotulo1.setForeground(foregroundColor);
            rotulo2.setForeground(foregroundColor);
            rotulo3.setForeground(foregroundColor);
            Nm.setForeground(foregroundColor);
            dtent.setForeground(foregroundColor);
            sair.setBackground(backgroundColor);
            sair.setForeground(foregroundColor);
            voltar.setBackground(backgroundColor);
            voltar.setForeground(foregroundColor);

            setSize(400, 400);
            setLocationRelativeTo(null);
        }
         
           private void HORAS(){
           hora=Calendar.getInstance();
           hh=hora.get(Calendar.HOUR_OF_DAY);
           mm=hora.get(Calendar.MINUTE);
           ss=hora.get(Calendar.SECOND);
           formato=new DecimalFormat("00");
           rotulo3.setText("Hora: "+formatar(hh%12)+" : "+formatar(mm)+" : "+formatar(ss));
        }

           private String formatar(int num){
           formato=new DecimalFormat("00");
           return formato.format(num);
        }
         }
      }
