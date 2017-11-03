/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PatientManagement;

import Controller.PatientManagement.ServiceController;
import java.util.Date;
import javax.swing.JComboBox;
import model.patientModels.Checkup;
import util.DBUtil;
import static util.DBUtil.LOG;
import util.Validation;
import util.messageAlert;

/**
 *
 * @author Y4SHVINE
 */
public class CheckUpAssignment extends javax.swing.JFrame {

    /**
     * Creates new form CheckUpAssignment
     */
    public CheckUpAssignment() {
        initComponents();
        ServiceController.getInstance().getOperationTypeList(cuCheckUpType,"CheckUpTypes");
        getAllPatientIDs(cuPatientIDs);
    }

    private void getAllPatientIDs(JComboBox jc){
        try{
            ServiceController.getInstance().getPatientIDList(jc); 
        }catch(Exception e){
            messageAlert.getMessageAlert(DBUtil.getXMLData("PatientMsg", "message", "Err_Something_Went_Wrong"), "error");
            LOG.error(e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cuPatientIDs = new javax.swing.JComboBox<>();
        patientManagementLbl = new javax.swing.JLabel();
        signupFNameLbl1 = new javax.swing.JLabel();
        signupFNameLbl2 = new javax.swing.JLabel();
        cuCheckUpType = new javax.swing.JComboBox<>();
        cuDate = new javax.swing.JLabel();
        cuCheckUpDate = new com.toedter.calendar.JDateChooser();
        cuAssignBtn = new javax.swing.JButton();
        opDate1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cuAdditionalInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 770));
        setMinimumSize(new java.awt.Dimension(900, 770));
        setPreferredSize(new java.awt.Dimension(900, 770));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jPanel1.add(cuPatientIDs);
        cuPatientIDs.setBounds(400, 175, 300, 35);

        patientManagementLbl.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        patientManagementLbl.setForeground(new java.awt.Color(255, 255, 255));
        patientManagementLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientManagementLbl.setText("CheckUp Assignment");
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

        signupFNameLbl2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        signupFNameLbl2.setForeground(new java.awt.Color(255, 255, 255));
        signupFNameLbl2.setText("CheckUp Type");
        signupFNameLbl2.setMaximumSize(new java.awt.Dimension(200, 35));
        signupFNameLbl2.setMinimumSize(new java.awt.Dimension(200, 35));
        signupFNameLbl2.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.add(signupFNameLbl2);
        signupFNameLbl2.setBounds(200, 250, 200, 35);

        jPanel1.add(cuCheckUpType);
        cuCheckUpType.setBounds(400, 250, 300, 35);

        cuDate.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cuDate.setForeground(new java.awt.Color(255, 255, 255));
        cuDate.setText("Date");
        cuDate.setMaximumSize(new java.awt.Dimension(200, 35));
        cuDate.setMinimumSize(new java.awt.Dimension(200, 35));
        cuDate.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.add(cuDate);
        cuDate.setBounds(200, 325, 200, 35);

        cuCheckUpDate.setMinSelectableDate(new Date());
        jPanel1.add(cuCheckUpDate);
        cuCheckUpDate.setBounds(400, 325, 300, 35);

        cuAssignBtn.setText("Assign");
        cuAssignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuAssignBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cuAssignBtn);
        cuAssignBtn.setBounds(400, 560, 200, 35);

        opDate1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        opDate1.setForeground(new java.awt.Color(255, 255, 255));
        opDate1.setText("Additional Information");
        opDate1.setMaximumSize(new java.awt.Dimension(200, 35));
        opDate1.setMinimumSize(new java.awt.Dimension(200, 35));
        opDate1.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel1.add(opDate1);
        opDate1.setBounds(200, 400, 200, 35);

        cuAdditionalInfo.setColumns(20);
        cuAdditionalInfo.setRows(5);
        jScrollPane1.setViewportView(cuAdditionalInfo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(400, 410, 300, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuAssignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuAssignBtnActionPerformed
        try{
            Checkup cu = new Checkup(
                cuPatientIDs.getSelectedItem().toString(),
                cuCheckUpType.getSelectedItem().toString(),
                Validation.convertUtilDateToSqlDate(cuCheckUpDate.getDate()),
                cuAdditionalInfo.getText()
            );
            boolean isAssigned = ServiceController.getInstance().CheckUpAssigning(cu);
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
    }//GEN-LAST:event_cuAssignBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CheckUpAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckUpAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckUpAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckUpAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckUpAssignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cuAdditionalInfo;
    private javax.swing.JButton cuAssignBtn;
    private com.toedter.calendar.JDateChooser cuCheckUpDate;
    private javax.swing.JComboBox<String> cuCheckUpType;
    private javax.swing.JLabel cuDate;
    private javax.swing.JComboBox<String> cuPatientIDs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel opDate1;
    private javax.swing.JLabel patientManagementLbl;
    private javax.swing.JLabel signupFNameLbl1;
    private javax.swing.JLabel signupFNameLbl2;
    // End of variables declaration//GEN-END:variables
}
