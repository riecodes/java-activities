package com.mycompany.laundryexpress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LaundryExpress extends javax.swing.JFrame {

    public LaundryExpress() {
        initComponents();
        loadTables();
    }
    
    // Method to load data into the table
    private void loadTables() {

        // SQL query to retrieve data from the transactions table
        String query = "SELECT name, number, wash_details, dry_details, total_amount FROM transactions WHERE is_completed = 1";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            // Prepare the model for the table
            DefaultTableModel model = (DefaultTableModel) tableDatabase.getModel();
            // Clear existing rows in the table
            model.setRowCount(0);

            // Loop through the result set and populate the table with the data
            while (rs.next()) {
                // Get the data from the result set
                String name = rs.getString("name");
                String number = rs.getString("number");
                String washDetails = rs.getString("wash_details");
                String dryDetails = rs.getString("dry_details");
                int totalAmount = rs.getInt("total_amount");

                // Add the data to the table model
                model.addRow(new Object[]{name, number, washDetails, dryDetails, totalAmount});
            }

        } catch (SQLException e) {
            // Handle exceptions (e.g., connection errors)
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void updateTransaction() {
        try {
            // Assuming you have a connection to your database (e.g., conn)
            Connection conn = DatabaseConnection.connect();
            String updateQuery = "UPDATE transactions SET is_completed = 1 WHERE wash_details IS NOT NULL AND dry_details IS NOT NULL AND total_amount IS NOT NULL";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(updateQuery);

            // Now, update the table to only show completed transactions
            String selectQuery = "SELECT * FROM transactions WHERE is_completed = 1";
            ResultSet rs = stmt.executeQuery(selectQuery);

            // Clear the previous data in the table (if any)
            DefaultTableModel model = (DefaultTableModel) tableDatabase.getModel();
            model.setRowCount(0);

            // Add rows to the table
            while (rs.next()) {
                String name = rs.getString("name");
                String number = rs.getString("number");
                String washDetails = rs.getString("wash_details");
                String dryDetails = rs.getString("dry_details");
                double totalAmount = rs.getDouble("total_amount");

                // Add the row to the table model
                model.addRow(new Object[]{name, number, washDetails, dryDetails, totalAmount});
            }

            // Update the table header
            tableDatabase.getColumnModel().getColumn(0).setHeaderValue("Name");
            tableDatabase.getColumnModel().getColumn(1).setHeaderValue("Number");
            tableDatabase.getColumnModel().getColumn(2).setHeaderValue("Wash");
            tableDatabase.getColumnModel().getColumn(3).setHeaderValue("Dry");
            tableDatabase.getColumnModel().getColumn(4).setHeaderValue("TOTAL");

            // Refresh the table
            tableDatabase.revalidate();
            tableDatabase.repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // GENERATED CODE
    // GENERATED CODE
    // GENERATED CODE
    // initComponents() 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        btnPanel = new javax.swing.JPanel();
        washBtn = new javax.swing.JButton();
        dryBtn = new javax.swing.JButton();
        totalBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        tableDatabase = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPanel.setBackground(new java.awt.Color(21, 96, 130));

        titlePanel.setBackground(new java.awt.Color(255, 191, 0));
        titlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        titleLabel.setBackground(new java.awt.Color(255, 191, 0));
        titleLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("LAUNDRY EXPRESS");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titleLabel)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnPanel.setBackground(new java.awt.Color(21, 96, 130));
        btnPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        washBtn.setBackground(new java.awt.Color(255, 255, 255));
        washBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        washBtn.setForeground(new java.awt.Color(0, 0, 0));
        washBtn.setText("WASH");
        washBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                washBtnActionPerformed(evt);
            }
        });

        dryBtn.setBackground(new java.awt.Color(255, 255, 255));
        dryBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dryBtn.setForeground(new java.awt.Color(0, 0, 0));
        dryBtn.setText("DRY");
        dryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dryBtnActionPerformed(evt);
            }
        });

        totalBtn.setBackground(new java.awt.Color(255, 255, 255));
        totalBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalBtn.setForeground(new java.awt.Color(0, 0, 0));
        totalBtn.setText("TOTAL");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(0, 0, 0));
        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(washBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(washBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(21, 96, 130));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        tableDatabase.setBackground(new java.awt.Color(255, 255, 255));
        tableDatabase.setForeground(new java.awt.Color(0, 0, 0));
        tableDatabase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Number", "Wash", "Dry", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDatabase.setToolTipText("");
        tableDatabase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableDatabase.setGridColor(new java.awt.Color(255, 255, 255));
        tableScrollPane.setViewportView(tableDatabase);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // GENERATED CODE
    // GENERATED CODE
    // GENERATED CODE
    
    
    private void washBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_washBtnActionPerformed
        
         // Open the ProgramPopup dialog
        Wash wash = new Wash(new javax.swing.JFrame(), true);
        wash.setVisible(true); // Show the popup
            
    }//GEN-LAST:event_washBtnActionPerformed

    private void dryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dryBtnActionPerformed
        // Go to Dry.java

        Dry dry = new Dry(new javax.swing.JFrame(), true);
        dry.setVisible(true);
        
    }//GEN-LAST:event_dryBtnActionPerformed

    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
        
        // Database connection (you should set this up as per your existing setup)
        Connection conn = DatabaseConnection.connect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Query to get the latest transaction_id (most recent transaction)
            String latestTransactionSql = "SELECT transaction_id FROM transactions ORDER BY transaction_id DESC LIMIT 1";

            // Prepare the statement to get the latest transaction_id
            stmt = conn.prepareStatement(latestTransactionSql);
            rs = stmt.executeQuery();

            if (rs.next()) {
                int transactionId = rs.getInt("transaction_id");

                // Query to fetch the necessary transaction data
                String sql = "SELECT t.transaction_id, t.wash_amount, t.dry_amount, t.wash_details, t.dry_details, " +
                             "wd.wash_amount AS wash_amount_details, wd.detergent, wd.fabric_conditioner, " +
                             "dd.dry_amount AS dry_amount_details " +
                             "FROM transactions t " +
                             "LEFT JOIN washdetails wd ON t.transaction_id = wd.transaction_id " +
                             "LEFT JOIN drydetails dd ON t.transaction_id = dd.transaction_id " +
                             "WHERE t.transaction_id = ?";

                stmt = conn.prepareStatement(sql);
                stmt.setInt(1, transactionId);
                rs = stmt.executeQuery();

                if (rs.next()) {
                    // Fetch data from the result set
                    double washAmount = rs.getDouble("wash_amount");  // Initial wash amount (from transactions)
                    double dryAmount = rs.getDouble("dry_amount");    // Initial dry amount (from transactions)
                    double washAmountDetails = rs.getDouble("wash_amount_details"); // Detailed wash amount
                    double dryAmountDetails = rs.getDouble("dry_amount_details");   // Detailed dry amount

                    // Calculate total amount using detailed amounts
                    double totalAmount = washAmountDetails + dryAmountDetails;

                    // Prepare the details strings
                    String detergent = rs.getString("detergent");
                    String fabricConditioner = rs.getString("fabric_conditioner");
                    String updatedWashDetails = "₱" + washAmountDetails + ", " + detergent + ", " + fabricConditioner;
                    String updatedDryDetails = (dryAmountDetails == 60.00) ? "Yes" : "No";  // Check for specific dry amount

                    // Update the transactions table with the new calculated values
                    String updateSql = "UPDATE transactions SET " +
                                       "wash_amount = ?, dry_amount = ?, total_amount = ?, " +
                                       "wash_details = ?, dry_details = ? " +
                                       "WHERE transaction_id = ?";

                    stmt = conn.prepareStatement(updateSql);
                    stmt.setDouble(1, washAmountDetails);  // Update with detailed values
                    stmt.setDouble(2, dryAmountDetails);
                    stmt.setDouble(3, totalAmount);  // Update with total of wash + dry amounts
                    stmt.setString(4, updatedWashDetails);
                    stmt.setString(5, updatedDryDetails);
                    stmt.setInt(6, transactionId);

                    // Execute update
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Transaction updated successfully!");
                    
                    updateTransaction();

                } else {
                    JOptionPane.showMessageDialog(null, "No transaction found with the provided ID.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No transactions found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_totalBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // Exit the program
        
        System.exit(0);
        
    }//GEN-LAST:event_exitBtnActionPerformed
   
    public javax.swing.JPanel getContentPanel() {
        return contentPanel;
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LaundryExpress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaundryExpress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaundryExpress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaundryExpress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaundryExpress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton dryBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tableDatabase;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton totalBtn;
    private javax.swing.JButton washBtn;
    // End of variables declaration//GEN-END:variables
}