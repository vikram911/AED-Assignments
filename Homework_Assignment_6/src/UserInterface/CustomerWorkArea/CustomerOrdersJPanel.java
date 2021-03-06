/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerWorkArea;

import Business.Customers.Customer;
import Business.OrderCatalogs.MasterOrderCatalog;
import Business.OrderCatalogs.Order;
import UserInterface.Orders.ViewOrderJPanel;
import java.awt.CardLayout;
import java.util.ConcurrentModificationException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varun
 */
public class CustomerOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrdersJPanel
     */
    JPanel userProcessContainer;
    MasterOrderCatalog masterOrderCatalog;
    Customer customer;
    public CustomerOrdersJPanel(JPanel userProcessContainer, MasterOrderCatalog masterOrderCatalog, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.masterOrderCatalog = masterOrderCatalog;
        this.customer = customer;
        populateTable();
    }

    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel)completeOrderListDirectoryJTable.getModel();
        dtm.setRowCount(0);
        for(Order order: masterOrderCatalog.getOrderList()){
            if (customer.equals(order.getCustomer())){
                Object row[] = new Object[2];
                row[0] = order;
                row[1] = order.getCustomer().getName();
                dtm.addRow(row);
            }
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

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completeOrderListDirectoryJTable = new javax.swing.JTable();
        viewOrderDetailsJButton = new javax.swing.JButton();
        cancelOrderJButton = new javax.swing.JButton();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Orders");

        completeOrderListDirectoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Customer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(completeOrderListDirectoryJTable);
        if (completeOrderListDirectoryJTable.getColumnModel().getColumnCount() > 0) {
            completeOrderListDirectoryJTable.getColumnModel().getColumn(0).setResizable(false);
            completeOrderListDirectoryJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        viewOrderDetailsJButton.setText("View Order Details >>");
        viewOrderDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderDetailsJButtonActionPerformed(evt);
            }
        });

        cancelOrderJButton.setText("Cancel Order");
        cancelOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(cancelOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewOrderDetailsJButton)))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewOrderDetailsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(cancelOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void cancelOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderJButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            int selectedrow = completeOrderListDirectoryJTable.getSelectedRow();

            if(selectedrow >= 0){

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to cancel this order ?", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION){
                   Order order = (Order)completeOrderListDirectoryJTable.getValueAt(selectedrow,0);
                    for(Order o: masterOrderCatalog.getOrderList()){
                        if (customer.equals(o.getCustomer())){
                            masterOrderCatalog.removeOrder(o);
                            populateTable();
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Please select a row");
            }
        } catch(ConcurrentModificationException e){}
    }//GEN-LAST:event_cancelOrderJButtonActionPerformed

    private void viewOrderDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = completeOrderListDirectoryJTable.getSelectedRow();

        if(selectedrow >= 0){
            Order order = (Order)completeOrderListDirectoryJTable.getValueAt(selectedrow,0);
            ViewOrderJPanel panel = new ViewOrderJPanel(userProcessContainer,order);
            userProcessContainer.add("ViewOrderJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else{JOptionPane.showMessageDialog(null,"Please Select a Row ");}
    }//GEN-LAST:event_viewOrderDetailsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton cancelOrderJButton;
    private javax.swing.JTable completeOrderListDirectoryJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewOrderDetailsJButton;
    // End of variables declaration//GEN-END:variables
}
