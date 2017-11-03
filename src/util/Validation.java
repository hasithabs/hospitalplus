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
 * @author Y4SHVINE
 */
public class Validation {

    public static final String SPECIAL_CHARACTERS = "!@#$%^&*()-=+[]{}|:\";',./<>?";

    //Contain Only letters
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

    
    //Contact Number
    public static boolean isAcceptableContactNumber(String cNumber) {
        int UC_Count = 0;
        int LC_Count = 0;
        int DC_Count = 0;
        int SC_Count = 0;

        if (cNumber.isEmpty()) {
            return false;
        }
        cNumber = cNumber.trim();

        int len = cNumber.length();
        if (len != 10) {
            return false;
        }
        char[] aC = cNumber.toCharArray();
        for (char c : aC) {
            if (Character.isUpperCase(c)) {
                UC_Count++;
            } else if (Character.isLowerCase(c)) {
                LC_Count++;
            } else if (Character.isDigit(c)) {
                DC_Count++;
            } else if (SPECIAL_CHARACTERS.indexOf(String.valueOf(c)) >= 0) {
                SC_Count++;
            }
        }
        if (UC_Count > 0 || LC_Count > 0 || DC_Count != 10 || SC_Count > 0) {
            return false;
        }
        return true;
    }

    public static boolean isAcceptableNIC(String NIC) {
        int UC_Count = 0;
        int LC_Count = 0;
        int DC_Count = 0;
        int SC_Count = 0;
        if (NIC.isEmpty()) {
            System.out.println("empty string.");
            return false;

        }
        int len = NIC.length();
        if (len != 10) {
            return false;
        }
        char[] aC = NIC.toCharArray();
        for (char c : aC) {
            if (Character.isUpperCase(c)) {
                UC_Count++;
            } else if (Character.isLowerCase(c)) {
                LC_Count++;
            } else if (Character.isDigit(c)) {
                DC_Count++;
            } else if (SPECIAL_CHARACTERS.indexOf(String.valueOf(c)) >= 0) {
                SC_Count++;
            }
        }
        if (UC_Count != 1 || LC_Count > 0 || DC_Count != 9 || SC_Count > 0) {
            return false;
        }

        return true;

    }

    public static String generateRandomChars(String candidateChars, int length) {

        StringBuilder sb = new StringBuilder();
        sb.append(candidateChars + "00" + length);

        return sb.toString();
    }

}