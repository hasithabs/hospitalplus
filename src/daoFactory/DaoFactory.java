package daoFactory;

import java.sql.Connection;
import dao.interfaces.PrescriptionDao;
import java.io.IOException;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();
  public abstract PrescriptionDao getPrescriptionDao();
  
  public static DaoFactory getDatabase() throws IOException {
      return new Mysql();
      
  }
}
