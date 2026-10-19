import java.util.Scanner;

public class TaskQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        long x = 1000;
        while (x >= 0) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                sb.append(x).append(' ');
            }
            x--;
        }
        System.out.print(sb);
    }
}