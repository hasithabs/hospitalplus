/*
*this class contains all configeration that commenly need to use
*/
package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Config {
    
    
    /*
    *Give Log variable to any class that need to use loging.
    *className -> what ever the class that need to use log file.(most of the time calling class name)
    *Logger-> return LOG varible which contain all loging functionalities.
    */
    public Logger getLogger(Class className){
        Logger LOG;
        
        PropertyConfigurator.configure(imageIconUtil.PROPERTY_FILE_PATH);
        LOG = Logger.getLogger(className);
        return LOG;
    }
    
    /*
    *This methord reads all App.Propery log file and give all readed propery files as output
    *this is static class because once you read proprty file it will not allocate memory chunks for each and every call
    */
    
    public static Properties getPropValues() throws IOException {
        Config conf =  new Config();
        Logger LOG = conf.getLogger(Config.class);

        InputStream inputStream = null;
        Properties prop = new Properties();

        try {
            String propFileName = imageIconUtil.PROPERTY_FILE_PATH;
            inputStream = new FileInputStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
                return prop;
            } else {

                LOG.error("property file '" + propFileName + "' not found in the classpath");
            }

        } catch (IOException e) {
            LOG.error("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return null;
    }
    
    /*
    *this method reads propety value for given key and return that value as string format.
    *key->key in the app.property file regarding to the value.
    */
    public String getPropertyValue(String key) throws IOException {

        Properties propertyValues = Config.getPropValues();
        return propertyValues.getProperty(key);
    }
    
    
}
