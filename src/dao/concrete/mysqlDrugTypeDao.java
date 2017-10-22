/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.DrugTypeModel;
import dao.interfaces.DrugTypeDao;
import daoFactory.DaoFactory;
import org.apache.log4j.Logger;
import util.Config;
import static util.DBUtil.getXMLData;
import static util.messageAlert.getMessageAlert;

/**
 *
 * @author EnTeRs
 */
public class mysqlDrugTypeDao implements DrugTypeDao {

    Config cnf = new Config();

    public mysqlDrugTypeDao() {
        //create log variablle
        Logger LOG = cnf.getLogger(mysqlDrugTypeDao.class);
    }
    /**
     * Insert Drug Category to DB
     * 
     * @param drugType drug category model 
     * @return DrugTypeModel
     * @throws SQLException 
     */
    @Override
    public DrugTypeModel insert(DrugTypeModel drugType) throws SQLException {
        try {
            Connection c = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = c.prepareStatement(getXMLData("StockQuery", "query", "addDrugType"), 
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, drugType.getName());
                pstmt.setString(2, drugType.getDescription());

                pstmt.executeUpdate();

                //ResultSet rset = pstmt.getGeneratedKeys();
                c.close();
            } catch (Exception ee) {
                getMessageAlert(ee.getMessage(), "error");
            }
        } catch (Exception e) {
            getMessageAlert(e.getMessage(), "error");
        }

        return drugType;
    }
    
}
