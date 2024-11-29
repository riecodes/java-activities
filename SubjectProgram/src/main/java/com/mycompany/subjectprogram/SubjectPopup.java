package com.mycompany.subjectprogram;

import javax.swing.JOptionPane;

public class SubjectPopup extends javax.swing.JDialog {

    private String subject1;
    private String subject2;
    private String subject3;
    private boolean confirmed = false; // To track if the user clicked "OK"
    
    public SubjectPopup(java.awt.Frame parent, boolean modal, String subject1, String subject2, String subject3) {
    super(parent, modal);
    initComponents();

    this.subject1 = subject1;
    this.subject2 = subject2;
    this.subject3 = subject3;

    // Initialize text fields with passed values
    subText1.setText(subject1);
    subText3.setText(subject2);
    subText3.setText(subject3);
    
    // Show only subject 1 initially
    toggleVisibility();
}
    
    // Toggle visibility based on the subject data
    private void toggleVisibility() {
        subText1.setVisible(subject1 == null || subject1.isEmpty());
        subLabel1.setVisible(subject1 == null || subject1.isEmpty());
        
        subText2.setVisible(subject1 != null && !subject1.isEmpty() && (subject2 == null || subject2.isEmpty()));
        subLabel2.setVisible(subject1 != null && !subject1.isEmpty() && (subject2 == null || subject2.isEmpty()));
        
        subText3.setVisible(subject2 != null && !subject2.isEmpty() && (subject3 == null || subject3.isEmpty()));
        subLabel3.setVisible(subject2 != null && !subject2.isEmpty() && (subject3 == null || subject3.isEmpty()));
    }
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subLabel1 = new javax.swing.JLabel();
        subLabel2 = new javax.swing.JLabel();
        subLabel3 = new javax.swing.JLabel();
        subText1 = new javax.swing.JTextField();
        subText2 = new javax.swing.JTextField();
        subText3 = new javax.swing.JTextField();
        okBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        subLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subLabel1.setText("Subject 1:");

        subLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subLabel2.setText("Subject 2:");

        subLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subLabel3.setText("Subject 3:");

        subText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subText1ActionPerformed(evt);
            }
        });

        subText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subText2ActionPerformed(evt);
            }
        });

        subText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subText3ActionPerformed(evt);
            }
        });

        okBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(subLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subText1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subText3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subText2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(okBtn)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void subText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subText1ActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
        
        // Handle subject entry step by step
        if (subject1 == null || subject1.isEmpty()) {
            subject1 = subText1.getText().trim();
            if (subject1.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Subject 1 cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } else if (subject2 == null || subject2.isEmpty()) {
            subject2 = subText2.getText().trim();
            if (subject2.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Subject 2 cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } else if (subject3 == null || subject3.isEmpty()) {
            subject3 = subText3.getText().trim();
            if (subject3.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Subject 3 cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "All subjects have been entered.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

        confirmed = true; // Mark as confirmed
        toggleVisibility(); // Update visibility for the next fields
        dispose();
        
    }//GEN-LAST:event_okBtnActionPerformed

    private void subText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subText3ActionPerformed

    private void subText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subText2ActionPerformed
    
    
    // Getters for subjects
    public String getSubject1() { return subject1; }
    public String getSubject2() { return subject2; }
    public String getSubject3() { return subject3; }
    public boolean isConfirmed() { return confirmed; }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel subLabel1;
    private javax.swing.JLabel subLabel2;
    private javax.swing.JLabel subLabel3;
    private javax.swing.JTextField subText1;
    private javax.swing.JTextField subText2;
    private javax.swing.JTextField subText3;
    // End of variables declaration//GEN-END:variables
}
