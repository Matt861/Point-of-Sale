import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {
        
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        peoplesoftIDJL = new javax.swing.JLabel();
        passwordJL = new javax.swing.JLabel();
        peoplesoftIDJTF = new javax.swing.JTextField();
        loginJB = new javax.swing.JButton();
        resetJB = new javax.swing.JButton();
        passwordJPF = new javax.swing.JPasswordField();
        loginMsgJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        peoplesoftIDJL.setText("Peoplesoft ID");

        passwordJL.setText("Password");

        loginJB.setText("Login");
        loginJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJBActionPerformed(evt);
            }
        });

        resetJB.setText("Reset");
        resetJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetJBActionPerformed(evt);
            }
        });

        loginMsgJL.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(peoplesoftIDJL)
                    .addComponent(passwordJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetJB))
                    .addComponent(loginMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJPF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peoplesoftIDJTF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginJB, resetJB});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordJPF, peoplesoftIDJTF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peoplesoftIDJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peoplesoftIDJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginMsgJL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginJB)
                    .addComponent(resetJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordJL, peoplesoftIDJL});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginMsgJL, passwordJPF, peoplesoftIDJTF});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginJB, resetJB});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetJBActionPerformed
        
        peoplesoftIDJTF.setText(null);
        passwordJPF.setText(null);
        loginMsgJL.setText(null);
    }//GEN-LAST:event_resetJBActionPerformed

    private void loginJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJBActionPerformed
        
        String peoplesoftIDString = peoplesoftIDJTF.getText();
        String password = passwordJPF.getText();
        
        if(peoplesoftIDString.isEmpty() || password.isEmpty()) {
            peoplesoftIDJTF.setText(null);
            passwordJPF.setText(null);
            loginMsgJL.setText("One or more of the text fields were not entered");
        } else {
            try {
                int peoplesoftID = Integer.parseInt(peoplesoftIDString);
                
                try {
                    int flag = 0;
                    String adminRights = "bookkeeper";
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pointOfSaleDB", "username", "password");
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from EMPLOYEES");
                    while(rs.next()) {
                        if(rs.getString(1).equals(peoplesoftIDJTF.getText()) && rs.getString(2).equals(passwordJPF.getText()) && rs.getString(5).equals(adminRights)) {
                            flag = 1;
                            break;
                        } else if(rs.getString(1).equals(peoplesoftIDJTF.getText()) && rs.getString(2).equals(passwordJPF.getText())) {
                            flag = 2;
                            break;
                        } else if(rs.getString(1).equals(peoplesoftIDJTF.getText())) {
                            flag = 3;
                            break;
                        }
                    }
                    if(flag == 1) {
                        new Bookkeeper().setVisible(true);
                        this.setVisible(false);
                    } else if(flag == 2) {
                        String name = rs.getString(3);
                        new SellingScreen(peoplesoftID, name).setVisible(true);
                        this.setVisible(false);
                    } else if(flag == 3) {
                        peoplesoftIDJTF.setText(null);
                        passwordJPF.setText(null);
                        loginMsgJL.setText("Invalid Password");
                    } else {
                        peoplesoftIDJTF.setText(null);
                        passwordJPF.setText(null);
                        loginMsgJL.setText("Invalid Peoplesoft ID and Password");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                peoplesoftIDJTF.setText(null);
                passwordJPF.setText(null);
                loginMsgJL.setText("Please enter Peoplesoft ID with an integer type");
            }
        }
    }//GEN-LAST:event_loginJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginJB;
    private javax.swing.JLabel loginMsgJL;
    private javax.swing.JLabel passwordJL;
    private javax.swing.JPasswordField passwordJPF;
    private javax.swing.JLabel peoplesoftIDJL;
    private javax.swing.JTextField peoplesoftIDJTF;
    private javax.swing.JButton resetJB;
    // End of variables declaration//GEN-END:variables
}
