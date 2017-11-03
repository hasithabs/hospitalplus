/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import model.Employee;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kasun
 */
public interface EmployeeDao {
    
    public void insert(Employee object) throws SQLException;
    public ArrayList<Employee> getAllEmployees();
    public Employee getEnployeeFromId(String Id);
    public void UpdateEditEmployeeData(Employee emp);
    public void DeleteEmployee(String Id);
    public void UpdateSingleUser(Employee emp);
    public Employee logInCheck(String UserName,String Password);
    public boolean isLogin(String UserName,String Password);
}
