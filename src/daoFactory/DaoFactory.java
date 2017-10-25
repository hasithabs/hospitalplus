package daoFactory;

import dao.interfaces.EmployeeDao;
import java.io.IOException;
import java.sql.Connection;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();	
  public abstract EmployeeDao getEmployeeDao();
  
  public static DaoFactory getDatabase() throws IOException {
      return new Mysql();
  }
}
