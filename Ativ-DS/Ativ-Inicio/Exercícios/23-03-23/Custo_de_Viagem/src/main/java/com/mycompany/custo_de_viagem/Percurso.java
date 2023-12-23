/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.custo_de_viagem;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Percurso {
      //Atributos
    private double KmPercorrida;
  private double valorCombustivel;
    private double valorPedagio;

//construtores
    public Percurso(double KmPercorrida, double valorCombustivel, double valorPedagio) {
        this.KmPercorrida = KmPercorrida;
        this.valorCombustivel = valorCombustivel;
        this.valorPedagio = valorPedagio;
    }
    
    //Inicialzando atributo zerado
    public Percurso(){
        this(0,0,0);
    }
  //Iniciando get e setters
    public double getKmPercorrida() {
        return KmPercorrida;
    }

    public void setKmPercorrida(double KmPercorrida) {
        this.KmPercorrida = KmPercorrida;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
    
   
    //Método específico da classe cadastrarPercurso
    public void cadastrarPercurso(){
          //Lê um valor, converte de String para double e atribui a variavel valor
        this.setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog("Digite o Km Percorrido")));
        this.setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do combustivel")));
        this.setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de pedagio")));
    }
      //metodo de listaPercurso
     public void listaPercurso(){
    JOptionPane.showMessageDialog(null, "Seu km rodados é! " +getKmPercorrida()+ "Km"+ "\n sendo seu valor de combustivel por litro! R$" +getValorCombustivel() + "\n E seu valor do pedágio ! R$" + getValorPedagio());
    }
}
