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
public class Custos {
    //Atributos
    
    private double totalPercurso;
    
    //construtores
 //Inicialzando atributo zerado
    public Custos(){
    this(0);
    }
    //Get e Setters
    public Custos(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
     //Metodo calcular e recebendo como parametro da classe percurso
    public void calcularViagem(Percurso p){
       
         //Calculo do custo 
           double Cv = (p.getKmPercorrida() * p.getValorCombustivel()) + p.getValorPedagio();
                 //mostrando o valor de custo
         JOptionPane.showMessageDialog(null, "Seu Custo Total é: R$" +Cv);
    }
}
