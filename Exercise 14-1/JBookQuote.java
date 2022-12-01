import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookQuote extends JFrame {
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new JLabel("To begin with,");
    JLabel msg2 = new JLabel("Marley was dead.");
    JButton button = new JButton("Click for source");
    JLabel msg3 = new JLabel();
    String title = "** A Christmas Carol **";
    public JBookQuote() {
        //add controls to the frame
        add(msg1);
        add(msg2);
        add(button);
        add(msg3);
        setLayout(flow); //set flow layout for the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //explicitly close the frame
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button)) {
                    msg3.setText(title);
                }
            }
        });
    }
    public static void main(String[] args) {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(250, 150);
        aFrame.setVisible(true);
    }
}

