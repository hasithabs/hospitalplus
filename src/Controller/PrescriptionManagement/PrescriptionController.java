/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.PrescriptionManagement;

import dao.interfaces.PrescriptionDao;
import daoFactory.DaoFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import model.Prescription;

/**
 *
 * @author hp
 */
public class PrescriptionController {
    
    private static PrescriptionController presc = new PrescriptionController();

        
    public PrescriptionController(){
        
    }
    
    private static PrescriptionDao PrescriptDao() throws IOException {
        DaoFactory dao = DaoFactory.getDatabase();
        return dao.getPrescriptionDao();
    }

    public static PrescriptionController getPresc() {
        return presc;
    }
    
    public Prescription addPrescription(Prescription prescription) throws SQLException, IOException {
        if (prescription != null) {
            prescription.prescriptionSubmit();
        }
        return prescription;
    }
    public ArrayList<Prescription> getAllPrescriptionData() throws IOException{
        
        return PrescriptDao().getAllData();
        
    }
    public Prescription getPrescriptionById(String PatientName) throws IOException{
        return PrescriptDao().getEmployeeFromId(PatientName);
    }
    
    public boolean update(Prescription psc) throws SQLException, IOException {
        return Prescription.update(psc);
        
    }
    public void delete(int id) throws SQLException, IOException {
        PrescriptDao().delete(id);
    }
    
    public static void getPatientNameList(JComboBox jc) throws SQLException, IOException {
        List<String> NameList = getAllPatientNames();
        for (String Name : NameList) {
            jc.addItem(Name);
        }
    }
    
    private static List<String> getAllPatientNames() throws SQLException, IOException {
        return Prescription.getPatientNames();
    }
    
    public static void getDrugNameList(JComboBox dl) throws SQLException, IOException {
        List<String> drugNameList = getAllDrugNames();
        for (String Drug : drugNameList) {
            dl.addItem(Drug);
        }
    }
    
    private static List<String> getAllDrugNames() throws SQLException, IOException {
        return Prescription.getDrugNames();
    }
    
    public int patientGetPatientID() throws SQLException, IOException {
        return Prescription.patientGetPatientID();
         
    }
    
    public ArrayList<Prescription> allPrescViewData() throws IOException{
        
        return PrescriptDao().getPrescData();
        
    }
    
    public ArrayList<Prescription> viewAllDrugData() throws IOException{
        
        return PrescriptDao().getDrugData();
        
    }
    
    public List searchDateDetails(String searchDate) throws SQLException, IOException {
        return Prescription.searchDateDetails(searchDate);
    }
    
    public List searchPrescIdDetails(int prescId) throws SQLException, IOException {
        return Prescription.searchPrescIdDetails(prescId);
    }
    
}
