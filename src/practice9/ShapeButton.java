package practice9;

import practice8.ex1.*;

import javax.swing.*;
import java.awt.*;

public class ShapeButton extends JFrame {

    private final int windowWidth = 800;
    private final int windowHeight = 600;

    public ShapeButton()
    {
        super("Generate Shape by Button");

        JButton b = new JButton("Add Random Shape");
        RandomShape shape = new RandomShape();

        setLayout(new FlowLayout());
        setSize(windowWidth, windowHeight);
        add(b);
        b.addActionListener(e -> shape.addRandomShape(getGraphics(), windowWidth, windowHeight));
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShapeButton();
    }

}