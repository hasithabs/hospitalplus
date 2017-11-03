/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.OrderModel;
import dao.interfaces.OrderDao;
import daoFactory.DaoFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import util.Config;
import static util.DBUtil.getXMLData;

/**
 *
 * @author EnTeRs
 */
public class mysqlOrderDao implements OrderDao {

    Config cnf = new Config();
    public Logger LOG;

    public mysqlOrderDao() {
        //initialize log file
        LOG = cnf.getLogger(mysqlOrderDao.class);
    }

    /**
     * Insert Drug Type to DB
     *
     * @param order order model
     * @return OrderModel
     * @throws SQLException
     */
    @Override
    public boolean insert(OrderModel order) throws SQLException {
        try {
            Connection c = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = c.prepareStatement(getXMLData("StockQuery", "query", "addOrder"),
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, order.getSupplier());
                pstmt.setString(2, order.getDrug());
                pstmt.setInt(3, order.getQty());
                pstmt.setString(4, order.getPending());

                pstmt.executeUpdate();

                //ResultSet rset = pstmt.getGeneratedKeys();
                c.close();
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
     * Get All Drug Types from DB
     *
     * @return OrderModel
     * @throws SQLException
     */
    @Override
    public List<OrderModel> all(String pending) throws SQLException {
        ArrayList<OrderModel> orders = new ArrayList<>();

        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "getAllOrders"));
                pstmt.setString(1, pending);

                ResultSet rset = pstmt.executeQuery();
                while (rset.next()) {
                    orders.add(createOrder(rset));
                }

                pstmt.close();
            } catch (Exception ee) {
                LOG.error(ee);
            }
        } catch (Exception e) {
            LOG.error(e);
        }

        return orders;
    }
    
    /**
     * Update Existing Drug Category
     * 
     * @param order order model 
     * @return OrderModel
     * @throws SQLException 
     */
    @Override
    public boolean update(int id, String pending) throws SQLException {
        try {
            Connection con = DaoFactory.getDatabase().openConnection();
            try {
                PreparedStatement pstmt = con.prepareStatement(getXMLData("StockQuery", "query", "updateOrder"), 
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, pending);
                pstmt.setInt(2, id);

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
     * Create Drug Type
     *
     * @param rset resultset
     * @return OrderModel
     * @throws SQLException
     */
    private OrderModel createOrder(ResultSet rset) throws SQLException {
        OrderModel Order = new OrderModel(rset.getString("supplier"),
                rset.getString("drug"),
                rset.getInt("qty"),
                rset.getString("pending"));

        Order.setId(rset.getInt("id"));

        return Order;
    }

}
