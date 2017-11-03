/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patientModels;

import dao.interfaces.patientInterfaces.ServicesDao;
import daoFactory.DaoFactory;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author Y4SHVINE
 */
public class ChanelDoctorModel {

    
    private String doctorsName;
    private int patientID;
    private Date chanelDate;
    private String chanelSession;

    public ChanelDoctorModel(String docName, String patientID, Date chanelDate, String channelSession) {
        this.doctorsName = docName;
        this.patientID =Integer.parseInt(patientID);
        this.chanelDate = chanelDate;
        this.chanelSession = channelSession;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Date getChanelDate() {
        return chanelDate;
    }

    public void setChanelDate(Date chanelDate) {
        this.chanelDate = chanelDate;
    }

    public String getChanelSession() {
        return chanelSession;
    }

    public void setChanelSession(String chanelSession) {
        this.chanelSession = chanelSession;
    }
    
    public static boolean ChannelDoctorService(ChanelDoctorModel cd) throws SQLException {
        return ServiceDAO().ChannelDoctorService(cd);
    }

    private static ServicesDao ServiceDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getServiceDao();
    }
}
