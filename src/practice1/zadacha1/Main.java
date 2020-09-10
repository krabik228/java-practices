package practice1.zadacha1;

public class Main {

    public static void main(String[] args) {
        int sum = 0, a = 0, b = 10;
        int[] array;
        array = new int[5];
        for (int x = 0; x < array.length; x++)
            array[x] = a + (int) (Math.random() * b);
        for (int x = 0; x < 5; x++)
            sum += array[x];
        System.out.println(sum);
        int x = 0;
        sum = 0;
        while (x < array.length) {
            sum += array[x];
            x++;
        }
        System.out.println(sum);
        x = 0;
        sum = 0;
        do {
            sum += array[x];
            x++;
        } while (x < array.length);
        System.out.println(sum);
    }
}