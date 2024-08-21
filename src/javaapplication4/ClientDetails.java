package javaapplication4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication4.AccountNumberHolder.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ClientDetails extends javax.swing.JInternalFrame {

    int AccountNumber = Integer.parseInt(getAccountNumber());

    public ClientDetails() throws ClassNotFoundException, SQLException {
        initComponents();
        setSize(920, 640);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        fNameLbl.setText(getAccountFirstName());
        lNameLbl.setText(getAccountLastName());
        uNameLbl.setText(getAccountUserName());
        cnicLbl.setText(getAccountCNIC());
        genderLbl.setText(getAccountGender()); 
        conLbl.setText("0"+getAccountContact());
        ageLbl.setText(getAccountAge());
        accNumLbl.setText(getAccountNumber());

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

// Execute the query
            rs = p.executeQuery();

            if (rs.next()) {
                String accountAmount = rs.getString("Amount");
                Balancelbl.setText(accountAmount+" Rs/-");
            } else {
                // Handle the case where no results were found
                Balancelbl.setText("N/A");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        accNumLbl1 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fNameLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lNameLbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        uNameLbl = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        accNumLbl = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        conLbl = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        ageLbl = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Balancelbl = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        genderLbl = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        cnicLbl = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel11.setText("ACCOUNT NUMBER:");

        jLabel12.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel2");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel10.setText("ACCOUNT NUMBER:");

        accNumLbl1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        accNumLbl1.setForeground(new java.awt.Color(255, 255, 255));
        accNumLbl1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel1.setText("FIRST NAME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 60, 80, 25);

        fNameLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        fNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        fNameLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(fNameLbl);
        fNameLbl.setBounds(240, 60, 160, 30);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(240, 100, 160, 20);

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel3.setText("LAST NAME:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(520, 60, 77, 25);

        lNameLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        lNameLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(lNameLbl);
        lNameLbl.setBounds(620, 60, 146, 30);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(620, 100, 146, 10);

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel5.setText("USER NAME:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 130, 77, 25);

        uNameLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        uNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        uNameLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(uNameLbl);
        uNameLbl.setBounds(240, 120, 159, 31);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(240, 170, 159, 10);

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel7.setText("ACCOUNT NUMBER:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 130, 124, 25);

        accNumLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        accNumLbl.setForeground(new java.awt.Color(255, 255, 255));
        accNumLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(accNumLbl);
        accNumLbl.setBounds(620, 120, 146, 30);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(620, 170, 146, 10);

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-phone-48.png"))); // NOI18N
        jLabel9.setText("CONTACT:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 330, 117, 38);

        conLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        conLbl.setForeground(new java.awt.Color(255, 255, 255));
        conLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(conLbl);
        conLbl.setBounds(140, 330, 162, 30);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(140, 370, 162, 20);

        ageLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(255, 255, 255));
        ageLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(ageLbl);
        ageLbl.setBounds(440, 330, 150, 30);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(440, 370, 150, 20);

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-age-48.png"))); // NOI18N
        jLabel14.setText("AGE:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(350, 330, 81, 44);

        jLabel15.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-bank-48.png"))); // NOI18N
        jLabel15.setText("BALANCE:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(490, 450, 114, 40);

        Balancelbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        Balancelbl.setForeground(new java.awt.Color(255, 255, 255));
        Balancelbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(Balancelbl);
        Balancelbl.setBounds(650, 450, 170, 30);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(650, 490, 170, 10);

        jButton1.setBackground(new java.awt.Color(97, 212, 195));
        jButton1.setFont(new java.awt.Font("Myanmar Text", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Click to update phone number");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 380, 148, 20);

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel8.setText("GENDER:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(650, 330, 60, 25);

        genderLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        genderLbl.setForeground(new java.awt.Color(255, 255, 255));
        genderLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(genderLbl);
        genderLbl.setBounds(720, 330, 146, 30);

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(720, 370, 146, 20);

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel13.setText("CNIC:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 450, 34, 25);

        cnicLbl.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        cnicLbl.setForeground(new java.awt.Color(255, 255, 255));
        cnicLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(cnicLbl);
        cnicLbl.setBounds(210, 450, 190, 30);

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(0, 230, 950, 20);

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(210, 490, 190, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String newContactNumber = JOptionPane.showInputDialog(null, "Enter the new contact number:");

        if (newContactNumber != null && newContactNumber.length() == 11) {
            Connection con = null;
            PreparedStatement p = null;

            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://F:\\NetBeans\\HTS PROJECT FINAL\\HTS BANK\\banking.accdb");

                String query = "UPDATE Customer_details SET Contact=? WHERE Account_Number=?";
                p = con.prepareStatement(query);

                // Set the new contact number
                p.setString(1, newContactNumber);

                // Set the AccountNumber condition
                p.setInt(2, AccountNumber); // Assuming AccountNumber is already defined

                int rowsUpdated = p.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Contact number updated successfully!");
                    conLbl.setText(newContactNumber);
                } else {
                    JOptionPane.showMessageDialog(null, "No data found or update failed!");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClientDetails.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ClientDetails.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                // Close the resources in a finally block to ensure they are always closed
                try {
                    if (p != null) {
                        p.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ClientDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid contact number! Contact number should be exactly 11 characters long.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balancelbl;
    private javax.swing.JLabel accNumLbl;
    private javax.swing.JLabel accNumLbl1;
    private javax.swing.JLabel ageLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cnicLbl;
    private javax.swing.JLabel conLbl;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JLabel uNameLbl;
    // End of variables declaration//GEN-END:variables
}
