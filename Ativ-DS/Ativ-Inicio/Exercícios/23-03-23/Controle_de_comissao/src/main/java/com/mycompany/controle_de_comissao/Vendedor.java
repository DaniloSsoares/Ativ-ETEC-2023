/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle_de_comissao;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
//Atributos
public class Vendedor {
    // Atributos
   private String nome;
   private Double SalarioBase;
   private double Result;
   
//construtores
      //Inicialzando atributo zerado
   public Vendedor(){
   this("",0,0);
   }
      //Recebendo valores do atributos
    public Vendedor(String nome, double SalarioBase,double result) {
        this.nome = nome;
        this.SalarioBase = SalarioBase;
        this.Result = Result;
    }
//Get e Setters
    public double getResult() {
        return Result;
    }

    public void setResult(double Result) {
        this.Result = Result;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
      
         return this.getNome();
    }

    public Double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }
  //fazendo calculo de comissão
        public double calculoComissao(double valorVendido){
            
            //Colocando valor de Nome
              this.setNome(JOptionPane.showInputDialog("Digite seu Nome"));
              
              //Colocando valor de Salário
               this.setSalarioBase(Double.valueOf(JOptionPane.showInputDialog("Digite o valor do salário Base")));
               
               //Resultado/ calculo
               this.setResult(this.getSalarioBase() + (valorVendido*(0.1)));
               
       return getResult();
     
            
    }}

