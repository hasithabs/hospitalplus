package daoFactory;

import java.sql.Connection;
import dao.interfaces.DrugDao;
import dao.interfaces.DrugCategoryDao;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();
  public abstract DrugDao getDrugDao();
  public abstract DrugCategoryDao getDrugCategoryDao();
  
  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
