/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.layout.stockManagement;

import Controller.StockManagement.DrugTypeController;
import java.sql.SQLException;
import model.DrugTypeModel;
import org.apache.log4j.Logger;
import util.Config;
import static util.DBUtil.getXMLData;
import static util.Util.getScreenSizrRatio;
import static util.messageAlert.getMessageAlert;

/**
 *
 * @author EnTeRs
 */
public class UpdateRemoveDrugType extends javax.swing.JFrame {

    private static UpdateRemoveDrugType self;

    static int ScreenW = (int) getScreenSizrRatio()[0];
    static int ScreenH = (int) getScreenSizrRatio()[1];

    Config cnf = new Config();
    public Logger LOG;

    int selectedDrugTypeId;
    
    public UpdateRemoveDrugType(DrugTypeModel drugType) {
        initComponents();
        self = this;
        
        this.setLocation((ScreenW - this.getWidth()) / 2,
                (ScreenH - this.getHeight()) / 2);

        //initialize log file
        LOG = cnf.getLogger(UpdateRemoveDrugType.class);

        selectedDrugTypeId = drugType.getId();
        urdtDrugTypeNameInput.setText(drugType.getName());
        urdtDrugTypeDescInput.setText(drugType.getDescription());
    }

    public static UpdateRemoveDrugType getInstance() {
        if (self == null) {
            self = new UpdateRemoveDrugType();
        }

        return self;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateRemoveDrugTypePanel = new javax.swing.JPanel();
        urdtTitleLabel = new javax.swing.JLabel();
        urdtDrugTypeNameLabel = new javax.swing.JLabel();
        urdtUpdateBtn = new javax.swing.JButton();
        urdtCloseBtn = new javax.swing.JButton();
        urdtDrugTypeNameInput = new javax.swing.JTextField();
        urdtRemoveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        urdtDrugTypeDescInput = new javax.swing.JTextArea();
        urdtDrugTypeDescLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        UpdateRemoveDrugTypePanel.setBackground(new java.awt.Color(0, 0, 0));
        UpdateRemoveDrugTypePanel.setMaximumSize(new java.awt.Dimension(800, 400));
        UpdateRemoveDrugTypePanel.setMinimumSize(new java.awt.Dimension(800, 400));
        UpdateRemoveDrugTypePanel.setLayout(null);

        urdtTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        urdtTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        urdtTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urdtTitleLabel.setText("Update/Remove Drug Type");
        UpdateRemoveDrugTypePanel.add(urdtTitleLabel);
        urdtTitleLabel.setBounds(0, 30, 800, 50);

        urdtDrugTypeNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        urdtDrugTypeNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        urdtDrugTypeNameLabel.setText("Drug Type Name");
        UpdateRemoveDrugTypePanel.add(urdtDrugTypeNameLabel);
        urdtDrugTypeNameLabel.setBounds(120, 140, 180, 30);

        urdtUpdateBtn.setText("Update");
        urdtUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urdtUpdateBtnActionPerformed(evt);
            }
        });
        UpdateRemoveDrugTypePanel.add(urdtUpdateBtn);
        urdtUpdateBtn.setBounds(230, 310, 140, 40);

        urdtCloseBtn.setText("X");
        urdtCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urdtCloseBtnActionPerformed(evt);
            }
        });
        UpdateRemoveDrugTypePanel.add(urdtCloseBtn);
        urdtCloseBtn.setBounds(740, 10, 40, 40);
        UpdateRemoveDrugTypePanel.add(urdtDrugTypeNameInput);
        urdtDrugTypeNameInput.setBounds(310, 140, 300, 30);

        urdtRemoveBtn.setText("Remove");
        urdtRemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urdtRemoveBtnActionPerformed(evt);
            }
        });
        UpdateRemoveDrugTypePanel.add(urdtRemoveBtn);
        urdtRemoveBtn.setBounds(410, 310, 140, 40);

        urdtDrugTypeDescInput.setColumns(20);
        urdtDrugTypeDescInput.setRows(3);
        jScrollPane1.setViewportView(urdtDrugTypeDescInput);

        UpdateRemoveDrugTypePanel.add(jScrollPane1);
        jScrollPane1.setBounds(310, 200, 300, 70);

        urdtDrugTypeDescLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        urdtDrugTypeDescLabel.setForeground(new java.awt.Color(255, 255, 255));
        urdtDrugTypeDescLabel.setText("Description");
        UpdateRemoveDrugTypePanel.add(urdtDrugTypeDescLabel);
        urdtDrugTypeDescLabel.setBounds(120, 200, 180, 30);

        getContentPane().add(UpdateRemoveDrugTypePanel);
        UpdateRemoveDrugTypePanel.setBounds(0, 0, 800, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urdtCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urdtCloseBtnActionPerformed
        dispose();
    }//GEN-LAST:event_urdtCloseBtnActionPerformed

    private void urdtUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urdtUpdateBtnActionPerformed
        try {
            DrugTypeModel drugCategory = new DrugTypeModel(urdtDrugTypeNameInput.getText(), urdtDrugTypeDescInput.getText());
            drugCategory.setId(selectedDrugTypeId);
            DrugTypeController.getInstance().update(drugCategory);
            AddDrugItem.getInstance().getCategoriesInit();
            AddDrugItem.getInstance().asiDrugCatVali.setVisible(false);
            getMessageAlert(String.format(getXMLData("StockMsg", "message", "updatedMsg"), "Drug Type"), "success");
            dispose();
        } catch (SQLException ex) {
            getMessageAlert(getXMLData("StockMsg", "message", "somethingWrong"), "error");
            LOG.error(ex);
        }
    }//GEN-LAST:event_urdtUpdateBtnActionPerformed

    private void urdtRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urdtRemoveBtnActionPerformed
        try {
            DrugTypeController.getInstance().remove(selectedDrugTypeId);
            AddDrugItem.getInstance().getCategoriesInit();
            AddDrugItem.getInstance().asiDrugCatVali.setVisible(false);
            getMessageAlert(String.format(getXMLData("StockMsg", "message", "removedMsg"), "Drug Type"), "success");
            dispose();
        } catch (SQLException ex) {
            getMessageAlert(getXMLData("StockMsg", "message", "somethingWrong"), "error");
            LOG.error(ex);
        }
    }//GEN-LAST:event_urdtRemoveBtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        AddDrugItem.getInstance().setEnabled(true);
        AddDrugItem.getInstance().toFront();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(UpdateRemoveDrugType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRemoveDrugType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRemoveDrugType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRemoveDrugType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DrugTypeModel drugType = null;
                new UpdateRemoveDrugType(drugType).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UpdateRemoveDrugTypePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton urdtCloseBtn;
    private javax.swing.JTextArea urdtDrugTypeDescInput;
    private javax.swing.JLabel urdtDrugTypeDescLabel;
    private javax.swing.JTextField urdtDrugTypeNameInput;
    private javax.swing.JLabel urdtDrugTypeNameLabel;
    private javax.swing.JButton urdtRemoveBtn;
    private javax.swing.JLabel urdtTitleLabel;
    private javax.swing.JButton urdtUpdateBtn;
    // End of variables declaration//GEN-END:variables
}
