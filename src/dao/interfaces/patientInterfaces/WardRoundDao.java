/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces.patientInterfaces;

import java.sql.SQLException;
import java.util.List;
import model.patientModels.wardRound;

/**
 *
 * @author Y4SHVINE
 */
public interface WardRoundDao {

    public List<String> getDoctorList() throws SQLException;

    public boolean addWardRoundDetails(wardRound wr) throws SQLException;
    
}
