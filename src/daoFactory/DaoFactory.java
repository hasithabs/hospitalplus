package daoFactory;

import dao.interfaces.EmployeeDao;
import java.sql.Connection;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();	
  public abstract EmployeeDao getEmployeeDao();
  
  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
