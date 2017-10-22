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

    public mysqlDrugCategoryDao() {
        //create log variablle
        Logger LOG = cnf.getLogger(mysqlDrugCategoryDao.class);
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
            Connection c = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = c.prepareStatement(getXMLData("StockQuery", "query", "addDrugCategory"), 
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, drugCategory.getName());
                pstmt.setString(2, drugCategory.getDescription());

                pstmt.executeUpdate();

                //ResultSet rset = pstmt.getGeneratedKeys();
                c.close();
            } catch (Exception ee) {
                getMessageAlert(ee.getMessage(), "error");
            }
        } catch (Exception e) {
            getMessageAlert(e.getMessage(), "error");
        }

        return drugCategory;
    }
    
}
