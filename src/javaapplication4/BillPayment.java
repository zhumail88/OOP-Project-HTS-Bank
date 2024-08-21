package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javaapplication4.AccountNumberHolder.*;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class BillPayment extends javax.swing.JInternalFrame {

    String billtype;
    int billAmount;
    int AccountNumber = Integer.parseInt(getAccountNumber());

    public BillPayment() {
        initComponents();
        setSize(920, 640);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        billNumLbl = new javax.swing.JLabel();
        amountLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        proceedBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        InvalidBillNumber = new java.awt.Label();
        amountDisp = new javax.swing.JLabel();
        BillNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BillType = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        billNumLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        billNumLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-bill-64.png"))); // NOI18N
        billNumLbl.setText("BILL NUMBER:");

        amountLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        amountLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-amount-63.png"))); // NOI18N
        amountLbl.setText("AMOUNT: ");

        jSeparator1.setForeground(new java.awt.Color(242, 242, 242));

        jSeparator2.setForeground(new java.awt.Color(242, 242, 242));

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

        InvalidBillNumber.setForeground(new java.awt.Color(255, 0, 0));

        BillNumber.setBackground(new java.awt.Color(102, 153, 255));
        BillNumber.setBorder(null);
        BillNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BillNumberMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-bill-48 (1).png"))); // NOI18N
        jLabel1.setText("BILL TYPE:");

        BillType.setBackground(new java.awt.Color(102, 153, 255));
        BillType.setBorder(null);
        BillType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BillTypeMouseExited(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(amountLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amountDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvalidBillNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(billNumLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BillNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36)
                                .addComponent(BillType, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 324, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(billNumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BillNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(InvalidBillNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(BillType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(amountDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(amountLbl)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        BillNumber.setText("");
        InvalidBillNumber.setText("");
        amountDisp.setText("");
        BillType.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        String billNo = BillNumber.getText().trim();
        int billNumber = Integer.parseInt(billNo);

        Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Hp\\Downloads\\Java.Project.Incomplete\\JavaApplication4_COPY\\banking.accdb");
            con = DriverManager.getConnection("jdbc:ucanaccess://F:\\NetBeans\\HTS PROJECT FINAL\\HTS BANK\\banking.accdb");

            // Retrieve current account amount
            String accountQuery = "SELECT Amount FROM Customer_details WHERE Account_Number=?";
            p = con.prepareStatement(accountQuery);
            p.setInt(1, AccountNumber);
            rs = p.executeQuery();

            if (rs.next()) {
                int accountAmount = rs.getInt("Amount");
                if (accountAmount >= billAmount) {
                    int newBalance = accountAmount - billAmount;

                    JOptionPane.showMessageDialog(BillPayment.this, "Account Number: " + getAccountNumber() + "\nBill Type: " + billtype + "\nCurrent Balance: " + accountAmount + "\nBill Amount: " + billAmount + "\nNew Balance: " + newBalance);

                    // Update account amount
                    String accountUpdateQuery = "UPDATE Customer_details SET Amount=? WHERE Account_Number=?";
                    p = con.prepareStatement(accountUpdateQuery);
                    p.setInt(1, newBalance);
                    p.setInt(2, AccountNumber);
                    int rowsUpdatedAccount = p.executeUpdate();

                    // Update bill amount
                    String billUpdateQuery = "UPDATE BillsDue SET Bill_Amount = 0 WHERE Bill_Number = ?";
                    p = con.prepareStatement(billUpdateQuery);
                    p.setInt(1, billNumber);
                    int rowsUpdatedBill = p.executeUpdate();

                    if (rowsUpdatedAccount > 0 && rowsUpdatedBill > 0) {
                        System.out.println("Account amount and bill amount updated successfully.");
                    } else {
                        System.out.println("No rows updated. Account number or bill number not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(BillPayment.this, "You don't have enough amount to pay the bill");
                }
            } else {
                JOptionPane.showMessageDialog(BillPayment.this, "Account number not found.");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillPayment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BillPayment.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close the resources in a finally block to ensure they are always closed
            try {
                if (rs != null) {
                    rs.close();
                }
                if (p != null) {
                    p.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BillPayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_proceedBtnActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void BillNumberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillNumberMouseExited
        String billNo = BillNumber.getText().trim();
        if (!billNo.isEmpty()) {
            Connection con = null;
            PreparedStatement p = null;
            ResultSet rs = null;

            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//                con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Hp\\Downloads\\Java.Project.Incomplete\\JavaApplication4_COPY\\banking.accdb");
                 con = DriverManager.getConnection("jdbc:ucanaccess://F:\\NetBeans\\HTS PROJECT FINAL\\HTS BANK\\banking.accdb");
                String query = "SELECT * FROM BillsDue WHERE Bill_Number=? AND AccountNumber=?";
                p = con.prepareStatement(query);

                int billNumber = Integer.parseInt(billNo);
                // Assuming Bill_Number is an integer, use setInt instead of setString
                p.setInt(1, billNumber);
                p.setInt(2, AccountNumber);

                rs = p.executeQuery();

                if (rs.next()) {
                    billAmount = rs.getInt("Bill_Amount");
                    amountDisp.setText(String.valueOf(billAmount));
                    billtype = rs.getString("Bill_Type");
                    AccountNumberHolder.setAccountbilltype(billtype);
                    BillType.setText(getAccountbilltype());
                     InvalidBillNumber.setText("");
                } else {
                    InvalidBillNumber.setText("No data found");
                    amountDisp.setText("");
    BillType.setText("");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BillPayment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BillPayment.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                // Close the resources in a finally block to ensure they are always closed
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (p != null) {
                        p.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BillPayment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_BillNumberMouseExited

    private void BillTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTypeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTypeMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BillNumber;
    private javax.swing.JTextField BillType;
    private java.awt.Label InvalidBillNumber;
    private javax.swing.JLabel amountDisp;
    private javax.swing.JLabel amountLbl;
    private javax.swing.JLabel billNumLbl;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton proceedBtn;
    // End of variables declaration//GEN-END:variables
}
