package ui.SystemAdministration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.BusinessEvent;
import Business.Model.Enterprise;
import Business.Model.EnterpriseDirectory;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.SystemAdmin;

/**
 *
 * @author mithra
 */

public class manageNetworkJPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public manageNetworkJPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        this.callOnCreateMethod = callOnCreateMethod;
        this.systemAdmin = systemAdmin;
        initComponents();
        populateTable();
       
         btnBack.setOpaque(true);
         
         btnAdd.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageNetworks = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNetworks = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        tblManageNetworks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblManageNetworks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME"
            }
        ));
        jScrollPane1.setViewportView(tblManageNetworks);

        add(jScrollPane1);
        jScrollPane1.setBounds(320, 190, 513, 208);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(690, 420, 100, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NETWORK");
        add(jLabel1);
        jLabel1.setBounds(380, 430, 121, 22);

        txtNetworks.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtNetworks);
        txtNetworks.setBounds(480, 430, 180, 23);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setForeground(new java.awt.Color(255, 255, 255));
        lblsysadmin.setText("MANAGE NETWORKS");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(420, 30, 400, 44);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(40, 30, 90, 38);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed
    public boolean validateName() {
        if (txtNetworks.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input: name should contain only alphabets");
            return false;
        }
    }


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = txtNetworks.getText();
        if (name == null) {
            JOptionPane.showMessageDialog(this, "Enter a Network.");
            return;
        }
        if (validateName()) {
            systemAdmin.addNetwork(name);
            JOptionPane.showMessageDialog(this, "Network added successfully");
            txtNetworks.setText("");
            populateTable();
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblManageNetworks;
    private javax.swing.JTextField txtNetworks;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageNetworks.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Network network : systemAdmin.getListOfNetwork()) {        //populate network
            row[0] = network.getName();
            model.addRow(row);
        }
    }
}
