package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication4.AccountNumberHolder.getAccountNumber;
import static javaapplication4.AccountNumberHolder.getAccountpw;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class PinChange extends javax.swing.JInternalFrame {

    public PinChange() {
        initComponents();
        setSize(920, 640);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        oldPassLbl = new javax.swing.JLabel();
        conPassLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        proceedBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        newPassLbl1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        invalidConPass = new java.awt.Label();
        invalidOldPass = new java.awt.Label();
        invalidNewPass = new java.awt.Label();
        oldPassTxt = new java.awt.TextField();
        newPassTxt = new java.awt.TextField();
        conNewPassTxt = new java.awt.TextField();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 530));

        jPanel1.setBackground(new java.awt.Color(204, 0, 255));
        jPanel1.setLayout(null);

        oldPassLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        oldPassLbl.setForeground(new java.awt.Color(255, 204, 204));
        oldPassLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-password-48.png"))); // NOI18N
        oldPassLbl.setText("OLD PASSWORD:");
        jPanel1.add(oldPassLbl);
        oldPassLbl.setBounds(170, 90, 167, 48);

        conPassLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        conPassLbl.setForeground(new java.awt.Color(255, 204, 204));
        conPassLbl.setText("CONFIRM PASSWORD: ");
        jPanel1.add(conPassLbl);
        conPassLbl.setBounds(190, 310, 155, 28);

        jSeparator1.setForeground(new java.awt.Color(242, 242, 242));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(370, 160, 234, 20);

        jSeparator2.setForeground(new java.awt.Color(242, 242, 242));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(370, 370, 238, 20);

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        proceedBtn.setBackground(new java.awt.Color(97, 212, 195));
        proceedBtn.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        proceedBtn.setForeground(new java.awt.Color(255, 255, 255));
        proceedBtn.setText("PROCEED");
        proceedBtn.setBorder(null);
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(proceedBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proceedBtn)
                    .addComponent(jLabel3)))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(280, 410, 97, 34);

        jPanel4.setBackground(new java.awt.Color(97, 212, 195));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        clearBtn.setBackground(new java.awt.Color(97, 212, 195));
        clearBtn.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(null);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearBtn)
                    .addComponent(jLabel5)))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(490, 410, 91, 34);

        newPassLbl1.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        newPassLbl1.setForeground(new java.awt.Color(255, 204, 204));
        newPassLbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/password icon.png"))); // NOI18N
        newPassLbl1.setText("NEW PASSWORD:");
        jPanel1.add(newPassLbl1);
        newPassLbl1.setBounds(180, 200, 172, 53);

        jSeparator3.setForeground(new java.awt.Color(242, 242, 242));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(370, 270, 236, 20);

        invalidConPass.setEnabled(false);
        invalidConPass.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(invalidConPass);
        invalidConPass.setBounds(360, 350, 242, 20);

        invalidOldPass.setEnabled(false);
        invalidOldPass.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(invalidOldPass);
        invalidOldPass.setBounds(360, 140, 242, 20);

        invalidNewPass.setEnabled(false);
        invalidNewPass.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(invalidNewPass);
        invalidNewPass.setBounds(360, 250, 240, 20);

        oldPassTxt.setBackground(new java.awt.Color(204, 0, 255));
        jPanel1.add(oldPassTxt);
        oldPassTxt.setBounds(370, 90, 240, 30);

        newPassTxt.setBackground(new java.awt.Color(204, 0, 255));
        newPassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassTxtActionPerformed(evt);
            }
        });
        jPanel1.add(newPassTxt);
        newPassTxt.setBounds(370, 210, 240, 30);

        conNewPassTxt.setBackground(new java.awt.Color(204, 0, 255));
        jPanel1.add(conNewPassTxt);
        conNewPassTxt.setBounds(370, 310, 240, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        String accpass = getAccountpw();
        String oldpass = oldPassTxt.getText();
        String newpass = newPassTxt.getText();
        String conpass = conNewPassTxt.getText();
        String accountNumberStr = getAccountNumber();
        int accountNumber = 0;
        System.out.println("Old Password: " + oldpass);
        System.out.println("Account Password: " + accpass);
        System.out.println("Account Number" + accountNumberStr);

        if (accpass != null && oldpass.trim().equals(accpass.trim())) {
            if (newpass.length() < 8 || !newpass.matches(".*\\d.*") || !newpass.matches(".*[a-zA-Z].*") || !newpass.matches(".*[^a-zA-Z0-9].*")) {
                newPassTxt.setText("");
                conNewPassTxt.setText("");
                invalidNewPass.setEnabled(true);
                invalidNewPass.setText("New Password must contain at least 8 characters, one digit, one letter, and one special character.");
            } else {
                if (!conpass.equals(newpass)) {
                    newPassTxt.setText("");
                    conNewPassTxt.setText("");
                    invalidConPass.setEnabled(true);
                    invalidConPass.setText("Passwords do not match.");
                } else {
                    Connection con = null;
                    PreparedStatement p = null;

                    try {
                        accountNumber = Integer.parseInt(accountNumberStr);
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                        con = DriverManager.getConnection("jdbc:ucanaccess://F:\\NetBeans\\HTS PROJECT FINAL\\HTS BANK\\banking.accdb");

                        // Update password in the Customer_details table
                        String updateQuery = "UPDATE Customer_details SET Password=? WHERE Account_Number=?";
                        p = con.prepareStatement(updateQuery);
                        p.setString(1, newpass);
                        p.setInt(2, accountNumber);
                        p.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Password has been changed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
                        // Add code for the next step after password change, if needed
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(PinChange.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        // Close the resources in the finally block
                        try {
                            if (p != null) {
                                p.close();
                            }
                            if (con != null) {
                                con.close();
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(PinChange.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        } else {
            invalidOldPass.setEnabled(true);
            invalidOldPass.setText("Old password does not match");
        }

    }//GEN-LAST:event_proceedBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        
        oldPassTxt.setText("");
        newPassTxt.setText("");
        conNewPassTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void newPassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private java.awt.TextField conNewPassTxt;
    private javax.swing.JLabel conPassLbl;
    private java.awt.Label invalidConPass;
    private java.awt.Label invalidNewPass;
    private java.awt.Label invalidOldPass;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel newPassLbl1;
    private java.awt.TextField newPassTxt;
    private javax.swing.JLabel oldPassLbl;
    private java.awt.TextField oldPassTxt;
    private javax.swing.JButton proceedBtn;
    // End of variables declaration//GEN-END:variables
}
