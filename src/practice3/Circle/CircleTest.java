package practice3.Circle;

public class CircleTest {

    public static void main(String[] args) {
        Circle krug1 = new Circle("red", 4);
        Circle krug2 = new Circle("white", 5);
        System.out.println(krug1);
        krug1.setColor("blue");
        krug1.setRadius(10);
        System.out.println(krug1);
        System.out.println(krug2);
    }

}
