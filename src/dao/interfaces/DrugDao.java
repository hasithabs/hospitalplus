/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import model.DrugModel;

/**
 *
 * @author EnTeRs
 */
public interface DrugDao {
    DrugModel insert(DrugModel object) throws SQLException;
}
