/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces.patientInterfaces;

import java.sql.SQLException;
import java.util.List;
import model.patientModels.Patient;
import model.patientModels.PatientFood;

/**
 *
 * @author Y4SHVINE
 */
public interface PatientDao {

    void insert(Patient patient) throws SQLException;

    int getLatestPatientID() throws SQLException;

    List<Patient> getPatientDetails(String SearchText) throws SQLException;

    boolean updatePatient(Patient patient) throws SQLException;
    
    List<PatientFood> getPatientFoodDetails(String SearchText) throws SQLException;
    
    boolean updatePatientDiat(PatientFood pf) throws SQLException;
}
