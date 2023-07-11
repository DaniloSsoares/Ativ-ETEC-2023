/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exem1menu;

/**
 *
 * @author dti
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Exem1Menu extends JFrame {

    JPopupMenu opcoes1;
    JMenuBar barra;
    JButton direita, esquerda, centralizar, recortar1, copiar1, colar1,btnSair;
    JMenu opcoes, fonte, cor;
    JMenuItem limpar, sair, estilo, tamanho, azul, verde, vermelho, amarelo, preto, recortar, copiar, colar, somar;
    JTextArea texto;
    JPanel painel;
    JScrollPane rolagem;
    Inicial segundajanela;

    ImageIcon imagens[];

    public Exem1Menu() {
        super("Exemplo de Menus");
        Container tela = getContentPane();
        tela.setLayout(null);
           ImageIcon icone = new  ImageIcon("src/img/word.png");
           setIconImage(icone.getImage());
           
        String icones[] = {
            "src/imagens/direita.png",
            "src/imagens/esquerda.png",
            "src/imagens/centro.png",
            "src/imagens/recortar.png",
            "src/imagens/copiar.png",
            "src/imagens/colar.png"
        };

        imagens = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {
            imagens[i] = new ImageIcon(icones[i]);
        }

        direita = new JButton(imagens[0]);
        esquerda = new JButton(imagens[1]);
        centralizar = new JButton(imagens[2]);

        recortar1 = new JButton(imagens[3]);
        copiar1 = new JButton(imagens[4]);
        colar1 = new JButton(imagens[5]);

        direita.setToolTipText("Direita(Ctrl+d)");
        esquerda.setToolTipText("Esquerda(Ctrl+e)");
        centralizar.setToolTipText("Centralizar(Ctrl+z)");
        recortar1.setToolTipText("Recortar(Ctrl+x)");
        copiar1.setToolTipText("Copiar(Ctrl+c)");
        colar1.setToolTipText("Colar(Ctrl+v)");
      
        barra = new JMenuBar();
        setJMenuBar(barra);

        somar = new JMenuItem("Somar");
        opcoes = new JMenu("Opções");
        barra.add(opcoes);

        limpar = new JMenuItem("Limpar");
        sair = new JMenuItem("Sair");
        
     
        fonte = new JMenu("Fonte");
        cor = new JMenu("Cor");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        preto = new JMenuItem("Preto");
        estilo = new JMenuItem("Estilo");
        tamanho = new JMenuItem("Tamanho");

        texto = new JTextArea(15, 25);
        rolagem = new JScrollPane(texto);
        painel = new JPanel();
        painel.setBounds(10, 30, 450, 500);
        painel.add(rolagem);

        texto.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    opcoes1.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        Tratador tratmenu = new Tratador();
        opcoes1 = new JPopupMenu();

        recortar = new JMenuItem("Recortar");
        copiar = new JMenuItem("Copiar");
        colar = new JMenuItem("Colar");
        opcoes1.add(recortar);
        opcoes1.add(copiar);
        opcoes1.addSeparator();
        opcoes1.add(colar);
        tela.add(painel);

        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
                texto.requestFocus();
            }
        });

        azul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.blue);
                repaint();
            }
        });

        verde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.green);
                repaint();
            }
        });

        vermelho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.red);
                repaint();
            }
        });

        amarelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.yellow);
                repaint();
            }
        });

        preto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setForeground(Color.black);
                repaint();
            }
        });

        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
         direita.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        texto.setAlignmentX(JTextArea.RIGHT_ALIGNMENT);
         }
          } 
           );
        esquerda.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        texto.setAlignmentX(JTextArea.LEFT_ALIGNMENT);
        }
         }
           );

        centralizar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        texto.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        }
         } 
          );

       recortar1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        texto.cut();
       }
        } 
         );

      copiar1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        texto.copy();
      }
       } 
         );

      colar1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        texto.paste();
     }
      } 
       );


      somar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        segundajanela = new Inicial(null,"Segunda Janela",true);
        segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        segundajanela.setVisible(true);}});


       btnSair = new JButton("Sair");
       btnSair.setBounds(400,450,80,20);
       btnSair.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar o programa?",
                "Mensagem de saida",JOptionPane.YES_NO_OPTION); 
        if (status == JOptionPane.YES_OPTION){System.exit(0);}}});

        recortar.addActionListener(tratmenu);
        copiar.addActionListener(tratmenu);
        colar.addActionListener(tratmenu);

        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.addSeparator();
        opcoes.add(somar);
        opcoes.add(sair);

        fonte.add(cor);
        fonte.add(estilo);
        fonte.add(tamanho);

        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(preto);

        barra.add(direita);
        barra.add(esquerda);
        barra.add(centralizar);

        barra.add(recortar1);
        barra.add(copiar1);
        barra.add(colar1);
        barra.setBounds(1, 1, 260, 100);
        
        barra.setBackground(Color.LIGHT_GRAY);
   

        // Personalizando os itens do menu
        opcoes.setForeground(Color.DARK_GRAY);
        opcoes.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcoes.setFont(new Font("Arial", Font.BOLD, 20));

        limpar.setForeground(Color.DARK_GRAY);
        sair.setForeground(Color.DARK_GRAY);

        fonte.setForeground(Color.DARK_GRAY);
        fonte.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        fonte.setFont(new Font("Arial", Font.BOLD, 15));

        cor.setForeground(Color.DARK_GRAY);
        cor.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        cor.setFont(new Font("Arial", Font.BOLD, 15));

        azul.setForeground(Color.DARK_GRAY);
        verde.setForeground(Color.DARK_GRAY);
        vermelho.setForeground(Color.DARK_GRAY);
        amarelo.setForeground(Color.DARK_GRAY);
        preto.setForeground(Color.DARK_GRAY);

        direita.setBackground(Color.LIGHT_GRAY);
        esquerda.setBackground(Color.LIGHT_GRAY);
        centralizar.setBackground(Color.LIGHT_GRAY);
        recortar1.setBackground(Color.LIGHT_GRAY);
        copiar1.setBackground(Color.LIGHT_GRAY);
        colar1.setBackground(Color.LIGHT_GRAY);

       

      
        tela.add(barra);
        tela.add(painel);
        tela.add(btnSair);


        setSize(500, 450);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        Exem1Menu app = new Exem1Menu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Tratador implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == recortar)
                texto.cut();
            if (e.getSource() == copiar)
                texto.copy();
            if (e.getSource() == colar)
                texto.paste();
            repaint();
        }
    }
    
    private class Inicial extends JDialog{
        JButton sair;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton somar2n;
        
        public Inicial(Frame owner, String title,boolean modal){
            super(owner,title,modal);
            Container tela1 = getContentPane();
               ImageIcon icone = new  ImageIcon("src/img/word.png");
           setIconImage(icone.getImage());
           
            tela1.setLayout(null);

        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
         texto1 = new JTextField(5);
         texto2 = new JTextField(5);
          exibir = new JLabel("");
          somar2n = new JButton("Somar");

  rotulo1.setBounds(50,20,100,20);
  rotulo2.setBounds(50,60,100,20);
  texto1.setBounds(120,20,200,20);
  texto2.setBounds(120,60,200,20);
  exibir.setBounds(50,140,200,20);
  somar2n.setBounds(150,100,80,20);

   somar2n.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        int numero1, numero2, soma;soma = 0;
        numero1 = Integer.parseInt(texto1.getText());
        numero2 = Integer.parseInt(texto2.getText());
        
        soma = numero1 + numero2;exibir.setVisible(true);
        exibir.setText("A soma é: "+soma);}});
   
        exibir.setVisible(false);tela1.add(rotulo1);
        
        tela1.add(rotulo2);tela1.add(texto1);
        tela1.add(texto2);tela1.add(exibir);
        tela1.add(somar2n);sair = new JButton("Sair");
        
         sair.setBounds(50,250,100,20);
         TBsair tsair = new TBsair();
          sair.addActionListener(tsair);
           tela1.add(sair);
              setSize(400,400);
              setLocationRelativeTo(null);
        }
           }
    
    private class TBsair implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            segundajanela.setVisible(false);
            segundajanela.dispose();
        }
    }
}
