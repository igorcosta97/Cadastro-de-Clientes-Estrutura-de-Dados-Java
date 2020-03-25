/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;
import java.util.Formatter;

/**
 *
 * @author Igor
 */
public class Arquivo {
    
    String nomeArquivo;
    Formatter saida;
    
    
    public Arquivo(String n) {
        nomeArquivo = n;
    }

    public void abrirArquivo() {
        try {
            saida = new Formatter(nomeArquivo);
        } // fim do try
        catch (Exception minhaExcecao) {
            System.err.println("Erro ao tentar abrir o arquivo!");
            System.exit(1);
        }// fim do catch		
    }

    public void fecharArquivo() {
        saida.close();
    }

    public void gravarCliente(int codigo, String nome, String endereco) {
        
        Cliente c = new Cliente(codigo, nome, endereco);
        saida.format("%d %s %s \n", c.getCodigo(), c.getNome(), c.getEndereco()  );
    }
    
     

}
