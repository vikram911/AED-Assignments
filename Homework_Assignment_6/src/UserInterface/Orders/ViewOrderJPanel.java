/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Orders;

import Business.OrderCatalogs.Order;
import Business.OrderCatalogs.OrderItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varun
 */
public class ViewOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderJPanel
     */
    JPanel userProcessContainer;
    Order order;
    public ViewOrderJPanel(JPanel userProcessContainer, Order order) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.order = order;
        populateTable();
    }
    
    
    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel)customerOrderTbl.getModel();
        dtm.setRowCount(0);
        for(OrderItem orderItem: order.getOrderItemList()){
            
                Object row[] = new Object[4];
                row[0] = order;
                row[1] = orderItem.getMarketOffer().getProduct().getProductName();
                row[2] = orderItem.getQuantity();
                row[3] = orderItem.getSellingPrice();
                dtm.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        customerOrderTbl = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Orders");
        add(jLabel1);
        jLabel1.setBounds(253, 27, 238, 34);

        customerOrderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerOrderTbl);

        add(jScrollPane1);
        jScrollPane1.setBounds(34, 166, 739, 128);

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(34, 342, 111, 31);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable customerOrderTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
