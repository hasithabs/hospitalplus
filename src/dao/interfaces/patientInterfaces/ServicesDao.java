/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces.patientInterfaces;

import java.sql.SQLException;
import java.util.List;
import model.patientModels.ChanelDoctorModel;
import model.patientModels.Checkup;
import model.patientModels.Operation;

/**
 *
 * @author Y4SHVINE
 */
public interface ServicesDao {
    List<String> getPatienIDs() throws SQLException;

    public boolean OperationRegistration(Operation op) throws SQLException;

    public boolean CheckUpAssigning(Checkup cu) throws SQLException;

    public boolean ChannelDoctorService(ChanelDoctorModel cd) throws SQLException;
}
