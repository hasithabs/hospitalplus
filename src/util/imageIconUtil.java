package util;

import javax.swing.ImageIcon;

/**
 *
 * @author EnTeRs
 */
public class imageIconUtil {

    private static final String IMAGE_PATH = "/view/images/";

    public static ImageIcon getIcon(Class<?> kclass, String icone) {
        return new ImageIcon(kclass.getResource(IMAGE_PATH + icone + ".png"));
    }
}
