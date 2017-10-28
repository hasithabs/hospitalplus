package util;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author EnTeRs
 */
public class Util {

    private static final String IMAGE_PATH = "/view/images/";

    public static final String PROPERTY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\App.properties";
    
    public static final String QUERY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Query\\";
    
    public static final String MSG_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Messages\\";

    public static ImageIcon getIcon(Class<?> kclass, String icone) {
        return new ImageIcon(kclass.getResource(IMAGE_PATH + icone + ".png"));
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
            } else if (c instanceof JComboBox) {
                JComboBox cb = (JComboBox) c;
                cb.setSelectedIndex(0);
            }
        }
    }
    
    public static double[] getScreenSizrRatio() {
        double[] screenArr = new double[4];

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int ScreenW = (int) screenSize.getWidth();
        int ScreenH = (int) screenSize.getHeight();
        double screenWRatio = ScreenW / 1920.0;
        double screenHRatio = ScreenH / 1080.0;
        
        screenArr[0] = ScreenW;
        screenArr[1] = ScreenH;
        screenArr[2] = screenWRatio;
        screenArr[3] = screenHRatio;
        
        return screenArr;
    }
            

}
