package util;

import javax.swing.ImageIcon;

/**
 *
 * @author EnTeRs
 */
public class Util {

    private static final String ICONS_PATH = "/view/images/";

    public static final String PROPERTY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\App.properties";
    
    public static final String QUERY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Query\\";
    
    public static final String MSG_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Messages\\";

    public static ImageIcon getIcon(Class<?> kclass, String icone) {
        return new ImageIcon(kclass.getResource(ICONS_PATH + icone + ".png"));
    }
}
