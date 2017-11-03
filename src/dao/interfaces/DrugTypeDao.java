/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import model.DrugTypeModel;

/**
 *
 * @author EnTeRs
 */
public interface DrugTypeDao {
    boolean insert(DrugTypeModel object) throws SQLException;
    List<DrugTypeModel> all() throws SQLException;
    boolean update(DrugTypeModel object) throws SQLException;
    boolean remove(int id) throws SQLException;
}
