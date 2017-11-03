/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import Model.EmployeeManagement.Employee;
import Model.EmployeeManagement.Leave;
import java.util.ArrayList;

/**
 *
 * @author kasun
 */
public interface LeaveDao {
    
    public Employee getBsicDetails(String Id);
    public ArrayList<Leave> getAllLeaveData(String Id);
    public void addLeave(Leave leave);
}
