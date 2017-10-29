package util;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Util {

    private static final String ICONS_PATH = "/view/images/";

    public static final String PASSWORD_DEFAULT_VALUE = "";

    public static final String PROPERTY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\App.properties";

    public static final String QUERY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Query\\";

    public static final String MSG_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Messages\\";

    public static ImageIcon getIcon(Class<?> kclass, String icone) {
        return new ImageIcon(kclass.getResource(ICONS_PATH + icone + ".png"));
    }

    /*
    *clean all the text in any input field in the Jpanel
    *pannel-> Jpanel that contain the input fields.
     */
    public static void Clear(JPanel pannel) {
        if (pannel == null) {
            return;
        }
        Component[] con = pannel.getComponents();
        for (Component c : con) {
            if (c instanceof JTextField) {
                JTextField j = (JTextField) c;
                j.setText("");
            } else if (c instanceof JPasswordField) {
                JPasswordField p = (JPasswordField) c;
                p.setText("");
            } else if (c instanceof JDateChooser) {
                JDateChooser date = (JDateChooser) c;
                date.setDate(null);
            } 
            else if (c instanceof JComboBox) {
                JComboBox date = (JComboBox) c;
                date.setSelectedIndex(0);
            } 
        }
    }

    /*
    *use to search the table contetnt from any given word
    *tbl-> JTabel that contain the data
    *SerchingWord-> word that need to search
     */
    public static void filterDataFromJTable(JTable tbl, String SerchingWord) {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        TableRowSorter<DefaultTableModel> tblRowSorter = new TableRowSorter<>(model);
        tbl.setRowSorter(tblRowSorter);

        tblRowSorter.setRowFilter(RowFilter.regexFilter(SerchingWord));
    }

}
