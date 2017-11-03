package dao.concrete;

import model.Employee;
import model.Leave;
import dao.interfaces.LeaveDao;
import daoFactory.DaoFactory;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import util.Config;
import util.DBUtil;

public class MySqlLeaveDao implements LeaveDao {
    //get logger 

    Config cnf = new Config();
    Logger LOG = cnf.getLogger(MysqlEmployeeDao.class);

    PreparedStatement pstmt;
    ResultSet rset;
    String query;
    Connection con;

    public MySqlLeaveDao() throws IOException {
        //create connection to database
        con = DaoFactory.getDatabase().openConnection();
    }

    /*
    *select basic drails of employee by given ID and give it as Employee Object.
    *Id -> Id of the Employee
     */
    @Override
    public Employee getBsicDetails(String Id) {
        Employee emp = new Employee();
        //reading query from xml file
        query = DBUtil.getXMLData("EmployeeQuery", "query", "Employee_Basic_Details");
        try {

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, Id);
            rset = pstmt.executeQuery();

            while (rset.next()) {

                emp.setId(rset.getString("Id"));
                emp.setFirstName(rset.getString("FirstName"));
                emp.setLastName(rset.getString("LastName"));
                emp.setEmail(rset.getString("Email"));

            }

        } catch (SQLException e) {
            LOG.error(e, e);
        }
        return emp;
    }

    @Override
    public ArrayList<Leave> getAllLeaveData(String Id) {
        
        ArrayList<Leave> leaveList = new ArrayList<>();
        Leave lv;
        try {
            //reading query from xml file
            query = DBUtil.getXMLData("EmployeeQuery", "query", "Leave_allData_ByEmpId");
            
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, Id);
            rset = pstmt.executeQuery();

            while (rset.next()) {
                lv = new Leave();

                lv.setEmpId(rset.getString("EmpId"));
                lv.setDiscription(rset.getString("Description"));
                lv.setDate(rset.getDate("Date"));
                lv.setStatus(rset.getString("Status"));
                lv.setReportingManager(rset.getString("Reporting_Manager"));

                leaveList.add(lv);
            }

        } catch (SQLException e) {
            LOG.error("Error In Quering", e);
        }

        return leaveList;
    }

    /*
    *Add leave to the LEave table from given Leave object
    *leave -> leave object 
    */
    @Override
    public void addLeave(Leave leave) {
         //reading query from xml file
        query = DBUtil.getXMLData("EmployeeQuery", "query", "Leave_Insert");

        try {

            pstmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, leave.getEmpId());
            pstmt.setDate(2,leave.getDate());
            pstmt.setString(3, leave.getDiscription());
            pstmt.setString(4, leave.getReportingManager());
            pstmt.setString(5, leave.getStatus());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            LOG.error(e, e);
        }

    }

}
