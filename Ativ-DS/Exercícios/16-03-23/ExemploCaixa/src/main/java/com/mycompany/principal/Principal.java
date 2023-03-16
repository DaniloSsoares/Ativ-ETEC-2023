/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Principal {

    public static void main(String[] args) {
        Caixa cx1 = new Caixa();
        //Instanciação do objeto cx1
        int op; //declaraçao da varavel de opçoes
        do{ //Inicio do looping do while
            //Apresentação e leitura do menu de opçoes
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Entrada " +
                    "\n2 - Retirada \n3 - Consultar o saldo \n0 - Sair"));
        
          switch (op) { //abertura da estrutura de swich-case
        case 1:
        cx1.entrar(); //Chamada ao método entrar do objeto cx1
        break;
         case 2:
        cx1.retirar(); //Chamada ao método retirar do objeto cx1
        break;
         case 3:
            //Apresentação do conteúdo do atributo saldo 
        JOptionPane.showMessageDialog(null, "Saldo atual: " +cx1.getSaldo());
        break;
         case 0:
             JOptionPane.showMessageDialog(null, "Finalizando programa! " +cx1.getSaldo());
             break;
         default:
             JOptionPane.showMessageDialog(null, "Opção Invaloda!");
    }      
          
    }while(op != 0); //Repetirá asoperações enquanto a opção for diferente de zero
}
}