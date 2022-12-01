import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTVDownload extends JFrame implements ItemListener {
    JComboBox<String> programBox = new JComboBox<String>();
    JLabel programList = new JLabel("***                  Program List               ***");
    JLabel stars = new JLabel("*****************************");
    JTextField descripField = new JTextField(20);
    String[] progs = {"Breaking Bad",
                      "Orange is the New Black", "Twilight Zone",
                      "Parks and Recreation", "Everybody Loves Raymond"
                     };
    String[] descrips = {"", "Teacher becomes meth dealer",
                         "Life in women's prison",
                         "Classic science fiction episodes",
                         "Comedy in local government office",
                         "Family comedy with meddling in-laws"
                        };
    public JTVDownload() {
        // Write your code here
    }
    public static void main(String[] arguments) {
        JTVDownload frame = new JTVDownload();
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent list) {
        // Write your code here
    }
}
