package view.EmployeeManagement;

import Controller.EmployeeManagement.EmployeeController;
import Model.EmployeeManagement.Employee;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import util.Config;
import java.util.Date;
import util.Util;

public class EditEmployee extends javax.swing.JFrame {

    Config cnf = new Config();
    public org.apache.log4j.Logger LOG;

    DefaultTableModel model;
    int selectedIndex;
    EmployeeController empCnt = new EmployeeController();

    public EditEmployee() throws IOException, ParseException {       
        initComponents();
        showUser(empCnt.getAllRegistedEmployeeData());

        //initialize log file
        LOG = cnf.getLogger(UserRegistration.class);

        //give initial forcus to ID field
        txtEditID.requestFocus();

        //load data to combobox
        for (String str : empCnt.getPosiition()) {
            cmbEditPossition.addItem(str);
        }

       
   
    }

    public void showUser(ArrayList<Employee> dataList) {
        model = (DefaultTableModel) tblEmpData.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        Object[] row = new Object[4];

        for (int i = 0; i < dataList.size(); i++) {
            row[0] = dataList.get(i).getId();
            row[1] = dataList.get(i).getFirstName();
            row[2] = dataList.get(i).getLastName();
            row[3] = dataList.get(i).getNIC();

            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlEditUser = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEditFirstName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEditLastName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEditEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEditID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEditAddressLine2 = new javax.swing.JTextField();
        txtEditAddressLine1 = new javax.swing.JTextField();
        dateEditDOB = new com.toedter.calendar.JDateChooser();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rdbFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        cmbEditPossition = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpData = new javax.swing.JTable();
        txtEditSearch = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEditNIC = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEditPassword = new javax.swing.JPasswordField();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1255, 547));
        setMinimumSize(new java.awt.Dimension(1255, 547));
        setPreferredSize(new java.awt.Dimension(1255, 547));
        getContentPane().setLayout(null);

        pnlEditUser.setBackground(new java.awt.Color(0, 0, 0));
        pnlEditUser.setMaximumSize(new java.awt.Dimension(1255, 547));
        pnlEditUser.setMinimumSize(new java.awt.Dimension(1255, 547));
        pnlEditUser.setName(""); // NOI18N
        pnlEditUser.setLayout(null);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FirstName");
        pnlEditUser.add(jLabel9);
        jLabel9.setBounds(30, 340, 80, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        pnlEditUser.add(jLabel7);
        jLabel7.setBounds(430, 400, 80, 30);

        txtEditFirstName.setBackground(new java.awt.Color(0, 0, 0));
        txtEditFirstName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEditFirstName.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditUser.add(txtEditFirstName);
        txtEditFirstName.setBounds(150, 340, 250, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name");
        pnlEditUser.add(jLabel10);
        jLabel10.setBounds(430, 340, 80, 30);

        txtEditLastName.setBackground(new java.awt.Color(0, 0, 0));
        txtEditLastName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEditLastName.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditUser.add(txtEditLastName);
        txtEditLastName.setBounds(550, 340, 250, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        pnlEditUser.add(jLabel11);
        jLabel11.setBounds(840, 220, 80, 30);

        txtEditEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtEditEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEditEmail.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditUser.add(txtEditEmail);
        txtEditEmail.setBounds(960, 220, 250, 30);

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID");
        pnlEditUser.add(jLabel12);
        jLabel12.setBounds(840, 100, 80, 30);

        txtEditID.setBackground(new java.awt.Color(0, 0, 0));
        txtEditID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEditID.setForeground(new java.awt.Color(255, 255, 255));
        txtEditID.setEnabled(false);
        pnlEditUser.add(txtEditID);
        txtEditID.setBounds(960, 100, 250, 30);

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gender");
        pnlEditUser.add(jLabel13);
        jLabel13.setBounds(30, 390, 80, 30);

        txtEditAddressLine2.setBackground(new java.awt.Color(0, 0, 0));
        txtEditAddressLine2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEditAddressLine2.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditUser.add(txtEditAddressLine2);
        txtEditAddressLine2.setBounds(550, 440, 250, 30);

        txtEditAddressLine1.setBackground(new java.awt.Color(0, 0, 0));
        txtEditAddressLine1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEditAddressLine1.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditUser.add(txtEditAddressLine1);
        txtEditAddressLine1.setBounds(550, 400, 250, 30);

        dateEditDOB.setBackground(new java.awt.Color(51, 51, 51));
        dateEditDOB.setForeground(new java.awt.Color(51, 51, 51));
        dateEditDOB.setDateFormatString("yyyy-MM-dd");
        dateEditDOB.setMaxSelectableDate(new java.util.Date(946666875000L));
        dateEditDOB.setOpaque(false);
        pnlEditUser.add(dateEditDOB);
        dateEditDOB.setBounds(150, 440, 250, 30);

        btnClear.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlEditUser.add(btnClear);
        btnClear.setBounds(890, 440, 100, 30);

        btnUpdate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlEditUser.add(btnUpdate);
        btnUpdate.setBounds(1110, 440, 100, 30);

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Possition");
        pnlEditUser.add(jLabel14);
        jLabel14.setBounds(840, 160, 80, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DOB");
        pnlEditUser.add(jLabel15);
        jLabel15.setBounds(30, 440, 80, 30);

        rdbFemale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdbFemale.setForeground(new java.awt.Color(255, 255, 255));
        rdbFemale.setText("Female");
        pnlEditUser.add(rdbFemale);
        rdbFemale.setBounds(270, 390, 93, 27);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edit User Data");
        pnlEditUser.add(jLabel8);
        jLabel8.setBounds(520, 10, 320, 60);

        rdbMale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdbMale.setForeground(new java.awt.Color(255, 255, 255));
        rdbMale.setText("Male");
        pnlEditUser.add(rdbMale);
        rdbMale.setBounds(150, 390, 55, 27);

        pnlEditUser.add(cmbEditPossition);
        cmbEditPossition.setBounds(960, 160, 250, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        tblEmpData.setBackground(new java.awt.Color(51, 51, 51));
        tblEmpData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblEmpData.setForeground(new java.awt.Color(204, 255, 255));
        tblEmpData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "NIC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpData.setGridColor(new java.awt.Color(51, 51, 51));
        tblEmpData.setSelectionBackground(new java.awt.Color(51, 255, 255));
        tblEmpData.setVerifyInputWhenFocusTarget(false);
        tblEmpData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpData);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 700, 210);

        txtEditSearch.setBackground(new java.awt.Color(0, 0, 0));
        txtEditSearch.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        txtEditSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtEditSearch.setText("Search by any field");
        txtEditSearch.setToolTipText("");
        txtEditSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEditSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEditSearchFocusLost(evt);
            }
        });
        txtEditSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtEditSearch);
        txtEditSearch.setBounds(10, 10, 250, 30);

        pnlEditUser.add(jPanel1);
        jPanel1.setBounds(20, 40, 720, 280);

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("NIC");
        pnlEditUser.add(jLabel16);
        jLabel16.setBounds(840, 280, 80, 30);

        txtEditNIC.setBackground(new java.awt.Color(0, 0, 0));
        txtEditNIC.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEditNIC.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditUser.add(txtEditNIC);
        txtEditNIC.setBounds(960, 280, 250, 30);

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Password");
        pnlEditUser.add(jLabel17);
        jLabel17.setBounds(840, 340, 80, 30);

        txtEditPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtEditPassword.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditUser.add(txtEditPassword);
        txtEditPassword.setBounds(960, 340, 250, 30);
        txtEditPassword.getAccessibleContext().setAccessibleName("");

        btnDelete.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlEditUser.add(btnDelete);
        btnDelete.setBounds(1000, 440, 100, 30);

        getContentPane().add(pnlEditUser);
        pnlEditUser.setBounds(0, 0, 1255, 548);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Util.Clear(pnlEditUser);
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtEditSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditSearchKeyReleased
        Util.filterDataFromJTable(tblEmpData, txtEditSearch.getText());
    }//GEN-LAST:event_txtEditSearchKeyReleased

    //add default text after forcus lost to search field.
    private void txtEditSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditSearchFocusLost
        txtEditSearch.setText("Search by any field");
    }//GEN-LAST:event_txtEditSearchFocusLost

    //clear the text when mouse go in to text field in search field
    private void txtEditSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditSearchFocusGained
        txtEditSearch.setText("");
    }//GEN-LAST:event_txtEditSearchFocusGained

    //load data to text fileds
    private void tblEmpDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpDataMouseClicked
        try {
            model = (DefaultTableModel) tblEmpData.getModel();
            selectedIndex = tblEmpData.getSelectedRow();

            Employee emp = new Employee();
            EmployeeController empContro = new EmployeeController();
            //call to DB to get the data from ID.
            emp = empContro.getEmployeeById(model.getValueAt(selectedIndex, 0).toString());

            // set data to text fields
            txtEditID.setText(emp.getId());
            txtEditFirstName.setText(emp.getFirstName());
            txtEditLastName.setText(emp.getLastName());
            txtEditEmail.setText(emp.getEmail());
            txtEditNIC.setText(emp.getNIC());
            txtEditPassword.setText(emp.getPassword());
            dateEditDOB.setDate(emp.getDOB());
            cmbEditPossition.setSelectedItem(emp.getPossition());

            //set address
            try {
                txtEditAddressLine1.setText(emp.getAddress().split(";")[0]);
                txtEditAddressLine2.setText(emp.getAddress().split(";")[1]);
            } catch (Exception e) {
                LOG.error("Address has not defined in database");
                txtEditAddressLine1.setText("");
                txtEditAddressLine2.setText("");

            }

            //set gender
            try {
                if (emp.getGender().equals("Male")) {
                    rdbMale.setSelected(true);
                } else if (emp.getGender().equals("Female")) {
                    rdbFemale.setSelected(true);
                }
            } catch (Exception e) {
                LOG.error("gender has not defined in database");
                buttonGroup1.clearSelection();

            }

        } catch (IOException ex) {
            LOG.error(ex, ex);
        }
    }//GEN-LAST:event_tblEmpDataMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String Gender = null;
        Employee emp = new Employee();

        if (rdbFemale.isSelected()) {
            Gender = "Female";
        } else if (rdbMale.isSelected()) {
            Gender = "Male";
        }
        emp.setId(txtEditID.getText());
        emp.setFirstName(txtEditFirstName.getText());
        emp.setLastName(txtEditLastName.getText());
        emp.setEmail(txtEditEmail.getText());
        emp.setNIC(txtEditNIC.getText());

        emp.setGender(Gender);
        emp.setAddress(txtEditAddressLine1.getText() + ";" + txtEditAddressLine2.getText());

        emp.setPassword(Arrays.toString(txtEditPassword.getPassword()));

        try {
            emp.setPossition(cmbEditPossition.getSelectedItem().toString());
            emp.setDOB(new java.sql.Date(dateEditDOB.getDate().getTime()));
        } catch (Exception e) {
            LOG.error("Update With Empty Values");
            emp.setPossition(null);
            emp.setDOB(null);
        }

        try {
            empCnt.AdminUpdate(emp);
            showUser(empCnt.getAllRegistedEmployeeData());
            Util.Clear(pnlEditUser);

        } catch (IOException e) {
            LOG.error("Cannot Update the Employee", e);
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String Id = txtEditID.getText();

        try {
            empCnt.DeleteEmployee(Id);
            showUser(empCnt.getAllRegistedEmployeeData());
            Util.Clear(pnlEditUser);

        } catch (IOException e) {
            LOG.error("Cannot Delete Employee process", e);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditEmployee().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EditEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(EditEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbEditPossition;
    private com.toedter.calendar.JDateChooser dateEditDOB;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlEditUser;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable tblEmpData;
    private javax.swing.JTextField txtEditAddressLine1;
    private javax.swing.JTextField txtEditAddressLine2;
    private javax.swing.JTextField txtEditEmail;
    private javax.swing.JTextField txtEditFirstName;
    private javax.swing.JTextField txtEditID;
    private javax.swing.JTextField txtEditLastName;
    private javax.swing.JTextField txtEditNIC;
    private javax.swing.JPasswordField txtEditPassword;
    private javax.swing.JTextField txtEditSearch;
    // End of variables declaration//GEN-END:variables
}
