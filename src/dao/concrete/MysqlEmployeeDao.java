/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import Controller.EmployeeManagement.EmployeeController;
import dao.interfaces.EmployeeDao;
import daoFactory.DaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kasun
 */
public class MysqlEmployeeDao implements EmployeeDao {

    private static final String INSERT = "INSERT INTO Employee (FirstName,LastName,Email,Password) VALUES (?, ?, ?, ?)";

    @Override
    public EmployeeController insert(EmployeeController employee) throws SQLException {
        try (
                Connection c = DaoFactory.getDatabase().openConnection();
                PreparedStatement pstmt = c.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, employee.getFirstName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setString(3, employee.getEmail());
            pstmt.setString(4, employee.getPassword());
         

            pstmt.executeUpdate();

            ResultSet rset = pstmt.getGeneratedKeys();

            rset.next();

        }

        return employee;
    }

}
