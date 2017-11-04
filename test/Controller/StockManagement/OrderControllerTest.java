/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.StockManagement;

import java.util.List;
import model.OrderModel;
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
public class OrderControllerTest {
    
    public OrderControllerTest() {
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
     * Test of getInstance method, of class OrderController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        OrderController expResult = null;
        OrderController result = OrderController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class OrderController.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        OrderModel order = null;
        OrderController instance = null;
        boolean expResult = false;
        boolean result = instance.save(order);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allOrders method, of class OrderController.
     */
    @Test
    public void testAllOrders() throws Exception {
        System.out.println("allOrders");
        String pending = "";
        OrderController instance = null;
        List<OrderModel> expResult = null;
        List<OrderModel> result = instance.allOrders(pending);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class OrderController.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        int id = 0;
        String pending = "";
        OrderController instance = null;
        boolean expResult = false;
        boolean result = instance.update(id, pending);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
