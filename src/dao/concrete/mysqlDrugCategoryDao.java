/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DrugCategoryModel;
import dao.interfaces.DrugCategoryDao;
import daoFactory.DaoFactory;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author EnTeRs
 */
public class mysqlDrugCategoryDao implements DrugCategoryDao {

    private static final String INSERT = "INSERT INTO drug_categories(name, description) VALUES(?, ?)";

    /**
     * Method to insert a user in the database
     *
     * @param user the user that will be inserted
     * @return user the inserted
     * @throws SQLException
     */
    @Override
    public DrugCategoryModel insert(DrugCategoryModel drugCategory) throws SQLException {
        try {
            Connection c = DaoFactory.getDatabase().openConnection();
            try (PreparedStatement pstmt = c.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, drugCategory.getName());
                pstmt.setString(2, drugCategory.getName());

                pstmt.executeUpdate();
                
                JOptionPane jop = new JOptionPane();
JDialog dialog = jop.createDialog("File not found");
dialog.setLayout(new BorderLayout());
JLabel im = new JLabel("Java Technology Dive Log", util.Util.getIcon(getClass(), "common/home_background"), JLabel.CENTER);
dialog.add(im, BorderLayout.NORTH);
dialog.setVisible(true);

                ResultSet rset = pstmt.getGeneratedKeys();
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return drugCategory;
    }
}
