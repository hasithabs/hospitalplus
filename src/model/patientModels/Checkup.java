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
public class Checkup {

    
    private int patientID;
    private String checkUpType;
    private Date checkupDate;
    private String additionalInfo;

    public Checkup(String pid, String cupType, Date cupDate, String additionalInfo) {
        this.patientID = Integer.parseInt(pid);
        this.checkUpType = cupType;
        this.checkupDate = cupDate;
        this.additionalInfo = additionalInfo;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getCheckUpType() {
        return checkUpType;
    }

    public void setCheckUpType(String checkUpType) {
        this.checkUpType = checkUpType;
    }

    public Date getCheckUpDate() {
        return checkupDate;
    }

    public void setCheckUpDate(Date checkupDate) {
        this.checkupDate = checkupDate;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    public static boolean CheckUpAssigning(Checkup cu) throws SQLException{
        return ServiceDAO().CheckUpAssigning(cu);
    }
    
     private static ServicesDao ServiceDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getServiceDao();
    }
}
