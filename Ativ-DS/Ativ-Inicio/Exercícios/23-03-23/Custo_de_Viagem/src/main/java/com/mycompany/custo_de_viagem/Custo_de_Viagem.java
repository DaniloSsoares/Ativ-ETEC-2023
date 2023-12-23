/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.custo_de_viagem;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Custo_de_Viagem {
//Inicio do main
    public static void main(String[] args) {
           JOptionPane.showMessageDialog(null, "Bem vindo a sua calculadora de Viagem!! ");
           JOptionPane.showMessageDialog(null, "Escolha uma operação a ser feita!! ");
           
          //Instancias
        Percurso Perc = new Percurso();
        Custos Cust = new Custos();
        int op; 
        do{ 
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1 - Cadastro de Viagem " +
                    "\n2 - Dados da Viagem \n3 - Custo total \n 4 - Sair"));
        //começando switch
          switch (op) { 
              //Caso 1 entrar no metodo cadastrarPercurso
        case 1:
       
       Perc.cadastrarPercurso();
        break;
         //Caso 2 entrar no metodo listaPercurso
        case 2:
            Perc.listaPercurso();
            break;
             //Caso 3 entrar no metodo calcularviagem
             case 3:
                   //pegando metodo do percurso e enviando como parametro
                Cust.calcularViagem(Perc);
                break;
                 //Caso 4 entrar no metodo finalização do programa
            case 4:
             JOptionPane.showMessageDialog(null, "Finalizando programa! ");
              JOptionPane.showMessageDialog(null, "Obrigado e até a proxima!! ");
             break;
           
             
             // digito outro valor que não seja 1,2,3,4 irá aparecer erro.
         default:
             JOptionPane.showMessageDialog(null, "Você digitou algo errado!!");
          }}while(op !=4);
    }
}
