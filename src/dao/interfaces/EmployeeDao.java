/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import Model.EmployeeManagement.Employee;
import java.sql.SQLException;

/**
 *
 * @author kasun
 */
public interface EmployeeDao {
    
    void insert(Employee object) throws SQLException;
    
}
