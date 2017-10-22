/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.EmployeeManagement;

import java.io.IOException;
import org.apache.log4j.Logger;
import util.Config;

/**
 *
 * @author kasun
 */
public class test {
    public static void main (String [] args) throws IOException{
        Config cnf = new Config();
        
        //create log variablle
        Logger LOG = cnf.getLogger(test.class);
        
        //calling property value
        System.out.println(cnf.getPropertyValue("name"));
        LOG.info("Hello World");
    }
}
