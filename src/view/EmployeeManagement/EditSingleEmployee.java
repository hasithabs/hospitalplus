package view.EmployeeManagement;

import Controller.EmployeeManagement.EmployeeController;
import Model.EmployeeManagement.Employee;
import java.io.IOException;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import util.Config;


public class EditSingleEmployee extends javax.swing.JFrame {

    Config cnf = new Config();
    public Logger LOG;

    EmployeeController empCnt = new EmployeeController();
    String hardcodeID = "5";
    String Pass = "";
    public EditSingleEmployee() throws IOException{
        initComponents();
                
        loadData(hardcodeID);
    }

    
    /*
    *Load data to text fields 
    *Id -> employeeId
    */
    public void loadData (String Id) throws IOException{
        
        Employee emp ;
        emp = empCnt.getEmployeeById(Id);
        
        txtUserEditId.setText(emp.getId());
        
        //Set old password
        Pass=emp.getPassword();
        // set data to text fields
        txtUserEditId.setText(emp.getId());
        txtUserEditFirstName.setText(emp.getFirstName());
        txtUserEditLastName.setText(emp.getLastName());
        txtUserEditEmail.setText(emp.getEmail());
        txtUserEditNIC.setText(emp.getNIC());
        dateEditUserDOB.setDate(emp.getDOB());
        //set address
        try {
            txtUserEditAddressLine1.setText(emp.getAddress().split(";")[0]);
            txtUserEditAddressLine2.setText(emp.getAddress().split(";")[1]);
        } catch (Exception e) {
            LOG.error("Address has not defined in database");
            txtUserEditAddressLine1.setText("");
            txtUserEditAddressLine2.setText("");
            
        }
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditSingleUserPannel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserEditFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUserEditLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUserEditEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUserEditNIC = new javax.swing.JTextField();
        Addrress = new javax.swing.JLabel();
        txtUserEditAddressLine2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUserEditAddressLine1 = new javax.swing.JTextField();
        dateEditUserDOB = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        psdUserEditConfPassword = new javax.swing.JPasswordField();
        psdUserEditPassword = new javax.swing.JPasswordField();
        btnUserEditClear = new javax.swing.JButton();
        btnUserEditSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtUserEditId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1255, 547));
        setMinimumSize(new java.awt.Dimension(1255, 547));
        setPreferredSize(new java.awt.Dimension(1255, 547));
        getContentPane().setLayout(null);

        EditSingleUserPannel.setBackground(new java.awt.Color(0, 0, 0));
        EditSingleUserPannel.setForeground(new java.awt.Color(255, 255, 255));
        EditSingleUserPannel.setMaximumSize(new java.awt.Dimension(1255, 547));
        EditSingleUserPannel.setMinimumSize(new java.awt.Dimension(1255, 547));
        EditSingleUserPannel.setPreferredSize(new java.awt.Dimension(1255, 547));
        EditSingleUserPannel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit User Data");
        EditSingleUserPannel.add(jLabel1);
        jLabel1.setBounds(470, 0, 260, 60);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        EditSingleUserPannel.add(jLabel3);
        jLabel3.setBounds(140, 160, 80, 30);

        txtUserEditFirstName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        EditSingleUserPannel.add(txtUserEditFirstName);
        txtUserEditFirstName.setBounds(280, 160, 250, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        EditSingleUserPannel.add(jLabel4);
        jLabel4.setBounds(690, 160, 90, 30);

        txtUserEditLastName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        EditSingleUserPannel.add(txtUserEditLastName);
        txtUserEditLastName.setBounds(850, 160, 250, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        EditSingleUserPannel.add(jLabel5);
        jLabel5.setBounds(140, 230, 60, 30);

        txtUserEditEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        EditSingleUserPannel.add(txtUserEditEmail);
        txtUserEditEmail.setBounds(280, 230, 250, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NIC");
        EditSingleUserPannel.add(jLabel6);
        jLabel6.setBounds(690, 230, 30, 30);

        txtUserEditNIC.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        EditSingleUserPannel.add(txtUserEditNIC);
        txtUserEditNIC.setBounds(850, 230, 250, 30);

        Addrress.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Addrress.setForeground(new java.awt.Color(255, 255, 255));
        Addrress.setText("Addrress");
        EditSingleUserPannel.add(Addrress);
        Addrress.setBounds(140, 300, 80, 30);

        txtUserEditAddressLine2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        EditSingleUserPannel.add(txtUserEditAddressLine2);
        txtUserEditAddressLine2.setBounds(280, 340, 250, 30);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date Of Birth");
        EditSingleUserPannel.add(jLabel8);
        jLabel8.setBounds(690, 300, 100, 30);

        txtUserEditAddressLine1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        EditSingleUserPannel.add(txtUserEditAddressLine1);
        txtUserEditAddressLine1.setBounds(280, 300, 250, 30);

        dateEditUserDOB.setDateFormatString("yyyy-MM-dd");
        dateEditUserDOB.setMaxSelectableDate(new java.util.Date(946666872000L));
        EditSingleUserPannel.add(dateEditUserDOB);
        dateEditUserDOB.setBounds(850, 300, 250, 30);
        dateEditUserDOB.getAccessibleContext().setAccessibleName("");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("New Password");
        EditSingleUserPannel.add(jLabel7);
        jLabel7.setBounds(140, 400, 100, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirm New Password");
        EditSingleUserPannel.add(jLabel9);
        jLabel9.setBounds(690, 400, 150, 30);
        EditSingleUserPannel.add(psdUserEditConfPassword);
        psdUserEditConfPassword.setBounds(850, 400, 250, 30);
        EditSingleUserPannel.add(psdUserEditPassword);
        psdUserEditPassword.setBounds(280, 400, 250, 30);

        btnUserEditClear.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnUserEditClear.setText("Clear");
        btnUserEditClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserEditClearActionPerformed(evt);
            }
        });
        EditSingleUserPannel.add(btnUserEditClear);
        btnUserEditClear.setBounds(870, 470, 100, 30);

        btnUserEditSave.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnUserEditSave.setText("Save");
        btnUserEditSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserEditSaveActionPerformed(evt);
            }
        });
        EditSingleUserPannel.add(btnUserEditSave);
        btnUserEditSave.setBounds(1000, 470, 100, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtUserEditId.setEditable(false);
        txtUserEditId.setBackground(new java.awt.Color(0, 0, 0));
        txtUserEditId.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUserEditId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtUserEditId);
        txtUserEditId.setBounds(150, 20, 250, 30);
        txtUserEditId.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 120, 30);

        EditSingleUserPannel.add(jPanel1);
        jPanel1.setBounds(390, 70, 420, 70);

        getContentPane().add(EditSingleUserPannel);
        EditSingleUserPannel.setBounds(0, 0, 1255, 547);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserEditClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserEditClearActionPerformed
        try {
            loadData(hardcodeID);
        } catch (IOException ex) {
           LOG.error(ex, ex);
        }
        
    }//GEN-LAST:event_btnUserEditClearActionPerformed

    
   
    private void btnUserEditSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserEditSaveActionPerformed
        
        Employee emp = new Employee();
        
        //validate password
        String Pass = empCnt.getLatestPassword(new String(psdUserEditPassword.getPassword()),  new String(psdUserEditConfPassword.getPassword()), this.Pass);
        
        //load data to employee object
        emp.setId(txtUserEditId.getText());
        emp.setFirstName(txtUserEditFirstName.getText());
        emp.setLastName(txtUserEditLastName.getText());
        emp.setEmail(txtUserEditEmail.getText());
        emp.setNIC(txtUserEditNIC.getText());
        emp.setPassword(Pass);
        
        emp.setAddress(txtUserEditAddressLine1.getText() + ";" + txtUserEditAddressLine2.getText());
        
        try {
            emp.setDOB(new java.sql.Date(dateEditUserDOB.getDate().getTime()));
        } catch (Exception e) {
            LOG.error("Update With Empty Values");
            emp.setDOB(null);
        }

        try {
            empCnt.updateSingleUser(emp);
            loadData(hardcodeID);

        } catch (IOException e) {
            LOG.error("Cannot Update this Employee", e);
        }

        
        
    }//GEN-LAST:event_btnUserEditSaveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditSingleEmployee().setVisible(true);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(EditSingleEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addrress;
    private javax.swing.JPanel EditSingleUserPannel;
    private javax.swing.JButton btnUserEditClear;
    private javax.swing.JButton btnUserEditSave;
    private com.toedter.calendar.JDateChooser dateEditUserDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField psdUserEditConfPassword;
    private javax.swing.JPasswordField psdUserEditPassword;
    private javax.swing.JTextField txtUserEditAddressLine1;
    private javax.swing.JTextField txtUserEditAddressLine2;
    private javax.swing.JTextField txtUserEditEmail;
    private javax.swing.JTextField txtUserEditFirstName;
    private javax.swing.JTextField txtUserEditId;
    private javax.swing.JTextField txtUserEditLastName;
    private javax.swing.JTextField txtUserEditNIC;
    // End of variables declaration//GEN-END:variables
}
