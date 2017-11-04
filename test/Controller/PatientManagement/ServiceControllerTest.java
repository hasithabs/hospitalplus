/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.PatientManagement;

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
     * Test of getInstance method, of class ServiceController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ServiceController expResult = null;
        ServiceController result = ServiceController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperationTypeList method, of class ServiceController.
     */
    @Test
    public void testGetOperationTypeList() {
        System.out.println("getOperationTypeList");
        JComboBox jc = null;
        String PropVal = "";
        ServiceController.getOperationTypeList(jc, PropVal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientIDList method, of class ServiceController.
     */
    @Test
    public void testGetPatientIDList() throws Exception {
        System.out.println("getPatientIDList");
        JComboBox jc = null;
        ServiceController.getPatientIDList(jc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OperationRegistration method, of class ServiceController.
     */
    @Test
    public void testOperationRegistration() throws Exception {
        System.out.println("OperationRegistration");
        Operation op = null;
        boolean expResult = false;
        boolean result = ServiceController.OperationRegistration(op);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckUpAssigning method, of class ServiceController.
     */
    @Test
    public void testCheckUpAssigning() throws Exception {
        System.out.println("CheckUpAssigning");
        Checkup cu = null;
        boolean expResult = false;
        boolean result = ServiceController.CheckUpAssigning(cu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKeyValue method, of class ServiceController.
     */
    @Test
    public void testSetKeyValue() throws Exception {
        System.out.println("setKeyValue");
        String key = "";
        String value = "";
        ServiceController.setKeyValue(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ChannelDoctorService method, of class ServiceController.
     */
    @Test
    public void testChannelDoctorService() throws Exception {
        System.out.println("ChannelDoctorService");
        ChanelDoctorModel cd = null;
        boolean expResult = false;
        boolean result = ServiceController.ChannelDoctorService(cd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
