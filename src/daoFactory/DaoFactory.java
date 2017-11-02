package daoFactory;

import dao.interfaces.EmployeeDao;
import dao.interfaces.LeaveDao;
import java.io.IOException;
import java.sql.Connection;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();	
  public abstract EmployeeDao getEmployeeDao();
  public abstract LeaveDao getLeaveDao();
  public static DaoFactory getDatabase() throws IOException {
      return new Mysql();
  }
}
