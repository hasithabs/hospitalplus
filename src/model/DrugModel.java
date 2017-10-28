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
    private int drug_level;
    private int reorder_level;
    private String weight;

    public DrugModel(String name, int category, int type, int price,
            String remarks, int drug_level, int reorder_level, String weight) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.price = price;
        this.remarks = remarks;
        this.drug_level = drug_level;
        this.reorder_level = reorder_level;
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

    public int getDrug_level() {
        return drug_level;
    }

    public int getReorder_level() {
        return reorder_level;
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

    public void setDrug_level(int drug_level) {
        this.drug_level = drug_level;
    }

    public void setReorder_level(int reorder_level) {
        this.reorder_level = reorder_level;
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

    /* 
     * Return the drug DAO
     * @return dao the drug dao 
     */
    private static DrugDao DrugDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getDrugDao();
    }
}
