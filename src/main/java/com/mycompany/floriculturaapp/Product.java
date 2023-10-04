package com.mycompany.floriculturaapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Product extends javax.swing.JFrame {

    public Product() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        btnLeaveScreen = new javax.swing.JButton();
        textProductName = new javax.swing.JLabel();
        textDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelDescription = new javax.swing.JTextArea();
        labelNameProduct = new javax.swing.JTextField();
        textPrice = new javax.swing.JLabel();
        labelPrice = new javax.swing.JTextField();
        textQuantity = new javax.swing.JLabel();
        labelQtd = new javax.swing.JTextField();
        textCategory = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(140, 17, 120));
        title.setText("Página de Produto");

        subtitle.setForeground(new java.awt.Color(140, 17, 120));
        subtitle.setText("Floricultura - CuMeCheira");

        btnLeaveScreen.setForeground(new java.awt.Color(140, 17, 120));
        btnLeaveScreen.setText("Sair");
        btnLeaveScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveScreenActionPerformed(evt);
            }
        });

        textProductName.setForeground(new java.awt.Color(140, 17, 120));
        textProductName.setText("Nome do Produto");

        textDescription.setForeground(new java.awt.Color(140, 17, 120));
        textDescription.setText("Descrição");

        labelDescription.setColumns(20);
        labelDescription.setRows(5);
        jScrollPane1.setViewportView(labelDescription);

        textPrice.setForeground(new java.awt.Color(140, 17, 120));
        textPrice.setText("Preço");

        textQuantity.setForeground(new java.awt.Color(140, 17, 120));
        textQuantity.setText("Qtd. em estoque");

        textCategory.setForeground(new java.awt.Color(140, 17, 120));
        textCategory.setText("Categoria");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Flores", "Presentes", "Caixas", "Outros" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Produto", "Preço", "Quantidade", "Categoria", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable1);

        btnAdd.setForeground(new java.awt.Color(140, 17, 120));
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(140, 17, 120));
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setForeground(new java.awt.Color(140, 17, 120));
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(subtitle)))
                        .addGap(27, 27, 27)
                        .addComponent(btnLeaveScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(textProductName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNameProduct))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(textDescription)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textCategory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelQtd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLeaveScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtitle)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textProductName)
                                    .addComponent(labelNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPrice)
                                    .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btnAdd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textDescription)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textQuantity)
                                        .addComponent(labelQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnDelete))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textCategory)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnEdit)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeaveScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveScreenActionPerformed
        principalScreen pS = new principalScreen();
        this.setVisible(false);
        pS.setVisible(true);
    }//GEN-LAST:event_btnLeaveScreenActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nomeProduto = labelNameProduct.getText();
        String descricao = labelDescription.getText();
        String precoStr = labelPrice.getText();
        String quantidadeStr = labelQtd.getText();
        String categoria = jComboBox1.getSelectedItem().toString();

        if (nomeProduto.isEmpty() || precoStr.isEmpty() || quantidadeStr.isEmpty() || categoria.equals("Selecione a categoria")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double preco;
        int quantidade;
        try {
            preco = Double.parseDouble(precoStr);
            quantidade = Integer.parseInt(quantidadeStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um preço e uma quantidade válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Object[] rowData = {nomeProduto, preco, quantidade, categoria, descricao};
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.insertRow(0, rowData);

        labelNameProduct.setText("");
        labelDescription.setText("");
        labelPrice.setText("");
        labelQtd.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.removeRow(selectedRow);
        labelNameProduct.setText("");
        labelDescription.setText("");
        labelPrice.setText("");
        labelQtd.setText("");
        jComboBox1.setSelectedIndex(0);
    } else {
        JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
    String nomeProduto = labelNameProduct.getText();
    String descricao = labelDescription.getText();
    String precoStr = labelPrice.getText();
    String quantidadeStr = labelQtd.getText();
    String categoria = jComboBox1.getSelectedItem().toString();

    // Verifique se os campos obrigatórios estão preenchidos
    if (nomeProduto.isEmpty() || precoStr.isEmpty() || quantidadeStr.isEmpty() || categoria.equals("Selecione a categoria")) {
        JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verifique se o preço e a quantidade são números válidos
    double preco;
    int quantidade;
    try {
        preco = Double.parseDouble(precoStr);
        quantidade = Integer.parseInt(quantidadeStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Digite um preço e uma quantidade válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Atualize a linha selecionada com os novos valores
    DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
    tableModel.setValueAt(nomeProduto, selectedRow, 0);
    tableModel.setValueAt(preco, selectedRow, 1);
    tableModel.setValueAt(quantidade, selectedRow, 2);
    tableModel.setValueAt(categoria, selectedRow, 3);
    tableModel.setValueAt(descricao, selectedRow, 4);

    // Limpe os campos após a edição
    labelNameProduct.setText("");
    labelDescription.setText("");
    labelPrice.setText("");
    labelQtd.setText("");
    jComboBox1.setSelectedIndex(0);
    selectedRow = -1;
} else {
    JOptionPane.showMessageDialog(null, "Selecione um produto para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btnEditActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLeaveScreen;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea labelDescription;
    private javax.swing.JTextField labelNameProduct;
    private javax.swing.JTextField labelPrice;
    private javax.swing.JTextField labelQtd;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel textCategory;
    private javax.swing.JLabel textDescription;
    private javax.swing.JLabel textPrice;
    private javax.swing.JLabel textProductName;
    private javax.swing.JLabel textQuantity;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
