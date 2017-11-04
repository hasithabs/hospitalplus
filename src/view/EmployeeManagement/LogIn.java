package view.EmployeeManagement;

import Controller.EmployeeManagement.EmployeeController;
import main.Main;
import model.Employee;
import org.apache.log4j.Logger;
import util.Config;
import util.Util;

public class LogIn extends javax.swing.JFrame {
    
    /*****LogIn Variables*****/
    public static boolean isLogin = false;
    public static String UserType = null;
    public static String UserId = null;
    /************************/
    
    Config cnf = new Config();
    public Logger LOG;
    EmployeeController empContro = new EmployeeController();
    Employee empObj = null;
    
    public LogIn() {
        initComponents();
        //initialize log file
        LOG = cnf.getLogger(LogIn.class);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogPage = new javax.swing.JPanel();
        pnlLogInBox = new javax.swing.JPanel();
        pswLoginPassword = new javax.swing.JPasswordField();
        txtLogInUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1255, 547));
        setMinimumSize(new java.awt.Dimension(1255, 547));
        setPreferredSize(new java.awt.Dimension(1255, 547));
        setSize(new java.awt.Dimension(1255, 547));
        getContentPane().setLayout(null);

        pnlLogPage.setBackground(new java.awt.Color(0, 0, 0));
        pnlLogPage.setPreferredSize(new java.awt.Dimension(1255, 547));
        pnlLogPage.setLayout(null);

        pnlLogInBox.setBackground(new java.awt.Color(102, 102, 102));
        pnlLogInBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LogIn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlLogInBox.setForeground(new java.awt.Color(255, 255, 255));
        pnlLogInBox.setLayout(null);
        pnlLogInBox.add(pswLoginPassword);
        pswLoginPassword.setBounds(500, 170, 250, 30);

        txtLogInUserName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        pnlLogInBox.add(txtLogInUserName);
        txtLogInUserName.setBounds(500, 100, 250, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");
        pnlLogInBox.add(jLabel2);
        jLabel2.setBounds(360, 100, 110, 24);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        pnlLogInBox.add(jLabel1);
        jLabel1.setBounds(360, 170, 110, 24);

        btnLogin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLogin.setText("LogIn");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogInBox.add(btnLogin);
        btnLogin.setBounds(640, 270, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/EmployeeManagement/LogUser.png"))); // NOI18N
        pnlLogInBox.add(jLabel4);
        jLabel4.setBounds(80, 80, 180, 140);

        pnlLogPage.add(pnlLogInBox);
        pnlLogInBox.setBounds(220, 80, 810, 370);

        getContentPane().add(pnlLogPage);
        pnlLogPage.setBounds(0, 0, 1255, 547);
        pnlLogPage.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        try {
            
            if(empContro.isLog(txtLogInUserName.getText(), new String(pswLoginPassword.getPassword()))){
                empObj=empContro.logIn(txtLogInUserName.getText(), new String(pswLoginPassword.getPassword()));
                isLogin=true;
                UserType= empObj.getPossition();
                UserId = empObj.getId();
                LOG.info(isLogin+" | "+UserId+" | "+UserType);
            }
            
            
        } catch (Exception ex) {
            LOG.error("Login Fail",ex);
        }
        
          Util.Clear(pnlLogInBox);
        
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlLogInBox;
    private javax.swing.JPanel pnlLogPage;
    private javax.swing.JPasswordField pswLoginPassword;
    private javax.swing.JTextField txtLogInUserName;
    // End of variables declaration//GEN-END:variables
}
