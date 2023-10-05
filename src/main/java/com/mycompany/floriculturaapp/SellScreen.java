package com.mycompany.floriculturaapp;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class SellScreen extends javax.swing.JFrame {
    
 private GerenciadorProdutos gerenciadorProdutos = new GerenciadorProdutos();

    public SellScreen() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        separatorOne = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        separatorTwo = new javax.swing.JSeparator();
        subtitle1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        textResult = new javax.swing.JLabel();
        fieldPrice = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        separatorOne.setForeground(new java.awt.Color(140, 17, 120));

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(140, 17, 120));
        title.setText("Controle de Caixa");

        subtitle.setForeground(new java.awt.Color(140, 17, 120));
        subtitle.setText("Floricultura - CuMeCheira");

        separatorTwo.setForeground(new java.awt.Color(140, 17, 120));

        subtitle1.setForeground(new java.awt.Color(140, 17, 120));
        subtitle1.setText("Pesquisar");

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        btnAdd.setText("Adicionar");
        btnAdd.setActionCommand("Pesquisar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        textResult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textResult.setForeground(new java.awt.Color(140, 17, 120));
        textResult.setText("Total R$:");

        fieldPrice.setText(".");

        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Código", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorOne)
            .addComponent(separatorTwo)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(subtitle))
                            .addComponent(title))
                        .addGap(323, 323, 323)
                        .addComponent(subtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(textResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(title)
                        .addGap(4, 4, 4)
                        .addComponent(subtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtitle1)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)
                            .addComponent(btnDelete))
                        .addGap(17, 17, 17)))
                .addComponent(separatorOne, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(separatorTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textResult)
                    .addComponent(fieldPrice))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
            String codigoText = searchField.getText().trim();  // Remove espaços em branco
    int codigo;

    try {
        codigo = Integer.parseInt(codigoText);
    } catch (NumberFormatException e) {
        // Se o texto não for um número válido, exibe um aviso ao usuário
        JOptionPane.showMessageDialog(this, "Digite um código válido.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return; // Sai do método sem fazer a pesquisa
    }

    // Pesquisa produtos fictícios com base no código
    List<Produto> resultados = gerenciadorProdutos.pesquisarPorCodigo(codigo);

    if (resultados.isEmpty()) {
        // Exibe um aviso ao usuário informando que nenhum produto foi encontrado
        JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o código " + codigo + ".", "Aviso", JOptionPane.WARNING_MESSAGE);
    } else {
        // Adiciona o produto encontrado à tabela
        addProdutoToTable(resultados.get(0));
    }

    // Limpa o campo de pesquisa
    searchField.setText("");
}

private void addProdutoToTable(Produto produto) {
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.addRow(new Object[]{produto.getNome(), produto.getQuantidade(), produto.getCodigo(), produto.getPreco()});
    }//GEN-LAST:event_btnAddActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel fieldPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField searchField;
    private javax.swing.JSeparator separatorOne;
    private javax.swing.JSeparator separatorTwo;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel subtitle1;
    private javax.swing.JLabel textResult;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
