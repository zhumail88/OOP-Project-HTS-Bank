package javaapplication4;

//IMPORTS

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Account extends javax.swing.JFrame {

    Color Defaultcolor, ClickedColor1, ClickedColor2;

    public Account() {
        initComponents();
        setSize(1100, 700);
        setTitle("HTS BANKING - WELCOME TO YOUR ACCOUNT");
        Defaultcolor = new Color(97, 212, 195);
        ClickedColor1 = new Color(102, 153, 255);
        ClickedColor2 = new Color(204, 0, 255);

        transactionPanel.setBackground(Defaultcolor);
        PassPanel.setBackground(Defaultcolor);
        BillPanel.setBackground(Defaultcolor);
        accDetPanel.setBackground(Defaultcolor);

        // Create the desktop pane to hold internal frames
        JDesktopPane desktopPane = new JDesktopPane();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        HeadingLbl = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        signoutBtn = new javax.swing.JButton();
        BillPanel = new javax.swing.JPanel();
        billBtn = new javax.swing.JButton();
        PassPanel = new javax.swing.JPanel();
        passBtn = new javax.swing.JButton();
        transactionPanel = new javax.swing.JPanel();
        transactionBtn = new javax.swing.JButton();
        accDetPanel = new javax.swing.JPanel();
        accDetBtn = new javax.swing.JButton();
        DesktopPane = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(36, 47, 65));

        HeadingLbl.setBackground(new java.awt.Color(51, 255, 255));
        HeadingLbl.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        HeadingLbl.setForeground(new java.awt.Color(204, 204, 204));
        HeadingLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-dashboard-layout-48.png"))); // NOI18N
        HeadingLbl.setText("DASHBOARD");
        HeadingLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        HeadingLbl.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(HeadingLbl)
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(HeadingLbl)
                .addGap(21, 21, 21))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 120));

        jPanel8.setBackground(new java.awt.Color(97, 212, 195));

        signoutBtn.setBackground(new java.awt.Color(97, 212, 195));
        signoutBtn.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        signoutBtn.setText("SIGN-OUT");
        signoutBtn.setBorder(null);
        signoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutBtnActionPerformed(evt);
            }
        });

        BillPanel.setBackground(new java.awt.Color(97, 212, 195));
        BillPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BillPanelMousePressed(evt);
            }
        });

        billBtn.setBackground(new java.awt.Color(97, 212, 195));
        billBtn.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        billBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-bill-48.png"))); // NOI18N
        billBtn.setText("BILL PAYMENT");
        billBtn.setBorder(null);
        billBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billBtnMousePressed(evt);
            }
        });
        billBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BillPanelLayout = new javax.swing.GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BillPanelLayout.setVerticalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
        );

        PassPanel.setBackground(new java.awt.Color(97, 212, 195));
        PassPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassPanelMousePressed(evt);
            }
        });

        passBtn.setBackground(new java.awt.Color(97, 212, 195));
        passBtn.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        passBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-password-reset-48.png"))); // NOI18N
        passBtn.setText("PIN CHANGE");
        passBtn.setToolTipText("");
        passBtn.setBorder(null);
        passBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PassPanelLayout = new javax.swing.GroupLayout(PassPanel);
        PassPanel.setLayout(PassPanelLayout);
        PassPanelLayout.setHorizontalGroup(
            PassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PassPanelLayout.setVerticalGroup(
            PassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassPanelLayout.createSequentialGroup()
                .addComponent(passBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        transactionPanel.setBackground(new java.awt.Color(97, 212, 195));
        transactionPanel.setForeground(new java.awt.Color(255, 255, 255));
        transactionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transactionPanelMousePressed(evt);
            }
        });

        transactionBtn.setBackground(new java.awt.Color(97, 212, 195));
        transactionBtn.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        transactionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-transaction-48.png"))); // NOI18N
        transactionBtn.setText("TRANSACTION");
        transactionBtn.setBorder(null);
        transactionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transactionBtnMousePressed(evt);
            }
        });
        transactionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transactionPanelLayout = new javax.swing.GroupLayout(transactionPanel);
        transactionPanel.setLayout(transactionPanelLayout);
        transactionPanelLayout.setHorizontalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        transactionPanelLayout.setVerticalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        accDetPanel.setBackground(new java.awt.Color(97, 212, 195));
        accDetPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accDetPanelMousePressed(evt);
            }
        });

        accDetBtn.setBackground(new java.awt.Color(97, 212, 195));
        accDetBtn.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        accDetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-more-details-48.png"))); // NOI18N
        accDetBtn.setText("ACCOUNT DETAILS");
        accDetBtn.setToolTipText("");
        accDetBtn.setBorder(null);
        accDetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accDetBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accDetBtnMousePressed(evt);
            }
        });
        accDetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accDetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accDetPanelLayout = new javax.swing.GroupLayout(accDetPanel);
        accDetPanel.setLayout(accDetPanelLayout);
        accDetPanelLayout.setHorizontalGroup(
            accDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accDetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        accDetPanelLayout.setVerticalGroup(
            accDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accDetPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(accDetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addComponent(accDetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transactionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(accDetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(signoutBtn)
                .addGap(93, 93, 93))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 580));

        DesktopPane.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/FINAL.BANKINGLOGO.png"))); // NOI18N

        DesktopPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(94, 94, 94))
        );

        jPanel6.add(DesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 900, 580));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        getContentPane().add(jPanel1, "card2");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(97, 212, 195));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 540));

        jPanel4.setBackground(new java.awt.Color(97, 212, 195));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO YOUR ACCOUNT");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setAlignmentX(0.5F);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HTS BANK");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 110));

        getContentPane().add(jPanel2, "card3");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transactionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionBtnActionPerformed

    }//GEN-LAST:event_transactionBtnActionPerformed

    private void transactionBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionBtnMousePressed
        transactionBtn.setBackground(ClickedColor2);
        passBtn.setBackground(Defaultcolor);
        billBtn.setBackground(Defaultcolor);
        accDetBtn.setBackground(Defaultcolor);
    }//GEN-LAST:event_transactionBtnMousePressed

    private void PassPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassPanelMousePressed

    private void passBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passBtnMousePressed
        transactionBtn.setBackground(Defaultcolor);
        passBtn.setBackground(ClickedColor2);
        billBtn.setBackground(Defaultcolor);
        accDetBtn.setBackground(Defaultcolor);

    }//GEN-LAST:event_passBtnMousePressed

    private void transactionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionBtnMouseClicked
        HeadingLbl.setText("TRANSACTION");
        TRANSACTION tn = new TRANSACTION();
        DesktopPane.removeAll();
        DesktopPane.add(tn).setVisible(true);

    }//GEN-LAST:event_transactionBtnMouseClicked

    private void billBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billBtnActionPerformed

    private void transactionPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionPanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_transactionPanelMousePressed

    private void BillPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillPanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_BillPanelMousePressed

    private void billBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billBtnMousePressed

        transactionBtn.setBackground(Defaultcolor);
        passBtn.setBackground(Defaultcolor);
        billBtn.setBackground(ClickedColor1);
        accDetBtn.setBackground(Defaultcolor);

    }//GEN-LAST:event_billBtnMousePressed

    private void passBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passBtnMouseClicked
        HeadingLbl.setText("PIN CHANGE");
        PinChange pc = new PinChange();
        DesktopPane.removeAll();
        DesktopPane.add(pc).setVisible(true);
    }//GEN-LAST:event_passBtnMouseClicked

    private void billBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billBtnMouseClicked
        HeadingLbl.setText("BILL PAYMENT");
        BillPayment b1 = new BillPayment();
        DesktopPane.removeAll();
        DesktopPane.add(b1).setVisible(true);


    }//GEN-LAST:event_billBtnMouseClicked

    private void signoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutBtnActionPerformed
//       Account accountForm = new Account();
        dispose();
        MainPage mainPageForm = new MainPage();
        mainPageForm.setVisible(true);
    }//GEN-LAST:event_signoutBtnActionPerformed

    private void accDetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accDetBtnMouseClicked
        try {
            HeadingLbl.setText("ACCOUNT DETAILS");
            ClientDetails cd = new ClientDetails();
            DesktopPane.removeAll();
            DesktopPane.add(cd).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_accDetBtnMouseClicked

    private void accDetBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accDetBtnMousePressed
        // TODO add your handling code here:
        transactionBtn.setBackground(Defaultcolor);
        passBtn.setBackground(Defaultcolor);
        billBtn.setBackground(Defaultcolor);
        accDetBtn.setBackground(ClickedColor1);
    }//GEN-LAST:event_accDetBtnMousePressed

    private void accDetPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accDetPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_accDetPanelMousePressed

    private void accDetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accDetBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_accDetBtnActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillPanel;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JLabel HeadingLbl;
    private javax.swing.JPanel PassPanel;
    private javax.swing.JButton accDetBtn;
    private javax.swing.JPanel accDetPanel;
    private javax.swing.JButton billBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton passBtn;
    private javax.swing.JButton signoutBtn;
    private javax.swing.JButton transactionBtn;
    private javax.swing.JPanel transactionPanel;
    // End of variables declaration//GEN-END:variables
}
