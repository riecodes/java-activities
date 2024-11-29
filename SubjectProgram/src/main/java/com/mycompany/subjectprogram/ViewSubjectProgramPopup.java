package com.mycompany.subjectprogram;


public class ViewSubjectProgramPopup extends javax.swing.JDialog {
    
    private SubjectProgram subjectProgram; // Reference to SubjectProgram
    private ViewPopup viewPopup; // Reference to ViewPopup

    private String subject;
    private String program;
    private String description;
    
    public ViewSubjectProgramPopup(java.awt.Frame parent, boolean modal, String subject, String program, String description) {
        super(parent, modal);
        initComponents();
        this.subject = subject;
        this.program = program;
        this.description = description;
        
        this.subjectProgram = subjectProgram;
        this.viewPopup = viewPopup;
        
        // Set the labels with the passed data
        subLabel1.setText("Subject: " + subject);
        progLabel1.setText("Program: " + program);
        descText1.setText("Description: " + description);
    }
    
    
    
    // GENERATED CODE
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okBtn = new javax.swing.JButton();
        subLabel1 = new javax.swing.JLabel();
        progLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descText1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        okBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        subLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        progLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        descText1.setColumns(20);
        descText1.setLineWrap(true);
        descText1.setRows(5);
        descText1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descText1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(progLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(subLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(604, Short.MAX_VALUE)
                        .addComponent(okBtn)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(subLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(okBtn)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // GENERATED CODE
    
    
    
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
        
        // Dispose the current dialog
        this.dispose();

        // Dispose of ViewPopup if it's still open
        if (viewPopup != null) {
            viewPopup.dispose();
        }
        
        // Bring SubjectProgram to focus
        if (subjectProgram != null) {
            subjectProgram.setVisible(true); // Ensure SubjectProgram is visible
            subjectProgram.toFront(); // Bring SubjectProgram to the front
        }

    }//GEN-LAST:event_okBtnActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descText1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel progLabel1;
    private javax.swing.JLabel subLabel1;
    // End of variables declaration//GEN-END:variables
}
