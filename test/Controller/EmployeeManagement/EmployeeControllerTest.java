/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.EmployeeManagement;

import model.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kasun
 */
public class EmployeeControllerTest {
    
    public EmployeeControllerTest() {
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
     * Test of compairePasswords method, of class EmployeeController.
     */
    @Test
    public void testCompairePasswords() {
        System.out.println("compairePasswords");
        Employee Emp = null;
        Emp.setPassword("abc");
        Emp.setConfigPassword("Abc");
        EmployeeController instance = new EmployeeController();
        boolean expResult = false;
        boolean result = instance.compairePasswords(Emp);
        assertEquals(expResult, result);
        
    }


    /**
     * Test of DeleteEmployee method, of class EmployeeController.
     * @throws java.lang.Exception
     */
    @Test
    public void testDeleteEmployee() throws Exception {
        System.out.println("DeleteEmployee");
        String Id = "78";
        EmployeeController instance = new EmployeeController();
        instance.DeleteEmployee(Id);
        
    }

    /**
     * Test of getLatestPassword method, of class EmployeeController.
     */
    @Test
    public void testGetLatestPassword() {
        System.out.println("getLatestPassword");
        String newPass = "hh";
        String confPass = "gg";
        String oldpass = "pp";
        EmployeeController instance = new EmployeeController();
        String expResult = "pp";
        String result = instance.getLatestPassword(newPass, confPass, oldpass);
        assertEquals(expResult, result);
        
    }


    /**
     * Test of getPosiition method, of class EmployeeController.
     */
    @Test
    public void testGetPosiition() throws Exception {
        System.out.println("getPosiition");
        EmployeeController instance = new EmployeeController();
        String[] expResult = {"Pharmacist","Doctor","Nurse","Admin"};
        String[] result = instance.getPosiition();
        assertArrayEquals(expResult, result);
        
    }


    /**
     * Test of isLog method, of class EmployeeController.
     */
    @Test
    public void testIsLog() throws Exception {
        System.out.println("isLog");
        String USername = "test@mail.com";
        String Password = "gg";
        EmployeeController instance = new EmployeeController();
        boolean expResult = true;
        boolean result = instance.isLog(USername, Password);
        assertEquals(expResult, result);
        
    }
    
}
