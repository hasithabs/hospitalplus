/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.DrugCategoryModel;
import dao.interfaces.DrugCategoryDao;
import daoFactory.DaoFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import util.Config;
import static util.DBUtil.getXMLData;
import static util.messageAlert.getMessageAlert;

/**
 *
 * @author EnTeRs
 */
public class mysqlDrugCategoryDao implements DrugCategoryDao {

    Config cnf = new Config();
    public Logger LOG;

    public mysqlDrugCategoryDao() {
        //initialize log file
        LOG = cnf.getLogger(mysqlDrugTypeDao.class);
    }

    /**
     * Insert Drug Category to DB
     * 
     * @param drugCategory drug category model 
     * @return DrugCategoryModel
     * @throws SQLException 
     */
    @Override
    public DrugCategoryModel insert(DrugCategoryModel drugCategory) throws SQLException {
        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "addDrugCategory"), 
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, drugCategory.getName());
                pstmt.setString(2, drugCategory.getDescription());

                pstmt.executeUpdate();

                //ResultSet rset = pstmt.getGeneratedKeys();
                con.close();
            } catch (Exception ee) {
                getMessageAlert(ee.getMessage(), "error");
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return drugCategory;
    }
    
    /**
     * Get All Drug Categories from DB
     * 
     * @return DrugCategoryModel
     * @throws SQLException 
     */
    @Override
    public List<DrugCategoryModel> all() throws SQLException {
        ArrayList<DrugCategoryModel> drugCategories = new ArrayList<>();

        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "getAllDrugCategories"));

                ResultSet rset = pstmt.executeQuery();
                while (rset.next()) {
                    drugCategories.add(createDrugCategory(rset));
                }

                pstmt.close();
            } catch (Exception ee) {
                getMessageAlert(ee.getMessage(), "error");
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return drugCategories;
    }
    
    /**
     * Update Existing Drug Category
     * 
     * @param drugCategory drug category model 
     * @return DrugCategoryModel
     * @throws SQLException 
     */
    @Override
    public DrugCategoryModel update(DrugCategoryModel drugCategory) throws SQLException {
        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "updateDrugCategory"), 
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, drugCategory.getName());
                pstmt.setString(2, drugCategory.getDescription());
                pstmt.setInt(3, drugCategory.getId());

                pstmt.executeUpdate();

                //ResultSet rset = pstmt.getGeneratedKeys();
                con.close();
            } catch (Exception ee) {
                getMessageAlert(ee.getMessage(), "error");
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return drugCategory;
    }
    
    /**
     * Remove Existing Drug Category
     * 
     * @param id drug category id
     * @return DrugCategoryModel
     * @throws SQLException 
     */
    @Override
    public void remove(int id) throws SQLException {
        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "removeDrugCategory"), 
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setInt(1, id);

                pstmt.executeUpdate();

                //ResultSet rset = pstmt.getGeneratedKeys();
                con.close();
            } catch (Exception ee) {
                getMessageAlert(ee.getMessage(), "error");
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }
    }
   
    /**
     * Create Drug Category
     * 
     * @param rset resultset
     * @return DrugCategoryModel
     * @throws SQLException 
     */
    private DrugCategoryModel createDrugCategory(ResultSet rset) throws SQLException {
        DrugCategoryModel DrugCategory = new DrugCategoryModel(rset.getString("name"),
                rset.getString("description"));

        DrugCategory.setId(rset.getInt("id"));

        return DrugCategory;
    }
    
}
