/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.interfaces.OrderDao;
import daoFactory.DaoFactory;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author EnTeRs
 */
public class OrderModel {

    private int id;
    private String supplier;
    private String drug;
    private int qty;
    private String pending;

    public OrderModel(String supplier, String drug, int qty, String pending) {
        this.supplier = supplier;
        this.drug = drug;
        this.qty = qty;
        this.pending = pending;
    }

    public int getId() {
        return id;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getDrug() {
        return drug;
    }

    public int getQty() {
        return qty;
    }

    public String getPending() {
        return pending;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    @Override
    public String toString() {
        return supplier;
    }

    /*  Methods to work with the database **/
    /**
     * Save Current Drug to DB
     */
    public boolean save() throws SQLException {
        return OrderDAO().insert(this);
    }
    
    /**
     * Get all drugs
     */
    public static List<OrderModel> all(String pending) throws SQLException {
        return OrderDAO().all(pending);
    }
    
    /**
     * Update Existing Drug
     */
    public static boolean update(int id, String pending) throws SQLException {
        return OrderDAO().update(id, pending);
    }

    /* 
     * Return the drug DAO
     * @return dao the drug dao 
     */
    private static OrderDao OrderDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getOrderDao();
    }
}
