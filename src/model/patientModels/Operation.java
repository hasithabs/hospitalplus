/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patientModels;

import daoFactory.DaoFactory;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import dao.interfaces.patientInterfaces.ServicesDao;

/**
 *
 * @author Y4SHVINE
 */
public class Operation {

    private int patientID;
    private String operationType;
    private String doctor;
    private Date operationDate;

    public Operation(String pid, String optype, String doc, Date opdate) {
        this.patientID = Integer.parseInt(pid);
        this.operationType = optype;
        this.doctor = doc;
        this.operationDate = opdate;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public static List<String> getPatienIDs() throws SQLException{
        return ServiceDAO().getPatienIDs();
    }
    
    public static boolean OperationRegistration(Operation op) throws SQLException{
        return ServiceDAO().OperationRegistration(op);
    }
    private static ServicesDao ServiceDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getServiceDao();
    }
}
