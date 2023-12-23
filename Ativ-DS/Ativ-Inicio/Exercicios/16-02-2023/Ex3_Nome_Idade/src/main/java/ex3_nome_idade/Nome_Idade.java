/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_nome_idade;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Nome_Idade {
          public static void main(String[] args){
              //Variaveis para cada objeto 
              int idade1,idade2;
              String nome1, nome2;
              
              //Aqui é realizado o que será  digitado dentro das variaveis nome1 e idade1
              nome1 = JOptionPane.showInputDialog("Digite o nome da 1 pessoa::");
              idade1=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1 pessoa:"));
              
                      //Aqui é realizado o que será  digitado dentro das variaveis nome2 e idade2
               nome2 = JOptionPane.showInputDialog("Digite o nome da 2 pessoa::");
               idade2 =Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2 pessoa:"));
               
 // Aqui é realizado o´metodo PessoaMaisVelha Sendo texto o resultado que virá dsos calculos realizado no metodo
               String texto = PessoaMaisVelha(nome1, idade1 , nome2, idade2);
               //nome1, idade1 , nome2, idade2 são a copia do que foi digitado nas variaveis.
        
                //Aqui será o que irá aparecer no final de tudo.
                JOptionPane.showMessageDialog(null,texto);
          }
           // inicio do calculo do metodo
            static String PessoaMaisVelha(String n1, int id1, String n2, int id2)
                    {
                         //Esta sendo realizado as comparações dos valores da idade
                        if (id1 > id2)
                             //Retornando o valor para o main
                            return n1 +" é a pessoa mais velha ";
                        else 
                            if (id2 > id1)
                                 //retornando o valor  para o main
                                return n2 + "é a pessoa mais velha";
                            else return n1 + "e" +n2+ "tem a mesma idade";
            
} }
 
