/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.StockManagement;

import java.sql.SQLException;
import java.util.List;
import model.DrugModel;

/**
 *
 * @author EnTeRs
 */
public class DrugController {

    private static DrugController instance = new DrugController();

    private DrugController() {
    }

    public static DrugController getInstance() {
        return instance;
    }

    public boolean save(DrugModel drug) throws SQLException {
        if (drug == null) {
            return false;
        }

        return drug.save();
    }

    public List<DrugModel> allDrugs() throws SQLException {
        return DrugModel.all();
    }

    public boolean update(DrugModel drug) throws SQLException {
        if (drug == null) {
            return false;
        }
        return drug.update();
    }

    public void remove(int id) throws SQLException {
        DrugModel.remove(id);
    }
}
