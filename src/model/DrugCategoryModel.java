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

    /*  Methods to work with the database **/
    /**
     * Method to save the current user in the database
     */
    public void save() throws SQLException {
        DrugCategoryDAO().insert(this);
    }

    /* 
     * Method to return the user DAO
     * @return dao the user dao 
     */
    private static DrugCategoryDao DrugCategoryDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getDrugCategoryDao();
    }
}
