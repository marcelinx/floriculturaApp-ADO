package com.mycompany.floriculturaapp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class TelaDeVendasLogic {
    private static final List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        inicializarProdutos();
    }

    public static void inicializarProdutos() {
        produtos.add(new Produto(1001, "Rosa Vermelha", 10, 5.0));
        produtos.add(new Produto(1002, "Tulipa Amarela", 15, 3.0));
        produtos.add(new Produto(1003, "Lírio Branco", 8, 6.0));
        produtos.add(new Produto(1004, "Orquídea Rosa", 12, 8.0));
        produtos.add(new Produto(1005, "Girassol", 20, 2.0));
        produtos.add(new Produto(1006, "Margarida", 18, 4.0));
        produtos.add(new Produto(1007, "Violeta Roxa", 25, 1.0));
    }

    public static void atualizarTabela(String nomeProduto, JTable produtosTable, JLabel totalLabel) {
        DefaultTableModel model = (DefaultTableModel) produtosTable.getModel();
        model.setRowCount(0);

        double total = 0.0;

        for (Produto produto : produtos) {
            if (produto.getDescricao().toLowerCase().contains(nomeProduto.toLowerCase())) {
                double subtotal = produto.getQuantidade() * produto.getPrecoUnitario();
                model.addRow(new Object[]{produto.getCodigo(), produto.getDescricao(), produto.getQuantidade(), produto.getPrecoUnitario(), subtotal});
                total += subtotal;
            }
        }

        totalLabel.setText("Total: R$ " + String.format("%.2f", total));
    }

    public static double calcularTotal(JTable produtosTable) {
        DefaultTableModel model = (DefaultTableModel) produtosTable.getModel();
        double total = 0.0;

        for (int i = 0; i < model.getRowCount(); i++) {
            double subtotal = (double) model.getValueAt(i, 4); // Coluna do Subtotal
            total += subtotal;
        }

        return total;
    }

public static Produto pesquisarProduto(int codigoProduto) {
    for (Produto produto : produtos) {
        if (produto.getCodigo() == codigoProduto) {
            return produto; // Retorna o produto encontrado
        }
    }
    return null; // Produto não encontrado
}
}
