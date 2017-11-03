package daoFactory;

import dao.interfaces.patientInterfaces.PatientDao;
import java.sql.Connection;
import dao.interfaces.patientInterfaces.ServicesDao;
import dao.interfaces.patientInterfaces.WardRoundDao;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();	
  public abstract PatientDao getPatientDao();
  public abstract ServicesDao getServiceDao();
  public abstract WardRoundDao getWardRoundDao();
  
  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
