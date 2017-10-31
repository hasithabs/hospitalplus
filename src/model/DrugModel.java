/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.interfaces.DrugDao;
import java.sql.SQLException;
import java.util.List;

import daoFactory.DaoFactory;

/**
 *
 * @author EnTeRs
 */
public class DrugModel {

    private int id;
    private String name;
    private int category;
    private int type;
    private int price;
    private String remarks;
    private int drugLevel;
    private int reorderLevel;
    private String weight;

    public DrugModel(String name, int category, int type, int price,
            String remarks, int drugLevel, int reorderLevel, String weight) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.price = price;
        this.remarks = remarks;
        this.drugLevel = drugLevel;
        this.reorderLevel = reorderLevel;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCategory() {
        return category;
    }

    public int getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getRemarks() {
        return remarks;
    }

    public int getDrugLevel() {
        return drugLevel;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public String getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setDrugLevel(int drugLevel) {
        this.drugLevel = drugLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    /*  Methods to work with the database **/
    /**
     * Save Current Drug to DB
     */
    public void save() throws SQLException {
        DrugDAO().insert(this);
    }
    
    /**
     * Get all drugs
     */
    public static List<DrugModel> all() throws SQLException {
        return DrugDAO().all();
    }
    
    /**
     * Update Existing Drug
     */
    public DrugModel update() throws SQLException {
        return DrugDAO().update(this);
    }
    
    /**
     * Remove Existing Drug
     */
    public static void remove(int id) throws SQLException {
        DrugDAO().remove(id);
    }

    /* 
     * Return the drug DAO
     * @return dao the drug dao 
     */
    private static DrugDao DrugDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getDrugDao();
    }
}
