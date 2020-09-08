package zadacha2;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 10;
        int[] array;
        array = new int[5];
        for (int x = 0; x < array.length; x++) {
            array[x] = a + (int) (Math.random() * b);
            System.out.println(array[x]);
        }
    }
}