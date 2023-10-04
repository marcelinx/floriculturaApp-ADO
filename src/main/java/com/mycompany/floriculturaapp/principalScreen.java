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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(screenClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 647, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screenClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void screenClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenClientButtonActionPerformed
        Client c = new Client();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_screenClientButtonActionPerformed

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
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
