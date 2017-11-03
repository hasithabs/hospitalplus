/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.interfaces.DrugCategoryDao;
import java.sql.SQLException;
import java.util.List;

import daoFactory.DaoFactory;

/**
 *
 * @author EnTeRs
 */
public class DrugCategoryModel {

    private int id;
    private String name;
    private String description;

    public DrugCategoryModel(String name, String description) {
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
     * Save Current Drug Category to DB
     */
    public boolean save() throws SQLException {
        return DrugCategoryDAO().insert(this);
    }
    
    /**
     * Get all drug categories
     */
    public static List<DrugCategoryModel> all() throws SQLException {
        return DrugCategoryDAO().all();
    }
    
    /**
     * Update Existing Drug Category
     */
    public boolean update() throws SQLException {
        return DrugCategoryDAO().update(this);
    }
    
    /**
     * Remove Existing Drug Category
     */
    public static boolean remove(int id) throws SQLException {
        return DrugCategoryDAO().remove(id);
    }
    
    /* 
     * Return the drug category DAO
     * @return dao the drug category dao 
     */
    private static DrugCategoryDao DrugCategoryDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getDrugCategoryDao();
    }
}
