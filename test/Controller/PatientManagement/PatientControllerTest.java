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
    JComboBox jcb = new JComboBox();
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
     * Test of getLatestPatientID method, of class PatientController.
     */
    @Test
    public void testGetLatestPatientID() throws Exception {
        System.out.println("getLatestPatientID");
        PatientController instance = PatientController.getInstance();
        int expResult = 2;
        int result = instance.getLatestPatientID();
        assertEquals(expResult, result);
    }

}
