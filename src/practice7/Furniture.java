package practice7;

public abstract class Furniture {
    private String color;
    private double price;

    public Furniture(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", price=" + price;
    }
}