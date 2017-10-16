/*
 * This class handles all the operations regarding to the employees 
 * in addition to that this holds all the attributes regarding to the Employees
 */
package Controller.EmployeeManagement;


import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import util.PropertyValues;
import util.Util;
 

public class Employee {
    public Logger LOG;
   
    public Employee() throws IOException{
        //in order to use the log file
        PropertyConfigurator.configure(Util.PROPERTY_FILE_PATH);
        LOG = Logger.getLogger(Employee.class);
        
    }
    
    public static void main(String[] args) throws IOException {
        //create instance to access the property file
        PropertyValues propertyVal = new PropertyValues();
        Properties propertyValues = propertyVal.getPropValues();
        
        System.out.println(propertyValues.getProperty("name"));
    }
    
    
    
    
}
