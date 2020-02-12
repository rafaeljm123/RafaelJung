/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rafael;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Rafael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Primeironumero = 
             JOptionPane.showInputDialog("Digite um numero inteiro");   
        String Segundonumero =
             JOptionPane.showInputDialog("Digite outro  numero inteiro");
        
        int numero1 = Integer.parseInt(Primeironumero);
        int numero2 = Integer.parseInt(Segundonumero);
        
        int soma = numero1 + numero2;
        
         JOptionPane.showMessageDialog(null , "A soma é igual a"+ soma , "Soma dos 2 inteiros", JOptionPane.PLAIN_MESSAGE);
                
                
                
    }
    
}
