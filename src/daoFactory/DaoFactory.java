package daoFactory;

import dao.interfaces.PrescriptionDao;
import java.sql.Connection;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();	
  public abstract PrescriptionDao getPrescriptionDao();
  
  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
