/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Digite_Um_Numero;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class DigiteUmNumero {
    public static void main(String[] args){
        //Declarando um variável
        int a;
        //inicio do método
        digite();
        //aqui será realizado depois que o metodo digite for realizado
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));
        //realizando outro metodo sendo A a variavel declarada no inicio e que recebeu o valor digitado
        
        dobro(a);
    }
    static void digite()
   //mensagem que irá ser mandada para o main
    {
    JOptionPane.showMessageDialog(null,"Digite um número::");
    } 
    static void dobro(int n)
            //aqui será realizado o metodo da multipliação em o valor de n foi o valor digitado na variavel A
    { 
       int d = n * 2;
       JOptionPane.showMessageDialog(null,"Dobro de " +n+ " é "+d);
       // Aqui está sendo mostrado o valor da multiplacação realizada no metodo.
    }
}
