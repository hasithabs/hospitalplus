package daoFactory;

import dao.interfaces.EmployeeDao;
import dao.interfaces.LeaveDao;
import java.sql.Connection;
import dao.interfaces.DrugDao;
import dao.interfaces.DrugCategoryDao;
import dao.interfaces.DrugTypeDao;
import dao.interfaces.OrderDao;
import dao.interfaces.patientInterfaces.PatientDao;
import dao.interfaces.PrescriptionDao;
import java.sql.Connection;
import dao.interfaces.patientInterfaces.ServicesDao;
import dao.interfaces.patientInterfaces.WardRoundDao;

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
  public abstract PatientDao getPatientDao();
  public abstract ServicesDao getServiceDao();
  public abstract WardRoundDao getWardRoundDao();
  public abstract PrescriptionDao getPrescriptionDao();

  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
