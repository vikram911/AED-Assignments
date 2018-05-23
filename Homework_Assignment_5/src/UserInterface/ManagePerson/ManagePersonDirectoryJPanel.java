/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManagePerson;

import BusinessPackage.Business;
import BusinessPackage.Person;
import BusinessPackage.UserAccount;
import UserInterface.ManageUser.ManageUserAccountDirectory;
import UserInterface.ManagePerson.NewPersonJPanel;
import UserInterface.ManageUser.UpdateUserJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vikram
 */
public class ManagePersonDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountDirectory
     */
    JPanel userProcessContainer;
    Business business;
    Person person;
    public ManagePersonDirectoryJPanel(JPanel userProcessContainer,Business business,Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.person = person;
        populateTable();
    }
    
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblPersonList.getModel();
        dtm.setRowCount(0);
        tblPersonList.getColumnModel().getColumn(0).setPreferredWidth(0);
        for (Person ua: business.getPersonDirectory().getPersonList()) {
            Object row[] = new Object[4];
            
                row[0] = ua;
                row[1] = ua.getFirstName();
                row[2] = ua.getLastName();
                if (ua.getUserAccount() == null) {
                row[3] = "--";
                }
                else{
                    row[3] = ua.getUserAccount().getUserName();
                }
                
            dtm.addRow(row);
        }
//        for(UserAccount ua: business.getUserAccountDirectory().getuserAccountList()) {
//            Object row[] = new Object[3];
//            row[0] = ua.getPerson();
//            row[1] = ua.getPerson().getLastName();
//            row[2] = ua.getUserName();
//            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonList = new javax.swing.JTable();
        btnFindPerson = new javax.swing.JButton();
        btnNewPerson = new javax.swing.JButton();
        btnUpdatePerson = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Person Directory");
        add(jLabel1);
        jLabel1.setBounds(230, 30, 481, 50);

        tblPersonList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person", "First Name", "Last Name", "User name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonList);
        if (tblPersonList.getColumnModel().getColumnCount() > 0) {
            tblPersonList.getColumnModel().getColumn(0).setMinWidth(0);
            tblPersonList.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblPersonList.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 170, 580, 220);

        btnFindPerson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFindPerson.setText("Find Person >>");
        btnFindPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPersonActionPerformed(evt);
            }
        });
        add(btnFindPerson);
        btnFindPerson.setBounds(580, 120, 215, 40);

        btnNewPerson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNewPerson.setText("New Person >>");
        btnNewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPersonActionPerformed(evt);
            }
        });
        add(btnNewPerson);
        btnNewPerson.setBounds(580, 400, 210, 30);

        btnUpdatePerson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdatePerson.setText("Update Person >>");
        btnUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonActionPerformed(evt);
            }
        });
        add(btnUpdatePerson);
        btnUpdatePerson.setBounds(580, 440, 210, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Person List");
        add(jLabel2);
        jLabel2.setBounds(40, 130, 150, 30);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(30, 410, 150, 40);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(580, 480, 210, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPersonActionPerformed
        // TODO add your handling code here:
        SearchPersonJPanel panel = new SearchPersonJPanel(userProcessContainer,business,person);
        userProcessContainer.add("SearchPersonJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindPersonActionPerformed

    private void btnNewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPersonActionPerformed
        // TODO add your handling code here:
        NewPersonJPanel panel = new NewPersonJPanel(userProcessContainer,business,person);
        userProcessContainer.add("NewPersonJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewPersonActionPerformed

    private void btnUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPersonList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Person person = (Person) tblPersonList.getValueAt(selectedRow,0);
        UpdatePersonJPanel panel = new UpdatePersonJPanel(userProcessContainer,business,person);
        userProcessContainer.add("UpdatePersonJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdatePersonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPersonList.getSelectedRow();

        if (selectedRow>=0) {
            Person person = (Person) tblPersonList.getValueAt(selectedRow,0);
            business.getPersonDirectory().deletePerson(person);
            business.getUserAccountDirectory().deleteUser(person.getUserAccount());
            JOptionPane.showMessageDialog(null,"Person has been deleted");
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null,"select any row");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindPerson;
    private javax.swing.JButton btnNewPerson;
    private javax.swing.JButton btnUpdatePerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonList;
    // End of variables declaration//GEN-END:variables
}

