package com.mycompany.subjectprogram;

import javax.swing.JOptionPane;

public class ProgramPopup extends javax.swing.JDialog {
    
    private String program1;
    private String program2;
    private boolean confirmed = false; // To track if the user clicked "OK"
    
    public ProgramPopup(java.awt.Frame parent, boolean modal, String program1, String program2) {
        super(parent, modal);
        initComponents();
        
        this.program1 = program1;
        this.program2 = program2;
        // Initialize text fields with passed values
        progText1.setText(program1);
        progText2.setText(program2);
        
        
        toggleVisibility();
    }
    
    // Toggle visibility based on the subject data
    private void toggleVisibility() {
        progText1.setVisible(program1 == null || program1.isEmpty());
        progLabel1.setVisible(program1 == null || program1.isEmpty());
        
        progText2.setVisible(program1 != null && !program1.isEmpty() && (program2 == null || program2.isEmpty()));
        progLabel2.setVisible(program1 != null && !program1.isEmpty() && (program2 == null || program2.isEmpty()));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progLabel1 = new javax.swing.JLabel();
        progLabel2 = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        progText1 = new javax.swing.JTextField();
        progText2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        progLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        progLabel1.setText("Program 1:");

        progLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        progLabel2.setText("Program 2:");

        okBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        progText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progText1ActionPerformed(evt);
            }
        });

        progText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progText2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(okBtn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progText1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progText2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addComponent(okBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:

        // Handle subject entry step by step
        if (program1 == null || program1.isEmpty()) {
            program1 = progText1.getText().trim();
            if (program1.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Subject 1 cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } else if (program2 == null || program2.isEmpty()) {
            program2 = progText2.getText().trim();
            if (program2.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Subject 2 cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "All subjects have been entered.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

        confirmed = true; // Mark as confirmed
        toggleVisibility(); // Update visibility for the next fields
        dispose();

    }//GEN-LAST:event_okBtnActionPerformed

    private void progText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_progText1ActionPerformed

    private void progText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_progText2ActionPerformed

    // Getters for programs
    public String getProgram1() { return program1; }
    public String getProgram2() { return program2; }
    public boolean isConfirmed() { return confirmed; }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel progLabel1;
    private javax.swing.JLabel progLabel2;
    private javax.swing.JTextField progText1;
    private javax.swing.JTextField progText2;
    // End of variables declaration//GEN-END:variables
}
