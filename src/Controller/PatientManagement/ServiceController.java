/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.PatientManagement;

import static Controller.PatientManagement.PatientController.cnf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import javax.swing.JComboBox;
import model.patientModels.Checkup;
import model.patientModels.Operation;
import util.imageIconUtil;

/**
 *
 * @author Y4SHVINE
 */
public class ServiceController {

    private static ServiceController serviceInstance = new ServiceController();
    static org.apache.log4j.Logger LOG = cnf.getLogger(ServiceController.class);

    private ServiceController() {
    }

    public static ServiceController getInstance() {
        return serviceInstance;
    }

    public static void getOperationTypeList(JComboBox jc, String PropVal) {
        try {
            String val = cnf.getPropertyValue(PropVal);
            String[] OperationTypes = val.split(",");
            for (String OperationType : OperationTypes) {
                jc.addItem(OperationType);
            }
        } catch (IOException ex) {
            LOG.error(ex.toString());
        }
    }

    public static void getPatientIDList(JComboBox jc) throws SQLException {
        List<String> IDList = getAllPatientIDs();
        for (String ID : IDList) {
            jc.addItem(ID);
        }
    }

    public static boolean OperationRegistration(Operation op) throws SQLException {
        return Operation.OperationRegistration(op);
    }

    public static boolean CheckUpAssigning(Checkup cu) throws SQLException {
        return Checkup.CheckUpAssigning(cu);
    }

    private static List<String> getAllPatientIDs() throws SQLException {
        return Operation.getPatienIDs();
    }

    public static void setKeyValue(String key, String value) throws FileNotFoundException, IOException {
        File file = new File(imageIconUtil.PROPERTY_FILE_PATH);

        FileInputStream in = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(in);
        FileOutputStream out = new FileOutputStream(file);
        String oldValue = properties.getProperty(key);
        String toStore = oldValue != null ? oldValue + "," + value : value;
        properties.setProperty(key, toStore);
        properties.store(out, null);
        in.close();
        out.close();
    }
}
