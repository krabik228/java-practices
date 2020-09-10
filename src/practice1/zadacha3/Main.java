package practice1.zadacha3;

public class Main {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        for (int x = 0; x < array.length; x++) {
            array[x] = x+1;
            if (x==0){System.out.println(array[x]);}else
                System.out.println("1/" + array[x]);
        }
    }
}