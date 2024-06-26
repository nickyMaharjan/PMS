/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.gui;

import dao.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author DELL
 */
public class AddMedicine extends javax.swing.JFrame {
    public String numberPattern="^[0-9]*$";
    /**
     * Creates new form AddMedicine
     */
    public AddMedicine() {
        initComponents();
        setLocationRelativeTo(null);
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
        medicineidTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        companynameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        priceperunitTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        manuDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        expDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 13, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 850, 10));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/close.png"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 13, 36, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Medicine Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 92, 300, -1));

        medicineidTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(medicineidTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 125, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 171, 300, -1));

        nameTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 211, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Company Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 250, 300, -1));

        companynameTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        companynameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companynameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(companynameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 283, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 322, 300, -1));

        quantityTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 355, 300, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Price Per Unit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 92, 300, -1));

        priceperunitTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(priceperunitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 125, 300, -1));

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/save.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Manufactured Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        manuDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(manuDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 211, 300, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Expiry Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 275, 300, -1));

        expDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(expDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 311, 300, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void companynameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companynameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companynameTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String medicineId=medicineidTxt.getText();
        String name=nameTxt.getText();
        String companyName=companynameTxt.getText();
        String quantity=quantityTxt.getText();
        String price=priceperunitTxt.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateManu = manuDate.getDate();
        String mDate = "";
        if (dateManu != null) {
            mDate = dFormat.format(manuDate.getDate());
        }
        Date dateExp = expDate.getDate();
        String eDate = "";
        if (dateExp != null) {
            eDate = dFormat.format(expDate.getDate());
        }
        if(medicineId.equals("")){
            JOptionPane.showMessageDialog(null, "Medicine Id field is required.");
        }else if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name field is required.");
        }else if(companyName.equals("")){
            JOptionPane.showMessageDialog(null, "Company Name field is required.");
        }else if(quantity.equals("")){
            JOptionPane.showMessageDialog(null, "Quantity field is required.");
        }else if(!quantity.matches(numberPattern)){
            JOptionPane.showMessageDialog(null, "Quantity field is invalid.");
        }else if(price.equals("")){
            JOptionPane.showMessageDialog(null, "Price Per Unit field is required.");
        }else if(!price.matches(numberPattern)){
            JOptionPane.showMessageDialog(null, "Price Per Unit field  is invalid.");
        }else if(mDate.equals("")){
            JOptionPane.showMessageDialog(null,"Manufactured Date filed is required.");
        }else if(eDate.equals("")){
            JOptionPane.showMessageDialog(null,"Expired Date filed is required.");
        }else{
            try {
                Connection con=ConnectionProvider.getConnection();
                PreparedStatement ps=con.prepareStatement("INSERT INTO medicine(uniqueId,name,companyName,quantity,price,manufacturedDate,expiryDate) VALUES(?,?,?,?,?,?,?)");
                ps.setString(1, medicineId);
                ps.setString(2,name);
                ps.setString(3,companyName);
                ps.setString(4,quantity);
                ps.setString(5,price);
                ps.setDate(6, new java.sql.Date(dateManu.getTime()));
                ps.setDate(7, new java.sql.Date(dateExp.getTime()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Medicine addded successfully.");
                setVisible(false);
                new AddMedicine().setVisible(true);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField companynameTxt;
    private javax.swing.JButton exitBtn;
    private com.toedter.calendar.JDateChooser expDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser manuDate;
    private javax.swing.JTextField medicineidTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField priceperunitTxt;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
