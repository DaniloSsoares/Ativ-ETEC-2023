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
public class Calculadora {
   
    private double n1 ;
    private double n2 ;
    private double r ;
         
        
     public Calculadora(){
         this(0,0,0);
     }
         
         public Calculadora(double n1, double n2, double r){
         this.n1 = n1;
         this.n2=n2;
         this.r=r;
         
         }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
       public void somar()  {
           this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite seu valor A")));
           this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite seu valor B")));
           this.setR(this.getN1() + this.getN2());
       }
       public void subtrair(double A,double B){
       double a=A;
       double b=B;
       }
    }

