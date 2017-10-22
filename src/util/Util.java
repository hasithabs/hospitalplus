package util;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Util {

    private static final String ICONS_PATH = "/view/images/";

    public static final String PASSWORD_DEFAULT_VALUE = "";
    
    public static final String PROPERTY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\App.properties";

    public static final String QUERY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Query\\";

    public static final String MSG_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Messages\\";

    public static ImageIcon getIcon(Class<?> kclass, String icone) {
        return new ImageIcon(kclass.getResource(ICONS_PATH + icone + ".png"));
    }

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
            }
        }
    }

}
