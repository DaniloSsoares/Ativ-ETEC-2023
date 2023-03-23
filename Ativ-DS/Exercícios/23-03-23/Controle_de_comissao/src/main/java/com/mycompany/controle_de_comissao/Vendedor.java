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
public class Vendedor {
   private String nome;
   private Double SalarioBase;
   private double Result;

   public Vendedor(){
   this("",0,0);
   }
    public Vendedor(String nome, Double SalarioBase) {
        this.nome = nome;
        this.Result = Result;
        this.SalarioBase = SalarioBase;
    }

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
  
        public double calculoComissao(double valorVendido){
              this.setNome(JOptionPane.showInputDialog("Digite seu Nome"));
               this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário Base")));
               this.setResult(this.getSalarioBase() + (ValorVendido*0.1));
       return getResult();
     
            
    }}

