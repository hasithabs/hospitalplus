/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.interfaces.PrescriptionDao;
import daoFactory.DaoFactory;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import model.Prescription;
import org.apache.log4j.Logger;
import util.Config;
import util.DBUtil;
import static util.DBUtil.getXMLData;

/**
 *
 * @author hp
 */

public class MysqlPrescriptionDao implements PrescriptionDao{
    Config cnf = new Config();
    public Logger LOG;
    
    PreparedStatement pstmt;
    ResultSet rset;
    String query;
    Connection con;

    public MysqlPrescriptionDao() throws IOException{
        //initialize log file
        LOG = cnf.getLogger(MysqlPrescriptionDao.class);
        con = DaoFactory.getDatabase().openConnection();
    }
    /*
    public void insert(Prescription prescription) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();
        
        PreparedStatement statement = c.prepareStatement(DBUtil.getXMLData("PrescriptionQuery", "query", "Prescription_Insert"));
        
        statement.setString(1, prescription.getPatientName());
        statement.setString(2, prescription.getPatientID());
        statement.setString(3, prescription.getAge());
        statement.setString(4, prescription.getSex());
        statement.setString(5, prescription.getPrescriptionID());
        statement.setDate(6, prescription.getCreateDate());
        statement.setString(7, prescription.getDrugName());
        statement.setString(8, prescription.getDosage());
        statement.setString(8, prescription.getFrequency());
        statement.setString(10, prescription.getPeroid());
        
        statement.executeUpdate();
        
        statement.close();
        c.close();
    }
    */
    @Override
    public Prescription insert(Prescription prescription) throws SQLException { 
    
        try{
            Connection con = DaoFactory.getDatabase().openConnection();
            try{
                PreparedStatement statement = con.prepareStatement(getXMLData("PrescriptionQuery", "query", "PrescriptionInsert"), PreparedStatement.RETURN_GENERATED_KEYS);
                statement.setString(1, prescription.getPatientName());
                statement.setInt(2, prescription.getPatientID());
                statement.setString(3, prescription.getAge());
                statement.setString(4, prescription.getSex());
                //statement.setInt(5, prescription.getPrescriptionID());
                statement.setDate(5, prescription.getCreateDate());
                statement.setString(6, prescription.getDrugName());
                statement.setString(7, prescription.getDosage());
                statement.setString(8, prescription.getFrequency());
                statement.setString(9, prescription.getPeroid());
                
                statement.executeUpdate();
                
                con.close();
                
            }catch(Exception ee){
                LOG.error(ee);
            }
        }catch(Exception e){
            LOG.error(e);
        }
        return prescription;
    }

    @Override
    public boolean update(Prescription psc) throws SQLException{
        
                query = DBUtil.getXMLData("PrescriptionQuery", "query", "PrescriptionUpdate");
          try { 
                pstmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
               
                pstmt.setInt(1, psc.getPatientID());
                pstmt.setString(2, psc.getAge());
                pstmt.setString(3, psc.getSex());
                pstmt.setInt(4, psc.getPrescriptionID());
                pstmt.setDate(5, psc.getCreateDate());
                pstmt.setString(6, psc.getDrugName());
                pstmt.setString(7, psc.getDosage());
                pstmt.setString(8, psc.getFrequency());
                pstmt.setString(9, psc.getPeroid());
                pstmt.setString(10, psc.getPatientName());
                
                pstmt.executeUpdate();
                
               //JOptionPane.showMessageDialog(null, DBUtil.getXMLData("EmployeeMsg", "message", "Sucessfully_updated"));
            }catch(Exception ee){
                LOG.error(ee);
            
        }
        return true;  
    } 
    

    
    @Override
    public ArrayList<Prescription> getAllData() {
       // Connection c = DaoFactory.getDatabase().openConnection();
        ArrayList<Prescription> PrescriptionList = new ArrayList<>();
        
        try {
            //pstmt = con.prepareStatement(getXMLData("PrescriptionQuery", "query", "prescriptiontDetails"), PreparedStatement.RETURN_GENERATED_KEYS);
            //reading query from xml file
            query = DBUtil.getXMLData("PrescriptionQuery", "query", "prescriptiontDetails");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery(query);
            /*query = DBUtil.getXMLData("PrescriptionQuery", "query", "prescriptiontDetails");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery(query);
            */
            //pstmt.executeUpdate();
            Prescription pres;
            while (rset.next()) {
                pres = new Prescription();
                pres.setPatientName(rset.getString("PatientName"));
                pres.setPatientID(rset.getInt("PatientID"));
                pres.setAge(rset.getString("Age"));
                pres.setSex(rset.getString("Sex"));
                pres.setPrescriptionID(rset.getInt("PrescriptionID"));
                pres.setCreateDate(rset.getDate("CreateDate"));
                pres.setDrugName(rset.getString("DrugName"));
                pres.setDosage(rset.getString("Dosage"));
                pres.setFrequency(rset.getString("Frequency"));
                pres.setPeroid(rset.getString("Period"));
                PrescriptionList.add(pres);
            }
           
        }catch (SQLException e) {
            LOG.error(e, e);
        }
        return PrescriptionList;
    }
        

        //return PrescriptionList;
    

    @Override
    public Prescription getEmployeeFromId(String PatientName) {
        Prescription presc = new Prescription();
        query = DBUtil.getXMLData("PrescriptionQuery", "query", "PrescriptionSelectAllById");
        try {

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, PatientName);
            rset = pstmt.executeQuery();
         
           
            while (rset.next()) {
                
                presc.setPatientName(rset.getString("PatientName"));
                presc.setPatientID(rset.getInt("PatientID"));
                presc.setAge(rset.getString("Age"));
                presc.setSex(rset.getString("Sex"));
                presc.setPrescriptionID(rset.getInt("PrescriptionID"));
                presc.setCreateDate(rset.getDate("CreateDate"));
                presc.setDrugName(rset.getString("DrugName"));
                presc.setDosage(rset.getString("Dosage"));
                presc.setFrequency(rset.getString("Frequency"));
                presc.setPeroid(rset.getString("Period"));            }

        } catch (SQLException e) {
            LOG.error(e, e);
        }
        return presc;
    }
/*
    @Override
    public ArrayList<String> getPatientList() throws SQLException {
        //con = DaoFactory.getDatabase().openConnection();
        ArrayList<String> PatientList = new ArrayList<>();
        try{
        query = DBUtil.getXMLData("PrescriptionQuery", "query", "patientDetails");
        pstmt = con.prepareStatement(query);
        rset = pstmt.executeQuery();

        
        while (rset.next()) {
            PatientList.add(rset.getString("FirstName") + " " + rset.getString("LastName"));
        }
        }catch(SQLException e){
            LOG.error(e);
        }
        return PatientList;
        
        
    }*/

    
    @Override
    public List<String> getPatientNames() throws SQLException {
        try {
            con = DaoFactory.getDatabase().openConnection();
            query = DBUtil.getXMLData("PrescriptionQuery", "query", "patientDetails");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
            
            List<String> patientNameList = new ArrayList<>();
            while (rset.next()) {
                patientNameList.add(rset.getString("FirstName") + " " + rset.getString("LastName"));
            }
            pstmt.close();
            con.close();
            if (patientNameList != null) {
                return patientNameList;
            }
            
        } catch (IOException ex) {
            
        }
        return null;
    }

    @Override
    public void delete(int id) throws SQLException {
        query = DBUtil.getXMLData("PrescriptionQuery", "query", "PrescriptionDelete");

        try {

            pstmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, id);

            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            LOG.error(e, e);
        }
    }

    @Override
    public int patientGetPatientID() throws SQLException {
        //try {
            int id = 0;
        try {
            con = DaoFactory.getDatabase().openConnection();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(MysqlPrescriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            query = DBUtil.getXMLData("PrescriptionQuery", "query", "patientGetPatientId");
            Statement st = con.createStatement();
            rset = st.executeQuery(query);
            
            while (rset.next()) {
                id = rset.getInt("PatientID");
            }
            st.close();
            con.close();
            return id;
        //}// catch (IOException ex) {
            //java.util.logging.Logger.getLogger(MysqlPrescriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        //}
        //return 0;
        
    }

    @Override
    public List<String> getDrugNames() throws SQLException {
        try {
            con = DaoFactory.getDatabase().openConnection();
            query = DBUtil.getXMLData("PrescriptionQuery", "query", "drugDetails");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
            
            List<String> drugNameList = new ArrayList<>();
            while (rset.next()) {
                drugNameList.add(rset.getString("DrugName"));
            }
            pstmt.close();
            con.close();
            if (drugNameList != null) {
                return drugNameList;
            }
            
        } catch (IOException ex) {
            
        }
        return null;
    }

    @Override
    public ArrayList<Prescription> getPrescData() {
        ArrayList<Prescription> dataView = new ArrayList<>();
        
        try {
            //pstmt = con.prepareStatement(getXMLData("PrescriptionQuery", "query", "prescriptiontDetails"), PreparedStatement.RETURN_GENERATED_KEYS);
            //reading query from xml file
            query = DBUtil.getXMLData("PrescriptionQuery", "query", "prescViewPrescriptionDetails");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery(query);
            /*query = DBUtil.getXMLData("PrescriptionQuery", "query", "prescriptiontDetails");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery(query);
            */
            //pstmt.executeUpdate();
            Prescription pres;
            while (rset.next()) {
                pres = new Prescription();
                pres.setPrescriptionID(rset.getInt("PrescriptionID"));
                pres.setPatientName(rset.getString("PatientName"));
                pres.setAge(rset.getString("Age"));
                pres.setCreateDate(rset.getDate("CreateDate"));
                                
                dataView.add(pres);
            }
           
        }catch (SQLException e) {
            LOG.error(e, e);
        }
        return dataView;
    }

    @Override
    public ArrayList<Prescription> getDrugData() {
        ArrayList<Prescription> viewDrug = new ArrayList<>();
        
        try {
            //pstmt = con.prepareStatement(getXMLData("PrescriptionQuery", "query", "prescriptiontDetails"), PreparedStatement.RETURN_GENERATED_KEYS);
            //reading query from xml file
            query = DBUtil.getXMLData("PrescriptionQuery", "query", "drugViewPrescDetails");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery(query);
            /*query = DBUtil.getXMLData("PrescriptionQuery", "query", "prescriptiontDetails");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery(query);
            */
            //pstmt.executeUpdate();
            Prescription pres;
            while (rset.next()) {
                pres = new Prescription();
                pres.setPrescriptionID(rset.getInt("PrescriptionID"));
                pres.setDrugName(rset.getString("DrugName"));
                pres.setDosage(rset.getString("Dosage"));
                pres.setFrequency(rset.getString("Frequency"));
                pres.setPeroid(rset.getString("Period"));
                                
                viewDrug.add(pres);
            }
           
        }catch (SQLException e) {
            LOG.error(e, e);
        }
        return viewDrug;
    }

    @Override
    public List<Prescription> searchDateDetails(String searchDate) throws SQLException {
        List<Prescription> searchdate = new ArrayList<>();
        try {
            con = DaoFactory.getDatabase().openConnection();
            String SearchTextNew = "%" + searchDate + "%";
            query = DBUtil.getXMLData("PrescriptionQuery", "query", "searchPrescriptionDetails");
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, SearchTextNew);
            rset = pstmt.executeQuery();                   
            
            
            Prescription pres;
            while (rset.next()) {
                pres = new Prescription();
                pres.setPrescriptionID(rset.getInt("PrescriptionID"));
                pres.setPatientName(rset.getString("PatientName"));
                pres.setAge(rset.getString("Age"));
                pres.setCreateDate(rset.getDate("CreateDate"));
                
                searchdate.add(pres);
            }
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(MysqlPrescriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return searchdate;
    }

    @Override
    public List<Prescription> searchPrescIdDetails(int prescId) throws SQLException {
        List<Prescription> idNumber = new ArrayList<>();
        try {
            con = DaoFactory.getDatabase().openConnection();
            String SearchTextNew = "%" + prescId + "%";
            
            query = DBUtil.getXMLData("PrescriptionQuery", "query", "prescDrugSearchDetails");
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, SearchTextNew);
            rset = pstmt.executeQuery();                   
            
            
            Prescription pres;
            while (rset.next()) {
                pres = new Prescription();
                pres.setPrescriptionID(rset.getInt("PrescriptionID"));
                pres.setDrugName(rset.getString("DrugName"));
                pres.setDosage(rset.getString("Dosage"));
                pres.setFrequency(rset.getString("Frequency"));
                pres.setPeroid(rset.getString("Period"));
                
                idNumber.add(pres);
            }
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(MysqlPrescriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idNumber;
    }
        

}
