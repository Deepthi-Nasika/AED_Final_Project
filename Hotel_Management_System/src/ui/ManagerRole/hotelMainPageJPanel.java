/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManagerRole;

/**
 *
 * @author rishika
 */

public class hotelMainPageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HotelMainJPanel
     */
    public hotelMainPageJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageEmployees = new javax.swing.JButton();
        btnConfirmBookings = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(null);

        btnManageEmployees.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageEmployees.setText("MANAGE EMPLOYEES");
        add(btnManageEmployees);
        btnManageEmployees.setBounds(0, 250, 320, 40);

        btnConfirmBookings.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConfirmBookings.setText("CONFIRM BOOKINGS & ASSIGN ");
        btnConfirmBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBookingsActionPerformed(evt);
            }
        });
        add(btnConfirmBookings);
        btnConfirmBookings.setBounds(0, 320, 320, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        jPanel1.add(btnBack);
        btnBack.setBounds(80, 30, 100, 28);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("HOTEL MANAGER");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(430, 30, 317, 44);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1460, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ar_5.gif"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(430, 80, 810, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmBookingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmBookingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmBookings;
    private javax.swing.JButton btnManageEmployees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}
