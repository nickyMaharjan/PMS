/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.gui;

import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DELL
 */
public class Supplier extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-z-A-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";

    /**
     * Creates new form AddSupplier
     */
    public Supplier() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel model = (DefaultTableModel) supplierTbl.getModel();
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM supplier");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("supplierId"), rs.getString("supplierName"), rs.getString("phoneNumber"), rs.getString("email"), rs.getString("gender")});
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
        exitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        suppliernameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phonenumberTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        supplieridTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTbl = new javax.swing.JTable();
        searchsupplierTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 13, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1360, 10));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/close.png"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 36, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Supplier Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 308, 300, -1));

        suppliernameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(suppliernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 344, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 385, 300, -1));

        phonenumberTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(phonenumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 416, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 457, 300, -1));

        emailTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 492, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 533, 300, -1));

        genderCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboActionPerformed(evt);
            }
        });
        getContentPane().add(genderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 568, 300, -1));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/save.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 609, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Supplier's ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 229, 300, -1));

        supplieridTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(supplieridTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 262, 300, -1));

        supplierTbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplierTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier's ID", "Supplier's Name", "Phone Number", "Email", "Gender"
            }
        ));
        supplierTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(supplierTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 213, 860, 467));

        searchsupplierTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchsupplierTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchsupplierTxtKeyReleased(evt);
            }
        });
        getContentPane().add(searchsupplierTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 157, 300, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Suppliers' Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 160, -1, -1));

        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 154, -1, -1));

        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 609, 85, 29));

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 651, 85, 29));

        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 651, 85, 29));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/bajra_pharmacy.png"))); // NOI18N
        jLabel10.setText("Bajra Pharmacy");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String supplierId = supplieridTxt.getText();
        String suppliername = suppliernameTxt.getText();
        String phoneNumber = phonenumberTxt.getText();
        String email = emailTxt.getText();
        String gender = (String) genderCombo.getSelectedItem();

        if (supplierId.equals("")) {
            JOptionPane.showMessageDialog(null, "Supplier Id field is required.");
        } else if (suppliername.equals("")) {
            JOptionPane.showMessageDialog(null, "Supplier Name field is required.");
        } else if (phoneNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Phone number field is required.");
        } else if (!phoneNumber.matches(mobileNumberPattern) || phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone number filed is invalid.");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email field is required.");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Email field is invalid.");
        } else if (gender.equals("")) {
            JOptionPane.showMessageDialog(null, "Gender field is required.");
        } else {
            try {
                Connection con = ConnectionProvider.getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO supplier(supplierId, supplierName, phoneNumber,email, gender) VALUES(?,?,?,?,?)");
                ps.setInt(1, Integer.parseInt(supplierId));
                ps.setString(2, suppliername);
                ps.setString(3, phoneNumber);
                ps.setString(4, email);
                ps.setString(5, gender);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Supplier Added Successfully.");
                setVisible(false);
                new Supplier().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void supplierTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTblMouseClicked
        // TODO add your handling code here:
        int index = supplierTbl.getSelectedRow();
        TableModel model = supplierTbl.getModel();
        String supplierId = model.getValueAt(index, 0).toString();
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM supplier where supplierId=?");
            ps.setString(1, supplierId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                supplieridTxt.setText("" + rs.getInt("supplierId"));
                suppliernameTxt.setText(rs.getString("supplierName"));
                phonenumberTxt.setText(rs.getString("phoneNumber"));
                emailTxt.setText(rs.getString("email"));
                String gender = rs.getString("gender");
                if (gender.endsWith("Male")) {
                    genderCombo.removeAllItems();
                    genderCombo.addItem("Male");
                    genderCombo.addItem("Female");
                    genderCombo.addItem("Other");
                } else if (gender.equals("Female")) {
                    genderCombo.removeAllItems();
                    genderCombo.addItem("Female");
                    genderCombo.addItem("Male");
                    genderCombo.addItem("Other");
                } else {
                    genderCombo.removeAllItems();
                    genderCombo.addItem("Other");
                    genderCombo.addItem("Male");
                    genderCombo.addItem("Female");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_supplierTblMouseClicked

    private void searchsupplierTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchsupplierTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchsupplierTxtKeyReleased

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String suppliername = searchsupplierTxt.getText();
        searchSupplier(suppliername);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String suppliername = suppliernameTxt.getText();
        String phoneNumber = phonenumberTxt.getText();
        String email = emailTxt.getText();
        String gender = (String) genderCombo.getSelectedItem();

        if (suppliername.equals("")) {
            JOptionPane.showMessageDialog(null, "Supplier Name field is required.");
        } else if (phoneNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Phone number field is required.");
        } else if (!phoneNumber.matches(mobileNumberPattern) || phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone number filed is invalid.");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email field is required.");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Email field is invalid.");
        } else if (gender.equals("")) {
            JOptionPane.showMessageDialog(null, "Gender field is required.");
        } else {
            try {
                Connection con = ConnectionProvider.getConnection();
                PreparedStatement ps = con.prepareStatement("UPDATE supplier SET phoneNumber=?,email=?, gender=? WHERE supplierName=?");
                ps.setString(4, suppliername);
                ps.setString(1, phoneNumber);
                ps.setString(2, email);
                ps.setString(3, gender);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Supplier updated successfully.");
                setVisible(false);
                new Supplier().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String supplierId = supplieridTxt.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete this supplier?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {
                Connection con = ConnectionProvider.getConnection();
                PreparedStatement ps = con.prepareStatement("DELETE FROM supplier where supplierId=?");
                ps.setString(1, supplierId);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Supplier deleted succesfully.");
                setVisible(false);
                new Supplier().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        supplieridTxt.setText("");
        suppliernameTxt.setText("");
        phonenumberTxt.setText("");
        emailTxt.setText("");
        genderCombo.removeAllItems();
        genderCombo.addItem("Male");
        genderCombo.addItem("Female");
        genderCombo.addItem("Other");
    }//GEN-LAST:event_clearBtnActionPerformed
    private void searchSupplier(String name) {
        DefaultTableModel model = (DefaultTableModel) supplierTbl.getModel();
        model.setRowCount(0);
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM supplier WHERE supplierName LIKE '" + name + "%'");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("supplierId"), rs.getString("supplierName"), rs.getString("phoneNumber"), rs.getString("email"), rs.getString("gender")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField phonenumberTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchsupplierTxt;
    private javax.swing.JTable supplierTbl;
    private javax.swing.JTextField supplieridTxt;
    private javax.swing.JTextField suppliernameTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
