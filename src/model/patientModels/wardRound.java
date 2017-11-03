/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patientModels;

import dao.interfaces.patientInterfaces.WardRoundDao;
import daoFactory.DaoFactory;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Y4SHVINE
 */
public class wardRound {

    private String DocName;
    private String WardName;
    private Date StartDate;
    private String StartTime;

    public wardRound(String docName, String wardName, Date startDate, String startTime) {
        this.DocName = docName;
        this.WardName = wardName;
        this.StartDate = startDate;
        this.StartTime = startTime;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    public String getWardName() {
        return WardName;
    }

    public void setWardName(String WardName) {
        this.WardName = WardName;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public static List<String> getDoctorList() throws SQLException {
        return wardRoundDAO().getDoctorList();
    }

    public static boolean addWardRoundDetails(wardRound wr) throws SQLException{
       return wardRoundDAO().addWardRoundDetails(wr);
    }

    private static WardRoundDao wardRoundDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getWardRoundDao();
    }

}
