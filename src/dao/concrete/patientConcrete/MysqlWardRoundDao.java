package dao.concrete.patientConcrete;

import dao.interfaces.patientInterfaces.WardRoundDao;
import daoFactory.DaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.patientModels.wardRound;
import util.DBUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Y4SHVINE
 */
public class MysqlWardRoundDao implements WardRoundDao {

    @Override
    public List<String> getDoctorList() throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();
        String query = DBUtil.getXMLData("PatientQuery", "query", "GET_All_Registered_Doctors");
        PreparedStatement st = c.prepareStatement(query);
        ResultSet rs = st.executeQuery();

        List<String> DoctorList = new ArrayList<>();
        while (rs.next()) {
            DoctorList.add(rs.getString("FirstName") + " " + rs.getString("LastName"));
        }
        st.close();
        c.close();
        if (DoctorList != null) {
            return DoctorList;
        }
        return null;
    }

    @Override
    public boolean addWardRoundDetails(wardRound wr) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();

        PreparedStatement pstmt = c.prepareStatement(DBUtil.getXMLData("PatientQuery", "query", "Schedule_Ward_Rrounds"));

        pstmt.setString(1, wr.getDocName());
        pstmt.setString(2, wr.getWardName());
        pstmt.setDate(3, wr.getStartDate());
        pstmt.setString(4, wr.getStartTime());

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
