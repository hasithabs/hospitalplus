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
import model.patientModels.wardRound;
import util.Config;

/**
 *
 * @author Y4SHVINE
 */
public class WardRoundController {
    static Config cnf = new Config();
    static org.apache.log4j.Logger LOG = cnf.getLogger(WardRoundController.class);
    private static WardRoundController instance = new WardRoundController();

     public static void getWardTypeList(JComboBox jc) {
        try {
            String val = cnf.getPropertyValue("Wards");
            String[] OperationTypes = val.split(",");
            for (String OperationType : OperationTypes) {
                jc.addItem(OperationType);
            }
        } catch (IOException ex) {
            LOG.error(ex.toString());
        }
    }
     public static WardRoundController getInstance() {
        return instance;
    }

    public List getDoctorListDetails() throws SQLException {
        return wardRound.getDoctorList();
    }
    
    public boolean addWardRoundDetails(wardRound wr) throws SQLException {
        return wardRound.addWardRoundDetails(wr);
    }
}
