package practice11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNum extends JFrame {
    private final Random random = new Random();
    private JButton button = new JButton("Check");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Input number 0 - 20");
    private int randNum = random.nextInt(20);
    private int counter = 0;

    public GuessNum() {
        super("Guess Number");
        this.setBounds(500, 350, 400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        button.addActionListener(e -> {
            String message = "";
            counter++;
            if (counter == 3) {
                message += "You run out of tries!";
                JOptionPane.showMessageDialog(null,
                        message,
                        "Output",
                        JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }

            int a = Integer.parseInt(input.getText());
            if (a > randNum)
                message += "Wrong! Your number is larger than guessed one.";
            else if (a < randNum)
                message += "Wrong! Your number is less than guessed one.";
            else {
                message += "Congrats! You are right!";
                JOptionPane.showMessageDialog(null,
                        message,
                        "Output",
                        JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null,
                    message,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE);
        });
        container.add(button);
    }

    public int getRandNum() {
        return randNum;
    }
}