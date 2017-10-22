/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.PatientManagement;


import java.sql.SQLException;
import model.Patient;

/**
 *
 * @author Y4SHVINE
 */
public class PatientController {

    private static PatientController instance = new PatientController();

    private PatientController() {
    }

    public static PatientController getInstance() {
        return instance;
    }

    public Patient patientSignUp(Patient patient) throws SQLException {
        if (patient != null) {
            patient.patientSignUp();
        }
        return patient;
    }

}
