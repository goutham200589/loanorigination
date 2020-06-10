package Gui;

import data.Contract;
import data.ContractList;
import data.Request;
import data.RequestList;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class PnApproved extends javax.swing.JPanel {

    Connection cn;
    ResultSet rs;
    JPanel PnShow;

    public PnApproved() {
        initComponents();
        initModel();
        initData();

    }

    public PnApproved(JPanel PnShow) {
        this.PnShow = PnShow;
        initComponents();
        initModel();
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
        java.awt.GridBagConstraints gridBagConstraints;

        groupcheck = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ckAll = new javax.swing.JCheckBox();
        ckDecline = new javax.swing.JCheckBox();
        ckApproved = new javax.swing.JCheckBox();
        ckPending = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtAccNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFrom = new com.toedter.calendar.JDateChooser();
        txtTo = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContract = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(153, 153, 255)));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEARCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        groupcheck.add(ckAll);
        ckAll.setText("All");
        ckAll.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckAllStateChanged(evt);
            }
        });
        ckAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckAllActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
        jPanel1.add(ckAll, gridBagConstraints);

        groupcheck.add(ckDecline);
        ckDecline.setText("Decline");
        ckDecline.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckDeclineStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 14, 0);
        jPanel1.add(ckDecline, gridBagConstraints);

        groupcheck.add(ckApproved);
        ckApproved.setText("Approved");
        ckApproved.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckApprovedStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 18, 14, 0);
        jPanel1.add(ckApproved, gridBagConstraints);

        groupcheck.add(ckPending);
        ckPending.setText("Pending");
        ckPending.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckPendingStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 2, 0, 38);
        jPanel1.add(ckPending, gridBagConstraints);

        jLabel2.setText("Indentifycard");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 26, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        txtAccNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAccNoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 18, 0, 0);
        jPanel1.add(txtAccNo, gridBagConstraints);

        jLabel4.setText("From");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 36, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 128;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 18, 0, 0);
        jPanel1.add(txtFrom, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 128;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 18, 0, 0);
        jPanel1.add(txtTo, gridBagConstraints);

        jLabel5.setText("To");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 40, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 18, 0, 0);
        jPanel1.add(btnSearch, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        tbContract.setAutoCreateRowSorter(true);
        tbContract.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "R ID", "Indentify Card", "Name", "Grade", "Loan Amount", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbContract);
        if (tbContract.getColumnModel().getColumnCount() > 0) {
            tbContract.getColumnModel().getColumn(0).setMinWidth(60);
            tbContract.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbContract.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        check();

    }//GEN-LAST:event_btnSearchActionPerformed

    private void ckPendingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckPendingStateChanged
        check();
        // TODO add your handling code here:
    }//GEN-LAST:event_ckPendingStateChanged

    private void ckApprovedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckApprovedStateChanged
        check();
        // TODO add your handling code here:
    }//GEN-LAST:event_ckApprovedStateChanged

    private void ckDeclineStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckDeclineStateChanged
        check();
        // TODO add your handling code here:
    }//GEN-LAST:event_ckDeclineStateChanged

    private void ckAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckAllActionPerformed

    private void ckAllStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckAllStateChanged
        check();

        // TODO add your handling code here:
    }//GEN-LAST:event_ckAllStateChanged

    private void txtAccNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccNoKeyReleased
        check();        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccNoKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox ckAll;
    private javax.swing.JCheckBox ckApproved;
    private javax.swing.JCheckBox ckDecline;
    private javax.swing.JCheckBox ckPending;
    private javax.swing.ButtonGroup groupcheck;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbContract;
    private javax.swing.JTextField txtAccNo;
    private com.toedter.calendar.JDateChooser txtFrom;
    private com.toedter.calendar.JDateChooser txtTo;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel model;
    TableRowSorter<DefaultTableModel> sorter;

    public void initModel() {
        model = (DefaultTableModel) tbContract.getModel();
        sorter = (TableRowSorter<DefaultTableModel>) tbContract.getRowSorter();
        tbContract.addMouseListener(
                new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        if (e.getClickCount() == 2) {
                            JTable target = (JTable) e.getSource();
                            int row = target.getSelectedRow();
                            int column = target.getSelectedColumn();
                            int rqID = Integer.parseInt(target.getValueAt(row, 0).toString());
                            RequestList rlist = new RequestList();
                            Request rq = rlist.getRequest(rqID);

                            int rperiod = rq.period;
                            Double rsalary = rq.salary;
                            String rname = rq.name;
                            String ricard = rq.icard;
                            String raddress = rq.address;
                            String rorganization = rq.organization;
                            String rphone = rq.phone;
                            Date rDob = rq.Dob;
                            Double rloanAmount = rq.loanAmount;
                            Double rcollateral = rq.collateral;
                            String rloanType = rq.loanType;
                            String rgrade = rq.grade;
                            String rstatus = rq.status;
                            boolean blstatus = true;
                            if ("Decline".equals(rstatus) || "Approved".equals(rstatus)) {
                                blstatus = false;
                            } else {
                                blstatus = true;
                            }
                            String rloanStatus = rq.loanStatus;
                            Date rday = rq.day;
                            int irate = rq.irate;
                            PnShow.removeAll();
                            PnApproveRequest a = new PnApproveRequest(PnShow, ricard, rname, rDob, raddress, rphone, rorganization, rsalary, rcollateral, rloanAmount, rloanType, rperiod, rloanStatus, rgrade, irate, rqID, blstatus);
                            //PnCheckGrade a = new PnCheckGrade();

                            PnShow.add(a);
                        }
                    }
                });
    }

    public static Date dateFormat(java.util.Date d) {
        int year = d.getYear();
        int monyh = d.getMonth();
        int date = d.getDate();
        Date re = new Date(year, monyh, date);
        return re;

    }

    private void initData() {
        RequestList list = new RequestList();
        ArrayList<Request> arrCont = list.getList();
        for (Request item : arrCont) {
            Vector v = item.toVector();
            model.addRow(v);
        }
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tbContract.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tbContract.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tbContract.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tbContract.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tbContract.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        tbContract.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);

        tbContract.setShowGrid(true);
        tbContract.getTableHeader().setOpaque(false);
        tbContract.getTableHeader().setBackground(Color.blue);
        tbContract.getTableHeader().setForeground(Color.blue);
    }

    private void check() {
        ArrayList al = new ArrayList();
        RowFilter pending = RowFilter.regexFilter("Pending", 6);
        RowFilter approved = RowFilter.regexFilter("Approved", 6);
        RowFilter decline = RowFilter.regexFilter("Decline", 6);
        if (ckPending.isSelected()) {
            al.add(pending);
        }
        if (ckApproved.isSelected()) {
            al.add(approved);
        }
        if (ckDecline.isSelected()) {
            al.add(decline);
        }
        if (ckAll.isSelected()) {
        }
        String accNo = txtAccNo.getText().trim();
        Calendar datefrom = txtFrom.getCalendar();
        datefrom.add(Calendar.DAY_OF_MONTH, - 1);
        java.util.Date from = datefrom.getTime();
        Calendar dateto = txtTo.getCalendar();
        dateto.add(Calendar.DAY_OF_MONTH, + 1);
        java.util.Date to = dateto.getTime();

        if (from != null && to != null) {
            if (from.after(to)) {
                JOptionPane.showMessageDialog(null, "Ngay bat dau khong duoc lon hon nay ket thuc");
                return;
            } else {

                RowFilter begin = RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, from, 5);
                RowFilter end = RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, to, 5);

                al.add(begin);
                al.add(end);

            }
        }

        if (accNo != null) {
            RowFilter acc = RowFilter.regexFilter(accNo, 1);
            al.add(acc);

        }

        sorter.setRowFilter(RowFilter.andFilter(al));
    }
}
