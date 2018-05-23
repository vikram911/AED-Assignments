/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageUser;

import BusinessPackage.Business;
import BusinessPackage.Person;
import BusinessPackage.PersonDirectory;
import BusinessPackage.UserAccount;
import BusinessPackage.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vikram
 */
public class NewUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewUserAccountJPanel
     */
    JPanel userProcessContainer;
    Business business;
    public NewUserAccountJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        
        PersonDirectory pd = business.getPersonDirectory();
        for (Person p: pd.getPersonList()) {
            personComboBox.addItem(p);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        personComboBox = new javax.swing.JComboBox();
        roleComboBox = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        btnNewUser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New User Account");
        add(jLabel1);
        jLabel1.setBounds(0, 20, 800, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Select Person");
        add(jLabel2);
        jLabel2.setBounds(90, 110, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Username");
        add(jLabel3);
        jLabel3.setBounds(90, 170, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Select a Role");
        add(jLabel4);
        jLabel4.setBounds(90, 270, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        add(jLabel5);
        jLabel5.setBounds(90, 220, 160, 30);

        personComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personComboBoxActionPerformed(evt);
            }
        });
        add(personComboBox);
        personComboBox.setBounds(250, 110, 249, 32);

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Human Resources", "VP" }));
        add(roleComboBox);
        roleComboBox.setBounds(254, 265, 249, 32);
        add(txtUsername);
        txtUsername.setBounds(250, 160, 249, 32);

        btnNewUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNewUser.setText("Save");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });
        add(btnNewUser);
        btnNewUser.setBounds(410, 340, 129, 32);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(160, 340, 129, 32);

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        add(passwordField);
        passwordField.setBounds(250, 210, 250, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void personComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_personComboBoxActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        // TODO add your handling code here:
        Person selectedPerson;
        selectedPerson = (Person) personComboBox.getSelectedItem();
        String userName = txtUsername.getText();
        String password = passwordField.getText();
        String role = (String) roleComboBox.getSelectedItem();
        
       
        Person person = business.getPersonDirectory().addPerson();
        UserAccount user  = business.getUserAccountDirectory().newUserAccount();
        //selectedPerson.setUserAccount(userAccount);
        //userAccount.setPerson(selectedPerson);
        user.setUserName(userName);
        user.setPassword(password);
        user.setRole(role);
        user.setStatus("Active");
        person.setFirstName(selectedPerson.getFirstName());
        person.setLastName(selectedPerson.getLastName());
        person.setUserAccount(user);
        
        JOptionPane.showMessageDialog(null, "User Created ");
    }//GEN-LAST:event_btnNewUserActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox personComboBox;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
