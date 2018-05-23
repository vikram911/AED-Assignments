/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerWorkArea;

import Business.Customers.Customer;
import Business.Customers.CustomerDirectory;
import Business.OrderCatalogs.MasterOrderCatalog;
import Business.UserAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Customer customer;
    MasterOrderCatalog masterOrderCatalog;
    //UserAccount user;

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, Customer customer, MasterOrderCatalog masterOrderCatalog) {//,UserAccount user
        initComponents();
        this.customer = customer;
        this.userProcessContainer = userProcessContainer;
        this.masterOrderCatalog = masterOrderCatalog;
        //this.user = user;
        customerIdJTextField.setText(String.valueOf(customer.getCustomerId()));
        customerNameJTextField.setText(customer.getName());
        contactNumberJTextField.setText(customer.getCellNumber());
        addressJTextField.setText(customer.getAddress());
        //loadData();
        
        
//        customerIdJTextField.setText(String.valueOf(customer.getCustomerId()));
//        customerNameJTextField.setText(customer.getName());
//        contactNumberJTextField.setText(customer.getCellNumber());
//        addressJTextField.setText(customer.getAddress());
        //usernameJTextField.setText(user.getUsername());
        //passwordJTextField.setText(user.getPassword());
    }
    
        public void loadData(){
        //usernameJTextField.setText(userAccount.getUsername());
        //passwordJTextField.setText(userAccount.getPassword());
            System.out.println("Inside");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        manageMyOrdersJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customerIdJTextField = new javax.swing.JTextField();
        customerNameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contactNumberJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contact Number:");

        manageMyOrdersJButton.setText("Manage My Orders >>");
        manageMyOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMyOrdersJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Work Area");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Id:");

        customerIdJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerIdJTextField.setEnabled(false);
        customerIdJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdJTextFieldActionPerformed(evt);
            }
        });

        customerNameJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerNameJTextField.setEnabled(false);
        customerNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer Name:");

        contactNumberJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactNumberJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberJTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address:");

        addressJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(customerIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(customerNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(contactNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(manageMyOrdersJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 356, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(manageMyOrdersJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageMyOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMyOrdersJButtonActionPerformed
        // TODO add your handling code here:
        CustomerOrdersJPanel panel = new CustomerOrdersJPanel(userProcessContainer,masterOrderCatalog, customer);
        userProcessContainer.add("CustomerOrdersJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMyOrdersJButtonActionPerformed

    private void customerIdJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdJTextFieldActionPerformed

    private void customerNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameJTextFieldActionPerformed

    private void contactNumberJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberJTextFieldActionPerformed

    private void addressJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JTextField contactNumberJTextField;
    private javax.swing.JTextField customerIdJTextField;
    private javax.swing.JTextField customerNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton manageMyOrdersJButton;
    // End of variables declaration//GEN-END:variables
}
