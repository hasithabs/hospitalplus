/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.StockManagement;

import java.util.List;
import model.DrugModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EnTeRs
 */
public class DrugControllerTest {
    
    public DrugControllerTest() {
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
     * Test of save method, of class DrugController.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        DrugModel drug = null;
        DrugController instance = null;
        boolean expResult = false;
        boolean result = instance.save(drug);
        assertEquals(expResult, result);

    }

    /**
     * Test of allDrugs method, of class DrugController.
     */
    @Test
    public void testAllDrugs() throws Exception {
        System.out.println("allDrugs");
        DrugController instance = null;
        List<DrugModel> expResult = null;
        List<DrugModel> result = instance.allDrugs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DrugController.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        DrugModel drug = null;
        DrugController instance = DrugController.getInstance();
        boolean expResult = false;
        boolean result = instance.update(drug);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DrugController.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        int id = 2;
        DrugController instance = DrugController.getInstance();
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
