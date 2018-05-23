/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.Business;
import Business.Customers.Customer;
import Business.Markets.Market;
import Business.OrderCatalogs.Order;
import Business.OrderCatalogs.OrderItem;
import Business.SalesPerson.SalesPerson;
import Business.Statistics.StatisticalAnalysis;
import Business.Supplier.Product;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mansi
 */
public class ViewStatisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStatisticsJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private StatisticalAnalysis analysis;

    public ViewStatisticsJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        analysis = new StatisticalAnalysis(business);
        populateMarketCombo();
        showTotalrevenueFields(false);
        showMarketRevenueFields(false);

    }

    private void showTotalrevenueFields(boolean b) {
        totalRevenueJLabel.setVisible(b);
        totalDifferenceJLabel.setVisible(b);
        totalRevenueDifferenceJTextField.setVisible(b);
        viewTotalRevenueTxt.setVisible(b);

    }

    private void showMarketRevenueFields(boolean b) {
        marketRevenueJLabel.setVisible(b);
        marketDifferenceJLabel.setVisible(b);
        RevenueMarketTxt.setVisible(b);
        marketRevenueDifferenceJTextField.setVisible(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewTotalRevenueJButton = new javax.swing.JButton();
        viewTotalRevenueTxt = new javax.swing.JTextField();
        MarketcomboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RevenueMarketTxt = new javax.swing.JTextField();
        marketRevenueJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productBelowtargetTable = new javax.swing.JTable();
        aboveTargetBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        commisionTable = new javax.swing.JTable();
        belowTargetBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        productAboveTargetTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        totalRevenueDifferenceJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        marketRevenueDifferenceJTextField = new javax.swing.JTextField();
        totalRevenueJLabel = new javax.swing.JLabel();
        marketDifferenceJLabel = new javax.swing.JLabel();
        totalDifferenceJLabel = new javax.swing.JLabel();
        belowTargetBtn1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        topProductsTbl = new javax.swing.JTable();

        setLayout(null);

        viewTotalRevenueJButton.setText("View Total Revenue  ");
        viewTotalRevenueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTotalRevenueJButtonActionPerformed(evt);
            }
        });
        add(viewTotalRevenueJButton);
        viewTotalRevenueJButton.setBounds(70, 80, 179, 23);
        add(viewTotalRevenueTxt);
        viewTotalRevenueTxt.setBounds(330, 80, 151, 25);

        MarketcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketcomboBoxActionPerformed(evt);
            }
        });
        add(MarketcomboBox);
        MarketcomboBox.setBounds(70, 160, 95, 20);

        jLabel1.setText("Select Market");
        add(jLabel1);
        jLabel1.setBounds(70, 140, 65, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Revenue Generation ");
        add(jLabel2);
        jLabel2.setBounds(76, 0, 621, 30);
        add(RevenueMarketTxt);
        RevenueMarketTxt.setBounds(330, 130, 151, 25);

        marketRevenueJLabel.setText("Revenue:");
        add(marketRevenueJLabel);
        marketRevenueJLabel.setBounds(280, 130, 47, 20);

        productBelowtargetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person", " Products sold below target"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productBelowtargetTable);
        if (productBelowtargetTable.getColumnModel().getColumnCount() > 0) {
            productBelowtargetTable.getColumnModel().getColumn(0).setResizable(false);
            productBelowtargetTable.getColumnModel().getColumn(0).setHeaderValue("Sales Person");
            productBelowtargetTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(70, 430, 621, 81);

        aboveTargetBtn.setText("Sales Person with Consistent above target Sales");
        aboveTargetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboveTargetBtnActionPerformed(evt);
            }
        });
        add(aboveTargetBtn);
        aboveTargetBtn.setBounds(70, 290, 265, 23);

        commisionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person", "Revenue Generated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(commisionTable);
        if (commisionTable.getColumnModel().getColumnCount() > 0) {
            commisionTable.getColumnModel().getColumn(0).setResizable(false);
            commisionTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane2);
        jScrollPane2.setBounds(70, 190, 621, 90);

        belowTargetBtn.setText("Sales Person with below total target Sales");
        belowTargetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belowTargetBtnActionPerformed(evt);
            }
        });
        add(belowTargetBtn);
        belowTargetBtn.setBounds(70, 400, 265, 23);

        productAboveTargetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person", " Products sold above target "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(productAboveTargetTable);
        if (productAboveTargetTable.getColumnModel().getColumnCount() > 0) {
            productAboveTargetTable.getColumnModel().getColumn(0).setResizable(false);
            productAboveTargetTable.getColumnModel().getColumn(1).setResizable(false);
            productAboveTargetTable.getColumnModel().getColumn(1).setHeaderValue(" Products sold above target ");
        }

        add(jScrollPane3);
        jScrollPane3.setBounds(70, 320, 610, 81);

        jLabel4.setText("Calculate Market Revenue");
        add(jLabel4);
        jLabel4.setBounds(70, 120, 126, 19);

        totalRevenueDifferenceJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalRevenueDifferenceJTextFieldActionPerformed(evt);
            }
        });
        add(totalRevenueDifferenceJTextField);
        totalRevenueDifferenceJTextField.setBounds(610, 80, 80, 25);

        jLabel5.setText("Calculate Total Revenue");
        add(jLabel5);
        jLabel5.setBounds(76, 57, 117, 19);

        marketRevenueDifferenceJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketRevenueDifferenceJTextFieldActionPerformed(evt);
            }
        });
        add(marketRevenueDifferenceJTextField);
        marketRevenueDifferenceJTextField.setBounds(610, 130, 80, 25);

        totalRevenueJLabel.setText("Revenue:");
        add(totalRevenueJLabel);
        totalRevenueJLabel.setBounds(280, 80, 47, 20);

        marketDifferenceJLabel.setText("Difference");
        add(marketDifferenceJLabel);
        marketDifferenceJLabel.setBounds(490, 130, 117, 20);

        totalDifferenceJLabel.setText("Difference");
        add(totalDifferenceJLabel);
        totalDifferenceJLabel.setBounds(490, 80, 117, 20);

        belowTargetBtn1.setText("Top 3 Products ");
        belowTargetBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belowTargetBtn1ActionPerformed(evt);
            }
        });
        add(belowTargetBtn1);
        belowTargetBtn1.setBounds(70, 510, 265, 23);

        topProductsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Products"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(topProductsTbl);
        if (topProductsTbl.getColumnModel().getColumnCount() > 0) {
            topProductsTbl.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane4);
        jScrollPane4.setBounds(70, 540, 621, 99);
    }// </editor-fold>//GEN-END:initComponents
public void populateMarketCombo() {
        MarketcomboBox.removeAllItems();
        for (Market m : business.getMarketList().getMarketList()) {
            MarketcomboBox.addItem(m);
        }
    }


    private void viewTotalRevenueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTotalRevenueJButtonActionPerformed
        //  viewTotalRevenueTxt.setText(String.valueOf(business.getMasterOrderCatalog().totalRevenueOrderCatalog())); 
        showTotalrevenueFields(true);
        double totalRevenue = analysis.calculateTotalRevenue();
        double targetRevenue = analysis.totalTargetRevenue();
        double difference;

        viewTotalRevenueTxt.setText(String.valueOf(totalRevenue));

        if (totalRevenue >= targetRevenue) {
            difference = totalRevenue - targetRevenue;
            totalDifferenceJLabel.setText("Unexpected Profits");
        } else {
            difference = targetRevenue - totalRevenue;
            totalDifferenceJLabel.setText("Missed Revenues");
        }
        totalRevenueDifferenceJTextField.setText(String.valueOf(difference));
    }//GEN-LAST:event_viewTotalRevenueJButtonActionPerformed

    private void MarketcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarketcomboBoxActionPerformed

        showMarketRevenueFields(true);
        double totalRevenue = analysis.totalMarketRevenue((Market) MarketcomboBox.getSelectedItem());
        double targetRevenue = analysis.totalTargetMarketRevenue((Market) MarketcomboBox.getSelectedItem());
        double difference;
        RevenueMarketTxt.setText(String.valueOf(totalRevenue));
        if (totalRevenue >= targetRevenue) {
            difference = totalRevenue - targetRevenue;
            marketDifferenceJLabel.setText("Unexpected Profits");
        } else {
            difference = targetRevenue - totalRevenue;
            marketDifferenceJLabel.setText("Missed Revenues");
        }
        marketRevenueDifferenceJTextField.setText(String.valueOf(difference));

        Map<SalesPerson, Double> topSalesPersonMap = analysis.salesPerCommision((Market) MarketcomboBox.getSelectedItem());
        Object[] a = topSalesPersonMap.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<SalesPerson, Double>) o2).getValue()
                        .compareTo(((Map.Entry<SalesPerson, Double>) o1).getValue());
            }
        });

        DefaultTableModel model = (DefaultTableModel) commisionTable.getModel();
        model.setRowCount(0);

        for (Object e : a) {
            Object row[] = new Object[2];

            row[0] = ((Map.Entry<SalesPerson, Double>) e).getKey();
            row[1] = ((Map.Entry<SalesPerson, Double>) e).getValue();

            model.addRow(row);
        }


    }//GEN-LAST:event_MarketcomboBoxActionPerformed

    private void aboveTargetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboveTargetBtnActionPerformed
        Map<SalesPerson, Integer> topSalesPersonMap = analysis.getSPaboveTargetSales();

        DefaultTableModel model = (DefaultTableModel) productAboveTargetTable.getModel();

        for (Map.Entry entry : topSalesPersonMap.entrySet()) {
            Object row[] = new Object[2];
            SalesPerson p = (SalesPerson) entry.getKey();

            row[0] = (SalesPerson) entry.getKey();
            row[1] = entry.getValue();
            //row[2] = p.getBelow_target();

            model.addRow(row);
        }
    }//GEN-LAST:event_aboveTargetBtnActionPerformed

    private void belowTargetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belowTargetBtnActionPerformed
        // TODO add your handling code here:
       

        Map<SalesPerson, Integer> belowTotalOrderMap = analysis.salesPersonBelowTotalOrder();
        DefaultTableModel model = (DefaultTableModel) productBelowtargetTable.getModel();

        for (Map.Entry entry : belowTotalOrderMap.entrySet()) {
            Object row[] = new Object[2];
            SalesPerson p = (SalesPerson) entry.getKey();

            row[0] = p;
            //row[1] = p.getAbove_target();
            row[1] = entry.getValue();

            model.addRow(row);
        }
    }//GEN-LAST:event_belowTargetBtnActionPerformed

    private void totalRevenueDifferenceJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalRevenueDifferenceJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalRevenueDifferenceJTextFieldActionPerformed

    private void marketRevenueDifferenceJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketRevenueDifferenceJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marketRevenueDifferenceJTextFieldActionPerformed

    private void belowTargetBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belowTargetBtn1ActionPerformed

        // TODO add your handling code here:
        List<OrderItem> top3ProductList = analysis.topThreeProducts();
        DefaultTableModel model = (DefaultTableModel) topProductsTbl.getModel();

        for (int i = 0; i < 3; i++) {
            Object row[] = new Object[1];
            row[0] = top3ProductList.get(i);

            model.addRow(row);

        }
    }//GEN-LAST:event_belowTargetBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox MarketcomboBox;
    private javax.swing.JTextField RevenueMarketTxt;
    private javax.swing.JButton aboveTargetBtn;
    private javax.swing.JButton belowTargetBtn;
    private javax.swing.JButton belowTargetBtn1;
    private javax.swing.JTable commisionTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel marketDifferenceJLabel;
    private javax.swing.JTextField marketRevenueDifferenceJTextField;
    private javax.swing.JLabel marketRevenueJLabel;
    private javax.swing.JTable productAboveTargetTable;
    private javax.swing.JTable productBelowtargetTable;
    private javax.swing.JTable topProductsTbl;
    private javax.swing.JLabel totalDifferenceJLabel;
    private javax.swing.JTextField totalRevenueDifferenceJTextField;
    private javax.swing.JLabel totalRevenueJLabel;
    private javax.swing.JButton viewTotalRevenueJButton;
    private javax.swing.JTextField viewTotalRevenueTxt;
    // End of variables declaration//GEN-END:variables
}
