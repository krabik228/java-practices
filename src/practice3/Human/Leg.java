package practice3.Human;

public class Leg {
    private String color;
    private int length;

    public Leg(String c, int l) {
        color = c;
        length = l;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color){
        return color;
    }

    public String toString(){
        return "Color: " + this.color + ", length: " + this.length;
    }
}
