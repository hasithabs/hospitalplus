/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PrescriptionManagement;

import java.sql.SQLException;
import Controller.PrescriptionManagement.PrescriptionController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JComboBox;
import model.Prescription;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;
import util.Config;
import util.DBUtil;
import static util.DBUtil.LOG;
import util.Validation;
import util.Util;
import util.messageAlert;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class PrescriptionDetails extends javax.swing.JFrame {

    int patientId;
    Config cnf = new Config();
    public Logger LOG;

    DefaultTableModel model;
    int selectIndex;
    PrescriptionController pctrl = new PrescriptionController();

    /**
     * Creates new form Prescription
     */
    //private List<Prescription> prescriptionResultSet;
    public PrescriptionDetails()throws IOException  {
        initComponents();
        
        //prescPname.setSelectedItem(null);
        //prescPID.setText("");
        prescPage.setText(null);
        prescPsex.setSelectedItem(null);
        prescPrescriptionID.setText("");
        prescDate.setDate(null);
        prescDrugName.setSelectedItem(null);
        prescDosage.setSelectedItem(null);
        prescFrequency.setSelectedItem(null);
        prescPeriod1.setSelectedItem(null);
        
        getPatientName(prescPname);
        getDrugName(prescDrugName);
        prescPID.setText(String.valueOf(patientGetPatientID()));
        tableload(pctrl.getAllPrescriptionData());
        
        
        PropertyConfigurator.configure(Util.PROPERTY_FILE_PATH);
        LOG = Logger.getLogger(PrescriptionDetails.class);
        /*patientId = prescript.getPatientID();
        prescPname.setSelectedItem(prescript.getPatientName());
        prescPage.setText(prescript.getAge());
        prescPsex.setSelectedItem(prescript.getSex());
        prescript.getPrescriptionID();
        prescDate.setDate(prescript.getCreateDate());
        prescDrugName.setSelectedItem(prescript.getDrugName());
        prescDosage.setSelectedItem(prescript.getDosage());
        prescFrequency.setSelectedItem(prescript.getFrequency());
        prescPeriod.setSelectedItem(prescript.getPeroid());
         */
    }
    private void getPatientName(JComboBox jc) {
        try{
            PrescriptionController.getPresc().getPatientNameList(jc);
        }catch(Exception e){
            
        }
    
    }
    
    private void getDrugName(JComboBox dl) {
        try{
            PrescriptionController.getPresc().getDrugNameList(dl);
        }catch(Exception e){
            
        }
    
    }
    
    private int patientGetPatientID() {
        try {
            return PrescriptionController.getPresc().patientGetPatientID();
            //return Prescription.patientGetPatientID();
        } catch (Exception ex) {
            //LOG.error(ex);
        }
        return 0;
    }
    
    public void wholeClear(){
        //prescPID.setText("");
        prescPage.setText(null);
        prescPsex.setSelectedItem(null);
        prescPrescriptionID.setText("");
        prescDate.setDate(null);
        prescDrugName.setSelectedItem(null);
        prescDosage.setSelectedItem(null);
        prescFrequency.setSelectedItem(null);
        prescPeriod1.setSelectedItem(null);
        
        addPrescription.setEnabled(true);
        updatePrescription.setEnabled(true);
        deletePrescription.setEnabled(true);
    }
    /*private static void getPatientName(JComboBox jc) throws IOException {
        try {
            for (Object PatientName : PrescriptionController.getPresc().getPatientListDetails()) {
                jc.addItem(PatientName);
            }
        } catch (SQLException ex) {
            //messageAlert.getMessageAlert(DBUtil.getXMLData("PatientMsg", "message", "Err_Something_Went_Wrong"), "error");
        }
    }*/

    /*public PrescriptionDetails(Prescription prescript){
        patientId = prescript.getPatientID();
        
    }*/
    public void tableload(ArrayList<Prescription> dataList) {

        try {
             
           // model = (DefaultTableModel) prescriptionTable.getModel();
           // model.getDataVector().removeAllElements();
           // model.fireTableDataChanged();

            //Object[] row = new Object[10];
            //Prescription dataList = new Prescription();
            
            
            model = (DefaultTableModel) prescriptionTable.getModel();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            
           Object[] row = new Object[10];

     
            
           //ArrayList<Prescription> AR = PrescriptionController.getPresc().getAllPrescriptionData();
           
            for (int i = 0; i < dataList.size(); i++) {
                row[0] = dataList.get(i).getPatientName();
                row[1]= dataList.get(i).getPatientID();
                row[2] = dataList.get(i).getAge();
                row[3] = dataList.get(i).getSex();
                row[4]= dataList.get(i).getPrescriptionID();
                row[5] = dataList.get(i).getCreateDate();
                row[6] = dataList.get(i).getDrugName();
                row[7] = dataList.get(i).getDosage();
                row[8] = dataList.get(i).getFrequency();
                row[9] = dataList.get(i).getPeroid();
                /*row[0] = dataList.getPatientName();
                row[1] = dataList.getPatientID();
                row[2] = dataList.getAge();
                row[3] = dataList.getSex();
                row[4] = dataList.getPrescriptionID();
                row[5] = dataList.getCreateDate();
                row[6] = dataList.getDrugName();
                row[7] = dataList.getDosage();
                row[8] = dataList.getFrequency();
                row[9] = dataList.getPeroid();
                model.addRow(row);
                
                */
                model.addRow(row);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
    boolean addPrescriptionbtn = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prescPID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pname = new javax.swing.JLabel();
        PID = new javax.swing.JLabel();
        PAge = new javax.swing.JLabel();
        Pdisease = new javax.swing.JLabel();
        prescPname = new javax.swing.JComboBox<>();
        prescPage = new javax.swing.JTextField();
        prescPrescriptionID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prescDrugName = new javax.swing.JComboBox<>();
        prescDosage = new javax.swing.JComboBox<>();
        prescFrequency = new javax.swing.JComboBox<>();
        prescPeriod1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionTable = new javax.swing.JTable();
        addPrescription = new javax.swing.JButton();
        updatePrescription = new javax.swing.JButton();
        deletePrescription = new javax.swing.JButton();
        prescDate = new com.toedter.calendar.JDateChooser();
        Pdisease1 = new javax.swing.JLabel();
        prescPsex = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        prescPID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescPID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prescPID);
        prescPID.setBounds(243, 101, 152, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Patient Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 175, 29);

        Pname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pname.setForeground(new java.awt.Color(240, 240, 240));
        Pname.setText("Patient name");
        getContentPane().add(Pname);
        Pname.setBounds(10, 58, 180, 22);

        PID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PID.setForeground(new java.awt.Color(240, 240, 240));
        PID.setText("Patient ID");
        getContentPane().add(PID);
        PID.setBounds(10, 101, 180, 22);

        PAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PAge.setForeground(new java.awt.Color(240, 240, 240));
        PAge.setText("Prescription ID");
        getContentPane().add(PAge);
        PAge.setBounds(10, 274, 180, 22);

        Pdisease.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pdisease.setForeground(new java.awt.Color(240, 240, 240));
        Pdisease.setText("Age");
        getContentPane().add(Pdisease);
        Pdisease.setBounds(10, 141, 180, 22);

        prescPname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(prescPname);
        prescPname.setBounds(243, 55, 152, 28);

        prescPage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescPageActionPerformed(evt);
            }
        });
        getContentPane().add(prescPage);
        prescPage.setBounds(243, 142, 152, 28);

        prescPrescriptionID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescPrescriptionID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prescPrescriptionID);
        prescPrescriptionID.setBounds(243, 274, 152, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Create date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 315, 180, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Drug Details");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 227, 147, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Drug name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 358, 180, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Dosage");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 404, 180, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Frequency");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 459, 180, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Period");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 505, 180, 22);

        prescDrugName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(prescDrugName);
        prescDrugName.setBounds(243, 355, 152, 28);

        prescDosage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescDosage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One", "Two", "Three" }));
        getContentPane().add(prescDosage);
        prescDosage.setBounds(243, 401, 152, 28);

        prescFrequency.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescFrequency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Once a day", "Twice a day", "Thrice a day", "Six Hours" }));
        prescFrequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescFrequencyActionPerformed(evt);
            }
        });
        getContentPane().add(prescFrequency);
        prescFrequency.setBounds(243, 456, 152, 28);

        prescPeriod1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescPeriod1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Three Days", "Four Days", "For a week", "For two weeks", "For a month", "For three months", "For six months", "For a year" }));
        prescPeriod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescPeriod1ActionPerformed(evt);
            }
        });
        getContentPane().add(prescPeriod1);
        prescPeriod1.setBounds(243, 502, 152, 28);

        prescriptionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient name", "Patient ID", "Age", "Sex", "Prescription ID", "Create Date", "Drug name", "Dosage", "Frequency", "Period"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        prescriptionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescriptionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prescriptionTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(405, 55, 907, 325);

        addPrescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addPrescription.setText("Add");
        addPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(addPrescription);
        addPrescription.setBounds(10, 558, 100, 31);

        updatePrescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatePrescription.setText("Update");
        updatePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePrescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(updatePrescription);
        updatePrescription.setBounds(150, 558, 100, 31);

        deletePrescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deletePrescription.setText("Delete");
        deletePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePrescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(deletePrescription);
        deletePrescription.setBounds(295, 558, 100, 31);
        getContentPane().add(prescDate);
        prescDate.setBounds(243, 315, 152, 20);

        Pdisease1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pdisease1.setForeground(new java.awt.Color(240, 240, 240));
        Pdisease1.setText("Sex");
        getContentPane().add(Pdisease1);
        Pdisease1.setBounds(10, 191, 180, 22);

        prescPsex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescPsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(prescPsex);
        prescPsex.setBounds(243, 188, 152, 28);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prescPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prescPageActionPerformed

    private void prescFrequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescFrequencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prescFrequencyActionPerformed

    private void prescPeriod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescPeriod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prescPeriod1ActionPerformed

    private void addPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrescriptionActionPerformed
        /*if(addPrescriptionbtn != false){*/
        try {
            Prescription prescript = new Prescription(
                    prescPname.getSelectedItem().toString(),
                    prescPID.getText(),
                    prescPage.getText(),
                    prescPsex.getSelectedItem().toString(),
                    //prescPrescriptionID.getText(),
                    Validation.convertUtilDateToSqlDate(prescDate.getDate()),
                    prescDrugName.getSelectedItem().toString(),
                    prescDosage.getSelectedItem().toString(),
                    prescFrequency.getSelectedItem().toString(),
                    prescPeriod1.getSelectedItem().toString()
            );
            //PrescriptionController.getPresc().addPrescription(prescript);
            PrescriptionController.getPresc().addPrescription(prescript);
            tableload(pctrl.getAllPrescriptionData());
            wholeClear();
            //messageAlert.getMessageAlert(DBUtil.getXMLData("PrescriptionError", "message", "Msg_Succesfully_Added"), "success");
        } catch (SQLException e) {
            LOG.error(e);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(PrescriptionDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*else {
            //messageAlert.getMessageAlert(DBUtil.getXMLData("PrescriptionError", "message", "Err_Something_Went_Wrong"), "error");
            LOG.error("Validation failed");
            }*/
    }//GEN-LAST:event_addPrescriptionActionPerformed

    private void updatePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePrescriptionActionPerformed
      
      try {
            Prescription psc = new Prescription();
            psc.setPatientName(prescPname.getSelectedItem().toString());
            psc.setPatientID(Integer.parseInt(prescPID.getText()));
            psc.setAge(prescPage.getText());
            psc.setSex(prescPsex.getSelectedItem().toString());
            psc.setPrescriptionID(Integer.parseInt(prescPrescriptionID.getText()));
            psc.setCreateDate(Validation.convertUtilDateToSqlDate(prescDate.getDate()));
            psc.setDrugName(prescDrugName.getSelectedItem().toString());
            psc.setDosage(prescDosage.getSelectedItem().toString());
            psc.setFrequency(prescFrequency.getSelectedItem().toString());
            psc.setPeroid(prescPeriod1.getSelectedItem().toString());
            
            PrescriptionController.getPresc().update(psc);
            tableload(pctrl.getAllPrescriptionData());
            wholeClear();

        } catch (IOException e) {
            LOG.error("Cannot Update the Employee", e);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PrescriptionDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updatePrescriptionActionPerformed

    private void deletePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePrescriptionActionPerformed
        int id = Integer.parseInt(prescPrescriptionID.getText());

        try {
            pctrl.delete(id);
            tableload(pctrl.getAllPrescriptionData());
            wholeClear();

        } catch (IOException e) {
            LOG.error("Cannot Delete Employee process", e);
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_deletePrescriptionActionPerformed

    private void prescriptionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionTableMouseClicked
        try {
            model = (DefaultTableModel) prescriptionTable.getModel();
            selectIndex = prescriptionTable.getSelectedRow();
            
            
            Prescription presc = new Prescription();
            PrescriptionController prctl = new PrescriptionController();
              presc= prctl.getPrescriptionById(model.getValueAt(selectIndex, 0).toString());
            //presc = prctl.getPrescriptionById(model.getValueAt(selectIndex, 1).toString());
            prescPname.setSelectedItem(presc.getPatientName());
            prescPID.setText(String.valueOf(presc.getPatientID()));
          prescPage.setText(presc.getAge());
         prescPsex.setSelectedItem(presc.getSex());
            prescPrescriptionID.setText(String.valueOf(presc.getPrescriptionID()));
          prescDate.setDate(presc.getCreateDate());
           prescDrugName.setSelectedItem(presc.getDrugName());
         prescDosage.setSelectedItem(presc.getDosage());
           prescFrequency.setSelectedItem(presc.getFrequency());
           prescPeriod1.setSelectedItem(presc.getPeroid());
           
           addPrescription.setEnabled(false);
           //prescPname.setEnabled(false);

        } catch (Exception ex) {
            LOG.error(ex);
        }
    }//GEN-LAST:event_prescriptionTableMouseClicked

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
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Prescription prescript = null;
               
                try {
                    new PrescriptionDetails().setVisible(true);
                } catch (IOException ex) {
                   
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PAge;
    private javax.swing.JLabel PID;
    private javax.swing.JLabel Pdisease;
    private javax.swing.JLabel Pdisease1;
    private javax.swing.JLabel Pname;
    private javax.swing.JButton addPrescription;
    private javax.swing.JButton deletePrescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser prescDate;
    private javax.swing.JComboBox<String> prescDosage;
    private javax.swing.JComboBox<String> prescDrugName;
    private javax.swing.JComboBox<String> prescFrequency;
    private javax.swing.JLabel prescPID;
    private javax.swing.JTextField prescPage;
    private javax.swing.JComboBox<String> prescPeriod1;
    private javax.swing.JComboBox<String> prescPname;
    private javax.swing.JLabel prescPrescriptionID;
    private javax.swing.JComboBox<String> prescPsex;
    private javax.swing.JTable prescriptionTable;
    private javax.swing.JButton updatePrescription;
    // End of variables declaration//GEN-END:variables
}
