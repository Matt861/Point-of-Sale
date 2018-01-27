import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AddUpdateRemoveViewUPCInventory extends javax.swing.JFrame {

    public AddUpdateRemoveViewUPCInventory() {
        initComponents();
        initalTable();
    }
    
    private void initalTable() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from UPCINVENTORY");
            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
            while(rs.next()) {       
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDouble(8)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearTextFields() {
        upcIDJTF.setText(null);
        itemNameJTF.setText(null);
        itemPriceJTF.setText(null);
        quanityJTF.setText(null);
        taxableItemJTF.setText(null);
        ageVerificationJTF.setText(null);
        couponIDJTF.setText(null);
        couponDiscountJTF.setText(null);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upcIDJL = new javax.swing.JLabel();
        upcIDJTF = new javax.swing.JTextField();
        itemNameJL = new javax.swing.JLabel();
        itemNameJTF = new javax.swing.JTextField();
        itemPriceJL = new javax.swing.JLabel();
        itemPriceJTF = new javax.swing.JTextField();
        quanityJL = new javax.swing.JLabel();
        quanityJTF = new javax.swing.JTextField();
        taxableItemJL = new javax.swing.JLabel();
        taxableItemJTF = new javax.swing.JTextField();
        ageVerificationJL = new javax.swing.JLabel();
        ageVerificationJTF = new javax.swing.JTextField();
        couponIDJL = new javax.swing.JLabel();
        couponIDJTF = new javax.swing.JTextField();
        couponDiscountJL = new javax.swing.JLabel();
        couponDiscountJTF = new javax.swing.JTextField();
        addJB = new javax.swing.JButton();
        updateJB = new javax.swing.JButton();
        removeJB = new javax.swing.JButton();
        errorMsgJL = new javax.swing.JLabel();
        tableJSP = new javax.swing.JScrollPane();
        tableJT = new javax.swing.JTable();
        logOffJB = new javax.swing.JButton();
        bookkeeperJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add, Update, and Remove UPC Inventory");

        upcIDJL.setText("UPC ID");

        itemNameJL.setText("Item Name");

        itemPriceJL.setText("Item Price");

        quanityJL.setText("Quanity");

        taxableItemJL.setText("Taxable Item");

        ageVerificationJL.setText("Age Verification");

        couponIDJL.setText("Coupon ID");

        couponDiscountJL.setText("Coupon Discount");

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

        errorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        tableJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UPC ID", "Item Name", "Item Price", "Quanity", "Taxable Item", "Age Verification", "Coupon ID", "Coupon Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            tableJT.getColumnModel().getColumn(6).setResizable(false);
            tableJT.getColumnModel().getColumn(7).setResizable(false);
        }

        logOffJB.setText("Log Off");
        logOffJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffJBActionPerformed(evt);
            }
        });

        bookkeeperJB.setText("Bookkeeper Screen");
        bookkeeperJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookkeeperJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookkeeperJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logOffJB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(errorMsgJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(upcIDJL)
                                        .addComponent(itemNameJL)
                                        .addComponent(itemPriceJL)
                                        .addComponent(quanityJL)
                                        .addComponent(taxableItemJL)
                                        .addComponent(ageVerificationJL)
                                        .addComponent(couponIDJL)
                                        .addComponent(couponDiscountJL))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(couponDiscountJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(couponIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageVerificationJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(taxableItemJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quanityJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(upcIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(itemNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(itemPriceJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addJB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateJB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeJB))
                            .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upcIDJL)
                    .addComponent(upcIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNameJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemPriceJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemPriceJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quanityJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quanityJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxableItemJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxableItemJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageVerificationJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageVerificationJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couponIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couponIDJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couponDiscountJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couponDiscountJL))
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
                    .addComponent(bookkeeperJB)
                    .addComponent(logOffJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookkeeperJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookkeeperJBActionPerformed
        
        new Bookkeeper().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_bookkeeperJBActionPerformed

    private void logOffJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffJBActionPerformed
        
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOffJBActionPerformed

    private void addJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJBActionPerformed
        
        upcIDString = upcIDJTF.getText();
        itemName = itemNameJTF.getText();
        itemPriceString = itemPriceJTF.getText();
        quanityString = quanityJTF.getText();
        taxableItem = taxableItemJTF.getText();
        ageVerification = ageVerificationJTF.getText();
        couponIDString = couponIDJTF.getText();
        couponDiscountString = couponDiscountJTF.getText();
        
        if(upcIDString.isEmpty() || itemName.isEmpty() || itemPriceString.isEmpty() || quanityString.isEmpty() || taxableItem.isEmpty() || ageVerification.isEmpty() || couponIDString.isEmpty() || couponDiscountString.isEmpty()) {
            clearTextFields();
            errorMsgJL.setText("Enter all of the text fields");
        } else {
            try {
                int upcID = Integer.parseInt(upcIDString);
                
                try {
                    double itemPrice = Double.parseDouble(itemPriceString);
                    
                    try {
                        int quanity = Integer.parseInt(quanityString);
                        
                        try {
                            int couponID = Integer.parseInt(couponIDString);
                            
                            try {
                                double couponDiscount = Double.parseDouble(couponDiscountString);
                                
                                try {
                                    int flag = 0;
                                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                                    PreparedStatement st = conn.prepareStatement("insert into UPCINVENTORY(UPCID, ITEMNAME, ITEMPRICE, QUANITY, TAXNOTAX, AGEVERIFICATION, COUPONID, COUPONDISCOUNT)values(?,?,?,?,?,?,?,?)");
                                    Statement st2 = conn.createStatement();
                                    ResultSet rs = st2.executeQuery("select * from UPCINVENTORY");
                                    while(rs.next()) {
                                        if(rs.getInt(1) == upcID) {
                                            flag = 1;
                                            break;
                                        } else if(rs.getInt(7) == couponID) {
                                            flag = 2;
                                            break;
                                        }
                                    }
                                    if(flag == 1) {
                                        clearTextFields();
                                        errorMsgJL.setText("That UPC ID already exists");
                                    } else if(upcID < 10000000 || upcID >= 100000000) {
                                        clearTextFields();
                                        errorMsgJL.setText("Enter UPC ID number between 10000000 and 99999999");
                                    } else if(itemPrice < 0) {
                                        clearTextFields();
                                        errorMsgJL.setText("Enter an item price greater than or equal to 0");
                                    } else if(quanity < 0) {
                                        clearTextFields();
                                        errorMsgJL.setText("Enter a quanity greater than or equal to 0");
                                    } else if(!taxableItem.equals("yes") && !taxableItem.equals("no")) {
                                        clearTextFields();
                                        errorMsgJL.setText("Enter taxable item field with a yes or no");
                                    } else if(!ageVerification.equals("yes21") && !ageVerification.equals("yes18") && !ageVerification.equals("no")) {
                                        clearTextFields();
                                        errorMsgJL.setText("Enter age verification field with a yes21, yes18, or no");
                                    } else if(couponID < 1000 || couponID >= 10000) {
                                        clearTextFields();
                                        errorMsgJL.setText("Enter coupon ID number between 1000 and 9999");
                                    } else if(flag == 2) {
                                        clearTextFields();
                                        errorMsgJL.setText("That coupon ID already exists");
                                    } else if(couponDiscount < 0) {
                                        clearTextFields();
                                        errorMsgJL.setText("Enter a coupon discount greater than or equal to 0");
                                    } else {
                                        st.setInt(1, upcID);
                                        st.setString(2, itemName);
                                        st.setDouble(3, itemPrice);
                                        st.setInt(4, quanity);
                                        st.setString(5, taxableItem);
                                        st.setString(6, ageVerification);
                                        st.setInt(7, couponID);
                                        st.setDouble(8, couponDiscount);
                                        st.executeUpdate();
                                        DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                                        model.addRow(new Object[]{upcID, itemName, itemPrice, quanity, taxableItem, ageVerification, couponID, couponDiscount});
                                        clearTextFields();
                                        errorMsgJL.setText(null);
                                    }
                                } catch (SQLException ex) {
                                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            } catch (NumberFormatException ex) {
                                clearTextFields();
                                errorMsgJL.setText("Please enter coupon discount with a double type");
                            }
                        } catch (NumberFormatException ex) {
                            clearTextFields();
                            errorMsgJL.setText("Please enter coupon ID with an integer type");
                        }
                    } catch (NumberFormatException ex) {
                        clearTextFields();
                        errorMsgJL.setText("Please enter quanity with an integer type");
                    }
                } catch (NumberFormatException ex) {
                    clearTextFields();
                    errorMsgJL.setText("Please enter item price with a double type");
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter UPC ID with an integer type");
            }
        }
    }//GEN-LAST:event_addJBActionPerformed

    private void removeJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJBActionPerformed
        
        upcIDString = upcIDJTF.getText();
        
        if(upcIDString.isEmpty()) {
            clearTextFields();
            errorMsgJL.setText("Enter UPC ID to delete");
        } else {
            try {
                int upcID = Integer.parseInt(upcIDString);
                
                try {
                    int flag = 0;
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    PreparedStatement st = conn.prepareStatement("delete from UPCINVENTORY where UPCID = ?");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from UPCINVENTORY");
                    while(rs.next()) {
                        if(rs.getInt(1) == upcID) {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 1) {
                        st.setInt(1, upcID);
                        st.executeUpdate();
                        DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                        int deleteRow = 0;
                        for(int i = 0; i < model.getRowCount(); i++) {
                            int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                            if(getRowIDValue == upcID) {
                                deleteRow = i;
                                break;
                            }
                        }
                        model.removeRow(deleteRow);
                        clearTextFields();
                        errorMsgJL.setText(null);    
                    } else {
                        clearTextFields();
                        errorMsgJL.setText("That UPC ID number is not located in the database");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter UPC ID with an integer type");
            }
        }
    }//GEN-LAST:event_removeJBActionPerformed

    private void updateJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJBActionPerformed
        
        upcIDString = upcIDJTF.getText();
        itemName = itemNameJTF.getText();
        itemPriceString = itemPriceJTF.getText();
        quanityString = quanityJTF.getText();
        taxableItem = taxableItemJTF.getText();
        ageVerification = ageVerificationJTF.getText();
        couponIDString = couponIDJTF.getText();
        couponDiscountString = couponDiscountJTF.getText();
        
        int flagger = 0;
        
        if(upcIDString.isEmpty()) {
            clearTextFields();
            errorMsgJL.setText("Enter UPC ID to update");
        } else {
            try {
                int upcID = Integer.parseInt(upcIDString);
                
                double itemPrice = 0.0;
                int quanity = 0;
                double couponDiscount = 0.0;
                try {
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    PreparedStatement stItemName = conn.prepareStatement("update UPCINVENTORY set ITEMNAME = ? where UPCID = ?");
                    PreparedStatement stItemPrice = conn.prepareStatement("update UPCINVENTORY set ITEMPRICE = ? where UPCID = ?");
                    PreparedStatement stQuanity = conn.prepareStatement("update UPCINVENTORY set QUANITY = ? where UPCID = ?");
                    PreparedStatement stTaxNoTax = conn.prepareStatement("update UPCINVENTORY set TAXNOTAX = ? where UPCID = ?");
                    PreparedStatement stAgeVerification = conn.prepareStatement("update UPCINVENTORY set AGEVERIFICATION = ? where UPCID = ?");
                    PreparedStatement stCouponDiscount = conn.prepareStatement("update UPCINVENTORY set COUPONDISCOUNT = ? where UPCID = ?");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from UPCINVENTORY");
                    while(rs.next()) {
                        if(rs.getInt(1) == upcID) {
                            flagger = 1;
                            break;
                        }
                    }
                    if(!upcIDString.isEmpty() && flagger == 1 && (itemName.isEmpty() && itemPriceString.isEmpty() && quanityString.isEmpty() && taxableItem.isEmpty() && ageVerification.isEmpty() && couponDiscountString.isEmpty())) {
                        clearTextFields();
                        errorMsgJL.setText("Nothing was entered to be updated");
                        flagger = -1;
                    }
                    if(flagger == 1 && !itemPriceString.isEmpty()) {
                        try {
                            itemPrice = Double.parseDouble(itemPriceString);                            
                            
                        } catch (NumberFormatException ex) {
                            clearTextFields();
                            errorMsgJL.setText("Please enter item price with a double type");
                            flagger = -1;
                        }
                        
                        if(flagger == 1 && itemPrice < 0) {
                            clearTextFields();
                            errorMsgJL.setText("Enter an item price greater than or equal to 0");
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
                    if(flagger == 1 && !taxableItem.isEmpty()) {
                        if(!taxableItem.equals("yes") && !taxableItem.equals("no")) {
                                clearTextFields();
                                errorMsgJL.setText("Enter taxable item field with a yes or no");
                                flagger = -1;
                        }
                    }
                    if(flagger == 1 && !ageVerification.isEmpty()) {
                        if(!ageVerification.equals("yes21") && !ageVerification.equals("yes18") && !ageVerification.equals("no")) {
                            clearTextFields();
                            errorMsgJL.setText("Enter age verification field with a yes21, yes18, or no");
                            flagger = -1;
                        }
                    }
                    if(flagger == 1 && !couponDiscountString.isEmpty()) {
                        try {
                            couponDiscount = Double.parseDouble(couponDiscountString);
                            
                        } catch (NumberFormatException ex) {
                            clearTextFields();
                            errorMsgJL.setText("Please enter coupon discount with a double type");
                            flagger = -1;
                        }
                        
                        if(couponDiscount < 0) {
                            clearTextFields();
                            errorMsgJL.setText("Enter a coupon discount greater than or equal to 0");
                            flagger = -1;
                        }
                    }
                    if(flagger == 1) {
                        
                        DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                        
                        if(!itemName.isEmpty()) {
                            stItemName.setString(1, itemName);
                            stItemName.setInt(2, upcID);
                            stItemName.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == upcID) {
                                    model.setValueAt(itemName, i, 1);
                                    break;
                                }
                            }
                        }
                        if(!itemPriceString.isEmpty()) {
                            stItemPrice.setDouble(1, itemPrice);
                            stItemPrice.setInt(2, upcID);
                            stItemPrice.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == upcID) {
                                    model.setValueAt(itemPrice, i, 2);
                                    break;
                                }
                            }
                        }
                        if(!quanityString.isEmpty()) {
                            stQuanity.setInt(1, quanity);
                            stQuanity.setInt(2, upcID);
                            stQuanity.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == upcID) {
                                    model.setValueAt(quanity, i, 3);
                                    break;
                                }
                            }
                        }
                        if(!taxableItem.isEmpty()) {
                            stTaxNoTax.setString(1, taxableItem);
                            stTaxNoTax.setInt(2, upcID);
                            stTaxNoTax.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == upcID) {
                                    model.setValueAt(taxableItem, i, 4);
                                    break;
                                }
                            }
                        }
                        if(!ageVerification.isEmpty()) {
                            stAgeVerification.setString(1, ageVerification);
                            stAgeVerification.setInt(2, upcID);
                            stAgeVerification.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == upcID) {
                                    model.setValueAt(ageVerification, i, 5);
                                    break;
                                }
                            }
                        }
                        if(!couponDiscountString.isEmpty()) {
                            stCouponDiscount.setDouble(1, couponDiscount);
                            stCouponDiscount.setInt(2, upcID);
                            stCouponDiscount.executeUpdate();
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == upcID) {
                                    model.setValueAt(couponDiscount, i, 7);
                                    break;
                                }
                            }
                        }
                        clearTextFields();
                        errorMsgJL.setText(null);  
                    }
                    if(flagger == 0) {
                        clearTextFields();
                        errorMsgJL.setText("That UPC ID number is not located in the database");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter UPC ID with an integer type");
            }
        }
    }//GEN-LAST:event_updateJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJB;
    private javax.swing.JLabel ageVerificationJL;
    private javax.swing.JTextField ageVerificationJTF;
    private javax.swing.JButton bookkeeperJB;
    private javax.swing.JLabel couponDiscountJL;
    private javax.swing.JTextField couponDiscountJTF;
    private javax.swing.JLabel couponIDJL;
    private javax.swing.JTextField couponIDJTF;
    private javax.swing.JLabel errorMsgJL;
    private javax.swing.JLabel itemNameJL;
    private javax.swing.JTextField itemNameJTF;
    private javax.swing.JLabel itemPriceJL;
    private javax.swing.JTextField itemPriceJTF;
    private javax.swing.JButton logOffJB;
    private javax.swing.JLabel quanityJL;
    private javax.swing.JTextField quanityJTF;
    private javax.swing.JButton removeJB;
    private javax.swing.JScrollPane tableJSP;
    private javax.swing.JTable tableJT;
    private javax.swing.JLabel taxableItemJL;
    private javax.swing.JTextField taxableItemJTF;
    private javax.swing.JLabel upcIDJL;
    private javax.swing.JTextField upcIDJTF;
    private javax.swing.JButton updateJB;
    // End of variables declaration//GEN-END:variables

    private String upcIDString;
    private String itemName;
    private String itemPriceString;
    private String quanityString;
    private String taxableItem;
    private String ageVerification;
    private String couponIDString;
    private String couponDiscountString;
}
