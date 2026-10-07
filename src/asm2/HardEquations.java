import java.util.Scanner;

public class HardEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("INF");
            return;
        }

        if (a == 0) {
            System.out.println("NO");
            return;
        }

        if (b % a != 0) {
            System.out.println("NO");
            return;
        }

        int x = -b / a;

        if (c * x + d == 0) {
            System.out.println("NO");
        } else {
            System.out.println(x);
        }
    }
}