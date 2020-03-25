/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;
import javax.swing.JOptionPane;
/**
 *
 * @author Igor
 */
public class Lista {
    
    TipoNo primeiro, ultimo, atual;
    
    private int ultimocodigo;
    
    public Lista()
    {
        primeiro = ultimo = null;
    }

    public void excluir(int codigo){
        TipoNo aux = primeiro;
        String entrada;
       int numero;
        
       
        while (aux != null && aux.item.getCodigo() != codigo){
            
            aux = aux.proximo;
        }
        
        if (aux == null){
            JOptionPane.showMessageDialog(null,"Cliente não encontrado");
            return;
        }
         
       
        entrada = JOptionPane.showInputDialog("Deseja Excluir o cliente? Se sim digite 1 ");
		// Converte a entrada para inteiro e armazena em numero1
        numero = Integer.parseInt(entrada);  
        
       if (numero==1){
        
        if (aux == primeiro)
        {
            if (primeiro == ultimo){
                ultimo = null;
                primeiro=null;
            }
            else {           
            primeiro = aux.proximo;
            primeiro.anterior=null;
            
            }
        } 
        else if (aux == ultimo)
        {
          
            ultimo.anterior.proximo=null;
            ultimo=ultimo.anterior;
                     
            
           
        } 
        else{
            aux.anterior.proximo=aux.proximo;
            aux.proximo.anterior=aux.anterior;
        }
        
        JOptionPane.showMessageDialog(null,"Cliente Excluido");
        
        }
        
    }
    

    
    public boolean vazia()
    {
        return primeiro == null;
    }
    
    
   public void CadastrarCliente(String nome, String endereco){
   ultimocodigo++;
   
   CadastrarCliente(ultimocodigo,nome,endereco);
   }
    
    public void CadastrarCliente( int codigo, String nome, String endereco)
    {   
                              
         TipoNo aux=null;             
         TipoNo no = new TipoNo(codigo, nome, endereco); 
        
              
        if (vazia()) 
              primeiro = no;
                            
        else{
                no.anterior=ultimo;
              ultimo.proximo = no;
              
        }
        
        ultimo = no;
       
    
      
    }
        
    public void salvarclientes(){     
        Arquivo a = new Arquivo("cliente.txt");
        a.abrirArquivo();
        TipoNo aux = primeiro;
        
        while (aux != null)
        {
            a.gravarCliente(aux.item.getCodigo(),aux.item.getNome(),aux.item.getEndereco());
            
            aux = aux.proximo;
        }
        a.fecharArquivo();        
            
        
           
    }
    
    public void carregarclientes() {
        ArquivoLeitura a = new ArquivoLeitura("cliente.txt");
        a.abrirArquivoLeitura();
        a.lerRegistros(this);
        a.fecharArquivoLeitura();

}
    
    
    public TipoNo localizar(int codigo)
    {
       TipoNo aux = primeiro;
        
        while (aux != null)
        {
            if(aux.item.getCodigo()== codigo){
                  return aux;
            }
            aux = aux.proximo;
        }
     return null;   
    }
    

    public void imprimir()
    {
        TipoNo aux = primeiro;
        
        while (aux != null)
        {
            System.out.println(aux);
            aux = aux.proximo;
        }
    }
    
    public Cliente primeiro()
    {
        
        
        atual = primeiro;
        return atual.item;
    }

    public Cliente ultimo()
    {
        if (atual==null)
            return null;
        
        atual = ultimo;
        return atual.item;
    }

    public Cliente proximo()
            
    {
         if (atual==null)
            return null;
        
        atual=atual.proximo;
        
        if (atual==null)
           atual=ultimo;
        
        return atual.item;
    }

    public Cliente anterior()
    {
        if (atual==null)
            return null;
        
        atual=atual.anterior;
                    
         if (atual==null)
           atual=primeiro;
        
        return atual.item;
        
        
            
    }
}
