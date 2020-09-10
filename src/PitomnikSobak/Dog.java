package PitomnikSobak;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public Dog(String n) {
        name = n;
        age = 0;
    }

    public Dog(){
        name = "";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public String toString(){
        return this.name + ", age " + this.age;
    }

    public void HumanAge(){
        System.out.println(name + "'s human age: " + age * 7);
    }
}