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
     * Test of save method, of class DrugCategoryController.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        DrugCategoryModel drugCategory = new DrugCategoryModel("test1", "test2");
        DrugCategoryController instance = DrugCategoryController.getInstance();
        boolean expResult = true;
        boolean result = instance.save(drugCategory);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class DrugCategoryController.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        DrugCategoryModel drugCategory = new DrugCategoryModel("test3", "test4");
        DrugCategoryController instance = DrugCategoryController.getInstance();
        boolean expResult = true;
        boolean result = instance.update(drugCategory);
        assertEquals(expResult, result);
    }
    
}
