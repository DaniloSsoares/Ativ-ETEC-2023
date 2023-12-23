/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo3;

import java.awt.Color;
import java.awt.Container;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author danil
 */
public class Exemplo3 extends JFrame {
JButton botao1,botao2,botao,botao3,erro,informacao,exclamacao,pergunta,nenhum,copiar,limpar;
String nome;
int ds,dia,mes,ano,hh,mm,ss,h;;
Calendar data;
JLabel rotulo,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6;
JTextField texto1,texto2;
Calendar hora;
DecimalFormat formato;
String diasemana[]={"Domingo","Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sábado"};
String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

public Exemplo3(){
    super("Exemplo de Botões com Diálogos de confirmação");
    Container tela = getContentPane();
     ImageIcon icone = new  ImageIcon("src/img/images.png");
    setIconImage(icone.getImage());
    setLayout(null);
       tela.setBackground(new Color(000,000,000));
   
    
    nome = JOptionPane.showInputDialog("Entre com seu nome:");
    
    rotulo = new JLabel(""); rotulo2 = new JLabel("Nome");
    rotulo3 = new JLabel("Nome");rotulo4=new JLabel("");
    rotulo5=new JLabel("");rotulo6=new JLabel("");
    
    texto1=new JTextField(20);texto2=new JTextField(20);
    
    botao = new JButton("Sair");botao1 = new JButton("Escolher Linguagem");
    copiar=new JButton("Copiar");
    limpar=new JButton("Limpar");
    
    erro=new JButton("Erro");informacao=new JButton("Informação");
    exclamacao=new JButton("Exclamação");pergunta=new JButton("Pergunta");
                     nenhum=new JButton("Nenhum");
    
    botao.setForeground(new Color(255,255,255));botao.setBackground(new Color(255,69,0));
    botao1.setForeground(new Color(255,255,255));botao1.setBackground(new Color(255,69,0));
    copiar.setForeground(new Color(255,255,255));copiar.setBackground(new Color(255,69,0));
    limpar.setForeground(new Color(255,255,255));limpar.setBackground(new Color(255,69,0));
   erro.setForeground(new Color(255,255,255));erro.setBackground(new Color(255,69,0));
   informacao.setForeground(new Color(255,255,255));informacao.setBackground(new Color(255,69,0));
   exclamacao.setForeground(new Color(255,255,255));exclamacao.setBackground(new Color(255,69,0));
   pergunta.setForeground(new Color(255,255,255));pergunta.setBackground(new Color(255,69,0));
   nenhum.setForeground(new Color(255,255,255));nenhum.setBackground(new Color(255,69,0));
   
   rotulo.setForeground(new Color(255,69,0));
   rotulo2.setForeground(new Color(255,69,0));
   rotulo3.setForeground(new Color(255,69,0));
   rotulo4.setForeground(new Color(255,69,0));
   rotulo5.setForeground(new Color(255,69,0));
   rotulo6.setForeground(new Color(255,69,0));
    
    rotulo.setBounds(30,20,350,70);rotulo2.setBounds(350,130,180,20);
    rotulo3.setBounds(350,160,180,20);rotulo4.setBounds(50,270,280,20);
    rotulo5.setBounds(50,300,280,20);rotulo6.setBounds(380,330,280,20);
    
    botao1.setBounds(350,100,150,20);botao.setBounds(390,270,100,20);
   
    
    texto1.setBounds(350,130,180,20);texto2.setBounds(350,160,180,20);
    copiar.setBounds(310,210,100,20);limpar.setBounds(460,210,100,20);
    
    erro.setBounds(30,90,100,20);informacao.setBounds(30,120,100,20);
    exclamacao.setBounds(30,150,100,20);pergunta.setBounds(30,180,100,20);
    nenhum.setBounds(30,210,100,20);
    
    botao1.setToolTipText("Botão para escolher sua linguagem");
    botao.setToolTipText("Botão que finaliza a janela");
  
    
    UIManager.put("ToolTip.background",SystemColor.info);
    rotulo.setText("O nome digita do foi:  "+nome.toUpperCase());
    
    
      botao1.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                        Object linguagens[] = {"Java","Delphi","C++","VisualBasic"};
                          Object opcao1 = JOptionPane.showInputDialog(null,"Qual sua linguagem favorita?","Enquete",
                            JOptionPane.QUESTION_MESSAGE,null,linguagens,linguagens[0]);
                                   JOptionPane.showMessageDialog(null,"Você escolheu: "+opcao1);
                                          System.exit(0); }});
    
                     
                  botao.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
            
                           int opcao;
            
                            Object[] botoes = {"Sim","Não"};
                             opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",
                          JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                                    if(opcao==JOptionPane.YES_OPTION)System.exit(0);
              } 
                }
                  );
    
                  
    copiar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto2.setText(texto1.getText().toUpperCase());
        }});
    limpar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto1.setText("");
            texto2.setText("");
            texto1.requestFocus();}});
  
    
        
    erro.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Você escolheu erro",
                    "Mensagem de Erro",JOptionPane.ERROR_MESSAGE,null);}});
    
    informacao.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Você escolheu informação",
                "Mensagem de Informação",JOptionPane.INFORMATION_MESSAGE,null);}});
    
    exclamacao.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Você escolheu exclamação",
                "Mensagem de Exclamação",JOptionPane.WARNING_MESSAGE,null);}});
    
    pergunta.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Você escolheu pergunta",
                "Mensagem de Pergunta",JOptionPane.QUESTION_MESSAGE,null);}});
    
    nenhum.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Você escolheu nenhum",
                "Mensagem",JOptionPane.PLAIN_MESSAGE,null);}});
    
              
    data=Calendar.getInstance();
    ds=data.get(Calendar.DAY_OF_WEEK);
    dia=data.get(Calendar.DAY_OF_MONTH);
    mes=data.get(Calendar.MONTH);
    ano=data.get(Calendar.YEAR);
    rotulo4.setText("Data: "+ds+" "+dia+" / "+(mes+1)+" / "+ano);
    rotulo5.setText("Data: "+diasemana[ds-1]+ ", " +dia+ " de "+meses[mes]+" de "+ano);
                  
    ActionListener tarefa =(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            HORAS();
        }
          }
            );
    javax.swing.Timer time=new javax.swing.Timer(1000,tarefa);
    time.start();
   
   
    
    tela.add(rotulo);tela.add(rotulo2);
    tela.add(rotulo3);tela.add(rotulo4);
    tela.add(rotulo5); tela.add(rotulo6);
    
    tela.add(texto1);tela.add(texto2);
    tela.add(copiar);tela.add(limpar);
    tela.add(botao);tela.add(botao1);
            
    tela.add(erro);tela.add(informacao);
    tela.add(exclamacao);tela.add(pergunta);
    tela.add(nenhum);
    
             setSize(600,400);
             setVisible(true);
             setLocationRelativeTo(null);
             
    }

    public static void main(String[] args) {
Exemplo3 app =new Exemplo3();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
private void HORAS(){
hora=Calendar.getInstance();
hh=hora.get(Calendar.HOUR_OF_DAY);
mm=hora.get(Calendar.MINUTE);
ss=hora.get(Calendar.SECOND);
formato=new DecimalFormat("00");
rotulo6.setText("Hora: "+formatar(hh%12)+" : "+formatar(mm)+" : "+formatar(ss));
}
private String formatar(int num){
formato=new DecimalFormat("00");
return formato.format(num);
    }
}
