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
    DrugTypeModel insert(DrugTypeModel object) throws SQLException;
}
