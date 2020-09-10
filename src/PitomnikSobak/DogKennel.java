package PitomnikSobak;

public class DogKennel {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bobik", 3);
        Dog d2 = new Dog("Sharik", 4);
        Dog d3 = new Dog("Sobaka", 5);
        d1.HumanAge();
        d2.setName("Pes");
        System.out.println(d2);
        d3.setAge(10);
        System.out.println(d3);
        d3.HumanAge();
    }
}