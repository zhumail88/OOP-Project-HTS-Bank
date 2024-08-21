package javaapplication4;

//IMPORTS
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SignUP extends javax.swing.JFrame {

    int newAccountNumber;
    String gender;

    public SignUP() {
        initComponents();
        setSize(1100, 700);
        setTitle("HTS BANK - SIGN UP PAGE");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fNameLbl = new javax.swing.JLabel();
        conLbl = new javax.swing.JLabel();
        uNameLbl = new javax.swing.JLabel();
        lNameLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        genderLbl = new javax.swing.JLabel();
        conPassLbl = new javax.swing.JLabel();
        TermsChckBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        clearBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        signUpBtn = new javax.swing.JButton();
        fNameTxt = new javax.swing.JTextField();
        lNameTxt = new javax.swing.JTextField();
        uNameTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        invalidConfirmLbl = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        cnicLbl = new javax.swing.JLabel();
        conTxt = new javax.swing.JTextField();
        AgeTxt = new javax.swing.JTextField();
        MaleRBtn = new javax.swing.JRadioButton();
        FemaleRBtn = new javax.swing.JRadioButton();
        passTxt = new javax.swing.JPasswordField();
        jSeparator14 = new javax.swing.JSeparator();
        conPassTxt = new javax.swing.JPasswordField();
        showPassBtn = new javax.swing.JCheckBox();
        conPassBtn = new javax.swing.JCheckBox();
        jSeparator16 = new javax.swing.JSeparator();
        invalidLastNameLbl = new javax.swing.JLabel();
        invalidFirstNameLbl = new javax.swing.JLabel();
        invalidUserNameLbl = new javax.swing.JLabel();
        invalidCnicLbl = new javax.swing.JLabel();
        cnicTxt = new javax.swing.JTextField();
        invalidContactLbl = new javax.swing.JTextField();
        invalidAgeLbl = new javax.swing.JTextField();
        invalidPassLbl = new javax.swing.JTextField();

        jButton3.setBackground(new java.awt.Color(97, 212, 195));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/download.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));

        jLabel1.setBackground(new java.awt.Color(97, 212, 195));
        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN UP FORM");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/icons8-login-64.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        backBtn.setBackground(new java.awt.Color(97, 212, 195));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/download.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(36, 47, 65));

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Terms & Conditions");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(376, 376, 376)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel1))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1129, 119);

        fNameLbl.setBackground(new java.awt.Color(36, 47, 65));
        fNameLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        fNameLbl.setForeground(new java.awt.Color(204, 204, 204));
        fNameLbl.setText("First Name:");
        jPanel1.add(fNameLbl);
        fNameLbl.setBounds(200, 140, 76, 28);

        conLbl.setBackground(new java.awt.Color(36, 47, 65));
        conLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        conLbl.setForeground(new java.awt.Color(204, 204, 204));
        conLbl.setText("Contact:");
        jPanel1.add(conLbl);
        conLbl.setBounds(200, 500, 55, 28);

        uNameLbl.setBackground(new java.awt.Color(36, 47, 65));
        uNameLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        uNameLbl.setForeground(new java.awt.Color(204, 204, 204));
        uNameLbl.setText("User Name:");
        jPanel1.add(uNameLbl);
        uNameLbl.setBounds(200, 320, 78, 28);

        lNameLbl.setBackground(new java.awt.Color(36, 47, 65));
        lNameLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lNameLbl.setForeground(new java.awt.Color(204, 204, 204));
        lNameLbl.setText("Last Name:");
        jPanel1.add(lNameLbl);
        lNameLbl.setBounds(200, 230, 74, 28);

        ageLbl.setBackground(new java.awt.Color(36, 47, 65));
        ageLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(204, 204, 204));
        ageLbl.setText("Age:");
        jPanel1.add(ageLbl);
        ageLbl.setBounds(590, 140, 31, 28);

        passLbl.setBackground(new java.awt.Color(36, 47, 65));
        passLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        passLbl.setForeground(new java.awt.Color(204, 204, 204));
        passLbl.setText("Password:");
        jPanel1.add(passLbl);
        passLbl.setBounds(590, 320, 68, 28);

        genderLbl.setBackground(new java.awt.Color(36, 47, 65));
        genderLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        genderLbl.setForeground(new java.awt.Color(204, 204, 204));
        genderLbl.setText("Gender:");
        jPanel1.add(genderLbl);
        genderLbl.setBounds(590, 230, 53, 28);

        conPassLbl.setBackground(new java.awt.Color(36, 47, 65));
        conPassLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        conPassLbl.setForeground(new java.awt.Color(204, 204, 204));
        conPassLbl.setText("Confirm Password:");
        jPanel1.add(conPassLbl);
        conPassLbl.setBounds(590, 410, 126, 28);

        TermsChckBox.setBackground(new java.awt.Color(36, 47, 65));
        TermsChckBox.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        TermsChckBox.setForeground(new java.awt.Color(204, 204, 204));
        TermsChckBox.setText("Do you agree all the terms");
        TermsChckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TermsChckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(TermsChckBox);
        TermsChckBox.setBounds(590, 540, 250, 18);

        jPanel3.setBackground(new java.awt.Color(97, 212, 195));

        clearBtn.setBackground(new java.awt.Color(97, 212, 195));
        clearBtn.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(null);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(clearBtn)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(560, 610, 70, 30);

        jPanel4.setBackground(new java.awt.Color(97, 212, 195));

        signUpBtn.setBackground(new java.awt.Color(97, 212, 195));
        signUpBtn.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("SIGN UP");
        signUpBtn.setBorder(null);
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(signUpBtn)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(410, 610, 77, 30);

        fNameTxt.setBackground(new java.awt.Color(36, 47, 65));
        fNameTxt.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        fNameTxt.setForeground(new java.awt.Color(204, 204, 204));
        fNameTxt.setBorder(null);
        fNameTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        fNameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(fNameTxt);
        fNameTxt.setBounds(200, 170, 211, 30);

        lNameTxt.setBackground(new java.awt.Color(36, 47, 65));
        lNameTxt.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lNameTxt.setForeground(new java.awt.Color(204, 204, 204));
        lNameTxt.setBorder(null);
        lNameTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(lNameTxt);
        lNameTxt.setBounds(200, 260, 211, 30);

        uNameTxt.setBackground(new java.awt.Color(36, 47, 65));
        uNameTxt.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        uNameTxt.setForeground(new java.awt.Color(204, 204, 204));
        uNameTxt.setBorder(null);
        uNameTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        uNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(uNameTxt);
        uNameTxt.setBounds(200, 350, 211, 30);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(200, 220, 211, 3);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(200, 310, 211, 3);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(200, 400, 211, 3);

        invalidConfirmLbl.setBackground(new java.awt.Color(36, 47, 65));
        invalidConfirmLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invalidConfirmLbl.setForeground(new java.awt.Color(255, 51, 51));
        invalidConfirmLbl.setBorder(null);
        invalidConfirmLbl.setEnabled(false);
        invalidConfirmLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invalidConfirmLblActionPerformed(evt);
            }
        });
        jPanel1.add(invalidConfirmLbl);
        invalidConfirmLbl.setBounds(590, 470, 290, 20);

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(200, 490, 211, 3);

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(590, 220, 211, 3);

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(200, 580, 211, 3);

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(590, 400, 310, 3);

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(590, 490, 310, 3);

        cnicLbl.setBackground(new java.awt.Color(36, 47, 65));
        cnicLbl.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        cnicLbl.setForeground(new java.awt.Color(204, 204, 204));
        cnicLbl.setText("CNIC:");
        jPanel1.add(cnicLbl);
        cnicLbl.setBounds(200, 410, 37, 28);

        conTxt.setBackground(new java.awt.Color(36, 47, 65));
        conTxt.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        conTxt.setForeground(new java.awt.Color(204, 204, 204));
        conTxt.setBorder(null);
        conTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        conTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conTxtActionPerformed(evt);
            }
        });
        jPanel1.add(conTxt);
        conTxt.setBounds(200, 530, 211, 30);

        AgeTxt.setBackground(new java.awt.Color(36, 47, 65));
        AgeTxt.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        AgeTxt.setForeground(new java.awt.Color(204, 204, 204));
        AgeTxt.setBorder(null);
        AgeTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(AgeTxt);
        AgeTxt.setBounds(590, 170, 218, 30);

        MaleRBtn.setBackground(new java.awt.Color(36, 47, 65));
        buttonGroup1.add(MaleRBtn);
        MaleRBtn.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        MaleRBtn.setForeground(new java.awt.Color(204, 204, 204));
        MaleRBtn.setText("MALE");
        MaleRBtn.setBorder(null);
        MaleRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRBtnActionPerformed(evt);
            }
        });
        jPanel1.add(MaleRBtn);
        MaleRBtn.setBounds(630, 260, 58, 30);

        FemaleRBtn.setBackground(new java.awt.Color(36, 47, 65));
        buttonGroup1.add(FemaleRBtn);
        FemaleRBtn.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        FemaleRBtn.setForeground(new java.awt.Color(204, 204, 204));
        FemaleRBtn.setText("FEMALE");
        FemaleRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRBtnActionPerformed(evt);
            }
        });
        jPanel1.add(FemaleRBtn);
        FemaleRBtn.setBounds(710, 260, 90, 33);

        passTxt.setBackground(new java.awt.Color(36, 47, 65));
        passTxt.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setBorder(null);
        passTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passTxt);
        passTxt.setBounds(590, 350, 260, 30);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(590, 310, 211, 3);

        conPassTxt.setBackground(new java.awt.Color(36, 47, 65));
        conPassTxt.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        conPassTxt.setForeground(new java.awt.Color(204, 204, 204));
        conPassTxt.setBorder(null);
        conPassTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        conPassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conPassTxtActionPerformed(evt);
            }
        });
        jPanel1.add(conPassTxt);
        conPassTxt.setBounds(590, 440, 280, 30);

        showPassBtn.setBackground(new java.awt.Color(36, 47, 65));
        showPassBtn.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        showPassBtn.setForeground(new java.awt.Color(204, 204, 204));
        showPassBtn.setText("Show Password");
        showPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassBtnActionPerformed(evt);
            }
        });
        jPanel1.add(showPassBtn);
        showPassBtn.setBounds(880, 350, 130, 27);

        conPassBtn.setBackground(new java.awt.Color(36, 47, 65));
        conPassBtn.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        conPassBtn.setForeground(new java.awt.Color(204, 204, 204));
        conPassBtn.setText("Show Password");
        conPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conPassBtnActionPerformed(evt);
            }
        });
        jPanel1.add(conPassBtn);
        conPassBtn.setBounds(880, 430, 130, 32);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(590, 570, 201, 3);

        invalidLastNameLbl.setForeground(new java.awt.Color(255, 51, 51));
        invalidLastNameLbl.setEnabled(false);
        jPanel1.add(invalidLastNameLbl);
        invalidLastNameLbl.setBounds(200, 290, 210, 20);

        invalidFirstNameLbl.setForeground(new java.awt.Color(255, 51, 51));
        invalidFirstNameLbl.setEnabled(false);
        jPanel1.add(invalidFirstNameLbl);
        invalidFirstNameLbl.setBounds(200, 200, 210, 20);

        invalidUserNameLbl.setForeground(new java.awt.Color(255, 51, 51));
        invalidUserNameLbl.setEnabled(false);
        jPanel1.add(invalidUserNameLbl);
        invalidUserNameLbl.setBounds(190, 380, 340, 20);

        invalidCnicLbl.setForeground(new java.awt.Color(255, 51, 51));
        invalidCnicLbl.setEnabled(false);
        jPanel1.add(invalidCnicLbl);
        invalidCnicLbl.setBounds(200, 470, 210, 20);

        cnicTxt.setBackground(new java.awt.Color(36, 47, 65));
        cnicTxt.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        cnicTxt.setForeground(new java.awt.Color(204, 204, 204));
        cnicTxt.setBorder(null);
        cnicTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        cnicTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicTxtActionPerformed(evt);
            }
        });
        jPanel1.add(cnicTxt);
        cnicTxt.setBounds(200, 440, 211, 30);

        invalidContactLbl.setBackground(new java.awt.Color(36, 47, 65));
        invalidContactLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invalidContactLbl.setForeground(new java.awt.Color(255, 51, 51));
        invalidContactLbl.setBorder(null);
        invalidContactLbl.setEnabled(false);
        invalidContactLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invalidContactLblActionPerformed(evt);
            }
        });
        jPanel1.add(invalidContactLbl);
        invalidContactLbl.setBounds(200, 560, 220, 20);

        invalidAgeLbl.setBackground(new java.awt.Color(36, 47, 65));
        invalidAgeLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invalidAgeLbl.setForeground(new java.awt.Color(255, 0, 0));
        invalidAgeLbl.setBorder(null);
        invalidAgeLbl.setEnabled(false);
        invalidAgeLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invalidAgeLblActionPerformed(evt);
            }
        });
        jPanel1.add(invalidAgeLbl);
        invalidAgeLbl.setBounds(590, 200, 250, 20);

        invalidPassLbl.setBackground(new java.awt.Color(36, 47, 65));
        invalidPassLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invalidPassLbl.setForeground(new java.awt.Color(255, 51, 51));
        invalidPassLbl.setBorder(null);
        invalidPassLbl.setEnabled(false);
        jPanel1.add(invalidPassLbl);
        invalidPassLbl.setBounds(590, 380, 300, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TermsChckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TermsChckBoxActionPerformed

    }//GEN-LAST:event_TermsChckBoxActionPerformed

    private void fNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTxtActionPerformed

    private void conTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conTxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MainPage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //THIS TAKE YOU BACK TO THE MAIN PAGE
        dispose();
        new MainPage().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void showPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassBtnActionPerformed
        if (showPassBtn.isSelected()) {
            passTxt.setEchoChar((char) 0);
        } else {
            passTxt.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_showPassBtnActionPerformed

    private void conPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conPassBtnActionPerformed
        if (conPassBtn.isSelected()) {
            conPassTxt.setEchoChar((char) 0);
        } else {
            conPassTxt.setEchoChar('\u2022');
        }

    }//GEN-LAST:event_conPassBtnActionPerformed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void MaleRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRBtnActionPerformed

    }//GEN-LAST:event_MaleRBtnActionPerformed

    private void FemaleRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleRBtnActionPerformed
    private void clearForm() {
        //THIS METHOD CLEARS THE FORM 
        fNameTxt.setText("");
        lNameTxt.setText("");
        invalidConfirmLbl.setText("");
        uNameTxt.setText("");
        conTxt.setText("");
        cnicTxt.setText("");
        AgeTxt.setText("");
        passTxt.setText("");
        conPassTxt.setText("");
        TermsChckBox.setSelected(false);
        invalidFirstNameLbl.setText("");
        invalidLastNameLbl.setText("");
        invalidUserNameLbl.setText("");
        invalidCnicLbl.setText("");
        invalidContactLbl.setText("");
        invalidAgeLbl.setText("");
        invalidPassLbl.setText("");
        invalidConfirmLbl.setText("");

    }
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        //CALLING THE CLEAR FORM METHOD
        clearForm();
    }//GEN-LAST:event_clearBtnActionPerformed

    private boolean checkFields() {
        //FIRST OFF WE ARE RETREVING VALUES FORM THE TEXT FEILDS AND CHECK BOXES
        String fname = fNameTxt.getText();
        String lname = lNameTxt.getText();
        String username = uNameTxt.getText();
        String conText = conTxt.getText();
        String cnic = cnicTxt.getText();
        String age = AgeTxt.getText();
        String password = new String(passTxt.getPassword());
        String conPass = new String(conPassTxt.getPassword());

        //THIS CHECKS WHETER ANY FEILD IS EMPTY AND RETURNS A BOOLEAN VALUE 
        //IF EVERTHING IS FILLED AND NOTHING IS LEFT EMPTY IT RETURNS TRUE
        boolean isfnameEmpty = fname.isEmpty();
        boolean islnameEmpty = lname.isEmpty();
        boolean isUsernameEmpty = username.isEmpty();
        boolean isconTextEmpty = conText.isEmpty();
        boolean iscnicTextEmpty = cnic.isEmpty();
        boolean isageEmpty = age.isEmpty();
        boolean ispasswordEmpty = password.isEmpty();
        boolean isconPasswordEmpty = conPass.isEmpty();
        boolean isCheckBoxSelected = TermsChckBox.isSelected();

        if (!isfnameEmpty && !islnameEmpty && !isUsernameEmpty && !isconTextEmpty && !iscnicTextEmpty && !isageEmpty && !ispasswordEmpty && !isconPasswordEmpty && !isCheckBoxSelected) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkUsernameExists(String username) {
        //THIS METHOD CHECKS WHETER THE USERNAME ALREADY EXISTS OR NOT
        boolean exists = false;
        Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://F:\\NetBeans\\HTS PROJECT FINAL\\HTS BANK\\banking.accdb");
            String query = "SELECT User_Name FROM Customer_details WHERE User_Name = ?";
            p = con.prepareStatement(query);
            p.setString(1, username);
            rs = p.executeQuery();
            if (rs.next()) {
                exists = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, e);
        } finally {
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
            } catch (SQLException e) {
                Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return exists;
    }
    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // CHECK IF ALL REQUIRED FIELDS ARE FILLED
        if (checkFields()) {
            // SHOW WARNING MESSAGE IF ANY REQUIRED FIELD IS EMPTY
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Incomplete Form", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean isValid = true; // FLAG TO INDICATE IF THE FORM IS VALID

// RETRIEVE INPUT VALUES
        String fname = fNameTxt.getText();
        String lname = lNameTxt.getText();
        String username = uNameTxt.getText();
        String cnic = cnicTxt.getText();
        String conText = conTxt.getText();
        String ageStr = AgeTxt.getText();

        String password = new String(passTxt.getPassword());
        String conPass = new String(conPassTxt.getPassword());

        int amount = 0;

        String gender = ""; // VARIABLE TO STORE THE SELECTED GENDER

// RETRIEVE GENDER FROM RADIO BUTTONS
        Enumeration<AbstractButton> buttons = buttonGroup1.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                gender = button.getText();
                break;
            }
        }

// VALIDATE FIRST NAME
        if (fname.isEmpty()) {
            fNameTxt.setText("");
            invalidFirstNameLbl.setEnabled(true);
            invalidFirstNameLbl.setText("First name is required");
            isValid = false;
        } else if (fname.matches(".*\\d.*")) {
            fNameTxt.setText("");
            invalidFirstNameLbl.setEnabled(true);
            invalidFirstNameLbl.setText("Invalid first name");
            isValid = false;
        } else {
            invalidFirstNameLbl.setEnabled(false);
            invalidFirstNameLbl.setText("");
        }

// VALIDATE LAST NAME
        if (lname.isEmpty()) {
            lNameTxt.setText("");
            invalidLastNameLbl.setEnabled(true);
            invalidLastNameLbl.setText("Last name is required");
            isValid = false;
        } else if (lname.matches(".*\\d.*")) {
            lNameTxt.setText("");
            invalidLastNameLbl.setEnabled(true);
            invalidLastNameLbl.setText("Invalid last name");
            isValid = false;
        } else {
            invalidLastNameLbl.setEnabled(false);
            invalidLastNameLbl.setText("");
        }

// VALIDATE USERNAME
if (username.isEmpty()) {
    uNameTxt.setText("");
    invalidUserNameLbl.setEnabled(true);
    invalidUserNameLbl.setText("Username is required");
    isValid = false;
} else if (!username.matches(".*\\d.*") || !username.matches(".*[^a-zA-Z0-9].*")) {
    uNameTxt.setText("");
    invalidUserNameLbl.setEnabled(true);
    invalidUserNameLbl.setText("Username must contain both a number and a special character");
    isValid = false;
} else {
    invalidUserNameLbl.setEnabled(false);
    invalidUserNameLbl.setText("");
}

// VALIDATES WHETHER THE USERNAME ALREADY EXISTS OR NOT
boolean usernameExists = checkUsernameExists(username);
if (usernameExists) {
    uNameTxt.setText("");
    invalidUserNameLbl.setEnabled(true);
    invalidUserNameLbl.setText("Username already exists.");
    isValid = false;
} else {
    if (username.isEmpty()) {
        invalidUserNameLbl.setEnabled(true);
        invalidUserNameLbl.setText("Username is required");
        isValid = false;
    } else if (!username.matches(".*\\d.*") || !username.matches(".*[^a-zA-Z0-9].*")) {
        invalidUserNameLbl.setEnabled(true);
        invalidUserNameLbl.setText("Username must contain both a number and a special character");
        isValid = false;
    } else {
        invalidUserNameLbl.setEnabled(false);
        invalidUserNameLbl.setText("");
    }
}




// VALIDATE CNIC NUMBER
        if (cnic.length() != 13 || !cnic.matches("^[1-9][0-9]{12}$")) {
            cnicTxt.setText("");
            invalidCnicLbl.setEnabled(true);
            invalidCnicLbl.setText("Invalid CNIC number");
            isValid = false;
        } else {
            invalidCnicLbl.setEnabled(false);
            invalidCnicLbl.setText("");
        }

// VALIDATE CONTACT NUMBER
        if (conText.length() != 11 || !conText.matches("\\d+")) {
            conTxt.setText("");
            invalidContactLbl.setEnabled(true);
            invalidContactLbl.setText("Contact number must be 11 digits");
            isValid = false;
        } else {
            invalidContactLbl.setEnabled(false);
            invalidContactLbl.setText("");
        }

        try {
            // VALIDATE AGE
            if (ageStr == null || ageStr.isEmpty()) {
                // Age field is empty
                AgeTxt.setText("");
                invalidAgeLbl.setEnabled(true);
                invalidAgeLbl.setText("Age must be a number");
                isValid = false;
            } else {
                int age = Integer.parseInt(ageStr);
                if (age >= 70 || age < 18) {
                    AgeTxt.setText("");
                    invalidAgeLbl.setEnabled(true);
                    invalidAgeLbl.setText("Age limit 18-70");
                    isValid = false;
                } else {
                    invalidAgeLbl.setEnabled(false);
                    invalidAgeLbl.setText("");
                }
            }
        } catch (NumberFormatException e) {
            AgeTxt.setText("");
            invalidAgeLbl.setEnabled(true);
            invalidAgeLbl.setText("Age must be a number");
            isValid = false;
        }

// VALIDATE PASSWORD
        if (password.length() < 8 || !password.matches(".*\\d.*") || !password.matches(".*[a-zA-Z].*")) {
            passTxt.setText("");
            conPassTxt.setText("");
            invalidPassLbl.setEnabled(true);
            invalidPassLbl.setText("Password must be at least 8 characters long and contain both letters and numbers.");
            isValid = false;
        } else if (!password.equals(conPass)) {
            passTxt.setText("");
            conPassTxt.setText("");
            invalidConfirmLbl.setEnabled(true);
            invalidConfirmLbl.setText("Passwords do not match.");
            isValid = false;
        } else {
            invalidPassLbl.setEnabled(false);
            invalidConfirmLbl.setEnabled(false);
            invalidPassLbl.setText("");
            invalidConfirmLbl.setText("");
        }

// IF THE FORM IS VALID, PROCEED WITH ACCOUNT CREATION
        if (isValid) {
            Connection con = null;
            PreparedStatement p = null;
            ResultSet rs;

            try {
                // ESTABLISH DATABASE CONNECTION
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://F:\\NetBeans\\HTS PROJECT FINAL\\HTS BANK\\banking.accdb");

                // RETRIEVE THE MAXIMUM ACCOUNT NUMBER
                String q = "SELECT MAX(Account_Number) FROM Customer_details";
                int currentMaxAccountNumber = 0;
                p = con.prepareStatement(q);
                rs = p.executeQuery();
                p.close();
                if (rs.next()) {
                    currentMaxAccountNumber = rs.getInt(1);
                }
                rs.close();
                newAccountNumber = currentMaxAccountNumber + 1;
                System.out.println("New account number: " + newAccountNumber);

                try {
                    // INSERT NEW CUSTOMER DETAILS INTO THE DATABASE
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:\\NetBeans\\HTS PROJECT FINAL\\HTS BANK\\banking.accdb");
                    String query = "INSERT INTO Customer_details ([First_Name],Last_Name,User_Name,CNIC,Contact,Age,Gender,Password,Account_Number,Amount) VALUES (?,?,?,?,?,?,?,?,?,?)";
                    p = con.prepareStatement(query);
                    p.setString(1, fname);
                    p.setString(2, lname);
                    p.setString(3, username);
                    p.setString(4, cnic);
                    p.setString(5, conText);
                    p.setString(6, ageStr);
                    p.setString(7, gender);
                    p.setString(8, password);
                    p.setInt(9, newAccountNumber);
                    p.setInt(10, amount);

                    p.executeUpdate();
                    p.close();

                    // SHOW SUCCESS MESSAGE AND CLEAR FORM
                    JOptionPane.showMessageDialog(this, "Your account has been created.\nYour New Account Number = " + newAccountNumber + "\nProceed to the Login page and log in to your new account.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearForm();
                    dispose();
                    new MainPage().setVisible(true);
                } catch (ClassNotFoundException | SQLException e) {
                    // HANDLE DATABASE ERRORS AND ROLLBACK TRANSACTION
                    Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, e);
                    if (con != null) {
                        try {
                            con.rollback();
                        } catch (SQLException ec) {
                            ec.printStackTrace();
                        }
                    }
                } finally {
                    // CLOSE DATABASE CONNECTION AND STATEMENTS
                    try {
                        if (p != null) {
                            p.close();
                        }

                        if (con != null) {
                            con.close();
                        }
                    } catch (SQLException e) {
                        Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // SHOW ERROR MESSAGE FOR INVALID FORM
            JOptionPane.showMessageDialog(this, "Please fix the errors in the form and try again.", "Invalid Form", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_signUpBtnActionPerformed

    private void conPassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conPassTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conPassTxtActionPerformed

    private void invalidConfirmLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invalidConfirmLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invalidConfirmLblActionPerformed

    private void invalidContactLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invalidContactLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invalidContactLblActionPerformed

    private void invalidAgeLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invalidAgeLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invalidAgeLblActionPerformed

    private void cnicTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnicTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new TermsCondition().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUP().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JRadioButton FemaleRBtn;
    private javax.swing.JRadioButton MaleRBtn;
    private javax.swing.JCheckBox TermsChckBox;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel cnicLbl;
    private javax.swing.JTextField cnicTxt;
    private javax.swing.JLabel conLbl;
    private javax.swing.JCheckBox conPassBtn;
    private javax.swing.JLabel conPassLbl;
    private javax.swing.JPasswordField conPassTxt;
    private javax.swing.JTextField conTxt;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JTextField invalidAgeLbl;
    private javax.swing.JLabel invalidCnicLbl;
    private javax.swing.JTextField invalidConfirmLbl;
    private javax.swing.JTextField invalidContactLbl;
    private javax.swing.JLabel invalidFirstNameLbl;
    private javax.swing.JLabel invalidLastNameLbl;
    private javax.swing.JTextField invalidPassLbl;
    private javax.swing.JLabel invalidUserNameLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JTextField lNameTxt;
    private javax.swing.JLabel passLbl;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JCheckBox showPassBtn;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JLabel uNameLbl;
    private javax.swing.JTextField uNameTxt;
    // End of variables declaration//GEN-END:variables
}
