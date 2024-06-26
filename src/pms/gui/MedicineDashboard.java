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
import javax.swing.Timer;

/**
 *
 * @author DELL
 */
public class MedicineDashboard extends javax.swing.JFrame {
    String username;
    /**
     * Creates new form MedicineDashboard
     */
    public MedicineDashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public MedicineDashboard(String tempUsername) {
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
        addMedicineBtn = new javax.swing.JButton();
        viewMedicineBtn = new javax.swing.JButton();
        updateMedicineBtn = new javax.swing.JButton();
        timeLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dayLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        medicinereturnBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medicine Dashboard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 13, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 10));

        addMedicineBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addMedicineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/addMedicine.png"))); // NOI18N
        addMedicineBtn.setText("Add Medicine");
        addMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 400, -1));

        viewMedicineBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewMedicineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/viewMedicine.png"))); // NOI18N
        viewMedicineBtn.setText("View Medicine");
        viewMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicineBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 400, -1));

        updateMedicineBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateMedicineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/updateMedicine.png"))); // NOI18N
        updateMedicineBtn.setText("Update Medicine");
        updateMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMedicineBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 400, -1));

        timeLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeLbl.setText("jLabel7");
        getContentPane().add(timeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 492, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Hello");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 288, -1, -1));

        usernameLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        usernameLbl.setText("jLabel4");
        getContentPane().add(usernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Date:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 412, -1, -1));

        dateLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateLbl.setText("jLabel5");
        getContentPane().add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 412, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Day:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 452, -1, -1));

        dayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dayLbl.setText("jLabel6");
        getContentPane().add(dayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 452, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Time:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 492, -1, -1));

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/exit.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 400, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/bajra_pharmacy.png"))); // NOI18N
        jLabel8.setText("Bajra Pharmacy");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 167, -1, -1));

        medicinereturnBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        medicinereturnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/return.png"))); // NOI18N
        medicinereturnBtn.setText("Medicine Return");
        medicinereturnBtn.setMaximumSize(new java.awt.Dimension(287, 109));
        medicinereturnBtn.setMinimumSize(new java.awt.Dimension(287, 109));
        medicinereturnBtn.setOpaque(false);
        medicinereturnBtn.setPreferredSize(new java.awt.Dimension(287, 109));
        medicinereturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinereturnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(medicinereturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 400, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/Images/dashboard_background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineBtnActionPerformed
        // TODO add your handling code here:
        new AddMedicine().setVisible(true);
    }//GEN-LAST:event_addMedicineBtnActionPerformed

    private void viewMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicineBtnActionPerformed
        // TODO add your handling code here:
        new ViewMedicine().setVisible(true);
        new ExpiryMedicine();
    }//GEN-LAST:event_viewMedicineBtnActionPerformed

    private void updateMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMedicineBtnActionPerformed
        // TODO add your handling code here:
        new UpdateMedicine().setVisible(true);
    }//GEN-LAST:event_updateMedicineBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void medicinereturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinereturnBtnActionPerformed
        // TODO add your handling code here:
        new ReturnMedicine().setVisible(true);
    }//GEN-LAST:event_medicinereturnBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MedicineDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicineDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicineDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicineDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicineDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineBtn;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dayLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton medicinereturnBtn;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JButton updateMedicineBtn;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JButton viewMedicineBtn;
    // End of variables declaration//GEN-END:variables
}
