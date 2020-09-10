package zadacha4;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int a = 0, b = 10;
        int[] array = new int[10];
        for (int x = 0; x < array.length; x++) {
            //array[x] = a + (int) (Math.random() * b);
            Random random = new Random();
            array[x] = random.nextInt(100);
            System.out.println(array[x]);
        }
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= i + 1; j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.println("Sorted:");
        for (int x = 0; x < array.length; x++)
            System.out.println(array[x]);
    }
}