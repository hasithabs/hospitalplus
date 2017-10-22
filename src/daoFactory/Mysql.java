package daoFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.concrete.mysqlDrugDao;
import dao.concrete.mysqlDrugCategoryDao;
import dao.concrete.mysqlDrugTypeDao;

import dao.interfaces.DrugDao;
import dao.interfaces.DrugCategoryDao;
import dao.interfaces.DrugTypeDao;

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
    public DrugDao getDrugDao() {
        return new mysqlDrugDao();
    }
    
    @Override
    public DrugCategoryDao getDrugCategoryDao() {
        return new mysqlDrugCategoryDao();
    }
    
    @Override
    public DrugTypeDao getDrugTypeDao() {
        return new mysqlDrugTypeDao();
    }

}
