package practice8.ex1;

import java.awt.*;

public class Circle extends Shape {


    public Circle(int x, int y, Color color) {
        super(x, y, color);
    }


    public void paintt(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), 50, 50);
    }
}