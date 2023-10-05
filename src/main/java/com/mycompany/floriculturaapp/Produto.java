package com.mycompany.floriculturaapp;


public class Produto {
    private String nome;
    private int quantidade;
    private int codigo;
    private double preco;

    public Produto(String nome, int quantidade, int codigo, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.preco = preco;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

