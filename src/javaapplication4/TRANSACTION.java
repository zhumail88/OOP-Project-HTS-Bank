package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication4.AccountNumberHolder.getAccountNumber;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TRANSACTION extends javax.swing.JInternalFrame {

    String AccountNumber = getAccountNumber();
    public TRANSACTION() {
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
        senderAccLbl = new javax.swing.JLabel();
        amountLbl = new javax.swing.JLabel();
        receiverAccNumTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        amountTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        proceedBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 530));

        jPanel1.setBackground(new java.awt.Color(204, 0, 255));

        senderAccLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        senderAccLbl.setForeground(new java.awt.Color(255, 204, 204));
        senderAccLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-visa-48.png"))); // NOI18N
        senderAccLbl.setText("RECEIVER ACCOUNT NUMBER: ");

        amountLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        amountLbl.setForeground(new java.awt.Color(255, 204, 204));
        amountLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-amount-63.png"))); // NOI18N
        amountLbl.setText("AMOUNT: ");

        receiverAccNumTxt.setBackground(new java.awt.Color(204, 0, 255));
        receiverAccNumTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        receiverAccNumTxt.setForeground(new java.awt.Color(255, 255, 255));
        receiverAccNumTxt.setBorder(null);
        receiverAccNumTxt.setCaretColor(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(242, 242, 242));

        amountTxt.setBackground(new java.awt.Color(204, 0, 255));
        amountTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amountTxt.setForeground(new java.awt.Color(255, 255, 255));
        amountTxt.setBorder(null);
        amountTxt.setCaretColor(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senderAccLbl)
                    .addComponent(amountLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 408, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(receiverAccNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(senderAccLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(receiverAccNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(amountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );

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

        String senderAccNum = AccountNumber;
        String receiverAccNum = receiverAccNumTxt.getText(); // Assuming the label contains the receiver's account number
        int amountToSend = Integer.parseInt(amountTxt.getText());

        if (amountToSend < 50 || amountToSend > 25000) {
            JOptionPane.showMessageDialog(null, "Invalid amount! Amount should be between 50 and 25000.");
        } else if (senderAccNum.equals(receiverAccNum)) {
            JOptionPane.showMessageDialog(null, "Cannot send money to your own account!");
        } else {
            Connection con = null;
            PreparedStatement senderStmt = null;
            PreparedStatement receiverStmt = null;
            ResultSet senderRs = null;
            ResultSet receiverRs = null;

            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://F:\\NetBeans\\HTS PROJECT FINAL\\HTS BANK\\banking.accdb");

                // Disable auto-commit
                con.setAutoCommit(false);

                // Check sender's account balance
                String senderQuery = "SELECT * FROM Customer_Details WHERE Account_Number=?";
                senderStmt = con.prepareStatement(senderQuery);
                senderStmt.setString(1, senderAccNum);
                senderRs = senderStmt.executeQuery();

                if (senderRs.next()) {
                    int senderCurrentAmount = senderRs.getInt("Amount");

                    if (senderCurrentAmount >= amountToSend) {
                        // Sufficient balance to send money

                        // Update sender's account balance
                        int senderNewAmount = senderCurrentAmount - amountToSend;
                        String senderUpdateQuery = "UPDATE Customer_Details SET Amount=? WHERE Account_Number=?";
                        senderStmt = con.prepareStatement(senderUpdateQuery);
                        senderStmt.setInt(1, senderNewAmount);
                        senderStmt.setString(2, senderAccNum);
                        senderStmt.executeUpdate();

                        // Update receiver's account balance
                        String receiverQuery = "SELECT * FROM Customer_Details WHERE Account_Number=?";
                        receiverStmt = con.prepareStatement(receiverQuery);
                        receiverStmt.setString(1, receiverAccNum);
                        receiverRs = receiverStmt.executeQuery();

                        if (receiverRs.next()) {
                            int receiverCurrentAmount = receiverRs.getInt("Amount");
                            int receiverNewAmount = receiverCurrentAmount + amountToSend;

                            String receiverUpdateQuery = "UPDATE Customer_Details SET Amount=? WHERE Account_Number=?";
                            receiverStmt = con.prepareStatement(receiverUpdateQuery);
                            receiverStmt.setInt(1, receiverNewAmount);
                            receiverStmt.setString(2, receiverAccNum);
                            receiverStmt.executeUpdate();

                            // Commit the transaction
                            con.commit();

                            JOptionPane.showMessageDialog(null, "Money sent successfully!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Receiver's Account Number not found!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient balance in sender's account!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sender's Account Number not found!");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                // Rollback the transaction in case of an exception
                if (con != null) {
                    try {
                        con.rollback();
                    } catch (SQLException rollbackEx) {
                        // Handle rollback exception
                    }
                }

                Logger.getLogger(TRANSACTION.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                // Close the resources in a finally block to ensure they are always closed
                try {
                    if (senderRs != null) {
                        senderRs.close();
                    }
                    if (senderStmt != null) {
                        senderStmt.close();
                    }
                    if (receiverRs != null) {
                        receiverRs.close();
                    }
                    if (receiverStmt != null) {
                        receiverStmt.close();
                    }
                    if (con != null) {
                        // Enable auto-commit before closing the connection
                        try {
                            con.setAutoCommit(true);
                        } catch (SQLException autoCommitEx) {
                            // Handle auto-commit enabling exception
                        }

                        con.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TRANSACTION.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        receiverAccNumTxt.setText("");
        amountTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLbl;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JTextField receiverAccNumTxt;
    private javax.swing.JLabel senderAccLbl;
    // End of variables declaration//GEN-END:variables
}
