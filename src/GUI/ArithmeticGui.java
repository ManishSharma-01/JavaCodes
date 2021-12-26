package GUI;


//import GUI.BusinessLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ArithmeticGui extends JFrame implements ActionListener {

    JButton buttonSum;
    JButton buttonExit;
    JTextField textFirst;
    JTextField textSecond;
    JLabel labelFirst;
    JLabel labelSecond;

    ArithmeticGui() {


        setLayout(null);
        setSize(500, 500);
        setResizable(false);
        setTitle("Math");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelFirst = new JLabel("First Number ");
        labelFirst.setBounds(20, 20, 100, 20);
        add(labelFirst);

        textFirst = new JTextField();
        textFirst.setBounds(150, 20, 100, 20);
        add(textFirst);


        labelSecond = new JLabel("Second Number");
        labelSecond.setBounds(20, 50, 100, 20);
        add(labelSecond);

        textSecond = new JTextField();
        textSecond.setBounds(150, 50, 100, 20);
        add(textSecond);


        JButton buttonCalc = new JButton("Calculate");
        buttonCalc.setBounds(50, 120, 100, 20);
        add(buttonCalc);
        buttonCalc.addActionListener(this);

//
//        buttonExit = new JButton("Exit");
//        buttonExit.setBounds(150, 100, 80, 20);
//        add(buttonExit);
//        buttonExit.addActionListener(this);

        JRadioButton radSum = new JRadioButton("Sum");
        radSum.setBounds(25,100,80,20);
        radSum.addActionListener(this);
        add(radSum);

        JRadioButton radSub = new JRadioButton("Subtract");
        radSub.setBounds(120,100,80,20);
        radSub.addActionListener(this);
        add(radSub);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(textFirst.getText());
        int b = Integer.parseInt(textSecond.getText());

        if (e.getSource().equals(buttonSum)) {
            BusinessLogic obb = new BusinessLogic(a, b);

            JOptionPane.showMessageDialog(null, "Sum: " + obb.add());
        }

        if (e.getSource().equals(buttonExit)) {
            System.exit(0);
        }

    }


    public static void main(String[] args) {
        new ArithmeticGui().setVisible(true);
    }
}