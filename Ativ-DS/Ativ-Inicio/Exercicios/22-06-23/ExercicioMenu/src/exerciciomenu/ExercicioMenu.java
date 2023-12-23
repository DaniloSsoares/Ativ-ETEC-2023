/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciomenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;



/**
 *
 * @author dti
 */

 public class ExercicioMenu extends JFrame {
     JButton somaicon,dividiricon,multiplicaricon,subtrairicon;
    JPopupMenu opcoes;
    JMenuBar barra;
    JMenu Operaçoes, Sobre, Sair;
    JMenuItem soma, dividir, multiplicar, subtrair, Sair1,Sobre1;
    Soma.Inicial janelasoma;
    Dividir.Inicial janelaDividir;
    Multiplicar.Inicial janelaMultiplicar;
    Subtrair.Inicial janelaSubtrair;
    Sobre.Inicial janelaSobre;
        ImageIcon imagens[];
        JLabel imagen;

    public ExercicioMenu() {
        super("Exemplo de Menus");
        ImageIcon icone = new ImageIcon("src/img/logo.jpeg");
        setIconImage(icone.getImage());
        ImageIcon miguel = new ImageIcon("src/img/2099.jpeg");
        Image imagemOriginal = miguel.getImage();
        Image imagemRedimensionada = imagemOriginal.getScaledInstance(500, 400, Image.SCALE_SMOOTH);
        ImageIcon miguelRedimensionada = new ImageIcon(imagemRedimensionada);
        imagen= new JLabel(miguelRedimensionada);
        Container tela = getContentPane();
        tela.setLayout(new FlowLayout());
        tela.add(imagen);
        
          String icones[] = {
            "src/img/soma.jpg",
            "src/img/subtração.png",
            "src/img/multiplicação.png",
            "src/img/divisão.png",
            
        };

        imagens = new ImageIcon[4];
        for (int i = 0; i < 4; i++) {
            imagens[i] = new ImageIcon(icones[i]);
        }
        
        somaicon = new JButton(imagens[0]);
        dividiricon = new JButton(imagens[1]);
        multiplicaricon = new JButton(imagens[2]);
        subtrairicon = new JButton(imagens[3]);
        
        
        barra = new JMenuBar();
        setJMenuBar(barra);

        Operaçoes = new JMenu("Operaçoes");
        Sobre = new JMenu("Sobre");
        Sair = new JMenu("Sair");

        soma = new JMenuItem("Somar");
        dividir = new JMenuItem("Dividir");
        multiplicar = new JMenuItem("Multiplicar");
        subtrair = new JMenuItem("Subtrair");
        Sair1 = new JMenuItem("Sair");
            

        tela.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    opcoes.show(e.getComponent(), e.getX(), e.getY());
           }
            }
             }
              );
        

        opcoes = new JPopupMenu();

        soma.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        janelasoma = new Soma.Inicial(null, "Segunda Janela", true);
        janelasoma.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelasoma.setVisible(true);
        dispose();
            }
             }
              );
       dividir.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
       janelaDividir = new Dividir.Inicial(null, "Segunda Janela", true);
       janelaDividir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       janelaDividir.setVisible(true);
       dispose();
       }
        }
         );
       multiplicar.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
       janelaMultiplicar = new Multiplicar.Inicial(null, "Segunda Janela", true);
       janelaMultiplicar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       janelaMultiplicar.setVisible(true);
       dispose();
            }
             } 
              );
       subtrair.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
       janelaSubtrair = new Subtrair.Inicial(null, "Segunda Janela", true);
       janelaSubtrair.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       janelaSubtrair.setVisible(true);
       dispose();
            }
        });
           
       JMenuItem Sobre = new JMenuItem("Sobre");
       Sobre.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
       janelaSobre = new Sobre.Inicial(null, "Segunda Janela", true);
       janelaSobre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       janelaSobre.setVisible(true);
       dispose();
     }
       }
         );

       JMenuItem Sair = new JMenuItem("Sair");
       Sair.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
       int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?",
                "Mensagem de saída", JOptionPane.YES_NO_OPTION);
        if (status == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
         }
          });
       
        somaicon.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        janelasoma = new Soma.Inicial(null, "Segunda Janela", true);
        janelasoma.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelasoma.setVisible(true);
        dispose();
            }
        });
        subtrairicon.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        janelaDividir = new Dividir.Inicial(null, "Segunda Janela", true);
        janelaDividir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaDividir.setVisible(true);
        dispose();
            }
        });
        dividiricon.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        janelaSubtrair = new Subtrair.Inicial(null, "Segunda Janela", true);
        janelaSubtrair.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaSubtrair.setVisible(true);
        dispose();
                
            }
        });
       
        multiplicaricon.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        janelaMultiplicar = new Multiplicar.Inicial(null, "Segunda Janela", true);
        janelaMultiplicar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaMultiplicar.setVisible(true);
        dispose();
            }
        });
     
       
        JMenuItem Sobre1 = new JMenuItem("Sobre");
        Sobre1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        janelaSobre = new Sobre.Inicial(null, "Segunda Janela", true);
        janelaSobre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaSobre.setVisible(true);
        dispose();
        
    }
});
        Sair1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?",
                "Mensagem de saída", JOptionPane.YES_NO_OPTION);
        if (status == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
});

       
        barra.setForeground(Color.DARK_GRAY);
        barra.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        barra.setFont(new Font("Arial", Font.BOLD, 20));

     
        Sair.setForeground(Color.DARK_GRAY);
        somaicon.setBackground(Color.LIGHT_GRAY);
        dividiricon.setBackground(Color.LIGHT_GRAY);
        multiplicaricon.setBackground(Color.LIGHT_GRAY);
        subtrairicon.setBackground(Color.LIGHT_GRAY);
        
        opcoes.add(Sobre1);
        opcoes.add(Sair1);

        
        barra.add(Operaçoes);
        barra.add(Sobre);
        barra.add(Sair);
        barra.add(somaicon);
        barra.add(dividiricon);
        barra.add(multiplicaricon);
        barra.add(subtrairicon);
        
        

        Operaçoes.add(soma);
        Operaçoes.add(dividir);
        Operaçoes.add(multiplicar);
        Operaçoes.add(subtrair);

        Operaçoes.addSeparator();

        setSize(500, 450);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        ExercicioMenu app = new ExercicioMenu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
}