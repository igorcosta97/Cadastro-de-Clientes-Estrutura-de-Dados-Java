/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

/**
 *
 * @author Igor
 */
public class TipoNo {
    
    Cliente item;
    TipoNo proximo, anterior; 
    
    public TipoNo(int codigo, String nome, String endereco)
    {
        this.item = new Cliente(codigo, nome, endereco);
        proximo = null;
        anterior =null;
    }
    
    public String toString()
    {
        return item.toString();
    }
    
}
