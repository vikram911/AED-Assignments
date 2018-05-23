/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageUser;

import BusinessPackage.Business;
import BusinessPackage.Person;
import BusinessPackage.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vikram
 */

public class UpdateUserJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    Person person;
    /**
     * Creates new form UpdateUserJPanel
     */
    public UpdateUserJPanel(JPanel userProcessContainer, Business business,Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.person = person;
        
        
        txtPerson.setText(person.toString());
        txtPerson.setEnabled(false);
        if (person.getUserAccount() == null) {
            txtUserName.setText("");
            txtPassword.setText("");
        }
        else{
            txtUserName.setText(person.getUserAccount().getUserName());
            txtPassword.setText(person.getUserAccount().getPassword());
        }
//        if (person.getUserAccount().getStatus().equals("Active") || person.getUserAccount() == null) {
//            radioBtnActive.setSelected(true);
//        }
//        else{
//            radioBtnDisabled.setSelected(false);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioBtnDisabled = new javax.swing.JRadioButton();
        radioBtnActive = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtPerson = new javax.swing.JTextField();
        roleComboBox = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JTextField();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update User Status");
        add(jLabel1);
        jLabel1.setBounds(0, 11, 790, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User name");
        add(jLabel2);
        jLabel2.setBounds(160, 200, 90, 30);

        Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Password.setText("Password");
        add(Password);
        Password.setBounds(170, 260, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Role");
        add(jLabel4);
        jLabel4.setBounds(180, 330, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Person");
        add(jLabel6);
        jLabel6.setBounds(170, 140, 80, 30);

        btnGroup.add(radioBtnDisabled);
        radioBtnDisabled.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioBtnDisabled.setText("Disabled");
        radioBtnDisabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnDisabledActionPerformed(evt);
            }
        });
        add(radioBtnDisabled);
        radioBtnDisabled.setBounds(650, 210, 140, 30);

        btnGroup.add(radioBtnActive);
        radioBtnActive.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioBtnActive.setText("Active");
        radioBtnActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnActiveActionPerformed(evt);
            }
        });
        radioBtnActive.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                radioBtnActivePropertyChange(evt);
            }
        });
        add(radioBtnActive);
        radioBtnActive.setBounds(650, 170, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Account Status");
        add(jLabel3);
        jLabel3.setBounds(650, 110, 180, 50);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(410, 400, 140, 40);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(210, 400, 140, 40);
        add(txtUserName);
        txtUserName.setBounds(270, 200, 260, 40);

        txtPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonActionPerformed(evt);
            }
        });
        add(txtPerson);
        txtPerson.setBounds(270, 140, 260, 40);

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Human Resources", "VP" }));
        roleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboBoxActionPerformed(evt);
            }
        });
        add(roleComboBox);
        roleComboBox.setBounds(270, 320, 260, 40);
        add(txtPassword);
        txtPassword.setBounds(270, 260, 260, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnDisabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnDisabledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnDisabledActionPerformed

    private void radioBtnActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnActiveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        String uName = txtUserName.getText();
        String pwd = txtPassword.getText();
        String role = roleComboBox.getSelectedItem().toString();
        
        person.getUserAccount().setUserName(uName);
        person.getUserAccount().setPassword(pwd);
        person.getUserAccount().setRole(role);
        
        
        if (radioBtnActive.isSelected()) {
            person.getUserAccount().setStatus("Active");
        }
        else
            person.getUserAccount().setStatus("Disabled");
        
        JOptionPane.showMessageDialog(null, "User updated successfuly");
//        txtPerson.setText(person.toString());
//        txtUserName.setText(person.getUserAccount().getUserName());
//        txtPassword.setText(person.getUserAccount().getPassword());
//        radioBtnActive.setSelected(true);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageUserAccountDirectory manageAccountJPanel = (ManageUserAccountDirectory) component;
        manageAccountJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void radioBtnActivePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_radioBtnActivePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnActivePropertyChange

    private void txtPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonActionPerformed

    private void roleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioBtnActive;
    private javax.swing.JRadioButton radioBtnDisabled;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPerson;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
