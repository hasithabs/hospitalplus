/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import Model.EmployeeManagement.Employee;
import dao.interfaces.EmployeeDao;
import daoFactory.DaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DBUtil;

/**
 *
 * @author kasun
 */
public class MysqlEmployeeDao implements EmployeeDao {
 
    /*
    *insert data into database
    *employee-> the employee object that need to save in the databse should be pass to here
    */
    @Override
    public void insert(Employee employee) throws SQLException {
        //reading query from xml file
        String query = DBUtil.getXMLData("EmployeeQuery", "query", "Employee_Regiter_Insert");
        
        try (
                Connection c = DaoFactory.getDatabase().openConnection();
                PreparedStatement pstmt = c.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, employee.getFirstName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setString(3, employee.getEmail());
            pstmt.setString(4, employee.getPassword());
         

            pstmt.executeUpdate();

            ResultSet rset = pstmt.getGeneratedKeys();

            rset.next();

        }
 
    }

}
