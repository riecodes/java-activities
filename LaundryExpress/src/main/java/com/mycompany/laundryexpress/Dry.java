package com.mycompany.laundryexpress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Dry extends javax.swing.JDialog {

    public Dry(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel3 = new javax.swing.JPanel();
        yesBtn = new javax.swing.JButton();
        dryLabel = new javax.swing.JLabel();
        noBtn = new javax.swing.JButton();
        dryBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contentPanel3.setBackground(new java.awt.Color(21, 96, 130));

        yesBtn.setBackground(new java.awt.Color(255, 255, 255));
        yesBtn.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        yesBtn.setForeground(new java.awt.Color(0, 0, 0));
        yesBtn.setText("YES");
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });

        dryLabel.setBackground(new java.awt.Color(255, 191, 0));
        dryLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        dryLabel.setForeground(new java.awt.Color(255, 255, 255));
        dryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dryLabel.setText("DRY");

        noBtn.setBackground(new java.awt.Color(255, 255, 255));
        noBtn.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        noBtn.setForeground(new java.awt.Color(0, 0, 0));
        noBtn.setText("NO");
        noBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBtnActionPerformed(evt);
            }
        });

        dryBackBtn.setBackground(new java.awt.Color(255, 255, 255));
        dryBackBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dryBackBtn.setForeground(new java.awt.Color(0, 0, 0));
        dryBackBtn.setText("Back");
        dryBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dryBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanel3Layout = new javax.swing.GroupLayout(contentPanel3);
        contentPanel3.setLayout(contentPanel3Layout);
        contentPanel3Layout.setHorizontalGroup(
            contentPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(yesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dryBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(714, Short.MAX_VALUE))
        );
        contentPanel3Layout.setVerticalGroup(
            contentPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(dryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(contentPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addComponent(dryBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 887, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contentPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contentPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        
        // Update the latest dry_amount in drydetails table
        try {
            // Establish a database connection
            Connection connection = DatabaseConnection.connect();

            // SQL query to update the dry_amount
            String updateQuery = "UPDATE drydetails SET dry_amount = 60.00 WHERE dry_id = (SELECT MAX(dry_id) FROM drydetails)";
            PreparedStatement stmt = connection.prepareStatement(updateQuery);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Dry amount updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Error: No record found to update.");
            }

            // Close the connection
            stmt.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

        // Close the dialog window
        this.dispose();
        
    }//GEN-LAST:event_yesBtnActionPerformed

    private void noBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBtnActionPerformed
        
        // Close the dialog window without making changes
        this.dispose();
        
    }//GEN-LAST:event_noBtnActionPerformed

    private void dryBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dryBackBtnActionPerformed
        
        // Close the dialog window when the "Back" button is clicked
        this.dispose();
        
    }//GEN-LAST:event_dryBackBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel3;
    private javax.swing.JButton dryBackBtn;
    private javax.swing.JLabel dryLabel;
    private javax.swing.JButton noBtn;
    private javax.swing.JButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
