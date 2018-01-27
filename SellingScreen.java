import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class SellingScreen extends javax.swing.JFrame {

    private double totalTax;
    private double totalNoTax;
    private double total;
    private double salesTax;
    private double totalWithSalesTax;
    
    private int orderNumber;
    private int peoplesoftID;
    private String firstName;
    
    private double change;
    
    public SellingScreen() {
        initComponents();
        showDate();
        showTime();
        totalTax = 0;
        totalNoTax = 0;
        total = 0;
        salesTax = 0;
        totalWithSalesTax = 0;
        setUpOrderNumber();
    }
    
    public SellingScreen(int submitUsername, String name) {
        initComponents();        
        usernameJL.setText("Peoplesoft ID: " + submitUsername);
        nameJL.setText("Cashier's Name: " + name);
        showDate();
        showTime();
        totalTax = 0;
        totalNoTax = 0;
        total = 0;
        salesTax = 0;
        totalWithSalesTax = 0;
        peoplesoftID = submitUsername;
        firstName = name;
        orderNumber = setUpOrderNumber();
        orderNumberJL.setText("Order #: " + orderNumber);
    }
    
    private int setUpOrderNumber() {
        int orderNumberCount = 1;
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
            Statement st2 = conn.createStatement();
            ResultSet rs = st2.executeQuery("select * from TRANSACTIONLOG");
            while(rs.next()) {
                if(rs.getInt(2) == orderNumberCount) {
                    orderNumberCount++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return orderNumberCount;
    }
    
    private void showDate() {
        Date date = new Date();
        SimpleDateFormat sDF = new SimpleDateFormat("MM-dd-yyyy");
        dateJL.setText("Date: " + sDF.format(date));
    }
    
    private void showTime() {
        new Timer(0, new ActionListener() {
         
            @Override
            public void actionPerformed(ActionEvent e) {
                Date time = new Date();
                SimpleDateFormat sdF = new SimpleDateFormat("hh:mm:ss a");
                timeJL.setText("Time: " + sdF.format(time));
            }    
        }).start();
    }
    
    private void clearTextFields() {
        upcJTF.setText(null);
        userSubmitCashJTF.setText(null);
        pluJTF.setText(null);
        weightJTF.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logOffJB = new javax.swing.JButton();
        usernameJL = new javax.swing.JLabel();
        dateJL = new javax.swing.JLabel();
        timeJL = new javax.swing.JLabel();
        nameJL = new javax.swing.JLabel();
        tableJSP = new javax.swing.JScrollPane();
        tableJT = new javax.swing.JTable();
        upcJTF = new javax.swing.JTextField();
        enterUPCJL = new javax.swing.JLabel();
        upcErrorMsgJL = new javax.swing.JLabel();
        salesTaxJL = new javax.swing.JLabel();
        totalWithSalesTaxJL = new javax.swing.JLabel();
        totalJL = new javax.swing.JLabel();
        DeleteUPCJB = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        enterCashAmountJL = new javax.swing.JLabel();
        userSubmitCashJTF = new javax.swing.JTextField();
        errorMsgJL = new javax.swing.JLabel();
        orderNumberJL = new javax.swing.JLabel();
        startNewSellJB = new javax.swing.JButton();
        enterPLUJL = new javax.swing.JLabel();
        pluJTF = new javax.swing.JTextField();
        deletePLUJB = new javax.swing.JButton();
        enterWeightJL = new javax.swing.JLabel();
        weightJTF = new javax.swing.JTextField();
        pluErrorMsgJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selling Screen");

        logOffJB.setText("LogOff");
        logOffJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffJBActionPerformed(evt);
            }
        });

        tableJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UPC/PLU", "Item Name", "Item Price", "Taxable Item"
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

        upcJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upcJTFActionPerformed(evt);
            }
        });

        enterUPCJL.setText("Enter UPC:");

        upcErrorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        salesTaxJL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salesTaxJL.setForeground(new java.awt.Color(0, 0, 255));
        salesTaxJL.setText("Sales Tax:");

        totalWithSalesTaxJL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalWithSalesTaxJL.setForeground(new java.awt.Color(0, 0, 255));
        totalWithSalesTaxJL.setText("Total with Sales Tax:");

        totalJL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalJL.setForeground(new java.awt.Color(0, 0, 255));
        totalJL.setText("Total:");

        DeleteUPCJB.setText("Delete UPC");
        DeleteUPCJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUPCJBActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        enterCashAmountJL.setForeground(new java.awt.Color(0, 204, 0));
        enterCashAmountJL.setText("Enter cash given:");

        userSubmitCashJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSubmitCashJTFActionPerformed(evt);
            }
        });

        errorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        startNewSellJB.setText("Start New Sell");
        startNewSellJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startNewSellJBActionPerformed(evt);
            }
        });

        enterPLUJL.setText("Enter PLU:");

        deletePLUJB.setText("Delete PLU");

        enterWeightJL.setText("Enter Weight (lbs)");

        weightJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightJTFActionPerformed(evt);
            }
        });

        pluErrorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalJL)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(salesTaxJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(totalWithSalesTaxJL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(enterUPCJL)
                                    .addComponent(enterPLUJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(upcJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(pluJTF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DeleteUPCJB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(upcErrorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterWeightJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(weightJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deletePLUJB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pluErrorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterCashAmountJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userSubmitCashJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usernameJL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logOffJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startNewSellJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeJL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateJL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderNumberJL, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameJL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalJL)
                                .addGap(18, 18, 18)
                                .addComponent(salesTaxJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalWithSalesTaxJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(upcJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enterUPCJL)
                                .addComponent(DeleteUPCJB))
                            .addComponent(upcErrorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pluJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterPLUJL)
                            .addComponent(enterWeightJL)
                            .addComponent(weightJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletePLUJB)
                            .addComponent(pluErrorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterCashAmountJL)
                            .addComponent(userSubmitCashJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(errorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logOffJB)
                            .addComponent(startNewSellJB)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(orderNumberJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timeJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOffJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffJBActionPerformed
        
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOffJBActionPerformed

    private void upcJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upcJTFActionPerformed
        
        String stringUPC = upcJTF.getText();
        
        if(stringUPC.isEmpty()) {
            clearTextFields();
            upcErrorMsgJL.setText("Nothing was entered");
        } else {
            try {
                int upc = Integer.parseInt(stringUPC);
                
                try {
                    int flag = 0;
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from UPCINVENTORY");
                    while(rs.next()) {
                        if(rs.getInt(1) == upc) {
                            if(rs.getString(6).equals("yes21")) {
                                flag = 1;
                                break;
                            } else if(rs.getString(6).equals("yes18")) {
                                flag = 2;
                                break;
                            } else {
                                flag = 3;
                                break;
                            }
                        }
                    }
                    if(flag ==  1) {
                        int boolFlag = JOptionPane.showConfirmDialog(null, "Click YES if the customer is over 21 years old", "Verify Age (21)", JOptionPane.YES_NO_OPTION);
                        if(boolFlag == 0) {
                            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();        
                            model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(5)});
                            clearTextFields();
                            double priceItem = rs.getDouble(3);
                            if(rs.getString(5).equals("no")) {
                                totalNoTax += priceItem;
                            } else {
                                totalTax += priceItem;
                                salesTax = (totalTax * .0825);
                            }
                            total = totalNoTax + totalTax;
                            totalWithSalesTax = total + salesTax;                                               
                            String totalString = String.format("%.2f", total);
                            String salesTaxString = String.format("%.2f", salesTax);
                            String totalWithSalesTaxString = String.format("%.2f", totalWithSalesTax);
                            totalJL.setText("Total: $" + totalString);
                            salesTaxJL.setText("Sales Tax: $" + salesTaxString);
                            totalWithSalesTaxJL.setText("Total with Sales Tax: $" + totalWithSalesTaxString);
                        }                             
                        clearTextFields();    
                    } else if(flag ==  2) {
                        int boolFlag = JOptionPane.showConfirmDialog(null, "Click YES if the customer is over 18 years old", "Verify Age (18)", JOptionPane.YES_NO_OPTION);
                        
                        if(boolFlag == 0) {
                            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();        
                            model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(5)});
                            upcErrorMsgJL.setText(null);
                            double priceItem = rs.getDouble(3);
                            if(rs.getString(5).equals("no")) {
                                totalNoTax += priceItem;
                            } else {
                                totalTax += priceItem;
                                salesTax = (totalTax * .0825);
                            }
                            total = totalNoTax + totalTax;
                            totalWithSalesTax = total + salesTax;                                               
                            String totalString = String.format("%.2f", total);
                            String salesTaxString = String.format("%.2f", salesTax);
                            String totalWithSalesTaxString = String.format("%.2f", totalWithSalesTax);
                            totalJL.setText("Total: $" + totalString);
                            salesTaxJL.setText("Sales Tax: $" + salesTaxString);
                            totalWithSalesTaxJL.setText("Total with Sales Tax: $" + totalWithSalesTaxString);
                        }                             
                        clearTextFields();    
                        flag = -1;
                    } else if(flag == 3) {
                        DefaultTableModel model = (DefaultTableModel) tableJT.getModel();        
                        model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(5)});
                        clearTextFields();
                        upcErrorMsgJL.setText(null);
                        double priceItem = rs.getDouble(3);
                        if(rs.getString(5).equals("no")) {
                            totalNoTax += priceItem;
                        } else {
                            totalTax += priceItem;
                            salesTax = (totalTax * .0825);
                        }
                        total = totalNoTax + totalTax;
                        totalWithSalesTax = total + salesTax;                                               
                        String totalString = String.format("%.2f", total);
                        String salesTaxString = String.format("%.2f", salesTax);
                        String totalWithSalesTaxString = String.format("%.2f", totalWithSalesTax);
                        totalJL.setText("Total: $" + totalString);
                        salesTaxJL.setText("Sales Tax: $" + salesTaxString);
                        totalWithSalesTaxJL.setText("Total with Sales Tax: $" + totalWithSalesTaxString);
                    } else if(flag == 0) {
                        clearTextFields();
                        upcErrorMsgJL.setText("UPC doesn't exist in system");
                    }                    
                } catch (SQLException ex) {
                    Logger.getLogger(SellingScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                upcErrorMsgJL.setText("Please enter integer type");
            }
        }
    }//GEN-LAST:event_upcJTFActionPerformed

    private void DeleteUPCJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUPCJBActionPerformed
        
        String stringUPC = upcJTF.getText();
        
        if(stringUPC.isEmpty()) {
            clearTextFields();
            upcErrorMsgJL.setText("Nothing was entered");
        } else {
            try {
                int upc = Integer.parseInt(stringUPC);
                
                DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                
                int flag = 0;
                int deleteRow = 0;
                double getRowItemPrice = 0.0;
                String getRowTaxableItem = "";
                for(int i = 0; i < model.getRowCount(); i++) {
                    int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                    getRowItemPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
                    getRowTaxableItem = (model.getValueAt(i, 3).toString());
                    if(getRowIDValue == upc) {
                        deleteRow = i;
                        flag = 0;
                        break;
                    } else {
                        flag = 1;
                    }
                }
                
                if(flag == 1) {
                    clearTextFields();
                    upcErrorMsgJL.setText("That UPC is not in current sell");
                } else {
                    model.removeRow(deleteRow);
                    clearTextFields();
                    upcErrorMsgJL.setText(null);
                    
                    if(getRowTaxableItem.equals("no")) {
                        totalNoTax -= getRowItemPrice;
                    } else {
                        totalTax -= getRowItemPrice;
                        salesTax = (totalTax * .0825);
                    }
                    total = totalNoTax + totalTax;
                    totalWithSalesTax = total + salesTax;                                               
                    String totalString = String.format("%.2f", total);
                    String salesTaxString = String.format("%.2f", salesTax);
                    String totalWithSalesTaxString = String.format("%.2f", totalWithSalesTax);
                    totalJL.setText("Total: $" + totalString);
                    salesTaxJL.setText("Sales Tax: $" + salesTaxString);
                    totalWithSalesTaxJL.setText("Total with Sales Tax: $" + totalWithSalesTaxString);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                upcErrorMsgJL.setText("Please enter integer type");
            }
        }
    }//GEN-LAST:event_DeleteUPCJBActionPerformed

    private void userSubmitCashJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSubmitCashJTFActionPerformed
        
        String cashAmountString = userSubmitCashJTF.getText();
        
        if(cashAmountString.isEmpty()) {
            userSubmitCashJTF.setText(null);
            errorMsgJL.setText("Nothing was entered");
        } else {
            try {
                double cashAmount = Double.parseDouble(cashAmountString);
                if(cashAmount < totalWithSalesTax) {
                    userSubmitCashJTF.setText(null);
                    errorMsgJL.setText("Insufficient funds");
                } else {
                    try {
                        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                        PreparedStatement st = conn.prepareStatement("insert into TRANSACTIONLOG(COUNTER, ORDERNUMBER, PEOPLESOFTID, UPCPLUID, ITEMNAME, ITEMPRICE, TAXNOTAX)values(?, ?, ?, ?, ?, ?, ?)");
                        Statement st2 = conn.createStatement();
                        Statement st3 = conn.createStatement();
                        ResultSet rs2 = st3.executeQuery("select * from TRANSACTIONLOG");
                        int counter = 0;
                        while(rs2.next()) {
                            if(rs2.getInt(1) == counter) {
                                counter++;
                            } else {
                                break;
                            }
                        }
                        DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                        for(int i = 0; i < model.getRowCount(); i++) {
                            int getRowID = Integer.parseInt(model.getValueAt(i, 0).toString());
                            String getRowItemNameValue = (model.getValueAt(i, 1).toString());
                            double getRowItemPriceValue = Double.parseDouble(model.getValueAt(i, 2).toString());
                            String getRowTaxableItemValue = (model.getValueAt(i, 3).toString());
                            
                            st.setInt(1, counter);
                            st.setInt(2, orderNumber);
                            st.setInt(3, peoplesoftID);
                            st.setInt(4, getRowID);
                            st.setString(5, getRowItemNameValue);
                            st.setDouble(6, getRowItemPriceValue);
                            st.setString(7, getRowTaxableItemValue);
                            st.execute();
                            counter++;
                        }
                        change = cashAmount - totalWithSalesTax;
                        new FinalScreen(change).setVisible(true);
                        this.setVisible(false);
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(SellingScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (NumberFormatException ex) {
                userSubmitCashJTF.setText(null);
                errorMsgJL.setText("Please enter double type");
            }
        }
    }//GEN-LAST:event_userSubmitCashJTFActionPerformed

    private void startNewSellJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startNewSellJBActionPerformed
        
        new SellingScreen(peoplesoftID, firstName).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startNewSellJBActionPerformed

    private void weightJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightJTFActionPerformed
        
        String stringPLU = pluJTF.getText();
        String stringWeight = weightJTF.getText();
        
        if(stringPLU.isEmpty() || stringWeight.isEmpty()) {
            clearTextFields();
            pluErrorMsgJL.setText("Please enter both text fields");
        } else {
            try {
                int plu = Integer.parseInt(stringPLU);
                
                try {
                    double weight = Double.parseDouble(stringWeight);
                    
                    try {
                        int flag = 0;
                        double pricePerPound = 0.0;
                        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                        Statement st2 = conn.createStatement();
                        ResultSet rs = st2.executeQuery("select * from PLUINVENTORY");
                        while(rs.next()) {
                            if(rs.getInt(1) == plu) {
                                pricePerPound = rs.getDouble(3);
                                flag = 1;
                                break;
                            }
                        }
                        if(flag == 1) {
                            double price = pricePerPound * weight;
                            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();         
                            model.addRow(new Object[]{rs.getInt(1), rs.getString(2), price, rs.getString(5)});
                            clearTextFields();
                            pluErrorMsgJL.setText(null);
                            totalNoTax += price;
                            total = totalNoTax + totalTax;
                            totalWithSalesTax = total + salesTax;                                               
                            String totalString = String.format("%.2f", total);
                            String salesTaxString = String.format("%.2f", salesTax);
                            String totalWithSalesTaxString = String.format("%.2f", totalWithSalesTax);
                            totalJL.setText("Total: $" + totalString);
                            salesTaxJL.setText("Sales Tax: $" + salesTaxString);
                            totalWithSalesTaxJL.setText("Total with Sales Tax: $" + totalWithSalesTaxString);
                        } else {
                            clearTextFields();
                            pluErrorMsgJL.setText("PLU doesn't exist in system");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(SellingScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (NumberFormatException ex) {
                    clearTextFields();
                    pluErrorMsgJL.setText("Please enter double type for weight");
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                pluErrorMsgJL.setText("Please enter integer type for PLU ID");
            }
        }
    }//GEN-LAST:event_weightJTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteUPCJB;
    private javax.swing.JLabel dateJL;
    private javax.swing.JButton deletePLUJB;
    private javax.swing.JLabel enterCashAmountJL;
    private javax.swing.JLabel enterPLUJL;
    private javax.swing.JLabel enterUPCJL;
    private javax.swing.JLabel enterWeightJL;
    private javax.swing.JLabel errorMsgJL;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logOffJB;
    private javax.swing.JLabel nameJL;
    private javax.swing.JLabel orderNumberJL;
    private javax.swing.JLabel pluErrorMsgJL;
    private javax.swing.JTextField pluJTF;
    private javax.swing.JLabel salesTaxJL;
    private javax.swing.JButton startNewSellJB;
    private javax.swing.JScrollPane tableJSP;
    private javax.swing.JTable tableJT;
    private javax.swing.JLabel timeJL;
    private javax.swing.JLabel totalJL;
    private javax.swing.JLabel totalWithSalesTaxJL;
    private javax.swing.JLabel upcErrorMsgJL;
    private javax.swing.JTextField upcJTF;
    private javax.swing.JTextField userSubmitCashJTF;
    private javax.swing.JLabel usernameJL;
    private javax.swing.JTextField weightJTF;
    // End of variables declaration//GEN-END:variables
}
