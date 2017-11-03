/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.EmployeeManagement;

import Model.EmployeeManagement.Employee;
import Model.EmployeeManagement.Leave;
import java.util.ArrayList;
import java.util.Map;
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
public class LeaveControllerTest {
    
    public LeaveControllerTest() {
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
     * Test of sendMail method, of class LeaveController.
     */
    @Test
    public void testSendMail() {
        System.out.println("sendMail");
        String mail = "kmkasunmadushanka@gmail.com";
        String Content = "Testing";
        LeaveController instance = new LeaveController();
        instance.sendMail(mail, Content);
        
    }

    /**
     * Test of getReportingManagers method, of class LeaveController.
     */
    @Test
    public void testGetReportingManagers() throws Exception {
        System.out.println("getReportingManagers");
        LeaveController instance = new LeaveController();
        String[] expResult = {"kasun madusanka","Yashwida Jayasekara"};
        String[] result = instance.getReportingManagers();
        assertArrayEquals(expResult, result);
        
    }

   

    
    
}
