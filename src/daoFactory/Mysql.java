package daoFactory;

import dao.concrete.MysqlPrescriptionDao;
import dao.interfaces.PrescriptionDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EnTeRs
 */
public class Mysql extends DaoFactory {

    private static String url = "jdbc:mysql://127.0.0.1:3306/";
    private static String database = "hospitalplus";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "1234";

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
    public PrescriptionDao getPrescriptionDao() {
        return new MysqlPrescriptionDao();
    }
}
