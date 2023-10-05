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

        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        screenSellReview = new javax.swing.JButton();
        screenProductButton = new javax.swing.JButton();
        screenSellingtButton = new javax.swing.JButton();
        screenClientButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CuMeCheira");
        setBackground(new java.awt.Color(242, 228, 216));

        title.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(140, 17, 120));
        title.setText("Floricultura - CuMeCheira");

        description.setForeground(new java.awt.Color(140, 17, 120));
        description.setText("Selecione o que deseja fazer:");

        screenSellReview.setBackground(new java.awt.Color(242, 242, 242));
        screenSellReview.setForeground(new java.awt.Color(140, 17, 120));
        screenSellReview.setText("Relatório de Venda");
        screenSellReview.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        screenSellReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenSellReviewActionPerformed(evt);
            }
        });

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

        screenClientButton.setBackground(new java.awt.Color(242, 242, 242));
        screenClientButton.setForeground(new java.awt.Color(140, 17, 120));
        screenClientButton.setText("Pagina de Clientes");
        screenClientButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        screenClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenClientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(screenSellingtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addComponent(screenSellReview, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(screenClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(screenProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(screenSellReview, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(screenSellingtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(screenProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(screenClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
            .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addGap(108, 108, 108)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(229, 229, 229))
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

    private void screenSellReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenSellReviewActionPerformed
        sellingReview sR = new sellingReview();
        this.setVisible(false);
        sR.setVisible(true);
    }//GEN-LAST:event_screenSellReviewActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel description;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton screenClientButton;
    private javax.swing.JButton screenProductButton;
    private javax.swing.JButton screenSellReview;
    private javax.swing.JButton screenSellingtButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
