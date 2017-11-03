package util;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import static util.DBUtil.LOG;

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
                if (cb.getItemCount() > 0) {
                    cb.setSelectedIndex(0);
                }
            } else if (c instanceof JScrollPane) {
                JScrollPane sp = (JScrollPane) c;
                if (sp.getViewport().getComponent(0) instanceof JTextArea) {
                    JTextArea ta = (JTextArea) sp.getViewport().getComponent(0);
                    ta.setText("");
                }
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

    //JTable Column width resize according to the number of columns
    public static void resizeColumnWidth(JTable table) {

        table.getTableHeader().setFont(new Font("Gidolinya", Font.BOLD, 15));
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < (table.getColumnCount() - 1); column++) {
            int width = 50; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    //Util date to sql date
    public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date) {

        if (date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        }
        return null;
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
//
//    /**
//     *
//     * @param tbl JTable
//     * @param SerchingWord Searching letters
//     * @param columns Search Columns
//     */
//    public static void filterMultipleColumnFromJTable(JTable tbl, String SerchingWord, int[] columns) {
//        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
//
//        List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
//        filters.add(RowFilter.regexFilter(SerchingWord, 1));
//        filters.add(RowFilter.regexFilter(SerchingWord, 2));
//        filters.add(RowFilter.regexFilter(SerchingWord, 3));
//
//        TableRowSorter<DefaultTableModel> tblRowSorter = new TableRowSorter<>(model);
//        tbl.setRowSorter(tblRowSorter);
//        
//        tblRowSorter.setRowFilter(filters);
//
//    }

    /*
    *Can send Mail by using mail address and password mension in the App.property file
    *senderMail-> email that we need to send the email
    *Subject->Subject of the mail
    *body->body of the mail
     */
    public static boolean mailSender(String senderMail, String Subject, String body) throws IOException {
        Config conf = new Config();

        final String username = conf.getPropertyValue("EmailAddress");
        final String password = conf.getPropertyValue("EmailPassword");

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(conf.getPropertyValue("EmailAddress")));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(senderMail));
            message.setSubject(Subject);
            message.setText(body);

            Transport.send(message);

            System.out.println("Done");
            return true;

        } catch (MessagingException e) {
            LOG.error(e);
            //throw new RuntimeException(e);
        }

        return false;
    }

}
