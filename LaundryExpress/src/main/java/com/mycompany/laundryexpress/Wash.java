package com.mycompany.laundryexpress;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Wash extends javax.swing.JDialog {

    public Wash(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // GENERATED CODE
    // GENERATED CODE
    // GENERATED CODE
    // initComponents() Uneditable
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel2 = new javax.swing.JPanel();
        confirmBtn = new javax.swing.JButton();
        washLabel = new javax.swing.JLabel();
        formLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        detergentLabel = new javax.swing.JLabel();
        fabricLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        numberTextField = new javax.swing.JTextField();
        detergentComboBox = new javax.swing.JComboBox<>();
        fabricComboBox = new javax.swing.JComboBox<>();
        backWashBtn = new javax.swing.JButton();
        weightComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contentPanel2.setBackground(new java.awt.Color(21, 96, 130));

        confirmBtn.setBackground(new java.awt.Color(255, 255, 255));
        confirmBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(0, 0, 0));
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        washLabel.setBackground(new java.awt.Color(255, 191, 0));
        washLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        washLabel.setForeground(new java.awt.Color(255, 255, 255));
        washLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        washLabel.setText("WASH");

        formLabel.setBackground(new java.awt.Color(255, 191, 0));
        formLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        formLabel.setForeground(new java.awt.Color(255, 255, 255));
        formLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formLabel.setText("FORM:");

        nameLabel.setBackground(new java.awt.Color(255, 191, 0));
        nameLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText("Name:");

        numberLabel.setBackground(new java.awt.Color(255, 191, 0));
        numberLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numberLabel.setText("Number:");

        weightLabel.setBackground(new java.awt.Color(255, 191, 0));
        weightLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        weightLabel.setForeground(new java.awt.Color(255, 255, 255));
        weightLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        weightLabel.setText("Weight:");

        detergentLabel.setBackground(new java.awt.Color(255, 191, 0));
        detergentLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        detergentLabel.setForeground(new java.awt.Color(255, 255, 255));
        detergentLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        detergentLabel.setText("Detergent:");

        fabricLabel.setBackground(new java.awt.Color(255, 191, 0));
        fabricLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fabricLabel.setForeground(new java.awt.Color(255, 255, 255));
        fabricLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fabricLabel.setText("Fabric Conditioner:");

        nameTextField.setBackground(new java.awt.Color(255, 255, 255));
        nameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(0, 0, 0));

        numberTextField.setBackground(new java.awt.Color(255, 255, 255));
        numberTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        numberTextField.setForeground(new java.awt.Color(0, 0, 0));
        numberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTextFieldActionPerformed(evt);
            }
        });

        detergentComboBox.setBackground(new java.awt.Color(255, 255, 255));
        detergentComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        detergentComboBox.setForeground(new java.awt.Color(0, 0, 0));
        detergentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ariel", "Pride", "No Detergent" }));
        detergentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detergentComboBoxActionPerformed(evt);
            }
        });

        fabricComboBox.setBackground(new java.awt.Color(255, 255, 255));
        fabricComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fabricComboBox.setForeground(new java.awt.Color(0, 0, 0));
        fabricComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Downy", "Surf", "No Fabric Conditioner" }));
        fabricComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricComboBoxActionPerformed(evt);
            }
        });

        backWashBtn.setBackground(new java.awt.Color(255, 255, 255));
        backWashBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backWashBtn.setForeground(new java.awt.Color(0, 0, 0));
        backWashBtn.setText("Back");
        backWashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backWashBtnActionPerformed(evt);
            }
        });

        weightComboBox.setBackground(new java.awt.Color(255, 255, 255));
        weightComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        weightComboBox.setForeground(new java.awt.Color(0, 0, 0));
        weightComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 kg  ", "2 kg  ", "3 kg  ", "4 kg  ", "5 kg  ", "6 kg  ", "7 kg  ", "8 kg" }));
        weightComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanel2Layout = new javax.swing.GroupLayout(contentPanel2);
        contentPanel2.setLayout(contentPanel2Layout);
        contentPanel2Layout.setHorizontalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backWashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detergentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fabricLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(nameTextField)
                    .addComponent(detergentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fabricComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weightComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(washLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(190, 190, 190)))
            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(formLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(658, Short.MAX_VALUE)))
        );
        contentPanel2Layout.setVerticalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTextField)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numberTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weightComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detergentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detergentComboBox))
                .addGap(18, 18, 18)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fabricLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fabricComboBox))
                .addGap(61, 61, 61)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backWashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(washLabel)
                    .addContainerGap(413, Short.MAX_VALUE)))
            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanel2Layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(formLabel)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // GENERATED CODE
    // GENERATED CODE
    // GENERATED CODE
    
    
    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        
        // Check if all fields are filled
        String name = nameTextField.getText().trim();
        String number = numberTextField.getText().trim();
        String weightSelected = (String) weightComboBox.getSelectedItem(); // Updated to use ComboBox
        String detergent = (String) detergentComboBox.getSelectedItem();
        String fabricConditioner = (String) fabricComboBox.getSelectedItem();

        if (name.isEmpty() || weightSelected == null || detergent == null || fabricConditioner == null) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Parse weight to extract the numeric value
        int weight;
        try {
            // Extract the numeric portion, assuming format like "1 kg", "2 kg"
            weight = Integer.parseInt(weightSelected.split(" ")[0]);
            if (weight < 1 || weight > 8) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please select a valid weight between 1 and 8.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Detergent cost and fabric conditioner cost
        double detergentCost = 0.00;
        double fabricConditionerCost = 0.00;
        
        if (!"No Detergent".equals(detergent)) {
            detergentCost = 11.00;
        }

        if (!"No Fabric Conditioner".equals(fabricConditioner)) {
            fabricConditionerCost = 16.00;
        }
        // Base wash amount is 60 pesos, you can modify this if needed
        double washAmount = 60.00;

        // Calculate the total amount for the wash
        double totalAmount = washAmount + detergentCost + fabricConditionerCost;

        // Insert data into transactions table first
        String insertTransactionSQL = "INSERT INTO transactions (wash_amount, name, number, dry_amount, total_amount) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.connect();
             PreparedStatement transactionStatement = connection.prepareStatement(insertTransactionSQL, PreparedStatement.RETURN_GENERATED_KEYS)) {

            // Set transaction values
            transactionStatement.setDouble(1, washAmount); // Wash amount
            transactionStatement.setString(2, name);
            transactionStatement.setString(3, number);
            transactionStatement.setDouble(4, 0.00); // Dry amount (assuming 0 for now)
            transactionStatement.setDouble(5, totalAmount); // Total amount

            // Execute the transaction insert
            int rowsInserted = transactionStatement.executeUpdate();

            if (rowsInserted > 0) {
                // Get the generated transaction_id
                try (ResultSet generatedKeys = transactionStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int transactionId = generatedKeys.getInt(1); // Get the transaction_id

                        // Now insert into washdetails table using the generated transaction_id
                        String insertWashDetailsSQL = "INSERT INTO washdetails (transaction_id, weight_kg, detergent, fabric_conditioner, wash_amount) VALUES (?, ?, ?, ?, ?)";
                        try (PreparedStatement washDetailsStatement = connection.prepareStatement(insertWashDetailsSQL)) {
                            washDetailsStatement.setInt(1, transactionId); // Use the generated transaction_id
                            washDetailsStatement.setInt(2, weight); // Weight
                            washDetailsStatement.setString(3, detergent); // Detergent
                            washDetailsStatement.setString(4, fabricConditioner); // Fabric Conditioner
                            washDetailsStatement.setDouble(5, totalAmount); // Total wash amount

                            int washDetailsInserted = washDetailsStatement.executeUpdate();
                            if (washDetailsInserted > 0) {
                                // Now insert into drydetails table using the generated transaction_id
                                String insertDryDetailsSQL = "INSERT INTO drydetails (transaction_id) VALUES (?)";
                                try (PreparedStatement dryDetailsStatement = connection.prepareStatement(insertDryDetailsSQL)) {
                                    // For dry details, assuming an opted dry cost (you can adjust this value if necessary)                                                                 

                                    dryDetailsStatement.setInt(1, transactionId); // Use the generated transaction_id                                                                        

                                    int dryDetailsInserted = dryDetailsStatement.executeUpdate();
                                    if (dryDetailsInserted > 0) {
                                        JOptionPane.showMessageDialog(this, "Wash details saved successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                        
                                        dispose(); // Remove the form
                                        
                                        clearFields();  // Reset fields after successful insert
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Failed to save dry details.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Failed to save wash details.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save transaction.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_confirmBtnActionPerformed

    private void backWashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backWashBtnActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_backWashBtnActionPerformed

    private void detergentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detergentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detergentComboBoxActionPerformed

    private void fabricComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fabricComboBoxActionPerformed

    private void numberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTextFieldActionPerformed

    private void detergentComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detergentComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detergentComboBox1ActionPerformed

    private void weightComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightComboBoxActionPerformed

    private void clearFields() {
        nameTextField.setText("");
        numberTextField.setText("");
        detergentComboBox.setSelectedIndex(0);
        fabricComboBox.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backWashBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPanel contentPanel2;
    private javax.swing.JComboBox<String> detergentComboBox;
    private javax.swing.JLabel detergentLabel;
    private javax.swing.JComboBox<String> fabricComboBox;
    private javax.swing.JLabel fabricLabel;
    private javax.swing.JLabel formLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JLabel washLabel;
    private javax.swing.JComboBox<String> weightComboBox;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
