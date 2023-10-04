package com.mycompany.floriculturaapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Client extends javax.swing.JFrame {
    
    private DefaultTableModel tableModel;
    private int selectedRow = -1;

    public Client() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) clientTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        textName = new javax.swing.JLabel();
        textStreet = new javax.swing.JLabel();
        textNeighborhood = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        streetField = new javax.swing.JTextField();
        neighborhoodField = new javax.swing.JTextField();
        numberPhone = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        numberID = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        textClient = new javax.swing.JLabel();
        clientType = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(140, 17, 120));
        title.setText("Página de Clientes");

        subtitle.setForeground(new java.awt.Color(140, 17, 120));
        subtitle.setText("Floricultura - CuMeCheira");

        textName.setText("Nome");

        textStreet.setText("Rua");

        textNeighborhood.setText("Bairro");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        numberPhone.setText("Numero");

        numberID.setText("ID");

        textClient.setText("Tipo de Cliente");

        clientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo", "Pessoa Fisica", "Pessoa Juridica", "Evento" }));

        btnAdd.setForeground(new java.awt.Color(140, 17, 120));
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Bairro", "ID", "Tipo de Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clientTable);

        btnEdit.setForeground(new java.awt.Color(140, 17, 120));
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(140, 17, 120));
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(title))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(subtitle))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textNeighborhood)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(neighborhoodField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textName)
                                    .addComponent(textStreet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(streetField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberPhone)
                                    .addComponent(numberID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idField)
                                    .addComponent(numberField))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtitle)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textName)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberID)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textStreet)
                            .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberPhone)
                            .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNeighborhood)
                    .addComponent(neighborhoodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textClient)
                    .addComponent(clientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    
    String nome = nameField.getText();
    String rua = streetField.getText();
    String bairro = neighborhoodField.getText();
    String tipoCliente = clientType.getSelectedItem().toString();
    int id;

    try {
        id = Integer.parseInt(idField.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "O campo 'ID' deve ser um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (nome.isEmpty() || rua.isEmpty() || bairro.isEmpty() || tipoCliente.equals("Selecione o tipo") || idField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Object[] rowData = {nome, bairro, id, tipoCliente};
    tableModel.insertRow(0, rowData);

    nameField.setText("");
    streetField.setText("");
    neighborhoodField.setText("");
    clientType.setSelectedIndex(0);
    idField.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
 if (selectedRow >= 0) {
        String nome = nameField.getText();
        String rua = streetField.getText();
        String bairro = neighborhoodField.getText();
        String tipoCliente = clientType.getSelectedItem().toString();
        int id = Integer.parseInt(idField.getText());

        tableModel.setValueAt(nome, selectedRow, 0);
        tableModel.setValueAt(bairro, selectedRow, 1);
        tableModel.setValueAt(id, selectedRow, 2);
        tableModel.setValueAt(tipoCliente, selectedRow, 3);

        nameField.setText("");
        streetField.setText("");
        neighborhoodField.setText("");
        clientType.setSelectedIndex(0);
        idField.setText("");
        numberField.setText("");
        selectedRow = -1;
    } else {
        selectedRow = clientTable.getSelectedRow();
        if (selectedRow >= 0) {
            nameField.setText(clientTable.getValueAt(selectedRow, 0).toString());
            neighborhoodField.setText(clientTable.getValueAt(selectedRow, 1).toString());
            idField.setText(clientTable.getValueAt(selectedRow, 2).toString());
            clientType.setSelectedItem(clientTable.getValueAt(selectedRow, 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String nomeExcluir = nameField.getText().trim(); // Obtém o nome do campo de entrada
    
    if (!nomeExcluir.isEmpty()) {
        for (int row = 0; row < tableModel.getRowCount(); row++) {
            String nomeTabela = tableModel.getValueAt(row, 0).toString();
            if (nomeExcluir.equals(nomeTabela)) {
                tableModel.removeRow(row);
                nameField.setText("");
                streetField.setText("");
                neighborhoodField.setText("");
                clientType.setSelectedIndex(0);
                idField.setText("");
                selectedRow = -1;
                return; // Encerra o loop após encontrar o cliente
            }
        }
        JOptionPane.showMessageDialog(null, "O cliente com o nome '" + nomeExcluir + "' não foi encontrado na tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Preencha o campo 'Nome' para excluir um cliente.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTable clientTable;
    private javax.swing.JComboBox<String> clientType;
    private javax.swing.JTextField idField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField neighborhoodField;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberID;
    private javax.swing.JLabel numberPhone;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel textClient;
    private javax.swing.JLabel textName;
    private javax.swing.JLabel textNeighborhood;
    private javax.swing.JLabel textStreet;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
