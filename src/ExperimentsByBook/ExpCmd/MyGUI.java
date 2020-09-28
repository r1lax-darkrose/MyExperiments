package ExperimentsByBook.ExpCmd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUI extends JFrame{

    private JButton button = new JButton("Choose");
    private JTextField input = new JTextField("",5);
    private JLabel text = new JLabel("Any wishes");
    private JRadioButton radBut1 = new JRadioButton("Black tea");
    private JRadioButton radBut2 = new JRadioButton("Green tea");
    private JCheckBox check = new JCheckBox("With teapot", false);

    public MyGUI(){
        super("Tea menu");
        this.setBounds(500,300,300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,1,1));

        ButtonGroup group = new ButtonGroup();
        group.add(radBut1);
        group.add(radBut2);
        container.add(radBut1);
        radBut1.setSelected(true);
        container.add(radBut2);

        container.add(text);
        container.add(check);
        container.add(input);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Order:\n";
            message += (radBut1.isSelected() ? "Black tea" : "Green Tea") + (check.isSelected() ? " with teapot" : " without teapot") + "\n";
            message += "and " + input.getText();
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
