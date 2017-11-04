/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.PatientManagement;

import java.util.List;
import javax.swing.JComboBox;
import model.patientModels.Patient;
import model.patientModels.PatientFood;
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
public class PatientControllerTest {
    
    public PatientControllerTest() {
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
     * Test of getDiatList method, of class PatientController.
     */
    @Test
    public void testGetDiatList() {
        System.out.println("getDiatList");
        JComboBox jc = null;
        PatientController.getDiatList(jc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class PatientController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        PatientController expResult = null;
        PatientController result = PatientController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of patientSignUp method, of class PatientController.
     */
    @Test
    public void testPatientSignUp() throws Exception {
        System.out.println("patientSignUp");
        Patient patient = null;
        PatientController instance = null;
        Patient expResult = null;
        Patient result = instance.patientSignUp(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLatestPatientID method, of class PatientController.
     */
    @Test
    public void testGetLatestPatientID() throws Exception {
        System.out.println("getLatestPatientID");
        PatientController instance = null;
        int expResult = 0;
        int result = instance.getLatestPatientID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientDetails method, of class PatientController.
     */
    @Test
    public void testGetPatientDetails() throws Exception {
        System.out.println("getPatientDetails");
        String searchText = "";
        PatientController instance = null;
        List expResult = null;
        List result = instance.getPatientDetails(searchText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatient method, of class PatientController.
     */
    @Test
    public void testUpdatePatient() throws Exception {
        System.out.println("updatePatient");
        Patient patient = null;
        PatientController instance = null;
        boolean expResult = false;
        boolean result = instance.updatePatient(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientFoodDetails method, of class PatientController.
     */
    @Test
    public void testGetPatientFoodDetails() throws Exception {
        System.out.println("getPatientFoodDetails");
        String searchText = "";
        PatientController instance = null;
        List expResult = null;
        List result = instance.getPatientFoodDetails(searchText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatientDiat method, of class PatientController.
     */
    @Test
    public void testUpdatePatientDiat() throws Exception {
        System.out.println("updatePatientDiat");
        PatientFood pf = null;
        PatientController instance = null;
        boolean expResult = false;
        boolean result = instance.updatePatientDiat(pf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
