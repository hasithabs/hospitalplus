/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.StockManagement;

import java.util.List;
import model.DrugTypeModel;
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
public class DrugTypeControllerTest {
    
    public DrugTypeControllerTest() {
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
     * Test of getInstance method, of class DrugTypeController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        DrugTypeController expResult = null;
        DrugTypeController result = DrugTypeController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class DrugTypeController.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        DrugTypeModel drugType = null;
        DrugTypeController instance = null;
        boolean expResult = false;
        boolean result = instance.save(drugType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allDrugTypes method, of class DrugTypeController.
     */
    @Test
    public void testAllDrugTypes() throws Exception {
        System.out.println("allDrugTypes");
        DrugTypeController instance = null;
        List<DrugTypeModel> expResult = null;
        List<DrugTypeModel> result = instance.allDrugTypes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DrugTypeController.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        DrugTypeModel drugType = null;
        DrugTypeController instance = null;
        boolean expResult = false;
        boolean result = instance.update(drugType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DrugTypeController.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        int id = 0;
        DrugTypeController instance = null;
        boolean expResult = false;
        boolean result = instance.remove(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
