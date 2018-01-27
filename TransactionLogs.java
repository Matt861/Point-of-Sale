import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TransactionLogs extends javax.swing.JFrame {

    public TransactionLogs() {
        initComponents();
        initalTable();
    }

    private void initalTable() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from TRANSACTIONLOG");
            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
            while(rs.next()) {       
                model.addRow(new Object[]{rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getDouble(6), rs.getString(7)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearTextFields() {
        searchByOrderNumberJTF.setText(null);
        searchByPeoplesoftIDJTF.setText(null);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableJSP = new javax.swing.JScrollPane();
        tableJT = new javax.swing.JTable();
        searchByOrderNumberJL = new javax.swing.JLabel();
        searchByOrderNumberJTF = new javax.swing.JTextField();
        searchByPeoplesoftIDJL = new javax.swing.JLabel();
        searchByPeoplesoftIDJTF = new javax.swing.JTextField();
        orderNumberErrorMsgJL = new javax.swing.JLabel();
        peoplesoftIDErrorMsgJL = new javax.swing.JLabel();
        logOffJB = new javax.swing.JButton();
        bookkeeperScreenJB = new javax.swing.JButton();
        clearAllTransactionsJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transaction Log");

        tableJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Peoplesoft ID", "UPC/PLU ID", "Item Name", "Item Price", "Taxable Item"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableJT.getTableHeader().setReorderingAllowed(false);
        tableJSP.setViewportView(tableJT);
        if (tableJT.getColumnModel().getColumnCount() > 0) {
            tableJT.getColumnModel().getColumn(0).setResizable(false);
            tableJT.getColumnModel().getColumn(1).setResizable(false);
            tableJT.getColumnModel().getColumn(2).setResizable(false);
            tableJT.getColumnModel().getColumn(3).setResizable(false);
            tableJT.getColumnModel().getColumn(4).setResizable(false);
            tableJT.getColumnModel().getColumn(5).setResizable(false);
        }

        searchByOrderNumberJL.setText("Search by Order Number:");

        searchByOrderNumberJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByOrderNumberJTFActionPerformed(evt);
            }
        });

        searchByPeoplesoftIDJL.setText("Search by Peoplesoft ID:");

        searchByPeoplesoftIDJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByPeoplesoftIDJTFActionPerformed(evt);
            }
        });

        orderNumberErrorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        peoplesoftIDErrorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        logOffJB.setText("Log Off");
        logOffJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffJBActionPerformed(evt);
            }
        });

        bookkeeperScreenJB.setText("Bookkeeper Screen");
        bookkeeperScreenJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookkeeperScreenJBActionPerformed(evt);
            }
        });

        clearAllTransactionsJB.setText("Clear All Transactions");
        clearAllTransactionsJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllTransactionsJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bookkeeperScreenJB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logOffJB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearAllTransactionsJB))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchByPeoplesoftIDJL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchByOrderNumberJL, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchByOrderNumberJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(orderNumberErrorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchByPeoplesoftIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(peoplesoftIDErrorMsgJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchByOrderNumberJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchByOrderNumberJL))
                    .addComponent(orderNumberErrorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchByPeoplesoftIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchByPeoplesoftIDJL))
                    .addComponent(peoplesoftIDErrorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookkeeperScreenJB)
                    .addComponent(logOffJB)
                    .addComponent(clearAllTransactionsJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookkeeperScreenJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookkeeperScreenJBActionPerformed
        
        new Bookkeeper().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_bookkeeperScreenJBActionPerformed

    private void logOffJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffJBActionPerformed
        
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOffJBActionPerformed

    private void searchByOrderNumberJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByOrderNumberJTFActionPerformed
        
        orderNumberString = searchByOrderNumberJTF.getText();
        
        if(orderNumberString.isEmpty()) {
            clearTextFields();
            peoplesoftIDErrorMsgJL.setText(null);
            orderNumberErrorMsgJL.setText("Nothing was entered");   
        } else {
            try {
                int orderNumber = Integer.parseInt(orderNumberString);
                
                try {
                    int flag = 0;
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from TRANSACTIONLOG");
                    while(rs.next()) {
                        if(rs.getInt(2) == orderNumber) {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 1) {
                        new SearchByOrderNumber(orderNumber).setVisible(true);
                        this.setVisible(false);
                    } else {
                        clearTextFields();
                        peoplesoftIDErrorMsgJL.setText(null);
                        orderNumberErrorMsgJL.setText("That order number is not located in the transaction log");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                peoplesoftIDErrorMsgJL.setText(null);
                orderNumberErrorMsgJL.setText("Please enter order number with an integer type");  
            }
        }
    }//GEN-LAST:event_searchByOrderNumberJTFActionPerformed

    private void searchByPeoplesoftIDJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByPeoplesoftIDJTFActionPerformed

        peoplesoftIDString = searchByPeoplesoftIDJTF.getText();
        
        if(peoplesoftIDString.isEmpty()) {
            clearTextFields();
            orderNumberErrorMsgJL.setText(null);
            peoplesoftIDErrorMsgJL.setText("Nothing was entered");   
        } else {
            try {
                int peoplesoftID = Integer.parseInt(peoplesoftIDString);
                
                try {
                    int flag = 0;
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from TRANSACTIONLOG");
                    while(rs.next()) {
                        if(rs.getInt(3) == peoplesoftID) {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 1) {
                        new SearchByPeoplesoftID(peoplesoftID).setVisible(true);
                        this.setVisible(false);
                    } else {
                        clearTextFields();
                        orderNumberErrorMsgJL.setText(null);
                        peoplesoftIDErrorMsgJL.setText("That Peoplesoft ID number is not located in the transaction log");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                orderNumberErrorMsgJL.setText(null);
                peoplesoftIDErrorMsgJL.setText("Please enter Peoplesoft ID with an integer type");  
            }
        }
    }//GEN-LAST:event_searchByPeoplesoftIDJTFActionPerformed

    private void clearAllTransactionsJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllTransactionsJBActionPerformed
        
        int flag = JOptionPane.showConfirmDialog(null, "Clear all transaction logs?", "Clear Transaction Logs", JOptionPane.YES_NO_OPTION);
        
        if(flag == 0) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                PreparedStatement st = conn.prepareStatement("delete from TRANSACTIONLOG");
                st.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                model.setRowCount(0);
            } catch (SQLException ex) {
                Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        clearTextFields();
        orderNumberErrorMsgJL.setText(null);
        peoplesoftIDErrorMsgJL.setText(null);        
    }//GEN-LAST:event_clearAllTransactionsJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookkeeperScreenJB;
    private javax.swing.JButton clearAllTransactionsJB;
    private javax.swing.JButton logOffJB;
    private javax.swing.JLabel orderNumberErrorMsgJL;
    private javax.swing.JLabel peoplesoftIDErrorMsgJL;
    private javax.swing.JLabel searchByOrderNumberJL;
    private javax.swing.JTextField searchByOrderNumberJTF;
    private javax.swing.JLabel searchByPeoplesoftIDJL;
    private javax.swing.JTextField searchByPeoplesoftIDJTF;
    private javax.swing.JScrollPane tableJSP;
    private javax.swing.JTable tableJT;
    // End of variables declaration//GEN-END:variables

    private String orderNumberString;
    private String peoplesoftIDString;
}
