/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import java.io.File;
import java.util.Scanner;


/**
 *
 * @author Igor
 */

public class ArquivoLeitura {
    String nomeArquivo;
    Scanner entrada;
   
    
     public ArquivoLeitura(String n) {
        nomeArquivo = n;
    }
    
     public void abrirArquivoLeitura() {
        try {
             entrada = new Scanner(new File(nomeArquivo));
        } // fim do try
        catch (Exception minhaExcecao) {
                System.err.println("Erro ao tentar abrir o arquivo!");
                System.exit(1);
        }// fim do catch		
   }
    public void lerRegistros(Lista l) {
        try // Lê os registros no arquivo utilizado
        {
            
            
                        

            while (entrada.hasNext()) {
                
                
                l.CadastrarCliente( entrada.nextInt(),entrada.next(),entrada.next());
                        
                       
            } // fim do while
        } // fim do try lê registros ...
        catch (Exception minhaExcecao)
        {
                System.err.println("Erro ao ler o arquivo");			
                System.exit(1);
        } // fim do catch
    }
     public void fecharArquivoLeitura() {
      entrada.close();	
   }

}
