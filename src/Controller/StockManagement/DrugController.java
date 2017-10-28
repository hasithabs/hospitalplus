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

    public DrugModel save(DrugModel drug) throws SQLException {
        if (drug != null) {
            drug.save();
        }
        return drug;
    }
}
