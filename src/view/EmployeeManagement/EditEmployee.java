package view.EmployeeManagement;

import Controller.EmployeeManagement.EmployeeController;
import Model.EmployeeManagement.Employee;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditEmployee extends javax.swing.JFrame {

    EmployeeController empCnt = new EmployeeController();

    public EditEmployee() throws IOException {
        initComponents();
        showUser(empCnt.getAllRegistedEmployeeData());
    }

    public void showUser(ArrayList<Employee> dataList) {
        DefaultTableModel model = (DefaultTableModel) tblEmpData.getModel();
        Object[] row = new Object[4];

        for (int i = 0; i < dataList.size(); i++) {
            row[0] = dataList.get(i).getId();
            row[1] = dataList.get(i).getFirstName();
            row[2] = dataList.get(i).getLastName();
            row[3] = dataList.get(i).getEmail();

            model.addRow(row);
        }
    }

    Color SearchBackground = Color.lightGray;
    Color SearchForground = Color.black;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpData1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        srchEmail = new javax.swing.JLabel();
        srchID = new javax.swing.JLabel();
        srchFirstName = new javax.swing.JLabel();
        srchLastName = new javax.swing.JLabel();

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
        tblEmpData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
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
        jLabel1.setBounds(70, 0, 320, 60);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FirstName");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 130, 80, 30);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 130, 250, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 190, 80, 30);

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(150, 190, 250, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 250, 80, 30);

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(150, 250, 250, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 70, 80, 30);

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(150, 70, 250, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DOB");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 310, 80, 30);

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(150, 310, 250, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 370, 80, 30);

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(150, 410, 250, 30);

        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(150, 370, 250, 30);

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 470, 100, 30);

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(300, 470, 100, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(1255, 547));
        jPanel2.setMinimumSize(new java.awt.Dimension(1255, 547));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        tblEmpData1.setBackground(new java.awt.Color(51, 51, 51));
        tblEmpData1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblEmpData1.setForeground(new java.awt.Color(204, 255, 255));
        tblEmpData1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Email", "DOB", "Address"
            }
        ));
        tblEmpData1.setGridColor(new java.awt.Color(51, 51, 51));
        tblEmpData1.setSelectionBackground(new java.awt.Color(51, 255, 255));
        tblEmpData1.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(tblEmpData1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(500, 70, 730, 430);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edit User Data");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(70, 0, 320, 60);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FirstName");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 130, 80, 30);

        jTextField8.setBackground(new java.awt.Color(0, 0, 0));
        jTextField8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField8);
        jTextField8.setBounds(150, 130, 250, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 190, 80, 30);

        jTextField9.setBackground(new java.awt.Color(0, 0, 0));
        jTextField9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField9);
        jTextField9.setBounds(150, 190, 250, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 250, 80, 30);

        jTextField10.setBackground(new java.awt.Color(0, 0, 0));
        jTextField10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField10);
        jTextField10.setBounds(150, 250, 250, 30);

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(30, 70, 80, 30);

        jTextField11.setBackground(new java.awt.Color(0, 0, 0));
        jTextField11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField11);
        jTextField11.setBounds(150, 70, 250, 30);

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DOB");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 310, 80, 30);

        jTextField12.setBackground(new java.awt.Color(0, 0, 0));
        jTextField12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField12);
        jTextField12.setBounds(150, 310, 250, 30);

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 370, 80, 30);

        jTextField13.setBackground(new java.awt.Color(0, 0, 0));
        jTextField13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField13);
        jTextField13.setBounds(150, 410, 250, 30);

        jTextField14.setBackground(new java.awt.Color(0, 0, 0));
        jTextField14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField14);
        jTextField14.setBounds(150, 370, 250, 30);

        jButton6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(190, 470, 100, 30);

        jButton8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(300, 470, 100, 30);

        srchEmail.setBackground(new java.awt.Color(0, 0, 0));
        srchEmail.setIcon(new javax.swing.ImageIcon("C:\\Users\\kasun\\Desktop\\Employee Management\\hospitalplus\\src\\view\\images\\EmployeeManagement\\Find.png")); // NOI18N
        srchEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srchEmail.setOpaque(true);
        srchEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srchEmailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srchEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srchEmailMouseExited(evt);
            }
        });
        jPanel2.add(srchEmail);
        srchEmail.setBounds(410, 250, 30, 32);

        srchID.setBackground(new java.awt.Color(0, 0, 0));
        srchID.setIcon(new javax.swing.ImageIcon("C:\\Users\\kasun\\Desktop\\Employee Management\\hospitalplus\\src\\view\\images\\EmployeeManagement\\Find.png")); // NOI18N
        srchID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srchID.setOpaque(true);
        srchID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srchIDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srchIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srchIDMouseExited(evt);
            }
        });
        jPanel2.add(srchID);
        srchID.setBounds(410, 70, 30, 32);

        srchFirstName.setBackground(new java.awt.Color(0, 0, 0));
        srchFirstName.setIcon(new javax.swing.ImageIcon("C:\\Users\\kasun\\Desktop\\Employee Management\\hospitalplus\\src\\view\\images\\EmployeeManagement\\Find.png")); // NOI18N
        srchFirstName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srchFirstName.setOpaque(true);
        srchFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srchFirstNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srchFirstNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srchFirstNameMouseExited(evt);
            }
        });
        jPanel2.add(srchFirstName);
        srchFirstName.setBounds(410, 130, 30, 32);

        srchLastName.setBackground(new java.awt.Color(0, 0, 0));
        srchLastName.setIcon(new javax.swing.ImageIcon("C:\\Users\\kasun\\Desktop\\Employee Management\\hospitalplus\\src\\view\\images\\EmployeeManagement\\Find.png")); // NOI18N
        srchLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srchLastName.setOpaque(true);
        srchLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srchLastNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srchLastNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srchLastNameMouseExited(evt);
            }
        });
        jPanel2.add(srchLastName);
        srchLastName.setBounds(410, 190, 30, 32);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1255, 548);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1255, 548);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void srchEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchEmailMouseClicked

        JOptionPane.showMessageDialog(null, "Seraching");

    }//GEN-LAST:event_srchEmailMouseClicked

    private void srchEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchEmailMouseEntered

        srchEmail.setBackground(SearchBackground);
    }//GEN-LAST:event_srchEmailMouseEntered

    private void srchEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchEmailMouseExited
        srchEmail.setBackground(SearchForground);
    }//GEN-LAST:event_srchEmailMouseExited

    private void srchIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchIDMouseClicked
       JOptionPane.showMessageDialog(null, "Seraching");
    }//GEN-LAST:event_srchIDMouseClicked

    private void srchIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchIDMouseEntered
      srchID.setBackground( SearchBackground);
    }//GEN-LAST:event_srchIDMouseEntered

    private void srchIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchIDMouseExited
        srchID.setBackground(SearchForground);
    }//GEN-LAST:event_srchIDMouseExited

    private void srchFirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchFirstNameMouseClicked
       JOptionPane.showMessageDialog(null, "Seraching");
    }//GEN-LAST:event_srchFirstNameMouseClicked

    private void srchFirstNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchFirstNameMouseEntered
        srchFirstName.setBackground( SearchBackground);
    }//GEN-LAST:event_srchFirstNameMouseEntered

    private void srchFirstNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchFirstNameMouseExited
       srchFirstName.setBackground(SearchForground);
    }//GEN-LAST:event_srchFirstNameMouseExited

    private void srchLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchLastNameMouseClicked
        JOptionPane.showMessageDialog(null, "Seraching");
    }//GEN-LAST:event_srchLastNameMouseClicked

    private void srchLastNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchLastNameMouseEntered
       srchLastName.setBackground( SearchBackground);
    }//GEN-LAST:event_srchLastNameMouseEntered

    private void srchLastNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchLastNameMouseExited
        srchLastName.setBackground(SearchForground);
    }//GEN-LAST:event_srchLastNameMouseExited

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel srchEmail;
    private javax.swing.JLabel srchFirstName;
    private javax.swing.JLabel srchID;
    private javax.swing.JLabel srchLastName;
    private javax.swing.JTable tblEmpData;
    private javax.swing.JTable tblEmpData1;
    // End of variables declaration//GEN-END:variables
}
