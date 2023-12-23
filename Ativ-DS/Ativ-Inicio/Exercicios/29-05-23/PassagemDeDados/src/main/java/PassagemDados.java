
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

 
public class PassagemDados extends JFrame {
   
    
     
           
            
    JTextField texto1,texto2;
    JLabel nome,Matricula, infor,restr;
    JButton limpar,env,sair;
    JComboBox lista;
    JRadioButton Etim,Mtec,Tecnico,prim,secu,terc;
    ButtonGroup grupo1,grupo2;
    JTextArea texto;
    JPanel painel;
    JScrollPane painelrolagem;
    String list[] = {"Selecione" , "Diurno","Vespertino","Noturno"};
    MaskFormatter Num;
    
    
    public PassagemDados(){            
    super("Exemplo de Lista e Caixa");
    Container tela = getContentPane();
    ImageIcon icone = new  ImageIcon("src/img/cadastre.png");
    setIconImage(icone.getImage());
    setLayout(null);
       
       
    nome= new JLabel("Nome:"); 
    Matricula= new JLabel("Matrícula");
    infor= new JLabel("Informe os dados do seu curso::");
    restr= new JLabel("Restrições Médicas::");

    sair = new JButton("Sair");
    limpar=new JButton("Limpar os Dados");
    env=new JButton("Enviar Dados");

    Etim = new JRadioButton("Etim");
    Mtec = new JRadioButton("Mtec");
    Tecnico = new JRadioButton("Tecnico");
    prim = new JRadioButton("1-Série");
    secu = new JRadioButton("2-Série");
    terc = new JRadioButton("3-Série");
     
   texto1 = new JTextField(50);
   texto2 = new JTextField(20);
     
   grupo1 = new ButtonGroup();
   grupo1.add(Etim);
   grupo1.add(Mtec);
   grupo1.add(Tecnico);
   
    grupo2 = new ButtonGroup();
    grupo2.add(prim);
    grupo2.add(secu);
    grupo2.add(terc);
   
    lista=new JComboBox(list);
    lista.setMaximumRowCount(4);
    
      try{
         Num = new MaskFormatter("#####");
   }
         catch(ParseException excp){}
         
         texto2 = new JFormattedTextField(Num);
    
    nome.setBounds(40,40,70,20);
    Matricula.setBounds(40,80,70,20);
    infor.setBounds(40,110,200,20);
    restr.setBounds(40,250,200,20);
    
    texto1.setBounds(100,40,250,20);
    texto2.setBounds(100,80,70,20);
    
     limpar.setBounds(200,400,150,20);
     env.setBounds(40,400,150,20);
     
     Etim.setBounds(60,140,100,20);
     Mtec.setBounds(60,170,100,20);
     Tecnico.setBounds(60,200,100,20);
     
     prim.setBounds(160,140,100,20);
     secu.setBounds(160,170,100,20);
     terc.setBounds(160,200,100,20);
 
     lista.setBounds(260,140,150,20);
 
     sair.setBounds(360,400,100,20);
 
      nome.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      Matricula.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      infor.setFont(new Font("Comic Sans MS",Font.BOLD,12));
      restr.setFont(new Font("Comic Sans MS",Font.BOLD,12));
     
      nome.setForeground(Color.red);
      Matricula.setForeground(Color.red);
      infor.setForeground(Color.red);
      restr.setForeground(Color.red);

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
      
  env.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
         String cursoe = "";
         String seriee = "";
        
         String nomee=texto1.getText();
         String matrice=texto2.getText();
         String restre=texto.getText();
         String perioe = lista.getSelectedItem().toString();
         if(prim.isSelected())
             seriee=prim.getText();
         else
             if(secu.isSelected())
                 seriee = secu.getText();
         else
                 seriee= terc.getText();
         
         if(Etim.isSelected())
             cursoe=Etim.getText();
         else
             if(Mtec.isSelected())
             cursoe=Mtec.getText();
         else
             cursoe=Tecnico.getText();
         
        frmostrar mostra = new frmostrar(nomee,matrice,restre,perioe,cursoe,seriee);
         mostra.setVisible(true);
         dispose();        
         lista.removeItemAt(0);
    

     }
      });
  
    
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto1.setText("");
                texto2.setText("");
                grupo1.clearSelection();
                grupo2.clearSelection();
                lista.setSelectedIndex(0);
                texto1.requestFocus();
                texto.setText("");
            }
        });
        
                
      
       

    texto = new JTextArea(6, 12);
    texto.setBounds(50, 20, 100, 50);
    texto.setFont(new Font("Arial", Font.PLAIN, 14));

    painelrolagem = new JScrollPane(texto);
    painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    painel = new JPanel();
    painel.add(painelrolagem);
    painel.setBounds(180, 245, 150, 140);
       
         
       
       tela.add(painel);setSize(500,450);
       tela.add(nome);tela.add(Matricula);
        tela.add(limpar);tela.add(sair);
         tela.add(env);tela.add(texto1);
          tela.add(texto2);tela.add(Etim);
           tela.add(Mtec);tela.add(Tecnico);
            tela.add(prim);tela.add(secu);
             tela.add(terc);tela.add(infor);
             tela.add(restr);tela.add(lista);
            
          setSize(500,555);
     setLocationRelativeTo(null);
     setVisible(true);
    }
    
public static void main(String[] args) {
      PassagemDados app = new PassagemDados();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}