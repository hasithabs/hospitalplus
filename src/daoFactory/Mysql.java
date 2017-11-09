package daoFactory;

import dao.concrete.MysqlPrescriptionDao;
import dao.interfaces.PrescriptionDao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public Connection openConnection(){
        try {
            Class.forName(driver).newInstance();
            Connection connection = DriverManager.getConnection(url + database, user, password);

            return connection;
            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.err.println("Database connection error.");
           
        } catch (SQLException ex) {
           
        }
        return null;
    }
    
    @Override
    public PrescriptionDao getPrescriptionDao() {
        try {
            return new MysqlPrescriptionDao();
        } catch (IOException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
}
