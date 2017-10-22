/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import java.sql.SQLException;
import model.Patient;

/**
 *
 * @author Y4SHVINE
 */
public interface PatientDao {
        void insert(Patient patient) throws SQLException;
}
