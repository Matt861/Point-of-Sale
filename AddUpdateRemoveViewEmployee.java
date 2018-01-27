import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AddUpdateRemoveViewEmployee extends javax.swing.JFrame {
  
    public AddUpdateRemoveViewEmployee() {
        initComponents();
        initalTable();
    }
    
    private void initalTable() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from EMPLOYEES");
            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
            while(rs.next()) {       
                model.addRow(new Object[]{rs.getInt(1), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearTextFields() {
        peoplesoftIDJTF.setText(null);
        passwordJPF.setText(null);
        firstNameJTF.setText(null);
        lastNameJTF.setText(null);
        positionJTF.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableJSP = new javax.swing.JScrollPane();
        tableJT = new javax.swing.JTable();
        peoplesoftIDJL = new javax.swing.JLabel();
        passwordJL = new javax.swing.JLabel();
        firstNameJL = new javax.swing.JLabel();
        positionJL = new javax.swing.JLabel();
        peoplesoftIDJTF = new javax.swing.JTextField();
        positionJTF = new javax.swing.JTextField();
        firstNameJTF = new javax.swing.JTextField();
        passwordJPF = new javax.swing.JPasswordField();
        addJB = new javax.swing.JButton();
        errorMsgJL = new javax.swing.JLabel();
        lastNameJTF = new javax.swing.JTextField();
        lastNameJL = new javax.swing.JLabel();
        removeJB = new javax.swing.JButton();
        logoffJB = new javax.swing.JButton();
        bookkeeperScreenJB = new javax.swing.JButton();
        updateJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add, Update, and Remove Employees");

        tableJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peoplesoft ID", "First Name", "Last Name", "Position"
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

        peoplesoftIDJL.setText("Peoplesoft ID");

        passwordJL.setText("Password");

        firstNameJL.setText("First Name");

        positionJL.setText("Position");

        addJB.setText("Add");
        addJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJBActionPerformed(evt);
            }
        });

        errorMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        lastNameJL.setText("Last Name");

        removeJB.setText("Remove");
        removeJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJBActionPerformed(evt);
            }
        });

        logoffJB.setText("Log Off");
        logoffJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffJBActionPerformed(evt);
            }
        });

        bookkeeperScreenJB.setText("Bookkeeper Screen");
        bookkeeperScreenJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookkeeperScreenJBActionPerformed(evt);
            }
        });

        updateJB.setText("Update");
        updateJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstNameJL)
                                    .addComponent(passwordJL)
                                    .addComponent(peoplesoftIDJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peoplesoftIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordJPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(positionJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(positionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastNameJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(tableJSP)
                        .addComponent(errorMsgJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeJB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookkeeperScreenJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoffJB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peoplesoftIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peoplesoftIDJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJB)
                    .addComponent(removeJB)
                    .addComponent(updateJB))
                .addGap(18, 18, 18)
                .addComponent(tableJSP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoffJB)
                    .addComponent(bookkeeperScreenJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJBActionPerformed
        
        peoplesoftIDString = peoplesoftIDJTF.getText();
        password = passwordJPF.getText();
        firstName = firstNameJTF.getText();
        lastName = lastNameJTF.getText();
        position = positionJTF.getText();
        
        if(peoplesoftIDString.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || position.isEmpty()) {
                clearTextFields();
                errorMsgJL.setText("Enter all of the text fields");
        } else {        
            try {
                int peoplesoftID = Integer.parseInt(peoplesoftIDString);

                try {
                    int flag = 0;
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    PreparedStatement st = conn.prepareStatement("insert into EMPLOYEES(PEOPLESOFTID, PASSWORD, FIRSTNAME, LASTNAME, POSITION)values(?,?,?,?,?)");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from EMPLOYEES");
                    while(rs.next()) {
                        if(rs.getInt(1) == peoplesoftID) {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 1) {
                        clearTextFields();
                        errorMsgJL.setText("That Peoplesoft ID already exists");
                    } else if(peoplesoftID < 10 || peoplesoftID > 10000) {
                        clearTextFields();
                        errorMsgJL.setText("Enter Peoplesoft ID number between 10 and 10000");
                    } else {
                        if(position.equals("bookkeeper") || position.equals("manager") || position.equals("cashier")) {                           
                            st.setInt(1, peoplesoftID);
                            st.setString(2, password);
                            st.setString(3, firstName);
                            st.setString(4, lastName);
                            st.setString(5, position);
                            st.executeUpdate();
                            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();     
                            model.addRow(new Object[]{peoplesoftID, firstName, lastName, position});
                            clearTextFields();
                            errorMsgJL.setText(null);
                        } else {
                            clearTextFields();
                            errorMsgJL.setText("Only positions available: bookkeeper, manager, cashier");
                        }
                    }         
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter Peoplesoft ID with an integer type");
            }
        }        
    }//GEN-LAST:event_addJBActionPerformed

    private void removeJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJBActionPerformed
        
        peoplesoftIDString = peoplesoftIDJTF.getText();
        password = passwordJPF.getText();
        firstName = firstNameJTF.getText();
        lastName = lastNameJTF.getText();
        position = positionJTF.getText();
        
        if(peoplesoftIDString.isEmpty()) {
            clearTextFields();
            errorMsgJL.setText("Enter Peoplesoft ID to delete");
        } else {            
            try {
                int peoplesoftID = Integer.parseInt(peoplesoftIDString);

                try {
                    int flag = 0;
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    PreparedStatement st = conn.prepareStatement("delete from EMPLOYEES where PEOPLESOFTID = ?");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from EMPLOYEES");
                    while(rs.next()) {
                        if(peoplesoftID == 1) {
                            flag = 1;
                            break;
                        } else if(rs.getInt(1) == peoplesoftID) {
                            flag = 2;
                            break;
                        }
                    }
                    switch (flag) {
                        case 1:
                            clearTextFields();
                            errorMsgJL.setText("You are not allowed to remove this user");
                            break;
                        case 2:
                            st.setInt(1, peoplesoftID);
                            st.executeUpdate();
                            DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                            int deleteRow = 0;
                            for(int i = 0; i < model.getRowCount(); i++) {
                                int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                if(getRowIDValue == peoplesoftID) {
                                    deleteRow = i;
                                    break;
                                }
                            }
                            model.removeRow(deleteRow);
                            clearTextFields();
                            errorMsgJL.setText(null);
                            break;
                        default:
                            clearTextFields();
                            errorMsgJL.setText("That Peoplesoft ID number is not located in the database");
                            break;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter Peoplesoft ID with an integer type");
            }
        }
    }//GEN-LAST:event_removeJBActionPerformed

    private void logoffJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffJBActionPerformed
        
        new Login().setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_logoffJBActionPerformed

    private void bookkeeperScreenJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookkeeperScreenJBActionPerformed
        
        new Bookkeeper().setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_bookkeeperScreenJBActionPerformed

    private void updateJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJBActionPerformed
        
        peoplesoftIDString = peoplesoftIDJTF.getText();
        password = passwordJPF.getText();
        firstName = firstNameJTF.getText();
        lastName = lastNameJTF.getText();
        position = positionJTF.getText();
        
        if(peoplesoftIDString.isEmpty()) {
            clearTextFields();
            errorMsgJL.setText("Enter Peoplesoft ID to update");
        } else {
            try {
                int peoplesoftID = Integer.parseInt(peoplesoftIDString);
                
                try {                    
                    int flag = 0;
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    PreparedStatement stFirstName = conn.prepareStatement("update EMPLOYEES set FIRSTNAME = ? where PEOPLESOFTID = ?");
                    PreparedStatement stLastName = conn.prepareStatement("update EMPLOYEES set LASTNAME = ? where PEOPLESOFTID = ?");
                    PreparedStatement stPosition = conn.prepareStatement("update EMPLOYEES set POSITION = ? where PEOPLESOFTID = ?");
                    Statement st2 = conn.createStatement();
                    ResultSet rs = st2.executeQuery("select * from EMPLOYEES");                    
                    while(rs.next()) {
                        if(peoplesoftID == 1) {
                            flag = 1;
                            break;
                        } else if(rs.getInt(1) == peoplesoftID) {
                            flag = 2;
                            break;
                        }
                    }
                    switch (flag) {
                        case 1:
                            clearTextFields();
                            errorMsgJL.setText("You are not allowed to update this user");
                            break;
                        case 2:
                            if(!peoplesoftIDString.isEmpty() && (firstName.isEmpty() && lastName.isEmpty() && position.isEmpty())) {
                                clearTextFields();
                                errorMsgJL.setText("Nothing was entered into the First Name, Last Name, or Position text field");
                            } else if(!position.isEmpty() && (!position.equals("bookkeeper") && !position.equals("manager") && !position.equals("cashier"))) {
                                clearTextFields();
                                errorMsgJL.setText("Only positions available: bookkeeper, manager, cashier");
                            } else {
                                DefaultTableModel model = (DefaultTableModel) tableJT.getModel();
                                if(!firstName.isEmpty()) {
                                    stFirstName.setString(1, firstName);
                                    stFirstName.setInt(2, peoplesoftID);
                                    stFirstName.executeUpdate();
                                    for(int i = 0; i < model.getRowCount(); i++) {
                                        int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                        if(getRowIDValue == peoplesoftID) {
                                            model.setValueAt(firstName, i, 1);
                                            break;
                                        }
                                    }
                                }
                                if(!lastName.isEmpty()) {
                                    stLastName.setString(1, lastName);
                                    stLastName.setInt(2, peoplesoftID);
                                    stLastName.executeUpdate();
                                    for(int i = 0; i < model.getRowCount(); i++) {
                                        int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                        if(getRowIDValue == peoplesoftID) {
                                            model.setValueAt(lastName, i, 2);
                                            break;
                                        }
                                    }
                                }
                                if(!position.isEmpty()) {
                                    stPosition.setString(1, position);
                                    stPosition.setInt(2, peoplesoftID);
                                    stPosition.executeUpdate();
                                    for(int i = 0; i < model.getRowCount(); i++) {
                                        int getRowIDValue = Integer.parseInt(model.getValueAt(i, 0).toString());
                                        if(getRowIDValue == peoplesoftID) {
                                            model.setValueAt(position, i, 3);
                                            break;
                                        }
                                    }
                                }
                                clearTextFields();                            
                                errorMsgJL.setText(null);
                                
                            }
                            break;
                        default:
                            clearTextFields();
                            errorMsgJL.setText("That Peoplesoft ID number is not located in the database");
                            break;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUpdateRemoveViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                clearTextFields();
                errorMsgJL.setText("Please enter Peoplesoft ID with an integer type");
            }
        }
    }//GEN-LAST:event_updateJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJB;
    private javax.swing.JButton bookkeeperScreenJB;
    private javax.swing.JLabel errorMsgJL;
    private javax.swing.JLabel firstNameJL;
    private javax.swing.JTextField firstNameJTF;
    private javax.swing.JLabel lastNameJL;
    private javax.swing.JTextField lastNameJTF;
    private javax.swing.JButton logoffJB;
    private javax.swing.JLabel passwordJL;
    private javax.swing.JPasswordField passwordJPF;
    private javax.swing.JLabel peoplesoftIDJL;
    private javax.swing.JTextField peoplesoftIDJTF;
    private javax.swing.JLabel positionJL;
    private javax.swing.JTextField positionJTF;
    private javax.swing.JButton removeJB;
    private javax.swing.JScrollPane tableJSP;
    private javax.swing.JTable tableJT;
    private javax.swing.JButton updateJB;
    // End of variables declaration//GEN-END:variables

    private String peoplesoftIDString;
    private String password;
    private String firstName;
    private String lastName;
    private String position;
}
