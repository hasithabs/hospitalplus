/*
* manage all the operations regarding to the employee.
*/
package Controller.EmployeeManagement;

import model.Employee;
import dao.interfaces.EmployeeDao;
import daoFactory.DaoFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import util.Config;
import util.Util;
import util.DBUtil;

public class EmployeeController {

    //set property values to this file
    Config cnf = new Config();
    Logger LOG = cnf.getLogger(EmployeeController.class);

    /*
    *return the Employee data access object after getting it form data access object factory.
    */
    private static EmployeeDao employeeDao() throws IOException {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getEmployeeDao();
    }

    /*
    *compare Password and COnfigPassword is match with each others. and return boolean value.
    *emp-> employee object that need to check the passwords
     */
    public boolean compairePasswords(Employee Emp) {
        return Emp.getPassword().equals(Emp.getConfigPassword());
    }

    /*
    *save function will call after all the validations are done by this method
    *Emp->Employee object that need to save in the database.
     */
    public void save(Employee Emp) throws SQLException, IOException {

        if (Emp != null) {
            if (compairePasswords(Emp) && !Emp.getPassword().equals(Util.PASSWORD_DEFAULT_VALUE) && !Emp.getConfigPassword().equals(Util.PASSWORD_DEFAULT_VALUE)) {
                employeeDao().insert(Emp);   
            } else {
                JOptionPane.showMessageDialog(null, DBUtil.getXMLData("EmployeeMsg", "message", "Employee_Registration_Password_NotCompair"));
                LOG.error(DBUtil.getXMLData("EmployeeMsg", "message", "Employee_Registration_Password_NotCompair"));
            }
        } 
    }
    
    /*
    *return all the employee registerd employee data as ArrayList
    */
    public ArrayList<Employee> getAllRegistedEmployeeData() throws IOException{
        
        return employeeDao().getAllEmployees();
        
    }
    
    /*
    *return all the employee registerd employee data as ArrayList
    */
    public Employee getEmployeeById(String Id) throws IOException{
        
        return employeeDao().getEnployeeFromId(Id);
        
    }
    
    
    /*
    *return all the employee registerd employee data as ArrayList
    */
    public void AdminUpdate(Employee emp) throws IOException{
        
        employeeDao().UpdateEditEmployeeData(emp);
        
    }
    
    public void DeleteEmployee(String Id) throws IOException{
        
        employeeDao().DeleteEmployee(Id);
        
    }
    
    
    /*
    *chrck the password is changed, then give the new one. otherwise return old password.
    *
    */
    
    public String getLatestPassword(String newPass,String confPass ,String oldpass){
        
        if(newPass != null||confPass != null){
            
            if(newPass.trim().endsWith(confPass.trim())){
                return newPass;
            }
        }
        
        return oldpass;
        
        
    }
    
    /*
    *Update Single User by given Employee Object
    */
    public void updateSingleUser(Employee emp) throws IOException{
        
        employeeDao().UpdateSingleUser(emp);
       
    }
    
    /*
    *Read the App.Property file and give all possitions as Array
    */
     public String[] getPosiition() throws IOException{
        String reportingManagers = cnf.getPropertyValue("possition");
       
        return reportingManagers.split(",");
    }
     
    /*
    *give Employee data from login employees
    */
    public Employee logIn(String USername, String Password) throws IOException{
        Employee emp ;
        emp = employeeDao().logInCheck(USername, Password);
        System.out.println(emp);
        return emp;
    }
    
    
   /*
   *check wether user is loged in or not
   */
   public boolean isLog(String USername, String Password) throws IOException{
       
       return employeeDao().isLogin(USername.trim(), Password.trim());
      
   } 
   
   
}
