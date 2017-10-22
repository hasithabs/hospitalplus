package daoFactory;

import dao.interfaces.PatientDao;
import java.sql.Connection;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();	
  public abstract PatientDao getPatientDao();
  
  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
