/*
 * This class conatain all the configerations regarding to
 * Log and PropertyFile
 */
package Controller.EmployeeManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author kasun
 */
public class UtilityConfig {

    //Log and Property attributes are accesed to child clases
    public Logger LOG;
    public Properties property;
    private final FileInputStream inputStream;

    public UtilityConfig() throws FileNotFoundException, IOException {

        //get property file data.
        inputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\Util\\App.properties");
        //get Log4j Properties
        PropertyConfigurator.configure("src\\Util\\App.properties");
        
        property = new Properties();
        //load property file
        property.load(inputStream);
    }

}
