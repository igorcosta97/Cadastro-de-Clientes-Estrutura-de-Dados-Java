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
public class Cliente {
    private String nome;
    private String endereco;
    private int codigo;
    
    
    public Cliente(int codigo, String nome, String endereco)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    
    public String toString()
    {
        return "Codigo: " + getCodigo() + "\tNome: " + getNome() + "\tEndereço: " + getEndereco();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

