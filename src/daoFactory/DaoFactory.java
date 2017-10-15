package daoFactory;

import java.sql.Connection;

/**
 *
 * @author EnTeRs
 */
public abstract class DaoFactory {

  public abstract Connection openConnection();	
  
  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
