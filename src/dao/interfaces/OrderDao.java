/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import model.OrderModel;

/**
 *
 * @author EnTeRs
 */
public interface OrderDao {
    boolean insert(OrderModel object) throws SQLException;
    List<OrderModel> all(String pending) throws SQLException;
    boolean update(int id, String pending) throws SQLException;
}
