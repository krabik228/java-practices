package practice8.ex1;

import java.awt.*;

public class Square extends Shape {
    public Square(int x, int y, Color color) {
        super(x, y, color);
    }

    public void paintt(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), 50, 50);
    }
}