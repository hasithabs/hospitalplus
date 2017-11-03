/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.PatientManagement;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import model.patientModels.Patient;
import model.patientModels.PatientFood;
import util.Config;

/**
 *
 * @author Y4SHVINE
 */
public class PatientController {

    static Config cnf = new Config();
    static org.apache.log4j.Logger LOG = cnf.getLogger(PatientController.class);
    private static PatientController instance = new PatientController();

    private PatientController() {
    }

    public static void getDiatList(JComboBox jc) {
        try {
            String val = cnf.getPropertyValue("DiatTypes");
            String[] DiattypeList = val.split(",");
            for (int i = 0; i < DiattypeList.length; i++) {
                jc.addItem(DiattypeList[i]);
            }
        } catch (IOException ex) {
            LOG.error(ex.toString());
        }
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

    public int getLatestPatientID() throws SQLException {
        return Patient.getLatestPatientID();
    }

    public List getPatientDetails(String searchText) throws SQLException {
        return Patient.getPatientDetails(searchText);
    }

    public boolean updatePatient(Patient patient) throws SQLException {
        return Patient.updatePatient(patient);
    }

    public List getPatientFoodDetails(String searchText) throws SQLException {
        return PatientFood.getPatientDiatDetails(searchText);
    }

    public boolean updatePatientDiat(PatientFood pf) throws SQLException {
        return PatientFood.updatePatientDiat(pf);
    }

}
