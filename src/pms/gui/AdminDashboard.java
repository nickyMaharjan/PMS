/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author DELL
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    private String username = "";

    public AdminDashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public AdminDashboard(String tempUsername) {
        initComponents();
        username = tempUsername;
        System.out.println(username);
        usernameLbl.setText(username);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);
        dateLbl.setText(formattedDate);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        dayLbl.setText(dayName);
        LocalTime currentTime = LocalTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        timeLbl.setText(formattedTime);
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the label with the current time
                LocalTime currentTime = LocalTime.now();
                String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                timeLbl.setText(formattedTime);
            }
        });
         timer.start();
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
        userBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        medicineBtn = new javax.swing.JButton();
        supplierBtn = new javax.swing.JButton();
        salesBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dayLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timeLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Dashboard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1366, 20));

        userBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/user.png"))); // NOI18N
        userBtn.setText("Manage User");
        userBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBtnActionPerformed(evt);
            }
        });
        getContentPane().add(userBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 400, -1));

        profileBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/profile.png"))); // NOI18N
        profileBtn.setText("Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        getContentPane().add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 400, -1));

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/logout.png"))); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, 400, -1));

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/exit.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 400, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        medicineBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        medicineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/medicine.png"))); // NOI18N
        medicineBtn.setText("Manage Medicine");
        medicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineBtnActionPerformed(evt);
            }
        });
        getContentPane().add(medicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 400, -1));

        supplierBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supplierBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/supplier.png"))); // NOI18N
        supplierBtn.setText("Manage Supplier");
        supplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierBtnActionPerformed(evt);
            }
        });
        getContentPane().add(supplierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 400, -1));

        salesBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/viewBill.png"))); // NOI18N
        salesBtn.setText("View Sales");
        salesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 400, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Hello");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 287, -1, -1));

        usernameLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        usernameLbl.setText("jLabel4");
        getContentPane().add(usernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 349, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 410, -1, -1));

        dateLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateLbl.setText("jLabel5");
        getContentPane().add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Day:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 450, -1, -1));

        dayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dayLbl.setText("jLabel6");
        getContentPane().add(dayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Time:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 490, -1, -1));

        timeLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeLbl.setText("jLabel7");
        getContentPane().add(timeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/bajra_pharmacy.png"))); // NOI18N
        jLabel7.setText("Bajra Pharmacy");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 167, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/dashboard_background.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void userBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBtnActionPerformed
        // TODO add your handling code here:
        new User().setVisible(true);
    }//GEN-LAST:event_userBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
        new Profile(username).setVisible(true);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void medicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineBtnActionPerformed
        // TODO add your handling code here:
        new MedicineDashboard(username).setVisible(true);
    }//GEN-LAST:event_medicineBtnActionPerformed

    private void supplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierBtnActionPerformed
        // TODO add your handling code here:
        new Supplier().setVisible(true);
    }//GEN-LAST:event_supplierBtnActionPerformed

    private void salesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesBtnActionPerformed
        // TODO add your handling code here:
        new ViewBill().setVisible(true);
    }//GEN-LAST:event_salesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dayLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton medicineBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton salesBtn;
    private javax.swing.JButton supplierBtn;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JButton userBtn;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
