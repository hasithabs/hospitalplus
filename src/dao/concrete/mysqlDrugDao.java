/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DrugModel;
import dao.interfaces.DrugDao;
import daoFactory.DaoFactory;

/**
 *
 * @author EnTeRs
 */
public class mysqlDrugDao implements DrugDao {

    private static final String INSERT = "INSERT INTO users (name, login) VALUES (?, ?)";

    /**
     * Method to insert a user in the database
     *
     * @param user the user that will be inserted
     * @return user the inserted
     * @throws SQLException
     */
    public DrugModel insert(DrugModel user) throws SQLException {
        Connection c = DaoFactory.getDatabase().openConnection();

        PreparedStatement pstmt = c.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

        pstmt.setString(1, user.getName());

        pstmt.executeUpdate();

        ResultSet rset = pstmt.getGeneratedKeys();

        rset.next();
        Long idGenerated = rset.getLong(1);

        pstmt.close();
        c.close();

        return user;
    }
}
