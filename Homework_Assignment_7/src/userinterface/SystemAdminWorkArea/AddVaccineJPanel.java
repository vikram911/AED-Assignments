/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Vaccine.Vaccine;
import javax.swing.JPanel;

/**
 *
 * @author vikram
 */
public class AddVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddVaccine
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public AddVaccineJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVaccineName = new javax.swing.JTextField();
        txtDiseaseName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setText("Vaccine Name");
        add(jLabel1);
        jLabel1.setBounds(106, 124, 66, 23);

        jLabel2.setText("Disease Name");
        add(jLabel2);
        jLabel2.setBounds(105, 153, 67, 31);

        jLabel3.setText("Quantity");
        add(jLabel3);
        jLabel3.setBounds(105, 195, 67, 25);
        add(txtVaccineName);
        txtVaccineName.setBounds(208, 115, 209, 32);
        add(txtDiseaseName);
        txtDiseaseName.setBounds(208, 153, 209, 31);
        add(txtQuantity);
        txtQuantity.setBounds(208, 195, 209, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add a Vaccine");
        add(jLabel5);
        jLabel5.setBounds(184, 43, 347, 36);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(250, 260, 110, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String vaccineName = txtVaccineName.getText();
        String diseaseName = txtDiseaseName.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        
        Vaccine va = system.getVaccineCatalog().addVaccine();
        va.setVaccineName(vaccineName);
        va.setDiseaseName(diseaseName);
        //va.setReqQuantity(quantity);
        va.setAvailQuantity(quantity);
        
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDiseaseName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtVaccineName;
    // End of variables declaration//GEN-END:variables
}