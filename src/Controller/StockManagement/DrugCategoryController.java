/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.StockManagement;

import java.sql.SQLException;
import java.util.List;
import model.DrugCategoryModel;

/**
 *
 * @author EnTeRs
 */
public class DrugCategoryController {

    private static DrugCategoryController instance = new DrugCategoryController();

    private DrugCategoryController() {
    }

    public static DrugCategoryController getInstance() {
        return instance;
    }

    public DrugCategoryModel save(DrugCategoryModel drugCategory) throws SQLException {
        if (drugCategory != null) {
            drugCategory.save();
        }
        return drugCategory;
    }

    public List<DrugCategoryModel> allDrugCategories() throws SQLException {
        return DrugCategoryModel.all();
    }

    public DrugCategoryModel update(DrugCategoryModel drugCategory) throws SQLException {
        if (drugCategory != null) {
            drugCategory.update();
        }
        return drugCategory;
    }

    public void remove(int id) throws SQLException {
        DrugCategoryModel.remove(id);
    }

}
