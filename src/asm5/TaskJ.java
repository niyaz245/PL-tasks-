import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int x = scanner.nextInt();
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}