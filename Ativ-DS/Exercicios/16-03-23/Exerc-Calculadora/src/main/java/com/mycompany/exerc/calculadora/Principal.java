/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
 
     public static void main(String[] args) {
          JOptionPane.showMessageDialog(null, "Bem vindo a sua calculadora!! ");
           JOptionPane.showMessageDialog(null, "Escolha uma operação a ser feita!! ");
           
          //Instancia
        Calculadora cal1 = new Calculadora();
        int op; 
        do{ 
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Soma " +
                    "\n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n0 - Sair"));
        //começando switch
          switch (op) { 
              //Caso 1 entrar no metodo somar sem return
        case 1:
       cal1.somar();
        break;
        //Entrando  no caso 2  em que você irá enviar valor de A e B para o metodo subtrair dai irá ser feito o calculo no metodo
        //E não possui retorno
         case 2:
       double A =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
       double B =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
       cal1.subtrair(A,B);
        break;
        
        // Entrando no caso 3 aqui inicia já puxando o resultado do metodo multiplica poispossui retorno
         case 3:
    double resultado = cal1.multiplicar();
    JOptionPane.showMessageDialog(null, "Seu resultado é " +resultado);
      break;
      
       //Entrando no caso 4 Aqui possui a entra do valor de A e B logo em seguida é mandado os  valores para o metodo 
      //lá irá acontecer a opearação e irá retornar para o resultado.
         case 4:
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
        double b =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
        double result = cal1.dividir(a, b);
        JOptionPane.showMessageDialog(null, "Seu resultado é " +result);
        break;
       // Aqui entra no caso 0 que ao clicar irá finalizar o programa
          case 0:
             JOptionPane.showMessageDialog(null, "Finalizando programa! ");
              JOptionPane.showMessageDialog(null, "Obrigado e até a proxima!! ");
             break;
             
             // digito outro valor que não seja 1,2,3,4,0 irá aparecer erro.
         default:
             JOptionPane.showMessageDialog(null, "Você digitou algo errado!!");
          }}while(op !=0);
     }}
        