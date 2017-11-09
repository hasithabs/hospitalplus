/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyValues {

    InputStream inputStream;
    public Logger LOG;

    public PropertyValues() {
        PropertyConfigurator.configure(Util.PROPERTY_FILE_PATH);
        LOG = Logger.getLogger(PropertyValues.class);
    }

    public Properties getPropValues() throws IOException {
        Properties prop = new Properties();
        
        try {
            String propFileName = Util.PROPERTY_FILE_PATH;

            inputStream = new FileInputStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {

                LOG.error("property file '" + propFileName + "' not found in the classpath");
            }

        } catch (IOException e) {
            LOG.error("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return prop;
    }

}
