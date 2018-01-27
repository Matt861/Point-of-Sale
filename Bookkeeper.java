public class Bookkeeper extends javax.swing.JFrame {

    public Bookkeeper() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myGroup = new javax.swing.ButtonGroup();
        optionChoiceJL = new javax.swing.JLabel();
        logOffJB = new javax.swing.JButton();
        addUpdateRemoveViewUPCInventoryJRB = new javax.swing.JRadioButton();
        addUpdateRemoveViewEmployeesJRB = new javax.swing.JRadioButton();
        submitJB = new javax.swing.JButton();
        errorMsgJL = new javax.swing.JLabel();
        addUpdateRemoveViewPLUInventoryJRB = new javax.swing.JRadioButton();
        transactionLogJRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bookkeeper");

        optionChoiceJL.setText("Select one of the following options:");

        logOffJB.setText("LogOff");
        logOffJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffJBActionPerformed(evt);
            }
        });

        myGroup.add(addUpdateRemoveViewUPCInventoryJRB);
        addUpdateRemoveViewUPCInventoryJRB.setText("Inventory Database (UPC)");

        myGroup.add(addUpdateRemoveViewEmployeesJRB);
        addUpdateRemoveViewEmployeesJRB.setText("Employee Database");
        addUpdateRemoveViewEmployeesJRB.setToolTipText("");

        submitJB.setText("Submit");
        submitJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJBActionPerformed(evt);
            }
        });

        errorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        myGroup.add(addUpdateRemoveViewPLUInventoryJRB);
        addUpdateRemoveViewPLUInventoryJRB.setText("Inventory Database (PLU)");

        myGroup.add(transactionLogJRB);
        transactionLogJRB.setText("Transaction Log");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionChoiceJL)
                    .addComponent(addUpdateRemoveViewUPCInventoryJRB)
                    .addComponent(addUpdateRemoveViewEmployeesJRB)
                    .addComponent(addUpdateRemoveViewPLUInventoryJRB)
                    .addComponent(transactionLogJRB)
                    .addComponent(errorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOffJB)
                    .addComponent(submitJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionChoiceJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addUpdateRemoveViewEmployeesJRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addUpdateRemoveViewUPCInventoryJRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addUpdateRemoveViewPLUInventoryJRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transactionLogJRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitJB)
                .addGap(18, 18, 18)
                .addComponent(logOffJB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOffJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffJBActionPerformed
        
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOffJBActionPerformed

    private void submitJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJBActionPerformed
        
        
        if(addUpdateRemoveViewEmployeesJRB.isSelected()) {
            new AddUpdateRemoveViewEmployee().setVisible(true);
            this.setVisible(false);
        } else if(addUpdateRemoveViewUPCInventoryJRB.isSelected()) {
            new AddUpdateRemoveViewUPCInventory().setVisible(true);
            this.setVisible(false);
        } else if(addUpdateRemoveViewPLUInventoryJRB.isSelected()) {
            new AddUpdateRemoveViewPLUInventory().setVisible(true);
            this.setVisible(false);
        } else if(transactionLogJRB.isSelected()) {
            new TransactionLogs().setVisible(true);
            this.setVisible(false);
        } else {
            errorMsgJL.setText("Nothing was selected");
        }
    }//GEN-LAST:event_submitJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton addUpdateRemoveViewEmployeesJRB;
    private javax.swing.JRadioButton addUpdateRemoveViewPLUInventoryJRB;
    private javax.swing.JRadioButton addUpdateRemoveViewUPCInventoryJRB;
    private javax.swing.JLabel errorMsgJL;
    private javax.swing.JButton logOffJB;
    private javax.swing.ButtonGroup myGroup;
    private javax.swing.JLabel optionChoiceJL;
    private javax.swing.JButton submitJB;
    private javax.swing.JRadioButton transactionLogJRB;
    // End of variables declaration//GEN-END:variables
}
