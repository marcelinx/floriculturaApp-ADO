package com.mycompany.floriculturaapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class sellingReview extends javax.swing.JFrame {

    private JTable table;
    private String[] buyers = {"Otavio", "Joao", "Caue", "Pedro", "Carlos"};

    public sellingReview() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setTitle("Relatório de Vendas");

        // Defina os nomes das colunas
        String[] columnNames = {"Data", "Produto", "Valor", "Comprador", "Detalhes"};

        // Crie o modelo da tabela
        DefaultTableModel model = new DefaultTableModel(0, columnNames.length) {
            // Impede que as células sejam editáveis
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setColumnIdentifiers(columnNames);

        // Preencha a tabela com dados fictícios
        Object[][] data = {
            {getCurrentDate(), "Rosa", 60.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Tulipa", 40.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Orquídea", 75.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Girassol", 45.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Lírio", 55.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Margarida", 70.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Cravo", 50.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Lavanda", 65.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Hortênsia", 80.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Azaleia", 95.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Gerânio", 72.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Violeta", 68.0, getRandomBuyer(), "Detalhes"},
            {getCurrentDate(), "Dália", 90.0, getRandomBuyer(), "Detalhes"}
        };

        // Adicione os dados ao modelo da tabela
        for (Object[] row : data) {
            model.addRow(row);
        }

        // Crie a tabela com o modelo personalizado
        table = new JTable(model);

        // Adicione um ActionListener para a coluna "Detalhes"
        table.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        table.addMouseListener(new ButtonMouseListener(table));

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
    
    private String getRandomBuyer() {
        Random random = new Random();
        int index = random.nextInt(buyers.length);
        return buyers[index];
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
            // Diminua a espessura de cada barra
            int barWidth = width / (numRows + 2); // Diminuído o divisor
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellingReview().setVisible(true);
            }
        });
    }

    // Classe para renderizar o botão na coluna "Detalhes"
    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                setForeground(table.getSelectionForeground());
                setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            }
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // Classe para tratar os cliques no botão na coluna "Detalhes"
    class ButtonMouseListener extends MouseAdapter {
        private final JTable table;

        public ButtonMouseListener(JTable table) {
            this.table = table;
        }

        public void mouseClicked(MouseEvent e) {
            int column = table.getColumnModel().getColumnIndexAtX(e.getX());
            int row = e.getY() / table.getRowHeight();

            if (row < table.getRowCount() && row >= 0 && column == 4) {
                // Implemente a lógica para exibir os detalhes da compra em uma janela modal
                JOptionPane.showMessageDialog(null, "Detalhes da Compra:\n\n"
                        + "Data: " + table.getValueAt(row, 0) + "\n"
                        + "Produto: " + table.getValueAt(row, 1) + "\n"
                        + "Valor: " + table.getValueAt(row, 2) + "\n"
                        + "Comprador: " + table.getValueAt(row, 3));
            }
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
}
