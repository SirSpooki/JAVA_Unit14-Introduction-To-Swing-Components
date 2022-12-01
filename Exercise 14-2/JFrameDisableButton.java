import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener {

final int SIZE = 180;

Container con = getContentPane();

JButton button = new JButton("Press Me");

int count = 0;

final int MAX = 8;

JLabel label = new JLabel("That's enough!");

public JFrameDisableButton() {

// using flow layout manager

con.setLayout(new FlowLayout());

// adding button and label to content pane

con.add(button);

con.add(label);

// initially hiding the label

label.setVisible(false);

// using SIZE x SIZE dimensions

setSize(SIZE, SIZE);

// adding action listener to the button

button.addActionListener(this);

// making window visible

setVisible(true);

}

@Override

public void actionPerformed(ActionEvent e) {

// updating count

count++;

// if count reached 8, disabling button and displaying label

if (count == 8) {

button.setEnabled(false);

label.setVisible(true);

}

}

public static void main(String[] args) {

JFrameDisableButton frame = new JFrameDisableButton();

}

}
