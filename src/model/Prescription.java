/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.SQLException;

import dao.interfaces.PrescriptionDao;
import daoFactory.DaoFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author hp
 */
public class Prescription {
    private String PatientName;
    private int PatientID;
    private String Age;
    private String Sex;
    private int PrescriptionID;
    private Date CreateDate;
    private String DrugName;
    private String Dosage;
    private String Frequency;
    private String Peroid;
    
   public Prescription(String pName, String pID, String pAge, String pSex, Date cDate, String dName, String dDosage, String dFrequency, String dPeriod){
        this.PatientName = pName;
        this.PatientID = Integer.parseInt(pID);
        this.Age = pAge;
        this.Sex = pSex;
        //this.prescriptionID = Integer.parseInt(prescID);
        this.CreateDate = cDate;
        this.DrugName = dName;
        this.Dosage = dDosage;
        this.Frequency = dFrequency;
        this.Peroid = dPeriod;
    }

    public Prescription() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*public Prescription(String string, int aInt, String string0, String string1, int aInt0, Date date, String string2, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        this.PatientName = patientName;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int patientID) {
        this.PatientID = patientID;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        this.Age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        this.Sex = sex;
    }
    
    public int getPrescriptionID() {
        return PrescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.PrescriptionID = prescriptionID;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        this.CreateDate = createDate;
    }

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String drugName) {
        this.DrugName = drugName;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        this.Dosage = dosage;
    }

    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String frequency) {
        this.Frequency = frequency;
    }

    public String getPeroid() {
        return Peroid;
    }

    public void setPeroid(String peroid) {
        this.Peroid = peroid;
    }
    
    public void prescriptionSubmit() throws SQLException, IOException {
        prescriptionDAO().insert(this);
    }
    
    public static boolean update(Prescription psc) throws IOException, SQLException {
        return prescriptionDAO().update(psc);
    }
    
    public static void delete(int id) throws IOException, SQLException {
        prescriptionDAO().delete(id);
    }
    
    public static List<String> getPatientNames() throws SQLException, IOException{
        return prescriptionDAO().getPatientNames();
    }
    
    public static List<String> getDrugNames() throws SQLException, IOException{
        return prescriptionDAO().getDrugNames();
    }
    
    public static int patientGetPatientID() throws SQLException, IOException{
        return prescriptionDAO().patientGetPatientID();
    }
    
    public static java.util.List searchDateDetails(String searchDate) throws SQLException, IOException{
        return prescriptionDAO().searchDateDetails(searchDate);
    }
    
    public static java.util.List searchPrescIdDetails(int prescId) throws SQLException, IOException{
        return prescriptionDAO().searchPrescIdDetails(prescId);
    }
    
    private static PrescriptionDao prescriptionDAO() throws IOException {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getPrescriptionDao();
    }
    
    
}
