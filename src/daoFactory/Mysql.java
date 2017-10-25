package daoFactory;

import dao.concrete.MysqlEmployeeDao;
import dao.interfaces.EmployeeDao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import org.apache.log4j.Logger;

import util.Config;

public class Mysql extends DaoFactory {

    Config cnf = new Config();
    Logger LOG = cnf.getLogger(Mysql.class);
    
    private String url;
    private String database;
    private String driver;
    private String user;
    private String password;

    public Mysql() throws IOException {
        
        url = cnf.getPropertyValue("url");
        database = cnf.getPropertyValue("database");
        driver = cnf.getPropertyValue("driver");
        user = cnf.getPropertyValue("user");
        password = cnf.getPropertyValue("password");
        
    }

    @Override
    public Connection openConnection(){
        try {
            Class.forName(driver).newInstance();
            Connection connection = DriverManager.getConnection(url + database, user, password);

            return connection;

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.err.println("Database connection error.");
            LOG.error(ex, ex);
        } catch (SQLException ex) {
           LOG.fatal(ex, ex);
        }
        return null;
    }

    @Override
    public EmployeeDao getEmployeeDao() {
        try {
            return new MysqlEmployeeDao();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
