/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.interfaces.DrugTypeDao;
import java.sql.SQLException;

import daoFactory.DaoFactory;
import java.util.List;

/**
 *
 * @author EnTeRs
 */
public class DrugTypeModel {

    private int id;
    private String name;
    private String description;

    public DrugTypeModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return name;
    }

    /*  Methods to work with the database **/
    /**
     * Save Current Drug Type to DB
     */
    public boolean save() throws SQLException {
        return DrugTypeDAO().insert(this);
    }
    
    /**
     * Get all drug types
     */
    public static List<DrugTypeModel> all() throws SQLException {
        return DrugTypeDAO().all();
    }

    /**
     * Update Existing Drug Type
     */
    public boolean update() throws SQLException {
        return DrugTypeDAO().update(this);
    }
    
    /**
     * Remove Existing Drug Type
     */
    public static boolean remove(int id) throws SQLException {
        return DrugTypeDAO().remove(id);
    }
    /* 
     * Return the drug type DAO
     * @return dao the drug type dao 
     */
    private static DrugTypeDao DrugTypeDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getDrugTypeDao();
    }
}
