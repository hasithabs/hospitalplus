package Controller.EmployeeManagement;

import Model.EmployeeManagement.Employee;
import Model.EmployeeManagement.Leave;
import dao.interfaces.LeaveDao;
import daoFactory.DaoFactory;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import util.Config;
import util.DBUtil;
import util.Util;

public class LeaveController {

    //set property values to this file
    Config cnf = new Config();
    Logger LOG = cnf.getLogger(LeaveController.class);

    /*
    *return the Employee data access object after getting it form data access object factory.
     */
    private static LeaveDao LeaveDao() throws IOException {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getLeaveDao();
    }

    /*
    *return all the employee registerd employee data as ArrayList
     */
    public Employee getEmployeeById(String Id) throws IOException {

        return LeaveDao().getBsicDetails(Id);
    }
    
    public ArrayList<Leave> getLeaves(String Id) throws IOException{
        return LeaveDao().getAllLeaveData(Id);
    }
    
   public void sendMail(String Content){
        try {
            Util.mailSender(cnf.getPropertyValue("HRManagerMail"), Util.LEAVE_EMIAL_SUBJECT, Content);
            JOptionPane.showMessageDialog(null, DBUtil.getXMLData("EmployeeMsg", "message", "Mail_Send_pass"));
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, DBUtil.getXMLData("EmployeeMsg", "message", "Mail_Send_fail"));
            LOG.error("Mail Can not Send", ex);
            
        }
   }
}
