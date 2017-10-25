
package view.EmployeeManagement;

import Controller.EmployeeManagement.EmployeeController;
import Model.EmployeeManagement.Employee;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class EditEmployee extends javax.swing.JFrame {

    EmployeeController empCnt = new EmployeeController();
    public EditEmployee() throws IOException {
        initComponents();
        showUser(empCnt.getAllRegistedEmployeeData());
    }

   
    public void showUser(ArrayList<Employee> dataList){
        DefaultTableModel model = (DefaultTableModel)tblEmpData.getModel();
        Object[] row = new Object[4];
        
        for(int i=0;i<dataList.size();i++){
            row[0]=dataList.get(i).getId();
            row[1]=dataList.get(i).getFirstName();
            row[2]=dataList.get(i).getLastName();
            row[3]=dataList.get(i).getEmail();

            model.addRow(row);
        }
    }
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1255, 547));
        setMinimumSize(new java.awt.Dimension(1255, 547));
        setPreferredSize(new java.awt.Dimension(1255, 547));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1255, 547));
        jPanel1.setMinimumSize(new java.awt.Dimension(1255, 547));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1255, 547));
        jPanel1.setLayout(null);

        tblEmpData.setBackground(new java.awt.Color(51, 51, 51));
        tblEmpData.setForeground(new java.awt.Color(204, 255, 255));
        tblEmpData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Email", "DOB", "Address"
            }
        ));
        tblEmpData.setGridColor(new java.awt.Color(51, 51, 51));
        tblEmpData.setSelectionBackground(new java.awt.Color(51, 255, 255));
        tblEmpData.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tblEmpData);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(500, 70, 730, 430);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit User Data");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 320, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1255, 548);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditEmployee().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EditEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpData;
    // End of variables declaration//GEN-END:variables
}
