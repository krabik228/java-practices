package practice10;

public class Main {
    public static int task1(int len, int sum, int k, int s){
        if (sum > s){
            return 0;
        }
        if (len == k){
            if (sum == s){
                return 1;
            } else {
                return 0;
            }
        }
        int x = 0;
        int res = 0;
        if (len == 0){
            x = 1;
        }
        for(int i = x; i < 10; i++ ){
            res += task1(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int task2(int zero, int one){
        if (zero > one+1){
            return 0;
        } else if (zero == 0 || one == 0){
            return 1;
        }
        return task2(zero, one - 1) + task2(zero - 1, one - 1);
    }
    public static void task3(int s){
        if(s > 0){
            task3(s / 10);
            System.out.print(s % 10 + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("task1:");
        System.out.println(task1(0, 0, 4, 36));
        System.out.println("\n");
        System.out.println("task2:");
        System.out.println(task2(2, 3));
        System.out.println("\n");
        System.out.println("task3:");
        task3(12345);
    }
}