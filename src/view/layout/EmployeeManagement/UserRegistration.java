/*
All the user Registration action done in this class. 
(add user to the system)
 */
package view.layout.EmployeeManagement;

import Controller.EmployeeManagement.EmployeeController;
import java.sql.SQLException;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import util.Util;

public class UserRegistration extends javax.swing.JFrame {

    public Logger LOG;

    public UserRegistration() {
        initComponents();

        PropertyConfigurator.configure(Util.PROPERTY_FILE_PATH);
        LOG = Logger.getLogger(UserRegistration.class);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Pluse");
        setMaximumSize(new java.awt.Dimension(1765, 770));
        setName("UserRegistration"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1255, 548));
        setSize(new java.awt.Dimension(1255, 548));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setText("User Registration Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 0, 370, 70);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 40, 150, 50);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Confirm password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 240, 210, 50);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 40, 150, 50);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("E-mail Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 140, 180, 50);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 240, 180, 50);

        txtFirstName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtFirstName.setOpaque(false);
        jPanel1.add(txtFirstName);
        txtFirstName.setBounds(250, 50, 270, 30);

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtEmail.setOpaque(false);
        jPanel1.add(txtEmail);
        txtEmail.setBounds(250, 150, 270, 30);
        txtEmail.getAccessibleContext().setAccessibleName("");

        txtLastName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtLastName.setOpaque(false);
        jPanel1.add(txtLastName);
        txtLastName.setBounds(850, 50, 270, 30);

        txtConfPassword.setOpaque(false);
        jPanel1.add(txtConfPassword);
        txtConfPassword.setBounds(850, 250, 270, 30);

        txtPassword.setOpaque(false);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(250, 250, 270, 30);

        btnCancelBotton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCancelBotton.setText("Cancel");
        jPanel1.add(btnCancelBotton);
        btnCancelBotton.setBounds(800, 370, 120, 30);

        btnRegister.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister);
        btnRegister.setBounds(1000, 370, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 80, 1160, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       
        EmployeeController empObj = new EmployeeController();

        empObj.setFirstName(txtFirstName.getText());
        empObj.setLastName(txtLastName.getText());
        empObj.setEmail(txtEmail.getText());
        empObj.setPassword(txtPassword.getText());

        try {
            empObj.save();
            System.out.println("Sucessfully Saved...");
        } catch (SQLException ex) {
            LOG.error(ex);
        }
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

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
    private javax.swing.JToggleButton btnCancelBotton;
    private javax.swing.JToggleButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
