/*
All the user Registration action done in this class. 
(add user to the system)
 */
package view.layout.EmployeeManagement;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Pluse");
        setMaximumSize(new java.awt.Dimension(1765, 770));
        setName("UserRegistration"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1255, 548));
        setSize(new java.awt.Dimension(1255, 548));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("User Registration Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(504, 0, 250, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
       
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
