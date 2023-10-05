package com.mycompany.floriculturaapp;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private List<Produto> listaProdutos;

    public GerenciadorProdutos() {
        // Inicializa a lista de produtos fictícios
        listaProdutos = new ArrayList<>();

        // Adiciona alguns produtos fictícios à lista
        listaProdutos.add(new Produto("Rosa Vermelha", 5, 101, 2.5));
        listaProdutos.add(new Produto("Lírio Branco", 3, 102, 3.0));
        listaProdutos.add(new Produto("Tulipa Amarela", 8, 103, 2.0));
        listaProdutos.add(new Produto("Girassol", 4, 104, 2.2));
    }

    public List<Produto> pesquisarProduto(String termoPesquisa) {
        List<Produto> resultados = new ArrayList<>();

        // Simula a pesquisa de produtos na lista fictícia
        for (Produto produto : listaProdutos) {
            if (produto.getNome().toLowerCase().contains(termoPesquisa.toLowerCase())) {
                resultados.add(produto);
            }
        }

        return resultados;
    }
}