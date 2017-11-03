/*
All the user Registration action done in this class. 
(add user to the system)
 */
package view.EmployeeManagement;

import Controller.EmployeeManagement.EmployeeController;
import Model.EmployeeManagement.Employee;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import util.Config;
import util.Util;

public class UserRegistration extends javax.swing.JFrame {

    Config cnf = new Config();
    public Logger LOG;

    public UserRegistration() {
        initComponents();
        //initialize log file
        LOG = cnf.getLogger(UserRegistration.class);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrationPannel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtConfPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        btnCancelBotton = new javax.swing.JToggleButton();
        btnRegister = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Pluse");
        setMaximumSize(new java.awt.Dimension(1765, 770));
        setName("UserRegistration"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1255, 548));
        setSize(new java.awt.Dimension(1255, 548));
        getContentPane().setLayout(null);

        RegistrationPannel.setBackground(new java.awt.Color(0, 0, 0));
        RegistrationPannel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        RegistrationPannel.add(jLabel2);
        jLabel2.setBounds(640, 150, 150, 50);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm password");
        RegistrationPannel.add(jLabel3);
        jLabel3.setBounds(640, 350, 210, 50);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        RegistrationPannel.add(jLabel4);
        jLabel4.setBounds(80, 150, 150, 50);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail Address");
        RegistrationPannel.add(jLabel5);
        jLabel5.setBounds(80, 250, 180, 50);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        RegistrationPannel.add(jLabel6);
        jLabel6.setBounds(80, 350, 180, 50);

        txtFirstName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtFirstName.setOpaque(false);
        RegistrationPannel.add(txtFirstName);
        txtFirstName.setBounds(290, 160, 270, 30);

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtEmail.setOpaque(false);
        RegistrationPannel.add(txtEmail);
        txtEmail.setBounds(290, 260, 270, 30);
        txtEmail.getAccessibleContext().setAccessibleName("");

        txtLastName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtLastName.setOpaque(false);
        RegistrationPannel.add(txtLastName);
        txtLastName.setBounds(890, 160, 270, 30);

        txtConfPassword.setOpaque(false);
        RegistrationPannel.add(txtConfPassword);
        txtConfPassword.setBounds(890, 360, 270, 30);

        txtPassword.setOpaque(false);
        RegistrationPannel.add(txtPassword);
        txtPassword.setBounds(290, 360, 270, 30);

        btnCancelBotton.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelBotton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCancelBotton.setText("Cancel");
        btnCancelBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelBottonActionPerformed(evt);
            }
        });
        RegistrationPannel.add(btnCancelBotton);
        btnCancelBotton.setBounds(840, 450, 120, 30);

        btnRegister.setBackground(new java.awt.Color(102, 102, 102));
        btnRegister.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        RegistrationPannel.add(btnRegister);
        btnRegister.setBounds(1040, 450, 120, 30);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Registration Form");
        RegistrationPannel.add(jLabel1);
        jLabel1.setBounds(460, 10, 370, 70);

        getContentPane().add(RegistrationPannel);
        RegistrationPannel.setBounds(0, 0, 1260, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        Employee empObj = new Employee();
        EmployeeController empContro = new EmployeeController();
        
        
        empObj.setFirstName(txtFirstName.getText());
        empObj.setLastName(txtLastName.getText());
        empObj.setEmail(txtEmail.getText());
        empObj.setPassword(new String(txtPassword.getPassword()));
        empObj.setConfigPassword(new String(txtConfPassword.getPassword()));

        try {
            empContro.save(empObj);
            Util.Clear(RegistrationPannel);
        } catch (SQLException ex) {
            LOG.error(ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnCancelBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelBottonActionPerformed

        Util.Clear(RegistrationPannel);

    }//GEN-LAST:event_btnCancelBottonActionPerformed

    public static void main(String args[]) throws SQLException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RegistrationPannel;
    private javax.swing.JToggleButton btnCancelBotton;
    private javax.swing.JToggleButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtConfPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
