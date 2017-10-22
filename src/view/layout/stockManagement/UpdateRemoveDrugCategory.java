/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.layout.stockManagement;

/**
 *
 * @author EnTeRs
 */
public class UpdateRemoveDrugCategory extends javax.swing.JFrame {

    /**
     * Creates new form AddStockItem
     */
    public UpdateRemoveDrugCategory() {
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

        UpdateRemoveDrugCategoryPanel = new javax.swing.JPanel();
        urdcTitleLabel = new javax.swing.JLabel();
        urdcDrugCatNameLabel = new javax.swing.JLabel();
        urdcUpdateBtn = new javax.swing.JButton();
        urdcCloseBtn = new javax.swing.JButton();
        urdcDrugCatNameInput = new javax.swing.JTextField();
        urdcRemoveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 300));
        getContentPane().setLayout(null);

        UpdateRemoveDrugCategoryPanel.setBackground(new java.awt.Color(0, 0, 0));
        UpdateRemoveDrugCategoryPanel.setMaximumSize(new java.awt.Dimension(800, 300));
        UpdateRemoveDrugCategoryPanel.setMinimumSize(new java.awt.Dimension(800, 300));
        UpdateRemoveDrugCategoryPanel.setLayout(null);

        urdcTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        urdcTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        urdcTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urdcTitleLabel.setText("Update/Remove Drug Category");
        UpdateRemoveDrugCategoryPanel.add(urdcTitleLabel);
        urdcTitleLabel.setBounds(0, 30, 800, 50);

        urdcDrugCatNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        urdcDrugCatNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        urdcDrugCatNameLabel.setText("Drug Category Name");
        UpdateRemoveDrugCategoryPanel.add(urdcDrugCatNameLabel);
        urdcDrugCatNameLabel.setBounds(120, 140, 180, 30);

        urdcUpdateBtn.setText("Update");
        UpdateRemoveDrugCategoryPanel.add(urdcUpdateBtn);
        urdcUpdateBtn.setBounds(230, 220, 140, 40);

        urdcCloseBtn.setText("X");
        UpdateRemoveDrugCategoryPanel.add(urdcCloseBtn);
        urdcCloseBtn.setBounds(740, 10, 40, 40);

        urdcDrugCatNameInput.setText("jTextField1");
        UpdateRemoveDrugCategoryPanel.add(urdcDrugCatNameInput);
        urdcDrugCatNameInput.setBounds(310, 140, 300, 30);

        urdcRemoveBtn.setText("Remove");
        UpdateRemoveDrugCategoryPanel.add(urdcRemoveBtn);
        urdcRemoveBtn.setBounds(410, 220, 140, 40);

        getContentPane().add(UpdateRemoveDrugCategoryPanel);
        UpdateRemoveDrugCategoryPanel.setBounds(0, 0, 800, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(UpdateRemoveDrugCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRemoveDrugCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRemoveDrugCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRemoveDrugCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRemoveDrugCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UpdateRemoveDrugCategoryPanel;
    private javax.swing.JButton urdcCloseBtn;
    private javax.swing.JTextField urdcDrugCatNameInput;
    private javax.swing.JLabel urdcDrugCatNameLabel;
    private javax.swing.JButton urdcRemoveBtn;
    private javax.swing.JLabel urdcTitleLabel;
    private javax.swing.JButton urdcUpdateBtn;
    // End of variables declaration//GEN-END:variables
}
