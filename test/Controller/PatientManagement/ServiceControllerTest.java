/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.PatientManagement;

import java.util.Date;
import javax.swing.JComboBox;
import model.patientModels.ChanelDoctorModel;
import model.patientModels.Checkup;
import model.patientModels.Operation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Y4SHVINE
 */
public class ServiceControllerTest {
    
    public ServiceControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of OperationRegistration method, of class ServiceController.
     */
    @Test
    public void testOperationRegistration() throws Exception {
        System.out.println("OperationRegistration");
        Operation op = new Operation("1", "test", "test", new java.sql.Date(2000,12,3));
        boolean expResult = true;
        boolean result = ServiceController.OperationRegistration(op);
        assertEquals(expResult, result);

    }

    /**
     * Test of CheckUpAssigning method, of class ServiceController.
     */
    @Test
    public void testCheckUpAssigning() throws Exception {
        System.out.println("CheckUpAssigning");
        Checkup cu;
        cu = new Checkup("1","test checkup",new java.sql.Date(2017,10,12),"info");
        boolean expResult = true;
        boolean result = ServiceController.CheckUpAssigning(cu);
        assertEquals(expResult, result);
    }


    /**
     * Test of ChannelDoctorService method, of class ServiceController.
     */
    @Test
    public void testChannelDoctorService() throws Exception {
        System.out.println("ChannelDoctorService");
        ChanelDoctorModel cd = new ChanelDoctorModel("test doc", "1", new java.sql.Date(2017,10,12), "morning");
        boolean expResult = true;
        boolean result = ServiceController.ChannelDoctorService(cd);
        assertEquals(expResult, result);
    }
    
}
