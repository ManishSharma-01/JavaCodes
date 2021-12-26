package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame implements ActionListener {

    JLabel labelFirst;
    JButton button;
    JButton button2;
    JRadioButton radMale;
    JRadioButton radFemale;
    JRadioButton radOthers;

    Form(){
        setLayout(null);
        setSize(500,500);
        setResizable(false);
        setTitle("Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelFirst = new JLabel("First Name");
        labelFirst.setBounds(20,20,100,20);
        add(labelFirst);

        JTextField textFirst = new JTextField();
                textFirst.setBounds(150,20,100,20);
        add(textFirst);

        JLabel labelSecond = new JLabel("Last Name");
        labelSecond.setBounds(20,50,100,20);
        add(labelSecond);
        JTextField textSecond = new JTextField();
        textSecond.setBounds(150,50,100,20);
        add(textSecond);

        radMale = new JRadioButton("Male");
        radMale.setBounds(20,80,100,20);
        add(radMale);
        radFemale = new JRadioButton("Female");
        radFemale.setBounds(20,100,100,20);
        add(radFemale);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Form().setVisible(true);
    }
}
