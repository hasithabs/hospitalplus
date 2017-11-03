/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patientModels;

import dao.interfaces.patientInterfaces.PatientDao;
import daoFactory.DaoFactory;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author Y4SHVINE
 */
public class PatientFood {

    private int patientID;
    private String firstName;
    private String lastName;
    private String DiatType;
    private Date StartDate;
    private Date EndDate;

    public PatientFood(String pid, String fname, String lname, String DiatType, Date sdate, Date edate) {
        this.patientID = Integer.parseInt(pid);
        this.firstName = fname;
        this.lastName = lname;
        this.DiatType = DiatType;
        this.StartDate = sdate;
        this.EndDate = edate;
    }

    public PatientFood(String pid, String DiatType, Date sdate, Date edate) {
        this.patientID = Integer.parseInt(pid);
        this.DiatType = DiatType;
        this.StartDate = sdate;
        this.EndDate = edate;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiatType() {
        return DiatType;
    }

    public void setDiatType(String DiatType) {
        this.DiatType = DiatType;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    public static java.util.List getPatientDiatDetails(String SearchText) throws SQLException {
        return patientDAO().getPatientFoodDetails(SearchText);
    }
    
    public static boolean updatePatientDiat(PatientFood pf) throws SQLException {
        return patientDAO().updatePatientDiat(pf);
    }

    private static PatientDao patientDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getPatientDao();
    }
}
