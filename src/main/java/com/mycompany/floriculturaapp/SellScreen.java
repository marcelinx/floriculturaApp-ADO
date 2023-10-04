package com.mycompany.floriculturaapp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SellScreen extends javax.swing.JFrame {

    private JTextField produtoField;
    private JButton pesquisarButton;
    private JTable produtosTable;
    private JLabel totalLabel;

    public SellScreen() {
        initUI();
    }

    private void initUI() {
        
        setTitle("Sistema de Vendas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        produtoField = new JTextField(20);
        pesquisarButton = new JButton("Pesquisar");
        produtosTable = new JTable(new DefaultTableModel(new Object[]{"Código", "Descrição", "Quantidade", "Preço Unitário", "Subtotal"}, 0));
        totalLabel = new JLabel("Total: R$ 0.00");

        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Produto:"));
        topPanel.add(produtoField);
        topPanel.add(pesquisarButton);
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(produtosTable), BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(totalLabel);
        add(bottomPanel, BorderLayout.SOUTH);
        
        pesquisarButton.addActionListener((ActionEvent e) -> {
    try {
        int codigoProduto = Integer.parseInt(produtoField.getText());

        Produto produtoEncontrado = TelaDeVendasLogic.pesquisarProduto(codigoProduto);

        if (produtoEncontrado != null) {
            DefaultTableModel model = (DefaultTableModel) produtosTable.getModel();

            // Verifique se o produto já está na tabela
            boolean produtoJaNaTabela = false;
            int rowCount = model.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                int codigo = (int) model.getValueAt(i, 0);
                if (codigo == produtoEncontrado.getCodigo()) {
                    // Se o produto já estiver na tabela, aumente a quantidade em 1
                    int quantidade = (int) model.getValueAt(i, 2);
                    model.setValueAt(quantidade + 1, i, 2);

                    // Atualize o subtotal
                    double precoUnitario = produtoEncontrado.getPrecoUnitario();
                    model.setValueAt(quantidade * precoUnitario, i, 4);

                    produtoJaNaTabela = true;
                    break;
                }
            }

            if (!produtoJaNaTabela) {
                // Se o produto não estiver na tabela, adicione-o com quantidade 1
                model.addRow(new Object[]{
                    produtoEncontrado.getCodigo(),
                    produtoEncontrado.getDescricao(),
                    1,
                    produtoEncontrado.getPrecoUnitario(),
                    produtoEncontrado.getPrecoUnitario()
                });
            }
        } else {
            System.out.println("Produto não encontrado: Código " + codigoProduto);
        }
    } catch (NumberFormatException ex) {
        System.out.println("Código de produto inválido: " + produtoField.getText());
    }
});

    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SellScreen().setVisible(true);
        });
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

