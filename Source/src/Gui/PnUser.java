/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import data.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author tri
 */
public class PnUser extends javax.swing.JPanel {

    /**
     * Creates new form PnUser
     */
    public PnUser() {
        initComponents();
        initData();
    }
    JPanel PnShow;
    int d;

    public PnUser(JPanel PnShow) {
        this.PnShow = PnShow;
        initComponents();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cboRole = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        btIn = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btUp = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(153, 153, 255)));
        setAutoscrolls(true);
        setLayout(new java.awt.BorderLayout());

        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Role", "FullName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUser);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel4.setText("User");

        jLabel1.setText("Role");

        jLabel2.setText("Fullname");

        btIn.setText("Insert");
        btIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInActionPerformed(evt);
            }
        });

        btDel.setText("Delete");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        btUp.setText("Update");
        btUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpActionPerformed(evt);
            }
        });

        btnReset.setText("Reset Pass");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btIn)
                        .addGap(18, 18, 18)
                        .addComponent(btUp)
                        .addGap(18, 18, 18)
                        .addComponent(btDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btDel)
                        .addComponent(btnReset))
                    .addComponent(btIn)
                    .addComponent(btUp)))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void tbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUserMouseClicked
        // TODO add your handling code here:
        int i = tbUser.getSelectedRow();
        d = 0;
        txtUser.setText(tbUser.getValueAt(i, 0).toString());
        cboRole.setSelectedItem(tbUser.getValueAt(i, 1));
        txtFname.setText(tbUser.getValueAt(i, 2).toString());
        btIn.setText("New");
        txtUser.setEnabled(false);
        btUp.setEnabled(true);
        btDel.setEnabled(true); 
        btnReset.setEnabled(true);

    }//GEN-LAST:event_tbUserMouseClicked

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed

        String user = txtUser.getText().trim();
        UserList ul = new UserList();
        if (ul.delete(user)) {
            JOptionPane.showMessageDialog(null, "Delete OK");
            model.setRowCount(0);
            initData();
        }
    }//GEN-LAST:event_btDelActionPerformed

    private void btInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInActionPerformed
        // TODO add your handling code here:
        String user = txtUser.getText().trim();

        if (d == 1) {
            int role = Integer.parseInt(cboRole.getSelectedItem().toString());
            String fname = txtFname.getText().trim();

            User u = new User(user, null, fname, role);
            UserList ul = new UserList();
            if (txtUser.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "User Not Null");
            } else if (txtFname.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Full Name Not Null");
            } else {
                if (!ul.insert(u)) {
                    JOptionPane.showMessageDialog(null, "Duplicated");
                } else {
                    JOptionPane.showMessageDialog(null, "Insert Ok");
                    //cap nhat lai model, de du lieu moi xuat hien trong Jtable.
                    model.addRow(u.toVector());
                }
            }
        } else {
            d = 1;
            btIn.setText("Insert");
            txtUser.setEnabled(true);
            btDel.setEnabled(false);
            btUp.setEnabled(false);
            btnReset.setEnabled(false);

            txtUser.setText("");
            cboRole.setSelectedItem("");
            txtFname.setText("");
        }


    }//GEN-LAST:event_btInActionPerformed

    private void btUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpActionPerformed
        // TODO add your handling code here:
        String user = txtUser.getText().trim();
        int role = (int) cboRole.getSelectedItem();
        String fname = txtFname.getText().trim();
        if (fname.length() == 0) {
            JOptionPane.showMessageDialog(null, "Full name cannot be blank");
        } else {

            UserList ul = new UserList();
            if (ul.updateFullname(user, role, fname)) {
                JOptionPane.showMessageDialog(null, "Update Ok");
                model.setRowCount(0);
                initData();
            } else {
                JOptionPane.showMessageDialog(null, "Update Failed");
            }
        }
    }//GEN-LAST:event_btUpActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        String user = txtUser.getText().trim();
       

        UserList ul = new UserList();
        int reply = JOptionPane.showConfirmDialog(null, "Do you want to reset password", "Reset Password", 2);
        if(reply==JOptionPane.YES_OPTION){
        if (ul.updatepass(user)) {
            JOptionPane.showMessageDialog(null, "Reset Pass Ok");
            model.setRowCount(0);
            initData();
        } else {
            JOptionPane.showMessageDialog(null, "Reset Pass Failed");
        }
    }
    // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDel;
    private javax.swing.JButton btIn;
    private javax.swing.JButton btUp;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUser;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel model;
    TableRowSorter<TableModel> sort;

    private void initData() {
        model = (DefaultTableModel) tbUser.getModel();
        UserList ul = new UserList();
        for (User item : ul.getList()) {
            model.addRow(item.toVector());
        }
        RoleList rl = new RoleList();
        for (Role e : rl.getList()) {
            if (e.role == 0) {
                continue;
            }
            cboRole.addItem(e.role);
        }
        sort = (TableRowSorter<TableModel>) tbUser.getRowSorter();
    }
}
