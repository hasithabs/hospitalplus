package Controller.EmployeeManagement;

import Model.EmployeeManagement.Employee;
import Model.EmployeeManagement.Leave;
import dao.interfaces.LeaveDao;
import daoFactory.DaoFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

    public ArrayList<Leave> getLeaves(String Id) throws IOException {
        return LeaveDao().getAllLeaveData(Id);
    }

    public void sendMail(String mail,String Content) {
        try {
            Util.mailSender(mail, Util.LEAVE_EMIAL_SUBJECT, Content);
            JOptionPane.showMessageDialog(null, DBUtil.getXMLData("EmployeeMsg", "message", "Mail_Send_pass"));

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, DBUtil.getXMLData("EmployeeMsg", "message", "Mail_Send_fail"));
            LOG.error("Mail Can not Send", ex);

        }
    }

    /*
    *return all reporting manager names in property file
    */
    public String[] getReportingManagers() throws IOException {

        String reportingManagers = cnf.getPropertyValue("ReporttingManagers");
        String nameArray[] = new String[reportingManagers.split(";").length];

        for (int i = 0; i < reportingManagers.split(";").length; i++) {

            nameArray[i] = reportingManagers.split(";")[i].split(":")[0].trim();
        }

        return nameArray;
    }

    /*
    *return all reporting manager names with there email as map
    *<name,email>
    */
    public Map<String, String> getEmailMap() throws IOException {

        String reportingManagers = cnf.getPropertyValue("ReporttingManagers");
        Map<String, String> emailMap = new HashMap<>();

        for (int i = 0; i < reportingManagers.split(";").length; i++) {
            emailMap.put(reportingManagers.split(";")[i].split(":")[0].trim(), reportingManagers.split(";")[i].split(":")[1]);
        }

        return emailMap;
    }
    
    /*
    *call to insert leave function
    */
    
    public void insert(Leave leave) throws IOException{
        
        LeaveDao().addLeave(leave);
        JOptionPane.showMessageDialog(null, DBUtil.getXMLData("EmployeeMsg", "message", "Leave_Successfully_Insert"));
        
    }
    
    
   

}
