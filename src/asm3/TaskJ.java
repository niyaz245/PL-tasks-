import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}