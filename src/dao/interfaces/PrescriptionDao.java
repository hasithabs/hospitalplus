/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Prescription;
/**
 *
 * @author hp
 */
public interface PrescriptionDao {
    Prescription insert(Prescription prescription) throws SQLException;
    public ArrayList<Prescription> getAllData();
    public Prescription getEmployeeFromId(String Id);
    boolean update(Prescription psc) throws SQLException;
    public void delete(int id) throws SQLException;
    List<String> getPatientNames() throws SQLException;
    List<String> getDrugNames() throws SQLException;
    int patientGetPatientID() throws SQLException;
    public ArrayList<Prescription> getPrescData();
    public ArrayList<Prescription> getDrugData();
    List<Prescription> searchDateDetails(String searchDate) throws SQLException;
    List<Prescription> searchPrescIdDetails(int prescId) throws SQLException;
}
