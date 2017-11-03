/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.StockManagement;

import java.sql.SQLException;
import java.util.List;
import model.OrderModel;

/**
 *
 * @author EnTeRs
 */
public class OrderController {

    private static OrderController instance = new OrderController();

    private OrderController() {
    }

    public static OrderController getInstance() {
        return instance;
    }

    public boolean save(OrderModel order) throws SQLException {
        if (order == null) {
            return false;
        }
        return order.save();
    }

    public List<OrderModel> allOrders(String pending) throws SQLException {
        return OrderModel.all(pending);
    }

    public boolean update(int id, String pending) throws SQLException {
        return OrderModel.update(id, pending);
    }
}
