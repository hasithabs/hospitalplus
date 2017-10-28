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

import model.DrugModel;
import dao.interfaces.DrugDao;
import daoFactory.DaoFactory;
import org.apache.log4j.Logger;
import util.Config;
import static util.DBUtil.getXMLData;
import static util.messageAlert.getMessageAlert;

/**
 *
 * @author EnTeRs
 */
public class mysqlDrugDao implements DrugDao {

    Config cnf = new Config();
    public Logger LOG;

    public mysqlDrugDao() {
        //initialize log file
        LOG = cnf.getLogger(mysqlDrugTypeDao.class);
    }

    /**
     * Method to insert a user in the database
     *
     * @param user the user that will be inserted
     * @return user the inserted
     * @throws SQLException
     */
    @Override
    public DrugModel insert(DrugModel drug) throws SQLException {
        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "addDrug"), 
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, drug.getName());
                pstmt.setInt(2, drug.getCategory());
                pstmt.setInt(3, drug.getType());
                pstmt.setInt(4, drug.getPrice());
                pstmt.setString(5, drug.getRemarks());
                pstmt.setInt(6, drug.getDrug_level());
                pstmt.setInt(7, drug.getReorder_level());
                pstmt.setString(8, drug.getWeight());

                pstmt.executeUpdate();

                con.close();
            } catch (Exception ee) {
                getMessageAlert(ee.getMessage(), "error");
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return drug;
    }
}
