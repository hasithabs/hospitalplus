/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.StockManagement;

import java.util.List;
import model.DrugCategoryModel;
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
public class DrugCategoryControllerTest {
    
    public DrugCategoryControllerTest() {
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
     * Test of getInstance method, of class DrugCategoryController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        DrugCategoryController expResult = null;
        DrugCategoryController result = DrugCategoryController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class DrugCategoryController.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        DrugCategoryModel drugCategory = null;
        DrugCategoryController instance = null;
        boolean expResult = false;
        boolean result = instance.save(drugCategory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allDrugCategories method, of class DrugCategoryController.
     */
    @Test
    public void testAllDrugCategories() throws Exception {
        System.out.println("allDrugCategories");
        DrugCategoryController instance = null;
        List<DrugCategoryModel> expResult = null;
        List<DrugCategoryModel> result = instance.allDrugCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DrugCategoryController.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        DrugCategoryModel drugCategory = null;
        DrugCategoryController instance = null;
        boolean expResult = false;
        boolean result = instance.update(drugCategory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DrugCategoryController.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        int id = 0;
        DrugCategoryController instance = null;
        boolean expResult = false;
        boolean result = instance.remove(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
