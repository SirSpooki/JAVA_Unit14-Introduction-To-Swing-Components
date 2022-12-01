import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JTVDownload extends JFrame implements ActionListener {
  JComboBox<String> programBox = new JComboBox<String>();
  JLabel programList = new JLabel("*** Program List ***");
  JLabel stars = new JLabel("*****************************");
  JTextField descripField = new JTextField(20);
  // add your desired TV programs to the string
  String[] progs
      = { "The Walking Dead", "Gotham", "9-1-1", "This is Us", "ANTM" };
  // add your desired TV programs descrips to the string
  String[] descrips = { "", "Humans living in a zombie apocalypse",
    "Drama series based off Batman", "Series about lives of first responders",
    "Emotional drama about a family", "Modeling competition" };
  public JTVDownload()
  {
    super("JTVDownload");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    programBox.addActionListener(this);
    add(stars);
    add(programList);
    programBox.addItem("none");
    programBox.setEditable(true);
    for (int x = 0; x < progs.length; ++x)
      programBox.addItem(progs[x]);
    add(programBox);
    add(descripField);
  }
  public static void main(String[] arguments)
  {
    JTVDownload frame = new JTVDownload();
    frame.setSize(300, 150);
    frame.setVisible(true);
  }
  @Override public void actionPerformed(ActionEvent list)
  {
    Object source = list.getSource();
    if (source == programBox) {
      int num = programBox.getSelectedIndex();
      if (num >= 0) {
        descripField.setText(descrips[num]);
      } else if (true) {
        Object newVal = programBox.getSelectedItem();
        String str = (String)newVal;
        for (int i = 0; i < progs.length; i++) {
          if (progs[i].equals(str)) {
            descripField.setText(descrips[i]);
            break;
          }
        }
        descripField.setText("Movie Not Found");
      }
    }
  }
}
