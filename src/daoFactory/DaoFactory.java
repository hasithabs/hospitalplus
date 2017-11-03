package daoFactory;

import dao.interfaces.EmployeeDao;
import dao.interfaces.LeaveDao;
import java.sql.Connection;
import dao.interfaces.DrugDao;
import dao.interfaces.DrugCategoryDao;
import dao.interfaces.DrugTypeDao;
import dao.interfaces.OrderDao;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();
  public abstract DrugDao getDrugDao();
  public abstract DrugCategoryDao getDrugCategoryDao();
  public abstract DrugTypeDao getDrugTypeDao();
  public abstract OrderDao getOrderDao();
  public abstract EmployeeDao getEmployeeDao();
  public abstract LeaveDao getLeaveDao();
  
  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
