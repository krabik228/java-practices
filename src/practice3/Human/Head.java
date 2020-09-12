package practice3.Human;

public class Head {
    private String color;
    private int radius;

    public Head(String c, int r) {
        color = c;
        radius = r;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color){
        return color;
    }

    public String toString(){
        return "Color: " + this.color + ", radius: " + this.radius;
    }
}
