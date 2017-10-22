/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.layout.stockManagement;

import Controller.StockManagement.DrugTypeController;
import java.sql.SQLException;
import model.DrugTypeModel;

/**
 *
 * @author EnTeRs
 */
public class AddDrugType extends javax.swing.JFrame {

    /**
     * Creates new form AddStockItem
     */
    public AddDrugType() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddDrugTypePanel = new javax.swing.JPanel();
        adtTitleLabel = new javax.swing.JLabel();
        adtDrugCatNameLabel = new javax.swing.JLabel();
        adtAddNewBtn = new javax.swing.JButton();
        adtCloseBtn = new javax.swing.JButton();
        adtDrugTypeNameInput = new javax.swing.JTextField();
        adcDrugTypeDescLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adtDrugTypeDescInput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(null);

        AddDrugTypePanel.setBackground(new java.awt.Color(0, 0, 0));
        AddDrugTypePanel.setMaximumSize(new java.awt.Dimension(800, 400));
        AddDrugTypePanel.setMinimumSize(new java.awt.Dimension(800, 400));
        AddDrugTypePanel.setPreferredSize(new java.awt.Dimension(800, 400));
        AddDrugTypePanel.setLayout(null);

        adtTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        adtTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        adtTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adtTitleLabel.setText("Add New Drug Type");
        AddDrugTypePanel.add(adtTitleLabel);
        adtTitleLabel.setBounds(0, 30, 800, 50);

        adtDrugCatNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adtDrugCatNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        adtDrugCatNameLabel.setText("Drug Type Name");
        AddDrugTypePanel.add(adtDrugCatNameLabel);
        adtDrugCatNameLabel.setBounds(120, 140, 180, 30);

        adtAddNewBtn.setText("Add New");
        adtAddNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adtAddNewBtnActionPerformed(evt);
            }
        });
        AddDrugTypePanel.add(adtAddNewBtn);
        adtAddNewBtn.setBounds(300, 310, 200, 40);

        adtCloseBtn.setText("X");
        adtCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adtCloseBtnActionPerformed(evt);
            }
        });
        AddDrugTypePanel.add(adtCloseBtn);
        adtCloseBtn.setBounds(740, 10, 40, 40);
        AddDrugTypePanel.add(adtDrugTypeNameInput);
        adtDrugTypeNameInput.setBounds(310, 140, 300, 30);

        adcDrugTypeDescLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adcDrugTypeDescLabel.setForeground(new java.awt.Color(255, 255, 255));
        adcDrugTypeDescLabel.setText("Description");
        AddDrugTypePanel.add(adcDrugTypeDescLabel);
        adcDrugTypeDescLabel.setBounds(120, 200, 180, 30);

        adtDrugTypeDescInput.setColumns(20);
        adtDrugTypeDescInput.setRows(3);
        jScrollPane1.setViewportView(adtDrugTypeDescInput);

        AddDrugTypePanel.add(jScrollPane1);
        jScrollPane1.setBounds(310, 200, 300, 70);

        getContentPane().add(AddDrugTypePanel);
        AddDrugTypePanel.setBounds(0, 0, 800, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adtCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adtCloseBtnActionPerformed
        dispose();
    }//GEN-LAST:event_adtCloseBtnActionPerformed

    private void adtAddNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adtAddNewBtnActionPerformed
        try {
            DrugTypeModel drugType = new DrugTypeModel(adtDrugTypeNameInput.getText(), adtDrugTypeDescInput.getText());
            DrugTypeController.getInstance().save(drugType);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_adtAddNewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddDrugType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDrugType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDrugType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDrugType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDrugType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddDrugTypePanel;
    private javax.swing.JLabel adcDrugTypeDescLabel;
    private javax.swing.JButton adtAddNewBtn;
    private javax.swing.JButton adtCloseBtn;
    private javax.swing.JLabel adtDrugCatNameLabel;
    private javax.swing.JTextArea adtDrugTypeDescInput;
    private javax.swing.JTextField adtDrugTypeNameInput;
    private javax.swing.JLabel adtTitleLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
