/*
 * This class handles all the operations regarding to the employees 
 * in addition to that this holds all the attributes regarding to the Employees
 */
package Controller.EmployeeManagement;


import java.io.IOException;
import org.apache.log4j.Logger;
import util.Config;


public class Employee {
  
    public static void main(String[] args) throws IOException {
        Config cnf = new Config();
        
        //create log variablle
        Logger LOG = cnf.getLogger(Employee.class);
        
        //calling property value
        System.out.println(cnf.getPropertyValue("name"));
        LOG.info("Hello World");
    }
    
    
    
    
}
