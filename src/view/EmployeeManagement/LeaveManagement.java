
package view.EmployeeManagement;


public class LeaveManagement extends javax.swing.JFrame {

    
    public LeaveManagement() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLeaveId = new javax.swing.JTextField();
        txtLeaveFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLeaveLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateLeaveDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLeaveReason = new javax.swing.JTextArea();
        cmbLeaveReportingManager = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnLeaveClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLeaveRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1255, 547));
        setMinimumSize(new java.awt.Dimension(1255, 547));
        setSize(new java.awt.Dimension(1255, 547));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1255, 547));
        jPanel1.setPreferredSize(new java.awt.Dimension(1255, 547));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Leave Management");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 0, 340, 60);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 100, 30);

        txtLeaveId.setBackground(new java.awt.Color(0, 0, 0));
        txtLeaveId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtLeaveId);
        txtLeaveId.setBounds(140, 80, 250, 30);

        txtLeaveFirstName.setBackground(new java.awt.Color(0, 0, 0));
        txtLeaveFirstName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtLeaveFirstName);
        txtLeaveFirstName.setBounds(140, 140, 250, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reporting Manager");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 460, 130, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 140, 100, 30);

        txtLeaveLastName.setBackground(new java.awt.Color(0, 0, 0));
        txtLeaveLastName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtLeaveLastName);
        txtLeaveLastName.setBounds(530, 140, 250, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 140, 100, 30);

        dateLeaveDate.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(dateLeaveDate);
        dateLeaveDate.setBounds(140, 200, 250, 30);

        txtLeaveReason.setColumns(20);
        txtLeaveReason.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtLeaveReason.setLineWrap(true);
        txtLeaveReason.setRows(5);
        jScrollPane1.setViewportView(txtLeaveReason);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 250, 750, 190);

        cmbLeaveReportingManager.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmbLeaveReportingManager.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A.B.C Perera", "Jhone Dao", "Tuna", " " }));
        jPanel1.add(cmbLeaveReportingManager);
        cmbLeaveReportingManager.setBounds(190, 460, 250, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 200, 100, 30);

        btnLeaveClear.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLeaveClear.setText("Clear");
        btnLeaveClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeaveClear);
        btnLeaveClear.setBounds(550, 460, 100, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(800, 70, 420, 420);

        btnLeaveRequest.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLeaveRequest.setText("Request ");
        jPanel1.add(btnLeaveRequest);
        btnLeaveRequest.setBounds(670, 460, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1255, 547);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeaveClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveClearActionPerformed
       
    }//GEN-LAST:event_btnLeaveClearActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaveManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtLeaveFirstName;
    private javax.swing.JTextField txtLeaveId;
    private javax.swing.JTextField txtLeaveLastName;
    private javax.swing.JTextArea txtLeaveReason;
    // End of variables declaration//GEN-END:variables
}
