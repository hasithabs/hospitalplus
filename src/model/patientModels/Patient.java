/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patientModels;

import java.sql.Date;
import java.sql.SQLException;

import dao.interfaces.patientInterfaces.PatientDao;
import daoFactory.DaoFactory;
import java.awt.List;

/**
 *
 * @author Y4SHVINE
 */
public class Patient {

    private int patientID;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private String phoneNumber;
    private String nic;
    private String address;
    private String city;
    private String pzCode;
    private String additionalInfo;
    private Date dateofBirth;

    public Patient(String pid, String fname, String lname, String sex, String email, String phonenumber, String nic, String address, String city, String pzcode, String additionalInfo, Date dob) {
        this.patientID = Integer.parseInt(pid);
        this.firstName = fname;
        this.lastName = lname;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phonenumber;
        this.nic = nic;
        this.address = address;
        this.city = city;
        this.pzCode = pzcode;
        this.additionalInfo = additionalInfo;
        this.dateofBirth = dob;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPzCode() {
        return pzCode;
    }

    public void setPzCode(String pzCode) {
        this.pzCode = pzCode;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /**
     * Method to save the patient in the database
     */
    public void patientSignUp() throws SQLException {
        patientDAO().insert(this);
    }
    
    /**
     * Method to get Latest PatientID
     */
    public static int getLatestPatientID() throws SQLException{
        return patientDAO().getLatestPatientID();
    }

    public static java.util.List getPatientDetails(String SearchText) throws SQLException{
        return patientDAO().getPatientDetails(SearchText);
    }
     
    public static boolean updatePatient(Patient patient) throws SQLException{
        return patientDAO().updatePatient(patient);
    }
    private static PatientDao patientDAO() {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getPatientDao();
    }
}
