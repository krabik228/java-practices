package practice8.ex2;

import javax.swing.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.File;

public class Image {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(args[0]));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}