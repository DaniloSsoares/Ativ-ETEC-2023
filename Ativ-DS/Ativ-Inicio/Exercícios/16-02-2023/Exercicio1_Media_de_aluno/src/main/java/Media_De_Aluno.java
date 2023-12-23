
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;
public class Media_De_Aluno {
    
    
     public static void main(String[] args){
        
         
         String nome;
       float nota1 = 0, nota2 = 0;
         float media = 0;
         
         JOptionPane.showMessageDialog(null, "Seja bem vindo(a)");
         nome=JOptionPane.showInputDialog("Digite seu nome");
         
      nota1 = lerNota();
      nota2 = lerNota();
    media = calcularMedia(nota1,nota2);
      
    if (media < 7){
       JOptionPane.showMessageDialog(null, nome+  " Sua " + media+ " Você não obteve a nota necessária");
    }
    else if(media < 10){
         JOptionPane.showMessageDialog(null, nome  + "  Sua nota foi " +media+ " levou a sua aprovação");
    }
    else if(media > 10){
         JOptionPane.showMessageDialog(null, nome + "Sua nota foi " +media+" Você digitou algo errado ");
     }
     }

    
     static float lerNota()
     {
          float nt1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Sua primeira nota"));
                  return nt1;
                   
     } 
     

    static  float calcularMedia(float nt1,float nt2){
        
       float med = (nt1+nt2)/2;
         return med;
    }
}

         
     
     
      
