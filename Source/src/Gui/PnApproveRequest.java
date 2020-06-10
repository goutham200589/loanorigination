/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import data.Contract;
import data.ContractList;
import data.Customer;
import data.CustomerList;
import data.PlanPayment;
import data.RequestList;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import data.RequestList;

/**
 *
 * @author tndkh_000
 */
public class PnApproveRequest extends javax.swing.JPanel {

    /**
     * Creates new form PnApproveRequest
     */
    public PnApproveRequest() {
        initComponents();
    }
    JPanel PnShow;

    PnApproveRequest(JPanel PnShow, String indent, String name, Date dob, String Add, String phone, String company, double salary, double colateral, double loanAmout, String loanType, int period, String loanStatus, String grade, int iRate, int rqID, boolean app) {
        this.PnShow = PnShow;
        initComponents();
        txtAcc.setEnabled(false);
        txtindentify.setEnabled(false);
        txtSalary.setEnabled(false);
        txtColl.setEnabled(false);
        NumberFormat formatphi = new DecimalFormat("#,###");

        txtindentify.setText(indent);
        txtName.setText(name);
        txtDob.setDate(dob);
        txtAddress.setText(Add);
        txtPhone.setText(phone);
        txtJob.setText(company);
        txtSalary.setText(formatphi.format(salary));
        txtColl.setText(formatphi.format(colateral));
        txtLoanAmount.setText(formatphi.format(loanAmout));
        txtLoanType.setText(loanType);
        spPeriod.setValue(period);
        txtLoanStatus.setText(loanStatus);
        txtGrade.setText(grade);
        txtIntRate.setText(Integer.toString(iRate));
        txtAcc.setText(Integer.toString(rqID));
        btnApp.setEnabled(app);
        btnDecline.setEnabled(app);

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

        birthdayEvaluator1 = new com.toedter.calendar.demo.BirthdayEvaluator();
        birthdayEvaluator2 = new com.toedter.calendar.demo.BirthdayEvaluator();
        jLocaleChooserBeanInfo1 = new com.toedter.components.JLocaleChooserBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtJob = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtColl = new javax.swing.JTextField();
        txtGrade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAcc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtindentify = new javax.swing.JTextField();
        txtLoanStatus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtLoanType = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JFormattedTextField();
        txtLoanAmount = new javax.swing.JFormattedTextField();
        btnApp = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDob = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spPeriod = new javax.swing.JSpinner();
        txtPhone = new javax.swing.JFormattedTextField();
        txtIntRate = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(153, 153, 255)));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APPROVED REQUEST", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel9.setText("Loan Amount :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 11, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel6.setText("Period :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 106, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel8.setText("Phone :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 46, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel10.setText("Collateral :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 91, 0, 0);
        jPanel1.add(jLabel10, gridBagConstraints);

        txtAddress.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtAddress.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 0, 0);
        jPanel1.add(txtAddress, gridBagConstraints);

        txtJob.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtJob.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 16, 0, 0);
        jPanel1.add(txtJob, gridBagConstraints);

        jLabel11.setText("Interest Rate :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        jPanel1.add(jLabel11, gridBagConstraints);

        txtName.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtName.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 16, 0, 0);
        jPanel1.add(txtName, gridBagConstraints);

        txtColl.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtColl.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 17, 0, 0);
        jPanel1.add(txtColl, gridBagConstraints);

        txtGrade.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtGrade.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(txtGrade, gridBagConstraints);

        jLabel16.setText("Grade : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 44, 0, 0);
        jPanel1.add(jLabel16, gridBagConstraints);

        txtAcc.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtAcc.setEnabled(false);
        txtAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 358;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 18, 0, 0);
        jPanel1.add(txtAcc, gridBagConstraints);

        jLabel15.setText("Request ID. :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 79, 0, 0);
        jPanel1.add(jLabel15, gridBagConstraints);

        txtindentify.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtindentify.setEnabled(false);
        txtindentify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtindentifyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 272;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 17, 0, 0);
        jPanel1.add(txtindentify, gridBagConstraints);

        txtLoanStatus.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtLoanStatus.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 16, 0, 0);
        jPanel1.add(txtLoanStatus, gridBagConstraints);

        jLabel14.setText("Indentify Card :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 5, 0, 0);
        jPanel1.add(jLabel14, gridBagConstraints);

        txtLoanType.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtLoanType.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 80);
        jPanel1.add(txtLoanType, gridBagConstraints);

        jLabel13.setText("Loan Status : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 69, 0, 0);
        jPanel1.add(jLabel13, gridBagConstraints);

        jLabel7.setText("Salary :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 46, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel5.setText("Company :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 91, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        txtSalary.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtSalary.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 80);
        jPanel1.add(txtSalary, gridBagConstraints);

        txtLoanAmount.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtLoanAmount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 80);
        jPanel1.add(txtLoanAmount, gridBagConstraints);

        btnApp.setText("Approved");
        btnApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 142, 7, 0);
        jPanel1.add(btnApp, gridBagConstraints);

        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 7, 0);
        jPanel1.add(btnDecline, gridBagConstraints);

        jLabel2.setText("Full Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 91, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        txtDob.setEnabled(false);
        txtDob.setMinimumSize(new java.awt.Dimension(6, 30));
        txtDob.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 18, 0, 0);
        jPanel1.add(txtDob, gridBagConstraints);

        jLabel3.setText("DoB :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 57, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel12.setText("Loan Type : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 23, 0, 0);
        jPanel1.add(jLabel12, gridBagConstraints);

        jLabel4.setText("Address :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 97, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        spPeriod.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 17, 0, 0);
        jPanel1.add(spPeriod, gridBagConstraints);

        txtPhone.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPhone.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 80);
        jPanel1.add(txtPhone, gridBagConstraints);

        txtIntRate.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtIntRate.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 80);
        jPanel1.add(txtIntRate, gridBagConstraints);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 7, 0);
        jPanel1.add(btnCancel, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppActionPerformed
        int relpy = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Approve Request", 2);
        if (relpy == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Request Approved !");
            RequestList list = new RequestList();
            int rqID = Integer.parseInt(txtAcc.getText());
            list.updatestatus(rqID, "Approved");
            this.setVisible(false);
            PnShow.removeAll();
            PnApproved a = new PnApproved(PnShow);
            PnShow.add(a);
            validate();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAppActionPerformed

    private void txtindentifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtindentifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtindentifyActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        int relpy = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Decline Request", 2);
        if (relpy == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Request Decline !");

            RequestList list = new RequestList();
            int rqID = Integer.parseInt(txtAcc.getText());
            list.updatestatus(rqID, "Decline");
            this.setVisible(false);
            PnShow.removeAll();
            PnApproved a = new PnApproved(PnShow);
            PnShow.add(a);
            validate();

        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        PnShow.removeAll();
        PnApproved a = new PnApproved(PnShow);
        PnShow.add(a);
        validate();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator1;
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator2;
    private javax.swing.JButton btnApp;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDecline;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooserBeanInfo jLocaleChooserBeanInfo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spPeriod;
    private javax.swing.JTextField txtAcc;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtColl;
    private com.toedter.calendar.JDateChooser txtDob;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtIntRate;
    private javax.swing.JTextField txtJob;
    private javax.swing.JFormattedTextField txtLoanAmount;
    private javax.swing.JTextField txtLoanStatus;
    private javax.swing.JTextField txtLoanType;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JFormattedTextField txtSalary;
    private javax.swing.JTextField txtindentify;
    // End of variables declaration//GEN-END:variables
}
