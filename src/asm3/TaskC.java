import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (long k = 0; k * k <= b; k++) {
            long sq = k * k;
            if (sq >= a) {
                sb.append(sq).append(' ');
            }
        }
        System.out.print(sb);
    }
}