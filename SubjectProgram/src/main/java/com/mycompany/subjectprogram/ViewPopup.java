package com.mycompany.subjectprogram;

import javax.swing.DefaultComboBoxModel;

public class ViewPopup extends javax.swing.JDialog {
    
    // New fields to store subjects and programs
    private String subject1;
    private String subject2;
    private String subject3;
    private String program1;
    private String program2;
    
    // Modified constructor to accept data
    public ViewPopup(javax.swing.JDialog parent, boolean modal, String subject1, String subject2, String subject3, String program1, String program2) {
        super(parent, modal);
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.program1 = program1;
        this.program2 = program2;
        initComponents();
        populateComboBox();
        populateProgramButtons();
    }
    
    // Populate the combo box with subjects
        private void populateComboBox() {
        // Clear any existing items first
        viewCombo.removeAllItems();

        // Add individual items to the combo box
        if (subject1 != null) {
            viewCombo.addItem(subject1);
        }
        if (subject2 != null) {
            viewCombo.addItem(subject2);
        }
        if (subject3 != null) {
            viewCombo.addItem(subject3);
        }
    }



    // Set program button text
    private void populateProgramButtons() {
        progBtn1.setText(program1);
        progBtn2.setText(program2);
    }
    
    private String getRandomDescription(String subject, String program) {
        // Define the 6 predefined descriptions based on subject and program
        String[][] descriptions = {
            {
                "Learn the fundamentals of programming, focusing on object-oriented concepts and their applications in software development.",
                "Dive into data organization techniques, focusing on algorithms and data structures used in efficient system development.",
                "Understand the mathematical foundations of artificial intelligence, including linear algebra, calculus, and probability theory for machine learning."
            },
            {
                "Gain a solid foundation in software development methodologies, focusing on the design, development, and maintenance of software systems.",
                "Explore the concepts and techniques used in database management, including relational models and SQL for effective data storage and retrieval.",
                "Learn about network architectures, protocols, and communication techniques to enable efficient data transfer and secure connectivity."
            }
        };


        int subjectIndex = -1;
        int programIndex = -1;

        // Determine the indices for the subject and program
        if (subject.equals(subject1)) subjectIndex = 0;
        else if (subject.equals(subject2)) subjectIndex = 1;
        else if (subject.equals(subject3)) subjectIndex = 2;

        if (program.equals(program1)) programIndex = 0;
        else if (program.equals(program2)) programIndex = 1;

        // Randomly select a description from the 3 available for the selected program
        if (subjectIndex >= 0 && programIndex >= 0) {
            return descriptions[programIndex][subjectIndex];
        } else {
            return "No description available.";
        }
    }
    
    
    
    
    // GENERATED CODE
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewCombo = new javax.swing.JComboBox<>();
        progBtn1 = new javax.swing.JButton();
        progBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        viewCombo.setEditable(true);
        viewCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viewCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewComboActionPerformed(evt);
            }
        });

        progBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        progBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progBtn1ActionPerformed(evt);
            }
        });

        progBtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        progBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(viewCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(progBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progBtn2)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(viewCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progBtn1)
                    .addComponent(progBtn2))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // GENERATED CODE
    
    
    
    private void viewComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewComboActionPerformed
        // TODO add your handling code here:
       
    
    }//GEN-LAST:event_viewComboActionPerformed

    private void progBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progBtn1ActionPerformed
        // TODO add your handling code here:

        // Get the selected subject from the combo box
        String selectedSubject = (String) viewCombo.getSelectedItem();

        // Get the random description based on the selected subject and program
        String description = getRandomDescription(selectedSubject, program1);

        // Open the ViewSubjectProgramPopup with the selected details
        ViewSubjectProgramPopup popup = new ViewSubjectProgramPopup(new javax.swing.JFrame(), true, selectedSubject, program1, description);
        popup.setVisible(true);

        // Dispose of ViewPopup after opening the popup
        this.dispose();
        
    }//GEN-LAST:event_progBtn1ActionPerformed

    private void progBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progBtn2ActionPerformed
        // TODO add your handling code here:
        
        // Get the selected subject from the combo box
        String selectedSubject = (String) viewCombo.getSelectedItem();

        // Get the random description based on the selected subject and program
        String description = getRandomDescription(selectedSubject, program2);

        // Open the ViewSubjectProgramPopup with the selected details
        ViewSubjectProgramPopup popup = new ViewSubjectProgramPopup(new javax.swing.JFrame(), true, selectedSubject, program2, description);
        popup.setVisible(true);

        // Dispose of ViewPopup after opening the popup
        this.dispose();
    
    }//GEN-LAST:event_progBtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton progBtn1;
    private javax.swing.JButton progBtn2;
    private javax.swing.JComboBox<String> viewCombo;
    // End of variables declaration//GEN-END:variables
}
