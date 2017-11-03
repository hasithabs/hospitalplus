package daoFactory;

import dao.concrete.patientConcrete.MysqlServicesDao;
import dao.concrete.patientConcrete.MysqlPatientDao;
import dao.interfaces.patientInterfaces.PatientDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import dao.interfaces.patientInterfaces.ServicesDao;
import dao.interfaces.patientInterfaces.WardRoundDao;
import dao.concrete.patientConcrete.MysqlWardRoundDao;


/**
 *
 * @author EnTeRs
 */
public class Mysql extends DaoFactory {

    private static String url = "jdbc:mysql://127.0.0.1:3306/";
    private static String database = "hospitalplus";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "hospitalplus";
    private static String password = "pluscrew";

    public Connection openConnection() {
        try {
            Class.forName(driver).newInstance();
            Connection connection = DriverManager.getConnection(url + database, user, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            System.err.println(
                    "Database connection error.");
        }
        return null;
    }

    @Override
    public PatientDao getPatientDao() {
        return new MysqlPatientDao();
    }

    @Override
    public ServicesDao getServiceDao() {
        return new MysqlServicesDao();
    }

    @Override
    public WardRoundDao getWardRoundDao() {
        return new MysqlWardRoundDao();
    }

    
}
