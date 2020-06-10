/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import data.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Mihawk
 */
public class PnGradeList extends javax.swing.JPanel {

    /**
     * Creates new form GradeList
     */
    JPanel PnShow;
    int dk;

    public PnGradeList(JPanel PnShow) {
        initComponents();
        initData();
        this.PnShow = PnShow;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PnGrade = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGradeID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        txtSalary = new javax.swing.JTextField();
        txtColla = new javax.swing.JTextField();
        txtMaxAmount = new javax.swing.JTextField();
        txtMaxPer = new javax.swing.JTextField();
        txtMinPer = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(153, 153, 255)));
        setLayout(new java.awt.BorderLayout());

        PnGrade.setBackground(new java.awt.Color(255, 255, 204));
        PnGrade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GRADE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        PnGrade.setLayout(new java.awt.GridBagLayout());

        jLabel8.setText("Max Period");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 117, 0, 0);
        PnGrade.add(jLabel8, gridBagConstraints);

        jLabel1.setText("Grade ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 126, 0, 0);
        PnGrade.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Gross Salary ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 106, 0, 0);
        PnGrade.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(74, 24, 0, 0);
        PnGrade.add(txtGradeID, gridBagConstraints);

        jLabel3.setText("Collateral");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 121, 0, 0);
        PnGrade.add(jLabel3, gridBagConstraints);

        jLabel5.setText("Max Amount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 106, 0, 0);
        PnGrade.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Min Period");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 113, 0, 0);
        PnGrade.add(jLabel6, gridBagConstraints);

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 117, 22, 0);
        PnGrade.add(btnOk, gridBagConstraints);

        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalaryKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 24, 0, 0);
        PnGrade.add(txtSalary, gridBagConstraints);

        txtColla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCollaActionPerformed(evt);
            }
        });
        txtColla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCollaKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 24, 0, 0);
        PnGrade.add(txtColla, gridBagConstraints);

        txtMaxAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaxAmountKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 24, 0, 0);
        PnGrade.add(txtMaxAmount, gridBagConstraints);

        txtMaxPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaxPerKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 24, 0, 0);
        PnGrade.add(txtMaxPer, gridBagConstraints);

        txtMinPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinPerActionPerformed(evt);
            }
        });
        txtMinPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMinPerKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 24, 0, 0);
        PnGrade.add(txtMinPer, gridBagConstraints);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 35, 22, 0);
        PnGrade.add(btnUpdate, gridBagConstraints);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 22, 111);
        PnGrade.add(btnDelete, gridBagConstraints);

        add(PnGrade, java.awt.BorderLayout.WEST);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.BorderLayout());

        tbGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade ID", "Gross Salary", "Collateral", "Max Amount", "Max Period", "Min Period"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGrade);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (dk == 0) {
            String id = txtGradeID.getText().trim();
            String salary = txtSalary.getText().trim();
            String col = txtColla.getText().trim();
            String maxAmount = txtMaxAmount.getText().trim();
            String maxPer = txtMaxPer.getText().trim();
            String minPer = txtMinPer.getText().trim();
            if (Integer.parseInt(minPer) > Integer.parseInt(maxPer)) {
                JOptionPane.showMessageDialog(null, "Min Period must lesser than Max Period");
            } else {
                if (id.equals("") || salary.equals("") || col.equals("") || maxAmount.equals("") || maxPer.equals("") || minPer.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
                } else {
                    Grade g = new Grade(id, Double.parseDouble(salary), Double.parseDouble(col), Double.parseDouble(maxAmount), Integer.parseInt(minPer), Integer.parseInt(maxPer));
                    data.GradeList gList = new data.GradeList();
                    if (!gList.insert(g)) {
                        JOptionPane.showMessageDialog(null, "Duplicated Grade ID");
                    } else {
                        JOptionPane.showMessageDialog(null, "Insert succeed");
                        txtGradeID.setText(null);
                        txtSalary.setText(null);
                        txtColla.setText(null);
                        txtMaxAmount.setText(null);
                        txtMinPer.setText(null);
                        txtMaxPer.setText(null);
                        model.setRowCount(0);
                        initData();

                    }

                }
            }
        } else {

            dk = 0;
            btnOk.setText("Insert");
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            txtGradeID.setEnabled(true);
            txtGradeID.setText(null);
            txtSalary.setText(null);
            txtColla.setText(null);
            txtMaxAmount.setText(null);
            txtMinPer.setText(null);
            txtMaxPer.setText(null);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtSalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyPressed
        txtSalary.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryKeyPressed

    private void txtCollaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCollaActionPerformed
        txtSalary.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtCollaActionPerformed

    private void txtMinPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinPerActionPerformed
        txtMinPer.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinPerActionPerformed

    private void txtCollaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCollaKeyPressed
        txtColla.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtCollaKeyPressed

    private void txtMaxAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxAmountKeyPressed
        txtMaxAmount.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxAmountKeyPressed

    private void txtMaxPerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxPerKeyPressed
        txtMaxPer.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxPerKeyPressed

    private void txtMinPerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinPerKeyPressed
        txtMinPer.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinPerKeyPressed

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        int i = tbGrade.getSelectedRow();
        //doc du lieu cua tung cot tren dong nay, fill vao cac o nhap lieu

        String rqID = tbGrade.getValueAt(i, 0).toString();
        GradeList rlist = new GradeList();
        Grade rq = rlist.getGrade(rqID);
        NumberFormat fomat = new DecimalFormat("#,###.##");
        txtGradeID.setText(rq.gradeID);
        txtSalary.setText(fomat.format(rq.salary));
        txtColla.setText(fomat.format(rq.collateral));
        txtMaxAmount.setText(fomat.format(rq.maxAmount));
        txtMinPer.setText(Integer.toString(rq.minPeriod));
        txtMaxPer.setText(Integer.toString(rq.maxPeriod));

        btnOk.setText(" New ");
        txtGradeID.setEnabled(false);
        dk = 1;
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tbGradeMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String id = txtGradeID.getText().trim();
        String salary = txtSalary.getText().trim().replaceAll("[\\.\\,]", "");
        String col = txtColla.getText().trim().replaceAll("[\\.\\,]", "");
        String maxAmount = txtMaxAmount.getText().trim().replaceAll("[\\.\\,]", "");
        String maxPer = txtMaxPer.getText().trim();
        String minPer = txtMinPer.getText().trim();
        if (Integer.parseInt(minPer) > Integer.parseInt(maxPer)) {
            JOptionPane.showMessageDialog(null, "Min Period must lesser than Max Period");
        } else {
            if (id.equals("") || salary.equals("") || col.equals("") || maxAmount.equals("") || maxPer.equals("") || minPer.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            } else {
                Grade g = new Grade(id, Double.parseDouble(salary), Double.parseDouble(col), Double.parseDouble(maxAmount), Integer.parseInt(minPer), Integer.parseInt(maxPer));
                data.GradeList gList = new data.GradeList();
                if (!gList.update(g)) {
                    JOptionPane.showMessageDialog(null, "Update failed !");
                } else {
                    JOptionPane.showMessageDialog(null, "Update succeed !");
                    txtGradeID.setText(null);
                    txtSalary.setText(null);
                    txtColla.setText(null);
                    txtMaxAmount.setText(null);
                    txtMinPer.setText(null);
                    txtMaxPer.setText(null);
                    model.setRowCount(0);
                    initData();

                }
            }

        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = txtGradeID.getText().trim();
        String salary = txtSalary.getText().trim();
        String col = txtColla.getText().trim();
        String maxAmount = txtMaxAmount.getText().trim();
        String maxPer = txtMaxPer.getText().trim();
        String minPer = txtMinPer.getText().trim();
        if (id.equals("") || salary.equals("") || col.equals("") || maxAmount.equals("") || maxPer.equals("") || minPer.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        } else {
            int reply = JOptionPane.showConfirmDialog(null, "Delete " + id + ", Are u sure ?", "Xac nhan thanh toan", 2);
            if (reply == JOptionPane.YES_OPTION) {
                data.GradeList gList = new data.GradeList();
                if (!gList.delete(id)) {
                    JOptionPane.showMessageDialog(null, "Delete failed !");
                } else {
                    JOptionPane.showMessageDialog(null, "Delete succeed !");
                    txtGradeID.setText(null);
                    txtSalary.setText(null);
                    txtColla.setText(null);
                    txtMaxAmount.setText(null);
                    txtMinPer.setText(null);
                    txtMaxPer.setText(null);
                    model.setRowCount(0);
                    initData();
                }
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnGrade;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField txtColla;
    private javax.swing.JTextField txtGradeID;
    private javax.swing.JTextField txtMaxAmount;
    private javax.swing.JTextField txtMaxPer;
    private javax.swing.JTextField txtMinPer;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel model;
    TableRowSorter<TableModel> sorter;

    private void initData() {
        model = (DefaultTableModel) tbGrade.getModel();
        GradeList gl = new GradeList();
        for (Grade item : gl.getList()) {
            model.addRow(item.toVector());
        }

        sorter = (TableRowSorter<TableModel>) tbGrade.getRowSorter();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tbGrade.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tbGrade.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tbGrade.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tbGrade.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tbGrade.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

        tbGrade.setShowGrid(true);
    }
}
