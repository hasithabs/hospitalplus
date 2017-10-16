/*
 * This class handles all the operations regarding to the employees 
 * in addition to that this holds all the attributes regarding to the Employees
 */
package Controller.EmployeeManagement;

import java.io.IOException;
import org.apache.log4j.Logger;


/**
 *
 * @author kasun
 */
public class Employee extends UtilityConfig{
    
    public Employee() throws IOException{
        super();
        LOG  = Logger.getLogger(Employee.class);
        
    }
    
    public static void main(String[] args) throws IOException {
         
        Employee e = new Employee();
        System.out.println(e.property.getProperty("name"));
        e.LOG.warn("fsefsf");
    }
    
    
    
    
}
