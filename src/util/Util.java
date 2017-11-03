package util;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
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
import javax.swing.table.TableRowSorter;

public class Util {

    private static final String ICONS_PATH = "/view/images/";

    public static final String PASSWORD_DEFAULT_VALUE = "";

    public static final String LEAVE_EMIAL_SUBJECT = "Applying For Leave";

    public static final String PROPERTY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\App.properties";

    public static final String QUERY_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Query\\";

    public static final String MSG_FILE_PATH = System.getProperty("user.dir") + "\\src\\util\\XMLFiles\\Messages\\";

    public static final String LEAVE_DEFAULT_STATUS = "Pending";

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
            } else if (c instanceof JComboBox) {
                JComboBox date = (JComboBox) c;
                date.setSelectedIndex(0);
            } else if (c instanceof JScrollPane) {
                JScrollPane sp = (JScrollPane) c;
                if (sp.getViewport().getComponent(0) instanceof JTextArea) {
                    JTextArea ta = (JTextArea) sp.getViewport().getComponent(0);
                    ta.setText("");
                }
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

    /*
    *Can send Mail by using mail address and password mension in the App.property file
    *senderMail-> email that we need to send the email
    *Subject->Subject of the mail
    *body->body of the mail
     */
    public static void mailSender(String senderMail, String Subject, String body) throws IOException {
        Config conf = new Config();

        final String username = conf.getPropertyValue("EmailAddress");
        final String password = conf.getPropertyValue("EmailPassword");

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
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

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
