package com.mycompany.subjectprogram;

import com.mycompany.subjectprogram.SubjectPopup;

public class SubjectProgram extends javax.swing.JDialog {
    
    private String subject1 = ""; // Store subjects
    private String subject2 = "";
    private String subject3 = "";
    
    private String program1 = "";
    private String program2 = "";
    
    private boolean confirmed = false;
    
    public SubjectProgram(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
    }

    
    
    // GENERATED CODE
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        subject = new javax.swing.JLabel();
        program = new javax.swing.JLabel();
        subjectBtn = new javax.swing.JButton();
        programBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        setIconImage(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        subject.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        subject.setForeground(new java.awt.Color(255, 255, 255));
        subject.setText("Subject:");

        program.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        program.setForeground(new java.awt.Color(255, 255, 255));
        program.setText("Program:");

        subjectBtn.setText("+");
        subjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBtnActionPerformed(evt);
            }
        });

        programBtn.setText("+");
        programBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programBtnActionPerformed(evt);
            }
        });

        viewBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(0, 0, 0));
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(viewBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(program, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(programBtn)
                            .addComponent(subjectBtn))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subject)
                    .addComponent(subjectBtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(program))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(programBtn)))
                .addGap(75, 75, 75)
                .addComponent(viewBtn)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // GENERATED CODE
    
    
    
    private void programBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programBtnActionPerformed
        // TODO add your handling code here:
       
        // Open the ProgramPopup dialog
        ProgramPopup popup = new ProgramPopup(new javax.swing.JFrame(), true, program1, program2);
        popup.setVisible(true); // Show the popup

        // Check if the user clicked "OK" (popup is confirmed)
        if (popup.isConfirmed()) {
            program1 = popup.getProgram1();
            program2 = popup.getProgram2();

            // Display programs or process them as needed
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Programs Entered:\n1. " + (program1.isEmpty() ? "N/A" : program1) + 
                "\n2. " + (program2.isEmpty() ? "N/A" : program2));
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No programs were entered.");
        }
    }//GEN-LAST:event_programBtnActionPerformed

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBtnActionPerformed
        // TODO add your handling code here:
        
        // Open the SubjectPopup dialog
        SubjectPopup popup = new SubjectPopup(new javax.swing.JFrame(), true, subject1, subject2, subject3);
        popup.setVisible(true); // Show the popup

        // Check if the user clicked "OK" (popup is confirmed)
        if (popup.isConfirmed()) {
            subject1 = popup.getSubject1();
            subject2 = popup.getSubject2();
            subject3 = popup.getSubject3();

            // Display subjects or process them as needed
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Subjects Entered:\n1. " + (subject1.isEmpty() ? "N/A" : subject1) +
                "\n2. " + (subject2.isEmpty() ? "N/A" : subject2) +
                "\n3. " + (subject3.isEmpty() ? "N/A" : subject3));
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No subjects were entered.");
        }
    
    }//GEN-LAST:event_subjectBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        
        // Create and show the ViewPopup dialog
        ViewPopup popup = new ViewPopup(this, true, subject1, subject2, subject3, program1, program2);
        popup.setVisible(true);
        
        
    }//GEN-LAST:event_viewBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            
            // Set the FlatLaf look and feel
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SubjectProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SubjectProgram dialog = new SubjectProgram(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel program;
    private javax.swing.JButton programBtn;
    private javax.swing.JLabel subject;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
