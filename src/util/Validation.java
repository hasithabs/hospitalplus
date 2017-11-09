/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author hp
 */
public class Validation {
    
    public static final String SPECIAL_CHARACTERS = "!@#$%^&*()-=+[]{}|:\";',./<>?";
    
    public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date) {

        if (date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        }
        return null;
    }
     
    public static boolean ContainOnlyLetters(String word) {
        int DC_Count = 0;
        int SC_Count = 0;
        if (word.isEmpty()) {
            return false;
        }
        word = word.trim();

        char[] aC = word.toCharArray();
        for (char c : aC) {
            if (Character.isDigit(c)) {
                DC_Count++;
            } else if (SPECIAL_CHARACTERS.indexOf(String.valueOf(c)) >= 0) {
                SC_Count++;
            }
        }
        if (DC_Count > 0 || SC_Count > 0) {
            return false;
        }
        return true;
    } 
    
}
