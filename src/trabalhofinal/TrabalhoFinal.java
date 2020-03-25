/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class TrabalhoFinal {
    
    public static void main(String[] args) {
    
        String nome , endereco;
        int sair=1;       
        Scanner input = new Scanner(System.in);
        Lista b = new Lista(); 
         b.carregarclientes();
         b.imprimir();
         b.excluir(2);
         b.salvarclientes();
         b.imprimir();
         
         
         
        while (sair != 0){
        System.out.println("Digite nome, endereço: ");
            
            nome = input.next();
            endereco = input.next();            
                
              
       b.CadastrarCliente(nome, endereco);
       
       System.out.println("Deseja sair? ");
       sair = input.nextInt();
       b.imprimir();
       
        }
        
      
      
     
        
         
}
}

    
    
    

