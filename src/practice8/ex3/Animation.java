package practice8.ex3;

import javax.swing.*;
import java.io.File;

public class Animation {

    public static void main(String[] args) throws InterruptedException {
        File folder = new File(args[0]);
        File[] files = folder.listFiles();

        if (files != null) {
            JFrame frame = new JFrame();
            for (int i = 0; i < files.length; i = (i+1) %6) {
                frame.getContentPane().removeAll();
                JLabel label = new JLabel(new ImageIcon(args[0] + "\\" + files[i].getName()));
                frame.add(label);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                Thread.sleep(200);
            }
        }
    }
}