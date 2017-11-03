/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import model.DrugCategoryModel;

/**
 *
 * @author EnTeRs
 */
public interface DrugCategoryDao {
    boolean insert(DrugCategoryModel object) throws SQLException;
    List<DrugCategoryModel> all() throws SQLException;
    boolean update(DrugCategoryModel object) throws SQLException;
    boolean remove(int id) throws SQLException;
}
