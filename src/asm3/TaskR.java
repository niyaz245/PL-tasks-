import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long e = sc.nextInt();

        int count = 0;
        long x = 0;
        while (x <= 1000) {
            if (x != e && a * x * x * x + b * x * x + c * x + d == 0) {
                count++;
            }
            x++;
        }
        System.out.println(count);
    }
}