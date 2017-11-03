/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.StockManagement;

import java.sql.SQLException;
import java.util.List;
import model.DrugTypeModel;

/**
 *
 * @author EnTeRs
 */
public class DrugTypeController {

    private static DrugTypeController instance = new DrugTypeController();

    private DrugTypeController() {
    }

    public static DrugTypeController getInstance() {
        return instance;
    }

    public boolean save(DrugTypeModel drugType) throws SQLException {
        if (drugType == null) {
            return false;
        }
        return drugType.save();
    }

    public List<DrugTypeModel> allDrugTypes() throws SQLException {
        return DrugTypeModel.all();
    }

    public boolean update(DrugTypeModel drugType) throws SQLException {
        if (drugType == null) {
            return false;
        }
        return drugType.update();
    }

    public boolean remove(int id) throws SQLException {
        return DrugTypeModel.remove(id);
    }

}
