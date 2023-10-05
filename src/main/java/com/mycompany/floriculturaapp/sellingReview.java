package com.mycompany.floriculturaapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class sellingReview extends javax.swing.JFrame {

    private JTable table;

    public sellingReview() {
         setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        
        setTitle("Relatório de Vendas");

        String[] columnNames = {"Data", "Produto", "Valor"};
        Object[][] data = {
            {getCurrentDate(), "Rosa", 60.0},
            {getCurrentDate(), "Tulipa", 40.0},
            {getCurrentDate(), "Orquídea", 75.0},
            {getCurrentDate(), "Girassol", 45.0},
            {getCurrentDate(), "Lírio", 55.0},
            {getCurrentDate(), "Margarida", 70.0},
            {getCurrentDate(), "Cravo", 50.0},
            {getCurrentDate(), "Lavanda", 65.0},
            {getCurrentDate(), "Hortênsia", 80.0},
            {getCurrentDate(), "Azaleia", 95.0},
            {getCurrentDate(), "Gerânio", 72.0},
            {getCurrentDate(), "Violeta", 68.0},
            {getCurrentDate(), "Dália", 90.0}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);

        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                principalScreen pS = new principalScreen();
                dispose();
                pS.setVisible(true);
            }
        });

        JPanel chartPanel = createBarChart();

        JLabel legendLabel = new JLabel("Legenda: Cada barra representa o valor de venda de um produto.");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(chartPanel, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(legendLabel, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(backButton)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chartPanel, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(legendLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addContainerGap())
        );

        pack();
    }

    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(new Date());
    }

    private JPanel createBarChart() {
        JPanel chartPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                int numRows = table.getRowCount();
                int[] salesData = new int[numRows];

                for (int i = 0; i < numRows; i++) {
                    double value = Double.parseDouble(table.getValueAt(i, 2).toString());
                    salesData[i] = (int) (value * 2);
                }

                int width = getWidth();
                int height = getHeight();
                int barWidth = width / (numRows + 1);
                int x = 50;

                for (int i = 0; i < numRows; i++) {
                    int barHeight = salesData[i];
                    g2d.setColor(new Color(128, 0, 128));
                    g2d.fillRect(x, height - barHeight, barWidth, barHeight);
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(x, height - barHeight, barWidth, barHeight);
                    x += barWidth + 20;
                }
            }
        };

        return chartPanel;
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellingReview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
