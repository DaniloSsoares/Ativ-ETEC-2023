/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Caixa {
    
    //Atributos
    private double saldo;
    
    //construtores
    //Inicialzando atributo zerado
    
    public Caixa(){
        this(0);
    }
    //Inicialzando o atributo com o parametro
    public Caixa(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Método específico da classe
    public void entrar(){
        //Lê um valor, converte de String para double e atribui a variavel valor
       double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite ovalor da entrada: "));
       /* Soma o conteudo do atributo saldo cm o a varavel valor e passa o resultado por parametro
       para o étodo setSaldo()
       */
       this.setSaldo(this.saldo + valor);
    }
    public void retirar(){
        //Lê um valor, converte de string para double e atribui a variavel valor
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada:" ));
        /*
        Subtrai o conteudo do atributo saldo cm o a variavel valor  passa o resultado por parametro para o método setSaldo()
        */
        this.setSaldo(this.saldo - valor);
        
    }
    }

