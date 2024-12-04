package com.mycompany.laundryexpress;

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
        detergentComboBox1 = new javax.swing.JComboBox<>();

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
        detergentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ariel", "Pride" }));
        detergentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detergentComboBoxActionPerformed(evt);
            }
        });

        fabricComboBox.setBackground(new java.awt.Color(255, 255, 255));
        fabricComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fabricComboBox.setForeground(new java.awt.Color(0, 0, 0));
        fabricComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Downy", "Surf" }));
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

        detergentComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        detergentComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        detergentComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        detergentComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 kg  ", "2 kg  ", "3 kg  ", "4 kg  ", "5 kg  ", "6 kg  ", "7 kg  ", "8 kg" }));
        detergentComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detergentComboBox1ActionPerformed(evt);
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
                    .addComponent(detergentComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberLabel)
                    .addComponent(numberTextField))
                .addGap(18, 18, 18)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addComponent(detergentComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(weightLabel))
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
        // TODO add your handling code here:
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

    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Wash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Wash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Wash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Wash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Wash dialog = new Wash(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backWashBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPanel contentPanel2;
    private javax.swing.JComboBox<String> detergentComboBox;
    private javax.swing.JComboBox<String> detergentComboBox1;
    private javax.swing.JLabel detergentLabel;
    private javax.swing.JComboBox<String> fabricComboBox;
    private javax.swing.JLabel fabricLabel;
    private javax.swing.JLabel formLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JLabel washLabel;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
