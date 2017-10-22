/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.interfaces.PatientDao;
import daoFactory.DaoFactory;
import model.Patient;
import util.DBUtil;

/**
 *
 * @author Y4SHVINE
 */
public class MysqlPatientDao implements PatientDao {

    /**
     *
     *Insert Data to Patient Table
     */
    public void insert(Patient patient) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();

        PreparedStatement pstmt = c.prepareStatement(DBUtil.getXMLData("PatientQuery", "query", "Patient_SignUp_Insert"));

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

        pstmt.close();
        c.close();
    }
}
