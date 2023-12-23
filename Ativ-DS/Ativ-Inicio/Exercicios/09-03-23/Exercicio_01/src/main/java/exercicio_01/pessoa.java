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
     //Recebimento dos valores das variaveis como parametro
    public pessoa(String nome,String endereco, String telefone){
         //o this estásendo usado para referenciar a um atributo externo fora do metodo.
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
         }
 // inicio do get e set
     // get está sendo usado como transferidor do valor do set
    public String getNome() {
   return nome;
    }
  // ele é o que recebe o valor digitado e transfere para o get para que ele retorne para metodo
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
 //metodo de mandar os resultados digitados para o metodo apresentar pessoa
    public void inserirDadosPessoa(){
         JOptionPane.showMessageDialog(null, "Seja bem vindo(a) \n Para começar:");
       setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);

    }

    public void apresentarPessoa(){
        
        System.out.println("Olá, seu nome é  "+ getNome() + 
                " \n Seu endereço é \n"+getEndereco ()+ 
                " \n Seu Telefone é " + getTelefone());
        JOptionPane.showMessageDialog(null,"Olá, seu nome é:  "+ getNome() + "\n Seu endereço é: "+getEndereco()+ " \n Seu Telefone é: " + getTelefone());
    }
}
