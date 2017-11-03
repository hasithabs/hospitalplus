/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete.patientConcrete;

import daoFactory.DaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.patientModels.Operation;
import util.DBUtil;
import dao.interfaces.patientInterfaces.ServicesDao;
import model.patientModels.Checkup;

/**
 *
 * @author Y4SHVINE
 */
public class MysqlServicesDao implements ServicesDao {

    @Override
    public List<String> getPatienIDs() throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();
        String query = DBUtil.getXMLData("PatientQuery", "query", "Operation_Get_All_PatientID");
        PreparedStatement st = c.prepareStatement(query);
        ResultSet rs = st.executeQuery();

        List<String> patientIDList = new ArrayList<>();
        while (rs.next()) {
            patientIDList.add(rs.getString("PatientID"));
        }
        st.close();
        c.close();
        if (patientIDList != null) {
            return patientIDList;
        }
        return null;
    }

    @Override
    public boolean OperationRegistration(Operation op) throws SQLException{
        Connection c = DaoFactory.getDatabase().openConnection();

        PreparedStatement pstmt = c.prepareStatement(DBUtil.getXMLData("PatientQuery", "query", "Operation_Resitration"));

        pstmt.setInt(1, op.getPatientID());
        pstmt.setString(2, op.getOperationType());
        pstmt.setString(3, op.getDoctor());
        pstmt.setDate(4, op.getOperationDate());

        // No rows affected
        if (pstmt.executeUpdate() <= 0) {
            pstmt.close();
            c.close();
            return false;
        } // Rows affected
        else {
            pstmt.close();
            c.close();
            return true;
        }
    }

    @Override
    public boolean CheckUpAssigning(Checkup cu) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();

        PreparedStatement pstmt = c.prepareStatement(DBUtil.getXMLData("PatientQuery", "query", "CheckUp_Assignment"));

        pstmt.setInt(1, cu.getPatientID());
        pstmt.setString(2, cu.getCheckUpType());
        pstmt.setString(3, cu.getAdditionalInfo());
        pstmt.setDate(4, cu.getCheckUpDate());

        // No rows affected
        if (pstmt.executeUpdate() <= 0) {
            pstmt.close();
            c.close();
            return false;
        } // Rows affected
        else {
            pstmt.close();
            c.close();
            return true;
        }
    }

}
