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
public class mysqlDrugTypeDao implements DrugTypeDao {

    Config cnf = new Config();
    public Logger LOG;

    public mysqlDrugTypeDao() {
        //initialize log file
        LOG = cnf.getLogger(mysqlDrugTypeDao.class);
    }

    /**
     * Insert Drug Type to DB
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
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return drugType;
    }

    /**
     * Get All Drug Types from DB
     *
     * @param drugType drug category model
     * @return DrugTypeModel
     * @throws SQLException
     */
    @Override
    public List<DrugTypeModel> all() throws SQLException {
        ArrayList<DrugTypeModel> drugTypes = new ArrayList<>();

        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "getAllDrugTypes"));

                ResultSet rset = pstmt.executeQuery();
                while (rset.next()) {
                    drugTypes.add(createDrugType(rset));
                }

                pstmt.close();
            } catch (Exception ee) {
                getMessageAlert(ee.getMessage(), "error");
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return drugTypes;
    }

    /**
     * Create Drug Type
     *
     * @param rset resultset
     * @return DrugTypeModel
     * @throws SQLException
     */
    private DrugTypeModel createDrugType(ResultSet rset) throws SQLException {
        DrugTypeModel DrugType = new DrugTypeModel(rset.getString("name"),
                rset.getString("description"));

        DrugType.setId(rset.getInt("id"));

        return DrugType;
    }

}
