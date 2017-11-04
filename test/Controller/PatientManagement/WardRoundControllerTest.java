/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.PatientManagement;

import java.util.List;
import javax.swing.JComboBox;
import model.patientModels.wardRound;
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
public class WardRoundControllerTest {
    
    public WardRoundControllerTest() {
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
     * Test of getWardTypeList method, of class WardRoundController.
     */
    @Test
    public void testGetWardTypeList() {
        System.out.println("getWardTypeList");
        JComboBox jc = null;
        WardRoundController.getWardTypeList(jc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class WardRoundController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        WardRoundController expResult = null;
        WardRoundController result = WardRoundController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoctorListDetails method, of class WardRoundController.
     */
    @Test
    public void testGetDoctorListDetails() throws Exception {
        System.out.println("getDoctorListDetails");
        WardRoundController instance = new WardRoundController();
        List expResult = null;
        List result = instance.getDoctorListDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWardRoundDetails method, of class WardRoundController.
     */
    @Test
    public void testAddWardRoundDetails() throws Exception {
        System.out.println("addWardRoundDetails");
        wardRound wr = null;
        WardRoundController instance = new WardRoundController();
        boolean expResult = false;
        boolean result = instance.addWardRoundDetails(wr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
