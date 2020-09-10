package practice1.zadacha5;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int number) {
        int factorial = 1;
        int[] array = new int[number];
        for (int x = 0; x < array.length; x++) {
            array[x] = x+1;
            factorial *= array[x];
        }
        return factorial;
    }
}
