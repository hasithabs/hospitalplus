/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PatientManagement;

/**
 *
 * @author Y4SHVINE
 */
import Controller.PatientManagement.ServiceController;
import java.util.Date;
import javax.swing.JComboBox;
import model.patientModels.Operation;
import org.apache.log4j.Logger;
import util.DBUtil;
import static util.DBUtil.LOG;
import util.Validation;
import util.messageAlert;

public class OperationAssignment extends javax.swing.JFrame {

    /**
     * Creates new form OperationAssignment
     */
    //
    public OperationAssignment() {
        initComponents();
        ServiceController.getInstance().getOperationTypeList(opOperationType,"OperationTypes");
        getAllPatientIDs(opPatientIDs);
        LOG = Logger.getLogger(OperationAssignment.class);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void getAllPatientIDs(JComboBox jc){
        try{
            ServiceController.getInstance().getPatientIDList(opPatientIDs); 
        }catch(Exception e){
            messageAlert.getMessageAlert(DBUtil.getXMLData("PatientMsg", "message", "Err_Something_Went_Wrong"), "error");
            LOG.error(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        patientManagementLbl = new javax.swing.JLabel();
        signupFNameLbl1 = new javax.swing.JLabel();
        opPatientIDs = new javax.swing.JComboBox<>();
        signupFNameLbl2 = new javax.swing.JLabel();
        opOperationType = new javax.swing.JComboBox<>();
        opDate = new javax.swing.JLabel();
        opOperationDate = new com.toedter.calendar.JDateChooser();
        signupFNameLbl3 = new javax.swing.JLabel();
        opDoctor = new javax.swing.JComboBox<>();
        opRegBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 770));
        setMinimumSize(new java.awt.Dimension(900, 770));
        setPreferredSize(new java.awt.Dimension(900, 770));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        patientManagementLbl.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        patientManagementLbl.setForeground(new java.awt.Color(255, 255, 255));
        patientManagementLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientManagementLbl.setText("Operation Registration");
        jPanel1.add(patientManagementLbl);
        patientManagementLbl.setBounds(0, 30, 900, 60);

        signupFNameLbl1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        signupFNameLbl1.setForeground(new java.awt.Color(255, 255, 255));
        signupFNameLbl1.setText("Patient ID");
        signupFNameLbl1.setMaximumSize(new java.awt.Dimension(200, 35));
        signupFNameLbl1.setMinimumSize(new java.awt.Dimension(200, 35));
        signupFNameLbl1.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.add(signupFNameLbl1);
        signupFNameLbl1.setBounds(200, 175, 200, 35);

        jPanel1.add(opPatientIDs);
        opPatientIDs.setBounds(400, 175, 300, 35);

        signupFNameLbl2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        signupFNameLbl2.setForeground(new java.awt.Color(255, 255, 255));
        signupFNameLbl2.setText("Operation Type");
        signupFNameLbl2.setMaximumSize(new java.awt.Dimension(200, 35));
        signupFNameLbl2.setMinimumSize(new java.awt.Dimension(200, 35));
        signupFNameLbl2.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.add(signupFNameLbl2);
        signupFNameLbl2.setBounds(200, 250, 200, 35);

        jPanel1.add(opOperationType);
        opOperationType.setBounds(400, 250, 300, 35);

        opDate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        opDate.setForeground(new java.awt.Color(255, 255, 255));
        opDate.setText("Operation Date");
        opDate.setMaximumSize(new java.awt.Dimension(200, 35));
        opDate.setMinimumSize(new java.awt.Dimension(200, 35));
        opDate.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.add(opDate);
        opDate.setBounds(200, 400, 200, 35);

        opOperationDate.setMinSelectableDate(new Date());
        jPanel1.add(opOperationDate);
        opOperationDate.setBounds(400, 400, 300, 35);

        signupFNameLbl3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        signupFNameLbl3.setForeground(new java.awt.Color(255, 255, 255));
        signupFNameLbl3.setText("Doctor");
        signupFNameLbl3.setMaximumSize(new java.awt.Dimension(200, 35));
        signupFNameLbl3.setMinimumSize(new java.awt.Dimension(200, 35));
        signupFNameLbl3.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.add(signupFNameLbl3);
        signupFNameLbl3.setBounds(200, 325, 200, 35);

        opDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item" }));
        jPanel1.add(opDoctor);
        opDoctor.setBounds(400, 325, 300, 35);

        opRegBtn.setText("Register");
        opRegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegBtnActionPerformed(evt);
            }
        });
        jPanel1.add(opRegBtn);
        opRegBtn.setBounds(400, 500, 200, 35);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opRegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegBtnActionPerformed
         try{
            Operation op = new Operation(
                    opPatientIDs.getSelectedItem().toString(),
                    opOperationType.getSelectedItem().toString(),
                    opDoctor.getSelectedItem().toString(),
                    Validation.convertUtilDateToSqlDate(opOperationDate.getDate())
            );
            
            boolean isAssigned = ServiceController.getInstance().OperationRegistration(op); 
            if(isAssigned){
                messageAlert.getMessageAlert(DBUtil.getXMLData("PatientMsg", "message", "Msg_Succesfully_Registered"), "success");
            }else{
                messageAlert.getMessageAlert(DBUtil.getXMLData("PatientMsg", "message", "Err_Something_Went_Wrong"), "error");
                LOG.error(DBUtil.getXMLData("PatientMsg", "message", "Err_Something_Went_Wrong"));
            }
        }catch(Exception e){
            messageAlert.getMessageAlert(DBUtil.getXMLData("PatientMsg", "message", "Err_Something_Went_Wrong"), "error");
            LOG.error(e);
        }
    }//GEN-LAST:event_opRegBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OperationAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperationAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperationAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperationAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperationAssignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel opDate;
    private javax.swing.JComboBox<String> opDoctor;
    private com.toedter.calendar.JDateChooser opOperationDate;
    private javax.swing.JComboBox<String> opOperationType;
    private javax.swing.JComboBox<String> opPatientIDs;
    private javax.swing.JButton opRegBtn;
    private javax.swing.JLabel patientManagementLbl;
    private javax.swing.JLabel signupFNameLbl1;
    private javax.swing.JLabel signupFNameLbl2;
    private javax.swing.JLabel signupFNameLbl3;
    // End of variables declaration//GEN-END:variables
}
