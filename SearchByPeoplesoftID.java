import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class SearchByPeoplesoftID extends javax.swing.JFrame {

    public SearchByPeoplesoftID() {
        initComponents();
    }
    
    public SearchByPeoplesoftID(int userSubmitPeoplesoftID) {
        initComponents();
        peoplesoftID = userSubmitPeoplesoftID;
        peoplesoftIDJL.setText("Peoplesoft ID: " + peoplesoftID);
        initalTable();
    }
    
    private void initalTable() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from TRANSACTIONLOG");
            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
            while(rs.next()) {
                if(rs.getInt(3) == peoplesoftID) {
                    model.addRow(new Object[]{rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getDouble(6), rs.getString(7)});
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        peoplesoftIDJL = new javax.swing.JLabel();
        tableJSP = new javax.swing.JScrollPane();
        tableJT = new javax.swing.JTable();
        transactionLogsJB = new javax.swing.JButton();
        bookkeeperScreenJB = new javax.swing.JButton();
        logOffJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search By Peoplesoft ID");

        peoplesoftIDJL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        }

        transactionLogsJB.setText("Transactions Logs");
        transactionLogsJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionLogsJBActionPerformed(evt);
            }
        });

        bookkeeperScreenJB.setText("Bookkeeper Screen");
        bookkeeperScreenJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookkeeperScreenJBActionPerformed(evt);
            }
        });

        logOffJB.setText("Log Off");
        logOffJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peoplesoftIDJL, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transactionLogsJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookkeeperScreenJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logOffJB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peoplesoftIDJL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionLogsJB)
                    .addComponent(bookkeeperScreenJB)
                    .addComponent(logOffJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transactionLogsJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionLogsJBActionPerformed
        
        new TransactionLogs().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_transactionLogsJBActionPerformed

    private void bookkeeperScreenJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookkeeperScreenJBActionPerformed
        
        new Bookkeeper().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_bookkeeperScreenJBActionPerformed

    private void logOffJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffJBActionPerformed
        
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOffJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookkeeperScreenJB;
    private javax.swing.JButton logOffJB;
    private javax.swing.JLabel peoplesoftIDJL;
    private javax.swing.JScrollPane tableJSP;
    private javax.swing.JTable tableJT;
    private javax.swing.JButton transactionLogsJB;
    // End of variables declaration//GEN-END:variables

    private int peoplesoftID;
}
