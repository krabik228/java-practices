package practice8.ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test extends JFrame {
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    private int x = 10;
    private int y = 10;
    private int i = 0;
    private int nextX = 0;
    private int nextY = 0;

    public Shape setTheValue(){
        if(i == 0){
            i++;
        }
        else if (i<=10){
            i++;
            nextX += 60;
        }
        if (i == 11){
            nextX = 0;
            nextY +=60;
            i++;
        }
        else if (i>10){
            i++;
            nextX +=60;
        }
        Random random = new Random();
        switch (random.nextInt(5)){
            case 1:
                return new Circle(x+ nextX,y+nextY,color());
            case 2:
                return  new Square(x+ nextX,y+nextY,color());
        }
        return new Circle(x+ nextX,y+nextY,color());
    }
    public Color color(){
        Random random = new Random();

        switch (random.nextInt(5)){
            case 1:
                return Color.BLACK;
            case 2:
                return Color.RED;
            case 3:
                return Color.BLUE;
            case 4:
                return Color.ORANGE;
            case 5:
                return Color.GREEN;

        }
        return Color.MAGENTA;
    }
    public Test(){
        super("window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,400,1000 , 1000);
        setVisible(true);
        add(new Mycomponent());
    }

    class Mycomponent extends JComponent{
        public void paint(Graphics g){
            super.paintComponent(g);
            for (int i = 0; i< 20;i++){
                Shape shape = setTheValue();
                shape.paintt(g);
            }
            setVisible(true);
        }
    }
}