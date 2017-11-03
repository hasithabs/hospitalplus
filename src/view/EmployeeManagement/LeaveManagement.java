package view.EmployeeManagement;

import Controller.EmployeeManagement.LeaveController;
import model.Employee;
import model.Leave;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import util.Config;
import java.util.Date;
import util.Util;

public class LeaveManagement extends javax.swing.JFrame {

    Config cnf = new Config();
    public Logger LOG;

    DefaultTableModel model;
    LeaveController leaveContro = new LeaveController();

    String HardCordId = "5";

    public LeaveManagement() throws IOException {
        initComponents();

        //load data to combobox
        for (String str : leaveContro.getReportingManagers()) {
            cmbLeaveReportingManager.addItem(str);
        }

        loadBasicData(HardCordId);
        showAllLeaveData(HardCordId);

        //initialize log file
        LOG = cnf.getLogger(UserRegistration.class);
    }

    /*
    *Load Basic Employee details to page
    *Id -> Employee Id Pass by the Login
     */
    private void loadBasicData(String Id) throws IOException {

        Employee emp;
        emp = leaveContro.getEmployeeById(Id);

        txtLeaveId.setText(emp.getId());
        txtLeaveFirstName.setText(emp.getFirstName());
        txtLeaveLastName.setText(emp.getLastName());
        dateLeaveDate.setDate(new Date());
    }

    private void showAllLeaveData(String Id) {
        model = (DefaultTableModel) tblLeaveData.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        ArrayList<Leave> leaves = new ArrayList<>();

        try {
            leaves = leaveContro.getLeaves(Id);
        } catch (IOException e) {
            LOG.error("Cannot Get Leave Data to Table", e);
        }

        Object[] row = new Object[4];

        for (int i = 0; i < leaves.size(); i++) {
            row[0] = leaves.get(i).getDate();
            row[1] = leaves.get(i).getReportingManager();
            row[2] = leaves.get(i).getStatus();

            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeavePannel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateLeaveDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLeaveReason = new javax.swing.JTextArea();
        cmbLeaveReportingManager = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnLeaveClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLeaveData = new javax.swing.JTable();
        btnLeaveRequest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLeaveId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLeaveFirstName = new javax.swing.JTextField();
        txtLeaveLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1255, 547));
        setMinimumSize(new java.awt.Dimension(1255, 547));
        setSize(new java.awt.Dimension(1255, 547));
        getContentPane().setLayout(null);

        LeavePannel.setBackground(new java.awt.Color(0, 0, 0));
        LeavePannel.setForeground(new java.awt.Color(255, 255, 255));
        LeavePannel.setMaximumSize(new java.awt.Dimension(1255, 547));
        LeavePannel.setPreferredSize(new java.awt.Dimension(1255, 547));
        LeavePannel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Leave Management");
        LeavePannel.add(jLabel1);
        jLabel1.setBounds(480, 0, 340, 60);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reporting Manager");
        LeavePannel.add(jLabel3);
        jLabel3.setBounds(40, 460, 130, 30);

        dateLeaveDate.setDateFormatString("yyyy-MM-dd");
        dateLeaveDate.setMinSelectableDate(new Date());
        LeavePannel.add(dateLeaveDate);
        dateLeaveDate.setBounds(140, 200, 250, 30);

        txtLeaveReason.setColumns(20);
        txtLeaveReason.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtLeaveReason.setLineWrap(true);
        txtLeaveReason.setRows(5);
        jScrollPane1.setViewportView(txtLeaveReason);

        LeavePannel.add(jScrollPane1);
        jScrollPane1.setBounds(30, 250, 750, 190);

        cmbLeaveReportingManager.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LeavePannel.add(cmbLeaveReportingManager);
        cmbLeaveReportingManager.setBounds(190, 460, 250, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        LeavePannel.add(jLabel6);
        jLabel6.setBounds(40, 200, 100, 30);

        btnLeaveClear.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLeaveClear.setText("Clear");
        btnLeaveClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveClearActionPerformed(evt);
            }
        });
        LeavePannel.add(btnLeaveClear);
        btnLeaveClear.setBounds(550, 460, 100, 30);

        tblLeaveData.setBackground(new java.awt.Color(102, 102, 102));
        tblLeaveData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblLeaveData.setForeground(new java.awt.Color(255, 255, 255));
        tblLeaveData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Reporting Manager", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLeaveData);

        LeavePannel.add(jScrollPane2);
        jScrollPane2.setBounds(800, 70, 420, 420);

        btnLeaveRequest.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLeaveRequest.setText("Request ");
        btnLeaveRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveRequestActionPerformed(evt);
            }
        });
        LeavePannel.add(btnLeaveRequest);
        btnLeaveRequest.setBounds(670, 460, 100, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Id");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 100, 30);

        txtLeaveId.setEditable(false);
        txtLeaveId.setBackground(new java.awt.Color(0, 0, 0));
        txtLeaveId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtLeaveId);
        txtLeaveId.setBounds(110, 10, 250, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 70, 100, 30);

        txtLeaveFirstName.setEditable(false);
        txtLeaveFirstName.setBackground(new java.awt.Color(0, 0, 0));
        txtLeaveFirstName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtLeaveFirstName);
        txtLeaveFirstName.setBounds(110, 70, 250, 30);

        txtLeaveLastName.setEditable(false);
        txtLeaveLastName.setBackground(new java.awt.Color(0, 0, 0));
        txtLeaveLastName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtLeaveLastName);
        txtLeaveLastName.setBounds(490, 70, 250, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(390, 70, 100, 30);

        LeavePannel.add(jPanel2);
        jPanel2.setBounds(30, 70, 750, 120);

        getContentPane().add(LeavePannel);
        LeavePannel.setBounds(0, 0, 1240, 540);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeaveClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveClearActionPerformed
          Util.Clear(LeavePannel);
    }//GEN-LAST:event_btnLeaveClearActionPerformed

    private void btnLeaveRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveRequestActionPerformed
        
        //get details to send database
        Leave leave = new Leave();
        leave.setEmpId(txtLeaveId.getText());
        leave.setDate(new java.sql.Date(dateLeaveDate.getDate().getTime()));
        leave.setDiscription(txtLeaveReason.getText());
        leave.setReportingManager(cmbLeaveReportingManager.getSelectedItem().toString());
        leave.setStatus(Util.LEAVE_DEFAULT_STATUS);

        try {
            leaveContro.insert(leave);
        } catch (IOException ex) {
            LOG.error("Can not Insert Leave",ex);
        }
        
         showAllLeaveData(HardCordId);
         Util.Clear(LeavePannel);
        
        //send email
//        try {
//           leaveContro.sendMail(leaveContro.getEmailMap().get(cmbLeaveReportingManager.getSelectedItem().toString()),txtLeaveReason.getText());
//        } catch (IOException ex) {
//            LOG.error(ex, ex);
//        }
    }//GEN-LAST:event_btnLeaveRequestActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LeaveManagement().setVisible(true);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(LeaveManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeavePannel;
    private javax.swing.JButton btnLeaveClear;
    private javax.swing.JButton btnLeaveRequest;
    private javax.swing.JComboBox<String> cmbLeaveReportingManager;
    private com.toedter.calendar.JDateChooser dateLeaveDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLeaveData;
    private javax.swing.JTextField txtLeaveFirstName;
    private javax.swing.JTextField txtLeaveId;
    private javax.swing.JTextField txtLeaveLastName;
    private javax.swing.JTextArea txtLeaveReason;
    // End of variables declaration//GEN-END:variables
}
