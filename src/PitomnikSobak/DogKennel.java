package PitomnikSobak;

public class DogKennel {
    int size;
    Dog[] dogs;

    public DogKennel(int size){
        this.size = 0;
        dogs = new Dog[size];
    }

    public void addDogs(Dog ... dogs){
        for (int i=0; i<dogs.length;i++){
            this.dogs[size] = dogs[i];
            size++;
        }
    }

    public static void main(String[] args) {
        Dog sobaka1 = new Dog("sharik", 4);
        Dog sobaka2 = new Dog("bobik", 2);
        DogKennel pitomnik = new DogKennel(4);
        pitomnik.addDogs(sobaka1);
        pitomnik.addDogs(sobaka2);
        System.out.println(pitomnik.dogs[0]);
        System.out.println(pitomnik.dogs[1]);
        sobaka1.HumanAge();
        sobaka2.HumanAge();
    }
}