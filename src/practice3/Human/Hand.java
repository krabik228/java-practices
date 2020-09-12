package practice3.Human;

public class Hand {
    private int length, fingers;

    public Hand(int f, int l) {
        fingers = f;
        length = l;
    }

    public void setLength(int radius) {
        this.length = radius;
    }

    public int getLength() {
        return length;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public int getFingers(){
        return fingers;
    }

    public String toString(){
        return "Number of fingers: " + this.fingers + ", length: " + this.length;
    }
}
