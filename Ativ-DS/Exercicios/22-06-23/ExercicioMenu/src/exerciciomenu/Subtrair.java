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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author danil
 */
public class Subtrair {
      public static class Inicial extends JDialog {
        private JButton sair,limpar,voltar;
        private JLabel rotulo1, rotulo2, exibir;
        private JTextField texto1, texto2;
        private JButton subtrair2n;

        public Inicial(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            ImageIcon icone = new ImageIcon("src/logo.jpeg");
            setIconImage(icone.getImage());

            tela1.setLayout(null);

            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            subtrair2n = new JButton("Subtrair");
            limpar=new JButton("Limpar");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            subtrair2n.setBounds(150, 100, 80, 20);
            limpar.setBounds(260,250,100,20);

           subtrair2n.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
           int numero1, numero2, subtrair;
           numero1 = Integer.parseInt(texto1.getText());
           numero2 = Integer.parseInt(texto2.getText());

           subtrair = numero1 - numero2;
           exibir.setVisible(true);
           exibir.setText("A Subtração é: " + subtrair);
                }
                 }
                  );
           limpar.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
           texto1.setText("");
           texto2.setText("");
           exibir.setText(null);
            }
             }
              );

            exibir.setVisible(false);
            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(texto1);
            tela1.add(texto2);
            tela1.add(exibir);
            tela1.add(subtrair2n);
            tela1.add(limpar);

            sair = new JButton("Sair");
            sair.setBounds(50, 250, 100, 20);
            sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
            System.exit(0);
                }
                 }
                  );
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
            Color foregroundColor = Color.RED;
            Color backgroundColor = Color.BLACK;

            getContentPane().setBackground(backgroundColor);
            rotulo1.setForeground(foregroundColor);
            rotulo2.setForeground(foregroundColor);
            exibir.setForeground(foregroundColor);
            subtrair2n.setBackground(Color.BLACK);
            subtrair2n.setForeground(Color.RED);
           limpar.setBackground(Color.BLACK);
            limpar.setForeground(Color.RED);
            sair.setBackground(Color.BLACK);
            sair.setForeground(Color.RED);
            voltar.setBackground(Color.BLACK);
            voltar.setForeground(Color.RED);
            
            tela1.add(voltar);
            tela1.add(sair);

            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
}