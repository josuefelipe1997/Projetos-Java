package model;

import helper.Utils;

public class Produto {

    private static int contador = 1;

    private int codigo;
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco){
        this.codigo = Produto.contador;
        this.nome = nome;
        this.preco = preco;
        Produto.contador += 1;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }

    public String toString(){
        return "\nC�digo: " + this.getCodigo() + "\nNome: " + this.getNome() + "\nPreco: " + Utils.doubleParaString(this.getPreco());
    }
}
