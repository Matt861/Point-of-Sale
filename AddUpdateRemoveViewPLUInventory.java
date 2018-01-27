import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AddUpdateRemoveViewPLUInventory extends javax.swing.JFrame {

    public AddUpdateRemoveViewPLUInventory() {
        initComponents();
        initalTable();
    }
    
    private void initalTable() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from PLUINVENTORY");
            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
            while(rs.next()) {       
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearTextFields() {
        pluIDJTF.setText(null);
        itemNameJTF.setText(null);
        pricePerPoundJTF.setText(null);
        quanityJTF.setText(null);   
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pluIDJL = new javax.swing.JLabel();
        pluIDJTF = new javax.swing.JTextField();
        itemNameJL = new javax.swing.JLabel();
        itemNameJTF = new javax.swing.JTextField();
        pricePerPoundJL = new javax.swing.JLabel();
        pricePerPoundJTF = new javax.swing.JTextField();
        quanityJL = new javax.swing.JLabel();
        quanityJTF = new javax.swing.JTextField();
        tableJSP = new javax.swing.JScrollPane();
        tableJT = new javax.swing.JTable();
        errorMsgJL = new javax.swing.JLabel();
        addJB = new javax.swing.JButton();
        updateJB = new javax.swing.JButton();
        removeJB = new javax.swing.JButton();
        bookkeeperScreenJB = new javax.swing.JButton();
        logOffJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add, Update, and Remove PLU Inventory");

        pluIDJL.setText("PLU ID");

        itemNameJL.setText("Item Name");

        pricePerPoundJL.setText("Price Per Pound");

        quanityJL.setText("Quanity");

        tableJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLU ID", "Item Name", "Price Per Pound", "Quanity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        errorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        addJB.setText("Add");
        addJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJBActionPerformed(evt);
            }
        });

        updateJB.setText("Update");
        updateJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJBActionPerformed(evt);
            }
        });

        removeJB.setText("Remove");
        removeJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJBActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(errorMsgJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pluIDJL)
                                .addComponent(itemNameJL)
                                .addComponent(pricePerPoundJL)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(quanityJL)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(quanityJTF)
                                .addComponent(pricePerPoundJTF)
                                .addComponent(itemNameJTF)
                                .addComponent(pluIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeJB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookkeeperScreenJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logOffJB))
                    .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pluIDJL)
                    .addComponent(pluIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNameJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricePerPoundJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricePerPoundJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quanityJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quanityJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJB)
                    .addComponent(updateJB)
                    .addComponent(removeJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookkeeperScreenJB)
                    .addComponent(logOffJB))
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

    private void addJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJBActionPerformed
        
        pluIDString = pluIDJTF.getText();
        itemName = itemNameJTF.getText();
        pricePerPoundString = pricePerPoundJTF.getText();
        quanityString = quanityJTF.getText();
        
        if(pluIDString.isEmpty() || itemName.isEmpty() || pricePerPoundString.isEmpty() || quanityString.isEmpty()) {
            clearTextFields();
            errorMsgJL.setText("Enter all of the text fields");            
        } else {
            try {
                int pluID = Integer.parseInt(pluIDString);
                
                try {
                    double pricePerPound = Double.parseDouble(pricePerPoundString);
                    
                    try {
                        int quanity = Integer.parseInt(quanityString);
                        
                        try {
                            int flag = 0;
                            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                            PreparedStatement st = conn.prepareStatement("insert into PLUINVENTORY(PLUID, ITEMNAME, PRICEPERPOUND, QUANITY, TAXNOTAX)values(?,?,?,?,?)");
                            Statement st2 = conn.createStatement();
                            ResultSet rs = st2.executeQuery("select * from PLUINVENTORY");
                            while(rs.next()) {
                                if(rs.getInt(1) == pluID) {
                                    flag = 1;
                                    break;
                                }
                            }
                            if(flag == 1) {
                                clearTextFields();
                                errorMsgJL.setText("That PLU ID already exists");
                            } else if(pluID < 1000 || pluID >= 10000) {
                                clearTextFields();
                                errorMsgJL.setText("Enter PLU ID number between 1000 and 9999");
                            } else if(pricePerPound < 0) {
                                clearTextFields();
                                errorMsgJL.setText("Enter a price per pound greater than or equal to 0");
                            } else if(quanity < 0) {
                                clearTextFields();
                                errorMsgJL.setText("Enter a quanity greater than or equal to 0");
                            } else {
                                String no = "no";
                                st.setInt(1, pluID);
                                st.setString(2, itemName);
                                st.setDouble(3, pricePerPound);
                                st.setInt(4, quanity);
                                st.setString(5, no);
                                st.executeUpdate();
                                DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                                model.addRow(new Object[]{pluID, itemName, pricePerPound, quanity});
                                clearTextFields();
                                errorMsgJL.setText(null);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (NumberFormatException ex) {
                        clearTextFields();
                        errorMsgJL.setText("Please enter quanity with an integer type");
                    }
                } catch (NumberFormatException ex) {
                    clearTextFields();
                    errorMsgJL.setText("Please enter price per pound with a double type");                    
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter PLU ID with an integer type");                
            }
        }
    }//GEN-LAST:event_addJBActionPerformed

    private void removeJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJBActionPerformed
        
        pluIDString = pluIDJTF.getText();
        
        if(pluIDString.isEmpty()) {
            clearTextFields();
            errorMsgJL.setText("Enter PLU ID to delete");
        } else {
            try {
                int pluID = Integer.parseInt(pluIDString);
                
                try {
                    int flag = 0;
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    PreparedStatement st = conn.prepareStatement("delete from PLUINVENTORY where PLUID = ?");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from PLUINVENTORY");
                    while(rs.next()) {
                        if(rs.getInt(1) == pluID) {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 1) {
                        st.setInt(1, pluID);
                        st.executeUpdate();
                        DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                        int deleteRow = 0;
                        for(int i = 0; i < model.getRowCount(); i++) {
                            int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                            if(getRowIDValue == pluID) {
                                deleteRow = i;
                                break;
                            }
                        }
                        model.removeRow(deleteRow);
                        clearTextFields();
                        errorMsgJL.setText(null);
                    } else {
                        clearTextFields();
                        errorMsgJL.setText("That PLU ID number is not located in the database");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter PLU ID with an integer type");
            }
        }
    }//GEN-LAST:event_removeJBActionPerformed

    private void updateJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJBActionPerformed
        
        pluIDString = pluIDJTF.getText();
        itemName = itemNameJTF.getText();
        pricePerPoundString = pricePerPoundJTF.getText();
        quanityString = quanityJTF.getText();
        
        int flagger = 0;
        
        if(pluIDString.isEmpty()) {
            clearTextFields();
            errorMsgJL.setText("Enter PLU ID to update");
        } else {
            try {
                int pluID = Integer.parseInt(pluIDString);
                
                double pricePerPound = 0.0;
                int quanity = 0;
                try {
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    PreparedStatement stItemName = conn.prepareStatement("update PLUINVENTORY set ITEMNAME = ? where PLUID = ?");
                    PreparedStatement stPricePerPound = conn.prepareStatement("update PLUINVENTORY set PRICEPERPOUND = ? where PLUID = ?");
                    PreparedStatement stQuanity = conn.prepareStatement("update PLUINVENTORY set QUANITY = ? where PLUID = ?");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from PLUINVENTORY");
                    while(rs.next()) {
                        if(rs.getInt(1) == pluID) {
                            flagger = 1;
                            break;
                        }
                    }
                    if(!pluIDString.isEmpty() && flagger == 1 && (itemName.isEmpty() && pricePerPoundString.isEmpty() && quanityString.isEmpty())) {
                        clearTextFields();
                        errorMsgJL.setText("Nothing was entered to be updated");
                        flagger = -1;
                    }
                    if(flagger == 1 && !pricePerPoundString.isEmpty()) {
                        try {
                            pricePerPound = Double.parseDouble(pricePerPoundString); 
                        } catch (NumberFormatException ex) {
                            clearTextFields();
                            errorMsgJL.setText("Please enter price per pound with a double type");
                            flagger = -1;
                        }
                        
                        if(flagger == 1 && pricePerPound < 0) {
                            clearTextFields();
                            errorMsgJL.setText("Enter a price per pound greater than or equal to 0");
                            flagger = -1;
                        }
                    }
                    if(flagger == 1 && !quanityString.isEmpty()) {
                        try {
                            quanity = Integer.parseInt(quanityString);
                            
                        } catch (NumberFormatException ex) {
                            clearTextFields();
                            errorMsgJL.setText("Please enter quanity with an integer type");
                            flagger = -1;
                        }
                        
                        if(flagger == 1 && quanity < 0) {
                            clearTextFields();
                            errorMsgJL.setText("Enter a quanity greater than or equal to 0");
                            flagger = -1;
                        }
                    }
                    if(flagger == 1) {
                        
                        DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                        
                        if(!itemName.isEmpty()) {
                            stItemName.setString(1, itemName);
                            stItemName.setInt(2, pluID);
                            stItemName.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == pluID) {
                                    model.setValueAt(itemName, i, 1);
                                    break;
                                }
                            }
                        }
                        if(!pricePerPoundString.isEmpty()) {
                            stPricePerPound.setDouble(1, pricePerPound);
                            stPricePerPound.setInt(2, pluID);
                            stPricePerPound.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == pluID) {
                                    model.setValueAt(pricePerPound, i, 2);
                                    break;
                                }
                            }
                        }
                        if(!quanityString.isEmpty()) {
                            stQuanity.setInt(1, quanity);
                            stQuanity.setInt(2, pluID);
                            stQuanity.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == pluID) {
                                    model.setValueAt(quanity, i, 3);
                                    break;
                                }
                            }
                        }
                        clearTextFields();
                        errorMsgJL.setText(null);  
                    }
                    if(flagger == 0) {
                        clearTextFields();
                        errorMsgJL.setText("That PLU ID number is not located in the database");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);  
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter PLU ID with an integer type");
            }
        }
    }//GEN-LAST:event_updateJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJB;
    private javax.swing.JButton bookkeeperScreenJB;
    private javax.swing.JLabel errorMsgJL;
    private javax.swing.JLabel itemNameJL;
    private javax.swing.JTextField itemNameJTF;
    private javax.swing.JButton logOffJB;
    private javax.swing.JLabel pluIDJL;
    private javax.swing.JTextField pluIDJTF;
    private javax.swing.JLabel pricePerPoundJL;
    private javax.swing.JTextField pricePerPoundJTF;
    private javax.swing.JLabel quanityJL;
    private javax.swing.JTextField quanityJTF;
    private javax.swing.JButton removeJB;
    private javax.swing.JScrollPane tableJSP;
    private javax.swing.JTable tableJT;
    private javax.swing.JButton updateJB;
    // End of variables declaration//GEN-END:variables

    private String pluIDString;
    private String itemName;
    private String pricePerPoundString;
    private String quanityString;
}
