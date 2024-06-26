/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.gui;

import dao.ConnectionProvider;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DELL
 */
public class User extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-z-A-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    public int checkUsername = 0;

    /**
     * Creates new form AddUser
     */
    public User() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel model = (DefaultTableModel) userTbl.getModel();
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM app_user");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("userId"), rs.getString("name"), rs.getString("userRole"), rs.getString("dob"), rs.getString("mobileNumber"), rs.getString("email"), rs.getString("username"), rs.getString("password"), rs.getString("address")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        userroleCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dobDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        mobilenumberTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        addUserBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTbl = new javax.swing.JTable();
        updateUserBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        usernamesearchTxt = new javax.swing.JTextField();
        serachBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Role");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 255, 300, -1));

        userroleCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userroleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pharmacist", " " }));
        userroleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userroleComboActionPerformed(evt);
            }
        });
        getContentPane().add(userroleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 279, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 320, 300, -1));

        nameTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 355, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date of Birth(DOB)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 396, 300, -1));

        dobDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(dobDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 431, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mobile Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 473, 300, -1));

        mobilenumberTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mobilenumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 508, 300, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 255, 300, -1));

        emailTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 279, 300, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Username");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 320, 300, -1));

        usernameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTxtKeyReleased(evt);
            }
        });
        getContentPane().add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 355, 300, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 396, 300, -1));

        passwordTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 432, 300, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Address");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 473, 300, -1));

        addressTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 508, 300, -1));

        addUserBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/save.png"))); // NOI18N
        addUserBtn.setText("Save");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 549, -1, -1));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/close.png"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1318, 13, 40, -1));

        userTbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Role", "Date of Birth(DOB)", "Mobile Number", "Email", "Username", "Password", "Address"
            }
        ));
        userTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTblMouseClicked(evt);
            }
        });
        userTbl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                userTblComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(userTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 150, 678, 605));

        updateUserBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateUserBtn.setText("Update");
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 551, -1, -1));

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 551, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1346, 482, -1, -1));

        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 551, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Username");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 109, -1, -1));

        usernamesearchTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernamesearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamesearchTxtActionPerformed(evt);
            }
        });
        getContentPane().add(usernamesearchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 106, 300, -1));

        serachBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serachBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/search.png"))); // NOI18N
        serachBtn.setText("Search");
        serachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachBtnActionPerformed(evt);
            }
        });
        getContentPane().add(serachBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1109, 103, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/bajra_pharmacy.png"))); // NOI18N
        jLabel12.setText("Bajra Pharmacy");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtKeyReleased

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //new AdminDashboard().setVisible(true);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        // TODO add your handling code here:
        String userRole = (String) userroleCombo.getSelectedItem();
        String name = usernameTxt.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dobDate.getDate();
        String dob = "";
        if (date != null) {
            dob = dFormat.format(dobDate.getDate());
        }
        String mobileNumber = mobilenumberTxt.getText();
        String email = emailTxt.getText();
        String username = usernameTxt.getText();
        String password = passwordTxt.getText();
        String address = addressTxt.getText();

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name field is required.");
        } else if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of Birth field is required.");
        } else if (mobileNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Mobile number field is required.");
        } else if (!mobileNumber.matches(mobileNumberPattern) || mobileNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Date of Birth filed is invalid.");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email field is required.");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Email field is invalid.");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username field is required.");
        } else if (checkUsername == 1) {
            JOptionPane.showMessageDialog(null, "Username field already exist. ");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password field is required");
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address field is required");
        } else {
            try {
                Connection con = ConnectionProvider.getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO app_user(userRole, name, dob,mobileNumber,email,username,password,address) VALUES(?,?,?,?,?,?,?,?)");
                ps.setString(1, userRole);
                ps.setString(2, name);
                ps.setString(3, dob);
                ps.setString(4, mobileNumber);
                ps.setString(5, email);
                ps.setString(6, username);
                ps.setString(7, password);
                ps.setString(8, address);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User Added Successfully.");
                setVisible(false);
                new User().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_addUserBtnActionPerformed

    private void userTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTblMouseClicked
        // TODO add your handling code here:
        int index = userTbl.getSelectedRow();
        TableModel model = userTbl.getModel();
        String id = model.getValueAt(index, 0).toString();
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM app_user WHERE userId=?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String userRole = rs.getString("userRole");
                if (userRole.equals("Admin")) {
                    userroleCombo.removeAllItems();
                    userroleCombo.addItem("Admin");
                    userroleCombo.addItem("Pharmacist");
                } else {
                    userroleCombo.removeAllItems();
                    userroleCombo.addItem("Pharmacist");
                    userroleCombo.addItem("Admin");
                }
                String name = rs.getString("name");
                nameTxt.setText(name);
                Date date = rs.getDate("dob");
                dobDate.setDate(date);
                String mobileNumber = rs.getString("mobileNumber");
                mobilenumberTxt.setText(mobileNumber);
                String email = rs.getString("email");
                emailTxt.setText(email);
                String username = rs.getString("username");
                usernameTxt.setText(username);
                String address = rs.getString("address");
                addressTxt.setText(address);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }//GEN-LAST:event_userTblMouseClicked

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentShown

    private void userTblComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_userTblComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_userTblComponentShown

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        // TODO add your handling code here:
        String userRole = (String) userroleCombo.getSelectedItem();
        String name = nameTxt.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyyy");
        Date date = dobDate.getDate();
        String dob = "";
        if (date != null) {
            dob = dFormat.format(dobDate.getDate());
        }
        String mobileNumber = mobilenumberTxt.getText();
        String email = emailTxt.getText();
        String username = usernameTxt.getText();
        String address = addressTxt.getText();

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name field is required");
        } else if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of birth field is required");
        } else if (mobileNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Mobile Number field is required");
        } else if (!mobileNumber.matches(mobileNumberPattern) || mobileNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Date of birth field is invalid");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email field is required");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Date of birth field is invalid");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username field is required");
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address field is required");
        } else {
            try {
                Connection con = ConnectionProvider.getConnection();
                PreparedStatement ps = con.prepareStatement("UPDATE app_user SET userRole=?,name=?,dob=?,mobileNumber=?,email=?,address=? WHERE username=?");
                ps.setString(1, userRole);
                ps.setString(2, name);
                ps.setString(3, dob);
                ps.setString(4, mobileNumber);
                ps.setString(5, email);
                ps.setString(6, address);
                ps.setString(7, username);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User updated successfully");
                setVisible(false);
                new User().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        userroleCombo.removeAllItems();
        userroleCombo.addItem("Admin");
        userroleCombo.addItem("Pharmacist");
        nameTxt.setText("");
        usernameTxt.setText("");
        dobDate.setDate(null);
        mobilenumberTxt.setText("");
        emailTxt.setText("");
        usernameTxt.setText("");
        passwordTxt.setText("");
        addressTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int index = userTbl.getSelectedRow();
        TableModel model = userTbl.getModel();
        String id = model.getValueAt(index, 0).toString();
        int a = JOptionPane.showConfirmDialog(null, "Do you wnat to delete this user?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {
                Connection con = ConnectionProvider.getConnection();
                PreparedStatement ps = con.prepareStatement("Delete From app_user WHERE userId=?");
                ps.setString(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User successfullt deleted.");
                setVisible(false);
                new User().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void userroleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userroleComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userroleComboActionPerformed

    private void usernamesearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamesearchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamesearchTxtActionPerformed

    private void serachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachBtnActionPerformed
        // TODO add your handling code here:
        int checkUserExist = 0;
        DefaultTableModel model = (DefaultTableModel) userTbl.getModel();
        model.setRowCount(0);
        String username = usernamesearchTxt.getText();
        if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username field is required");
        } else {
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyyy");
            try {
                Connection con = ConnectionProvider.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM app_user  WHERE username='" + username + "'");
                while (rs.next()) {
                    usernameTxt.setEditable(false);
                    checkUserExist = 1;
                    model.addRow(new Object[]{rs.getString("userId"), rs.getString("name"), rs.getString("userRole"), rs.getString("dob"), rs.getString("mobileNumber"), rs.getString("email"), rs.getString("username"), rs.getString("password"), rs.getString("address")});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            if (checkUserExist == 0) {
                JOptionPane.showMessageDialog(null, "Username does not exist");
            }
        }
    }//GEN-LAST:event_serachBtnActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private com.toedter.calendar.JDateChooser dobDate;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mobilenumberTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JButton serachBtn;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JTable userTbl;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JTextField usernamesearchTxt;
    private javax.swing.JComboBox<String> userroleCombo;
    // End of variables declaration//GEN-END:variables
}
