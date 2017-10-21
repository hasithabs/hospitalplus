/*
 * This class handles all the operations regarding to the employees 
 * in addition to that this holds all the attributes regarding to the Employees
 */
package Controller.EmployeeManagement;

import java.sql.SQLException;

import daoFactory.DaoFactory;
import dao.interfaces.EmployeeDao;

public class EmployeeController {

    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String ConfigPassword;


    private static EmployeeDao employeeDao() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getEmployeeDao();
    }

    public void save() throws SQLException {
        employeeDao().insert(this);
    }

    // getters and setters for the employee object
     public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getConfigPassword() {
        return ConfigPassword;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setConfigPassword(String ConfigPassword) {
        this.ConfigPassword = ConfigPassword;
    }
}
