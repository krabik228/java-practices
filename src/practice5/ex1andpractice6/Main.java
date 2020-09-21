package practice5.ex1andpractice6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MovableCircle circle=new MovableCircle("white",2,2,8);
        MoveRectangle rectangle=new MoveRectangle("black",11,33, 3,7);
        System.out.println(circle);
        System.out.println(rectangle);
        circle.move(5,5);
        rectangle.move(-2,1);
        System.out.println(rectangle);
        System.out.println(circle);
    }
}