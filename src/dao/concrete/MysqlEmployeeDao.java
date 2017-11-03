/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import Model.EmployeeManagement.Employee;
import dao.interfaces.EmployeeDao;
import daoFactory.DaoFactory;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import util.Config;
import util.DBUtil;

/**
 *
 * @author kasun
 */
public class MysqlEmployeeDao implements EmployeeDao {
    //get logger 

    Config cnf = new Config();
    Logger LOG = cnf.getLogger(MysqlEmployeeDao.class);

    PreparedStatement pstmt;
    ResultSet rset;
    String query;
    Connection con;
    

    public MysqlEmployeeDao() throws IOException {
        //create connection to database
        con = DaoFactory.getDatabase().openConnection();
    }

    /*
    *insert data into database
    *employee-> the employee object that need to save in the databse should be pass to here
     */
    @Override
    public void insert(Employee employee) throws SQLException {
        //reading query from xml file
        query = DBUtil.getXMLData("EmployeeQuery", "query", "Employee_Regiter_Insert");

        try {

            pstmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, employee.getFirstName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setString(3, employee.getEmail());
            pstmt.setString(4, employee.getPassword());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            LOG.error(e, e);
        }

    }

    /*
    *select all employee and give it as array list of employees.
     */
    @Override
    public ArrayList<Employee> getAllEmployees() {

        ArrayList<Employee> EmployeeList = new ArrayList<>();

        try {
            //reading query from xml file
            query = DBUtil.getXMLData("EmployeeQuery", "query", "Employee_Edit_SelectAll");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery(query);

            Employee emp;
            while (rset.next()) {
                emp = new Employee();
                emp.setId(rset.getString("Id"));
                emp.setFirstName(rset.getString("FirstName"));
                emp.setLastName(rset.getString("LastName"));
                emp.setNIC(rset.getString("NIC"));

                EmployeeList.add(emp);
            }

        } catch (SQLException e) {
            LOG.error(e, e);
        }

        return EmployeeList;
    }

    /*
    *select all employee by given ID and give it as Employee Object.
     */
    @Override
    public Employee getEnployeeFromId(String Id) {
       
         Employee emp =new Employee();
        //reading query from xml file
        query = DBUtil.getXMLData("EmployeeQuery", "query", "Employee_Edit_SelectAllById");
        try {

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, Id);
            rset = pstmt.executeQuery();
         
           
            while (rset.next()) {
                
                emp.setId(rset.getString("Id"));
                emp.setFirstName(rset.getString("FirstName"));
                emp.setLastName(rset.getString("LastName"));
                emp.setEmail(rset.getString("Email"));
                emp.setNIC(rset.getString("NIC"));
                emp.setPassword(rset.getString("Password"));
                emp.setAddress(rset.getString("Address"));
                emp.setDOB(rset.getDate("DOB"));
                emp.setGender(rset.getString("Gender"));
                emp.setPossition(rset.getString("Possition"));
            }

        } catch (SQLException e) {
            LOG.error(e, e);
        }
        return emp;
    }

    /*
    *Update Employee Data According to the given Employee Object
    *emp-> object with all updated data.
     */
    @Override
    public void UpdateEditEmployeeData(Employee emp) {
        //reading query from xml file
        query = DBUtil.getXMLData("EmployeeQuery", "query", "Employee_Edit_Update");

        try {

            pstmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, emp.getFirstName());
            pstmt.setString(2, emp.getLastName());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getPassword());
            pstmt.setDate(5,emp.getDOB());
            pstmt.setString(6, emp.getNIC());
            pstmt.setString(7, emp.getGender());
            pstmt.setString(8, emp.getPossition());
            pstmt.setString(9, emp.getAddress());
            pstmt.setString(10, emp.getId());

            
            
            pstmt.executeUpdate();

        } catch (SQLException e) {
            LOG.error(e, e);
        }
    }

    /*
    *Delete employee from given Id.
    *Id -> Employee ID
    */
    @Override
    public void DeleteEmployee(String Id) {
        //reading query from xml file
        query = DBUtil.getXMLData("EmployeeQuery", "query", "Employee_Delete");

        try {

            pstmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, Id);
         
            pstmt.executeUpdate();

        } catch (SQLException e) {
            LOG.error(e, e);
        }
        
        
    }

    @Override
    public void UpdateSingleUser(Employee emp) {
        
        
        //reading query from xml file
        query = DBUtil.getXMLData("EmployeeQuery", "query", "Employee_Single_Update");

        try {

            pstmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, emp.getFirstName());
            pstmt.setString(2, emp.getLastName());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getPassword());
            pstmt.setDate(5,emp.getDOB());
            pstmt.setString(6, emp.getNIC());
            pstmt.setString(7, emp.getAddress());
            pstmt.setString(8, emp.getId());

           
            
            pstmt.executeUpdate();

        } catch (SQLException e) {
            LOG.error(e, e);
        }
    }

}
