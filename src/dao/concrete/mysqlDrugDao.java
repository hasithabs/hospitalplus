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
    public boolean insert(DrugModel drug) throws SQLException {
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
                pstmt.setInt(6, drug.getDrugLevel());
                pstmt.setInt(7, drug.getReorderLevel());
                pstmt.setString(8, drug.getWeight());

                pstmt.executeUpdate();

                con.close();
                return true;
            } catch (Exception ee) {
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }
        
        return false;
    }

    /**
     * Get All Drugs from DB
     *
     * @return DrugModel
     * @throws SQLException
     */
    @Override
    public List<DrugModel> all() throws SQLException {
        ArrayList<DrugModel> drugs = new ArrayList<>();

        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "getAllDrugs"));

                ResultSet rset = pstmt.executeQuery();
                while (rset.next()) {
                    drugs.add(createDrug(rset));
                }

                pstmt.close();
            } catch (Exception ee) {
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return drugs;
    }

    /**
     * Update Existing Drug
     *
     * @param drug drug model
     * @return DrugModel
     * @throws SQLException
     */
    @Override
    public boolean update(DrugModel drug) throws SQLException {
        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "updateDrug"),
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, drug.getName());
                pstmt.setInt(2, drug.getCategory());
                pstmt.setInt(3, drug.getType());
                pstmt.setInt(4, drug.getPrice());
                pstmt.setString(5, drug.getRemarks());
                pstmt.setInt(6, drug.getDrugLevel());
                pstmt.setInt(7, drug.getReorderLevel());
                pstmt.setString(8, drug.getWeight());
                pstmt.setInt(9, drug.getId());

                pstmt.executeUpdate();

                //ResultSet rset = pstmt.getGeneratedKeys();
                con.close();

                return true;
            } catch (Exception ee) {
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return false;
    }

    /**
     * Remove Existing Drug
     *
     * @param id drug id
     * @return DrugModel
     * @throws SQLException
     */
    @Override
    public void remove(int id) throws SQLException {
        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "removeDrug"),
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
     * Create Drug
     *
     * @param rset resultset
     * @return DrugModel
     * @throws SQLException
     */
    private DrugModel createDrug(ResultSet rset) throws SQLException {
        DrugModel Drug = new DrugModel(rset.getString("name"),
                rset.getInt("category"),
                rset.getInt("type"),
                rset.getInt("price"),
                rset.getString("remarks"),
                rset.getInt("drug_level"),
                rset.getInt("reorder_level"),
                rset.getString("weight"));

        Drug.setId(rset.getInt("id"));

        return Drug;
    }

}
