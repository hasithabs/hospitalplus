/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.layout.stockManagement;

import Controller.StockManagement.DrugCategoryController;
import Controller.StockManagement.DrugController;
import Controller.StockManagement.DrugTypeController;
import java.sql.SQLException;
import java.util.List;
import model.DrugCategoryModel;
import model.DrugModel;
import model.DrugTypeModel;
import org.apache.log4j.Logger;
import util.Config;
import static util.DBUtil.getXMLData;
import util.Validation;
import static util.messageAlert.getMessageAlert;

/**
 *
 * @author EnTeRs
 */
public class UpdateDrugItem extends javax.swing.JFrame {

    private static UpdateDrugItem self;

    Config cnf = new Config();
    public Logger LOG;

    int selectedDrugId;
    int selectedDrugCategoryId;
    int selectedDrugTypeId;

    public UpdateDrugItem(DrugModel drug) {
        initComponents();
        self = this;

        //initialize log file
        LOG = cnf.getLogger(UpdateDrugItem.class);

        selectedDrugId = drug.getId();
        selectedDrugCategoryId = drug.getCategory();
        selectedDrugTypeId = drug.getType();

        resetJframe();
        getCategoriesInit();
        getTypsInit();

        udiDrugNameInput.setText(drug.getName());
        udiDrugPriceInput.setText(String.valueOf(drug.getPrice()));
        udiRemarksInput.setText(drug.getRemarks());
        udiDrugLevelInput.setValue(drug.getDrugLevel());
        udiReorderLevelInput.setValue(drug.getReorderLevel());
        udiDrugWeightInput.setText(drug.getWeight());
    }

    public static UpdateDrugItem getInstance() {
        if (self == null) {
            DrugModel drug = null;
            self = new UpdateDrugItem(drug);
        }

        return self;
    }

    public final void resetJframe() {
        util.Util.Clear(UpdateDrugItemPanel);
        udiDrugCatVali.setVisible(false);
        udiDrugNameVali.setVisible(false);
        udiDrugTypeVali.setVisible(false);
        udiDrugPriceVali.setVisible(false);
        udiDrugWeightVali.setVisible(false);
    }

    public final void getCategoriesInit() {
        udiDrugCategorySelector.removeAllItems();
        int selectedCatComboboxId = 0;
        try {
            List<DrugCategoryModel> drugCategories = DrugCategoryController.getInstance().allDrugCategories();
            for (int c = 0; c < drugCategories.size(); c++) {
                udiDrugCategorySelector.addItem(drugCategories.get(c));
                if (selectedDrugId == drugCategories.get(c).getId()) {
                    selectedCatComboboxId = c;
                }
            }
            udiDrugCategorySelector.insertItemAt(new DrugCategoryModel("Select Category", ""), 0);
            udiDrugCategorySelector.setSelectedIndex(selectedCatComboboxId + 1);
            udiDrugCatVali.setVisible(false);
        } catch (SQLException ex) {
            LOG.error(ex);
        }
    }

    public final void getTypsInit() {
        udiDrugTypeSelector.removeAllItems();
        int selectedCatComboboxId = 0;

        try {
            List<DrugTypeModel> drugTypes = DrugTypeController.getInstance().allDrugTypes();
            for (int i = 0; i < drugTypes.size(); ++i) {
                udiDrugTypeSelector.addItem(drugTypes.get(i));
                if (selectedDrugId == drugTypes.get(i).getId()) {
                    selectedCatComboboxId = i;
                }
            }
            udiDrugTypeSelector.insertItemAt(new DrugTypeModel("Select Type", ""), 0);
            udiDrugTypeSelector.setSelectedIndex(selectedCatComboboxId + 1);
            udiDrugTypeVali.setVisible(false);
        } catch (SQLException ex) {
            LOG.error(ex);
        }
    }

    /**
     * *** START Validation Section ****
     */
    public boolean validateCategory() {
        if (udiDrugCategorySelector.getSelectedIndex() != 0) {
            udiDrugCatVali.setVisible(false);
            return true;
        } else {
            udiDrugCatVali.setVisible(true);
            return false;
        }
    }

    public boolean validateName() {
        if (Validation.ContainLetters(udiDrugNameInput.getText())) {
            udiDrugNameVali.setVisible(false);
            return true;
        } else {
            udiDrugNameVali.setVisible(true);
            return false;
        }
    }

    public boolean validateType() {
        if (udiDrugTypeSelector.getSelectedIndex() != 0) {
            udiDrugTypeVali.setVisible(false);
            return true;
        } else {
            udiDrugTypeVali.setVisible(true);
            return false;
        }
    }

    public boolean validatePrice() {
        if (Validation.ContainOnlyNumbers(udiDrugPriceInput.getText())) {
            udiDrugPriceVali.setVisible(false);
            return true;
        } else {
            udiDrugPriceVali.setVisible(true);
            return false;
        }
    }

    public boolean validateWeight() {
        if (Validation.ContainLettersAndNumbers(udiDrugWeightInput.getText())) {
            udiDrugWeightVali.setVisible(false);
            return true;
        } else {
            udiDrugWeightVali.setVisible(true);
            return false;
        }
    }

    /**
     * *** END Validation Section ****
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateDrugItemPanel = new javax.swing.JPanel();
        udiTitleLabel = new javax.swing.JLabel();
        udiDrugCategoryLabel = new javax.swing.JLabel();
        udiDrugCategorySelector = new javax.swing.JComboBox<>();
        udiDrugNameLabel = new javax.swing.JLabel();
        udiDrugNameInput = new javax.swing.JTextField();
        udiDrugTypeLabel = new javax.swing.JLabel();
        udiDrugTypeSelector = new javax.swing.JComboBox<>();
        udiDrugPriceLabel = new javax.swing.JLabel();
        udiDrugPriceInput = new javax.swing.JTextField();
        udiRemarksInput = new javax.swing.JTextField();
        udiRemarksLabel = new javax.swing.JLabel();
        udiDrugLevelInput = new javax.swing.JSpinner();
        udiDrugLevelLabel = new javax.swing.JLabel();
        udiReorderLevelInput = new javax.swing.JSpinner();
        udiReorderLevelLabel = new javax.swing.JLabel();
        udiDrugWeightInput = new javax.swing.JTextField();
        udiResetBtn = new javax.swing.JButton();
        udiUpdateBtn = new javax.swing.JButton();
        udiDrugWeightLabel1 = new javax.swing.JLabel();
        udiDrugCatVali = new javax.swing.JLabel();
        udiDrugNameVali = new javax.swing.JLabel();
        udiDrugTypeVali = new javax.swing.JLabel();
        udiDrugPriceVali = new javax.swing.JLabel();
        udiDrugWeightVali = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1765, 770));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        UpdateDrugItemPanel.setBackground(new java.awt.Color(0, 0, 0));
        UpdateDrugItemPanel.setMaximumSize(new java.awt.Dimension(1765, 770));
        UpdateDrugItemPanel.setMinimumSize(new java.awt.Dimension(1765, 770));
        UpdateDrugItemPanel.setLayout(null);

        udiTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        udiTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        udiTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        udiTitleLabel.setText("Update Drug");
        UpdateDrugItemPanel.add(udiTitleLabel);
        udiTitleLabel.setBounds(0, 30, 1760, 50);

        udiDrugCategoryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        udiDrugCategoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        udiDrugCategoryLabel.setText("Drug Category");
        UpdateDrugItemPanel.add(udiDrugCategoryLabel);
        udiDrugCategoryLabel.setBounds(160, 170, 200, 30);

        udiDrugCategorySelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                udiDrugCategorySelectorItemStateChanged(evt);
            }
        });
        UpdateDrugItemPanel.add(udiDrugCategorySelector);
        udiDrugCategorySelector.setBounds(380, 170, 300, 30);

        udiDrugNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        udiDrugNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        udiDrugNameLabel.setText("Drug Name");
        UpdateDrugItemPanel.add(udiDrugNameLabel);
        udiDrugNameLabel.setBounds(160, 240, 200, 30);

        udiDrugNameInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                udiDrugNameInputCaretUpdate(evt);
            }
        });
        UpdateDrugItemPanel.add(udiDrugNameInput);
        udiDrugNameInput.setBounds(380, 240, 300, 30);

        udiDrugTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        udiDrugTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        udiDrugTypeLabel.setText("Drug Type");
        UpdateDrugItemPanel.add(udiDrugTypeLabel);
        udiDrugTypeLabel.setBounds(160, 310, 200, 30);

        udiDrugTypeSelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                udiDrugTypeSelectorItemStateChanged(evt);
            }
        });
        UpdateDrugItemPanel.add(udiDrugTypeSelector);
        udiDrugTypeSelector.setBounds(380, 310, 300, 30);

        udiDrugPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        udiDrugPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        udiDrugPriceLabel.setText("Drug Price");
        UpdateDrugItemPanel.add(udiDrugPriceLabel);
        udiDrugPriceLabel.setBounds(160, 380, 200, 30);

        udiDrugPriceInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                udiDrugPriceInputCaretUpdate(evt);
            }
        });
        UpdateDrugItemPanel.add(udiDrugPriceInput);
        udiDrugPriceInput.setBounds(380, 380, 300, 30);
        UpdateDrugItemPanel.add(udiRemarksInput);
        udiRemarksInput.setBounds(1310, 170, 300, 30);

        udiRemarksLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        udiRemarksLabel.setForeground(new java.awt.Color(255, 255, 255));
        udiRemarksLabel.setText("Remarks");
        UpdateDrugItemPanel.add(udiRemarksLabel);
        udiRemarksLabel.setBounds(1090, 170, 200, 30);

        udiDrugLevelInput.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        UpdateDrugItemPanel.add(udiDrugLevelInput);
        udiDrugLevelInput.setBounds(1310, 240, 300, 30);

        udiDrugLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        udiDrugLevelLabel.setForeground(new java.awt.Color(255, 255, 255));
        udiDrugLevelLabel.setText("Drug Level");
        UpdateDrugItemPanel.add(udiDrugLevelLabel);
        udiDrugLevelLabel.setBounds(1090, 240, 200, 30);

        udiReorderLevelInput.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        UpdateDrugItemPanel.add(udiReorderLevelInput);
        udiReorderLevelInput.setBounds(1310, 310, 300, 30);

        udiReorderLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        udiReorderLevelLabel.setForeground(new java.awt.Color(255, 255, 255));
        udiReorderLevelLabel.setText("Reorder Level");
        UpdateDrugItemPanel.add(udiReorderLevelLabel);
        udiReorderLevelLabel.setBounds(1090, 310, 200, 30);

        udiDrugWeightInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                udiDrugWeightInputCaretUpdate(evt);
            }
        });
        UpdateDrugItemPanel.add(udiDrugWeightInput);
        udiDrugWeightInput.setBounds(1310, 380, 300, 30);

        udiResetBtn.setText("Reset");
        UpdateDrugItemPanel.add(udiResetBtn);
        udiResetBtn.setBounds(900, 670, 200, 40);

        udiUpdateBtn.setText("Update");
        udiUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udiUpdateBtnActionPerformed(evt);
            }
        });
        UpdateDrugItemPanel.add(udiUpdateBtn);
        udiUpdateBtn.setBounds(620, 670, 200, 40);

        udiDrugWeightLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        udiDrugWeightLabel1.setForeground(new java.awt.Color(255, 255, 255));
        udiDrugWeightLabel1.setText("Drug Weight");
        UpdateDrugItemPanel.add(udiDrugWeightLabel1);
        udiDrugWeightLabel1.setBounds(1090, 380, 200, 30);

        udiDrugCatVali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/common/Wrong.png"))); // NOI18N
        UpdateDrugItemPanel.add(udiDrugCatVali);
        udiDrugCatVali.setBounds(710, 170, 30, 30);

        udiDrugNameVali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/common/Wrong.png"))); // NOI18N
        UpdateDrugItemPanel.add(udiDrugNameVali);
        udiDrugNameVali.setBounds(710, 240, 30, 30);

        udiDrugTypeVali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/common/Wrong.png"))); // NOI18N
        UpdateDrugItemPanel.add(udiDrugTypeVali);
        udiDrugTypeVali.setBounds(710, 310, 30, 30);

        udiDrugPriceVali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/common/Wrong.png"))); // NOI18N
        UpdateDrugItemPanel.add(udiDrugPriceVali);
        udiDrugPriceVali.setBounds(710, 380, 30, 30);

        udiDrugWeightVali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/common/Wrong.png"))); // NOI18N
        UpdateDrugItemPanel.add(udiDrugWeightVali);
        udiDrugWeightVali.setBounds(1640, 380, 30, 30);

        getContentPane().add(UpdateDrugItemPanel);
        UpdateDrugItemPanel.setBounds(0, 0, 1765, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void udiUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udiUpdateBtnActionPerformed
        if (validateCategory() & validateName() & validateType() & validatePrice() & validateWeight()) {
            DrugCategoryModel selectedDrugCategory = (DrugCategoryModel) udiDrugCategorySelector.getSelectedItem();
            DrugTypeModel selectedDrugType = (DrugTypeModel) udiDrugTypeSelector.getSelectedItem();
            try {
                DrugModel drugUpdate = new DrugModel(udiDrugNameInput.getText(),
                        selectedDrugCategory.getId(),
                        selectedDrugType.getId(),
                        Integer.parseInt(udiDrugPriceInput.getText()),
                        udiRemarksInput.getText(),
                        Integer.parseInt(udiDrugLevelInput.getValue().toString()),
                        Integer.parseInt(udiReorderLevelInput.getValue().toString()),
                        udiDrugWeightInput.getText());
                drugUpdate.setId(selectedDrugId);
                boolean dbStatus = DrugController.getInstance().update(drugUpdate);
                if (dbStatus) {
                    DrugList.getInstance().getDrugsInit();
                    DrugList.getInstance().setupDrugTable();
                    getMessageAlert(String.format(getXMLData("StockMsg", "message", "updatedMsg"), "Drug"), "success");
                    this.dispose();
                } else {
                    getMessageAlert(getXMLData("StockMsg", "message", "somethingWrong"), "error");
                }
            } catch (SQLException ex) {
                getMessageAlert(getXMLData("StockMsg", "message", "somethingWrong"), "error");
                LOG.error(ex);
            }
        }
    }//GEN-LAST:event_udiUpdateBtnActionPerformed

    private void udiDrugNameInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_udiDrugNameInputCaretUpdate
        validateName();
    }//GEN-LAST:event_udiDrugNameInputCaretUpdate

    private void udiDrugPriceInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_udiDrugPriceInputCaretUpdate
        validatePrice();
    }//GEN-LAST:event_udiDrugPriceInputCaretUpdate

    private void udiDrugCategorySelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_udiDrugCategorySelectorItemStateChanged
        validateCategory();
    }//GEN-LAST:event_udiDrugCategorySelectorItemStateChanged

    private void udiDrugTypeSelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_udiDrugTypeSelectorItemStateChanged
        validateType();
    }//GEN-LAST:event_udiDrugTypeSelectorItemStateChanged

    private void udiDrugWeightInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_udiDrugWeightInputCaretUpdate
        validateWeight();
    }//GEN-LAST:event_udiDrugWeightInputCaretUpdate

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        DrugList.getInstance().setEnabled(true);
        DrugList.getInstance().toFront();
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
            java.util.logging.Logger.getLogger(UpdateDrugItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDrugItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDrugItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDrugItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DrugModel drug = null;
                new UpdateDrugItem(drug).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UpdateDrugItemPanel;
    private javax.swing.JLabel udiDrugCatVali;
    private javax.swing.JLabel udiDrugCategoryLabel;
    public javax.swing.JComboBox<DrugCategoryModel> udiDrugCategorySelector;
    private javax.swing.JSpinner udiDrugLevelInput;
    private javax.swing.JLabel udiDrugLevelLabel;
    private javax.swing.JTextField udiDrugNameInput;
    private javax.swing.JLabel udiDrugNameLabel;
    private javax.swing.JLabel udiDrugNameVali;
    private javax.swing.JTextField udiDrugPriceInput;
    private javax.swing.JLabel udiDrugPriceLabel;
    private javax.swing.JLabel udiDrugPriceVali;
    private javax.swing.JLabel udiDrugTypeLabel;
    public javax.swing.JComboBox<DrugTypeModel> udiDrugTypeSelector;
    private javax.swing.JLabel udiDrugTypeVali;
    private javax.swing.JTextField udiDrugWeightInput;
    private javax.swing.JLabel udiDrugWeightLabel1;
    private javax.swing.JLabel udiDrugWeightVali;
    private javax.swing.JTextField udiRemarksInput;
    private javax.swing.JLabel udiRemarksLabel;
    private javax.swing.JSpinner udiReorderLevelInput;
    private javax.swing.JLabel udiReorderLevelLabel;
    private javax.swing.JButton udiResetBtn;
    private javax.swing.JLabel udiTitleLabel;
    private javax.swing.JButton udiUpdateBtn;
    // End of variables declaration//GEN-END:variables
}
