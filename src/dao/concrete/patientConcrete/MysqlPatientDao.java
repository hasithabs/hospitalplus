/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete.patientConcrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.interfaces.patientInterfaces.PatientDao;
import daoFactory.DaoFactory;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.patientModels.Patient;
import model.patientModels.PatientFood;
import org.apache.log4j.Logger;
import util.DBUtil;

/**
 *
 * @author Y4SHVINE
 */
public class MysqlPatientDao implements PatientDao {

    public Logger LOG;

    /**
     *
     * Insert Data to Patient Table
     */
    public void insert(Patient patient) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();

        PreparedStatement pstmt = c.prepareStatement(DBUtil.getXMLData("PatientQuery", "query", "Patient_SignUp_Insert"));
        PreparedStatement pstmtfood = c.prepareStatement(DBUtil.getXMLData("PatientQuery", "query", "Patient_SignUp_Insert_Food"));

        pstmt.setInt(1, patient.getPatientID());
        pstmt.setString(2, patient.getFirstName());
        pstmt.setString(3, patient.getLastName());
        pstmt.setString(4, patient.getSex());
        pstmt.setDate(5, patient.getDateofBirth());
        pstmt.setString(6, patient.getEmail());
        pstmt.setString(7, patient.getPhoneNumber());
        pstmt.setString(8, patient.getNic());
        pstmt.setString(9, patient.getAddress());
        pstmt.setString(10, patient.getCity());
        pstmt.setString(11, patient.getPzCode());
        pstmt.setString(12, patient.getAdditionalInfo());

        pstmt.executeUpdate();
        
        pstmtfood.setInt(1, patient.getPatientID());
        pstmtfood.executeUpdate();

        pstmt.close();
        pstmtfood.close();
        c.close();
    }

    @Override
    public int getLatestPatientID() throws SQLException {
        //Return Obj
        int id = 0;
        Connection c = DaoFactory.getDatabase().openConnection();

        String query = DBUtil.getXMLData("PatientQuery", "query", "Patient_Get_Latest_PatientID");
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            id = rs.getInt("MaxPID");
        }
        st.close();
        c.close();
        return id;
    }

    public List<Patient> getPatientDetails(String SearchText) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();
        String SearchTextNew = "%" + SearchText + "%";
        String query = DBUtil.getXMLData("PatientQuery", "query", "Patient_Get_Patient_Details");
        PreparedStatement st = c.prepareStatement(query);
        st.setString(1, SearchTextNew);
        st.setString(2, SearchTextNew);
        st.setString(3, SearchTextNew);
        ResultSet rs = st.executeQuery();

        List<Patient> patientList = new ArrayList<>();
        while (rs.next()) {
            Patient patient = new Patient(
                    rs.getString("PatientID"),
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("Sex"),
                    rs.getString("Email"),
                    rs.getString("PhoneNumber"),
                    rs.getString("NIC"),
                    rs.getString("Address"),
                    rs.getString("City"),
                    rs.getString("ZipPostalCode"),
                    rs.getString("AdditionalInfo"),
                    rs.getDate("DateofBirth")
            );
            patientList.add(patient);
        }
        st.close();
        c.close();
        if (patientList != null) {
            return patientList;
        }
        return null;
    }

    @Override
    public boolean updatePatient(Patient patient) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();

        PreparedStatement pstmt = c.prepareStatement(DBUtil.getXMLData("PatientQuery", "query", "Patient_Update_Patient_Details"));

        pstmt.setString(1, patient.getFirstName());
        pstmt.setString(2, patient.getLastName());
        pstmt.setString(3, patient.getSex());
        pstmt.setDate(4, patient.getDateofBirth());
        pstmt.setString(5, patient.getEmail());
        pstmt.setString(6, patient.getPhoneNumber());
        pstmt.setString(7, patient.getNic());
        pstmt.setString(8, patient.getAddress());
        pstmt.setString(9, patient.getCity());
        pstmt.setString(10, patient.getPzCode());
        pstmt.setString(11, patient.getAdditionalInfo());
        pstmt.setInt(12, patient.getPatientID());

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
    public List<PatientFood> getPatientFoodDetails(String SearchText) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();
        String SearchTextNew = "%" + SearchText + "%";
        String query = DBUtil.getXMLData("PatientQuery", "query", "PatientFood_Get_Patient_Diat_Details");
        PreparedStatement st = c.prepareStatement(query);
        st.setString(1, SearchTextNew);
        st.setString(2, SearchTextNew);
        st.setString(3, SearchTextNew);
        ResultSet rs = st.executeQuery();

        List<PatientFood> patientFoodList = new ArrayList<>();
          while (rs.next()) {
            PatientFood patientDiat = new PatientFood(
                    rs.getString("PatientID"),
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("DiatName"),
                    rs.getDate("StartDate"),
                    rs.getDate("EndDate")
            );

            patientFoodList.add(patientDiat);
        }
        st.close();
        c.close();
        if (patientFoodList != null) {
            return patientFoodList;
        }
        return null;
    }

    @Override
    public boolean updatePatientDiat(PatientFood pf) throws SQLException {
         Connection c = DaoFactory.getDatabase().openConnection();

        PreparedStatement pstmt = c.prepareStatement(DBUtil.getXMLData("PatientQuery", "query", "PatientFood_Update_Patient_Diat_Details"));

        pstmt.setString(1, pf.getDiatType());
        pstmt.setDate(2, pf.getStartDate());
        pstmt.setDate(3, pf.getEndDate());
        pstmt.setInt(4, pf.getPatientID());

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
