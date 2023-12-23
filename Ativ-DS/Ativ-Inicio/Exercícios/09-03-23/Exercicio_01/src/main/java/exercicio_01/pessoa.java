/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class pessoa {
    //Atributos
    private String nome;
    private String endereco;
    private String telefone;
    
    //Construtores
    public pessoa(){
        this("","","");
    }
    
    public pessoa(String nome,String endereco, String telefone){
        
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
         }

    public String getNome() {
   return nome;
    }

    public void setNome(String nome) {
        this.nome =  JOptionPane.showInputDialog("Digite seu Nome!");
    }

    public String getEndereco() {
        
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = JOptionPane.showInputDialog("Digite seu Endereço");
    }

    public String getTelefone() {
       
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone =  JOptionPane.showInputDialog("Digite seu Telefone!");
    }

    public void inserirDadosPessoa(){
         JOptionPane.showMessageDialog(null, "Seja bem vindo(a) \n Para começar:");
       setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);

    }

    public void apresentarPessoa(){
        
        System.out.println("Olá, seu nome é  "+ getNome() + "Seu endereço é "+getEndereco ()+ "Seu Telefone é" + getTelefone());
        JOptionPane.showMessageDialog(null,"Olá, seu nome é  "+ getNome() + "Seu endereço é "+getEndereco()+ "Seu Telefone é:" + getTelefone());
    }
}
