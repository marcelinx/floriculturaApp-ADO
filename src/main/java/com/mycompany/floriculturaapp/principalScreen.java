package com.mycompany.floriculturaapp;

import javax.swing.JFrame;

public class principalScreen extends javax.swing.JFrame {

    public principalScreen() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screenClientButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        screenProductButton = new javax.swing.JButton();
        screenSellingtButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CuMeCheira");
        setBackground(new java.awt.Color(242, 228, 216));

        screenClientButton.setBackground(new java.awt.Color(242, 242, 242));
        screenClientButton.setForeground(new java.awt.Color(140, 17, 120));
        screenClientButton.setText("Pagina de Clientes");
        screenClientButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        screenClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenClientButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(140, 17, 120));
        title.setText("Floricultura - CuMeCheira");

        description.setForeground(new java.awt.Color(140, 17, 120));
        description.setText("Selecione o que deseja fazer:");

        screenProductButton.setBackground(new java.awt.Color(242, 242, 242));
        screenProductButton.setForeground(new java.awt.Color(140, 17, 120));
        screenProductButton.setText("Pagina de Produtos");
        screenProductButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        screenProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenProductButtonActionPerformed(evt);
            }
        });

        screenSellingtButton.setBackground(new java.awt.Color(242, 242, 242));
        screenSellingtButton.setForeground(new java.awt.Color(140, 17, 120));
        screenSellingtButton.setText("Venda");
        screenSellingtButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        screenSellingtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenSellingtButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                .addGap(34, 34, 34))
            .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(screenSellingtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(screenClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(screenProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(screenClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(screenProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screenSellingtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void screenClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenClientButtonActionPerformed
        Login l = new Login();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_screenClientButtonActionPerformed

    private void screenProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenProductButtonActionPerformed
        Login l = new Login();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_screenProductButtonActionPerformed

    private void screenSellingtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenSellingtButtonActionPerformed
        SellScreen sC = new SellScreen();
        this.setVisible(false);
        sC.setVisible(true);
    }//GEN-LAST:event_screenSellingtButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel description;
    private javax.swing.JButton screenClientButton;
    private javax.swing.JButton screenProductButton;
    private javax.swing.JButton screenSellingtButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
