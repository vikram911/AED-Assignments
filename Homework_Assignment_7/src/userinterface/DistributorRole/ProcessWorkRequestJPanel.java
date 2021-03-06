/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributorRole;

import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import  Business.Enterprise.ProviderEnterprise;
import Business.Network.Network;
import Business.Organization.DistributorOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Provider;
import static Business.Role.Role.RoleType.Provider;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author vikram
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    WorkRequest request;
    EcoSystem system;
    Network network;
    Organization organization;
    
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, WorkRequest request,EcoSystem system,Network network,Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.system = system;
        this.network = network;
        this.organization = (DistributorOrganization) organization;
        //refreshTable();
        populateComboBox();
    }
    
//        public void refreshTable() {
//        int rowCount = tblVaccine.getRowCount();
//        DefaultTableModel model = (DefaultTableModel)tblVaccine.getModel();
//        model.setRowCount(0);
//        for(Vaccine v : organization.getVaccineCatalog().getVaccineList() ) {
//            Object row[] = new Object[4];
//            row[0] = v;
//            row[1] = v.getVaccineId();
//            row[2] = v.getDiseaseName();
//            row[3] = v.getAvailQuantity();
//            model.addRow(row);
//        }
//    }
        private void populateComboBox() {
        suppliersJComboBox.removeAllItems();

        for(Enterprise en:network.getEnterpriseDirectory().getEnterpriseList()){
            if(en instanceof ProviderEnterprise){
                suppliersJComboBox.addItem(en.getName());
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

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        suppliersJComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        submitJButton.setText("Process Request");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Result");

        resultJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultJTextFieldActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        suppliersJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        suppliersJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Suppliers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(suppliersJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(516, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(suppliersJComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DistributorWorkAreaJPanel dwjp = (DistributorWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        //request.setStatus(resultJTextField.getText());
       // if (submitJButton.isSelected()) {
            Enterprise ent = null;
            for (Enterprise en: network.getEnterpriseDirectory().getEnterpriseList()) {
                      if (en instanceof ProviderEnterprise){
                    ent = en;
                    break;
                }  
            }
                if (ent!=null){
                    request.setStatus("Sent to Provider");
            ent.getWorkQueue().getWorkRequestList().add(request); 
        }
   // }
       // request.setStatus("Completed");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void suppliersJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliersJComboBoxActionPerformed

    private void resultJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JComboBox<String> suppliersJComboBox;
    // End of variables declaration//GEN-END:variables
}
