import java.util.Scanner;

public class TrianglesTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c - max;

        if (sum <= max) {
            System.out.println("impossible");
            return;
        }

        int maxSq = max * max;
        int sumSq = 0;

        if (max == a) {
            sumSq = b * b + c * c;
        } else if (max == b) {
            sumSq = a * a + c * c;
        } else {
            sumSq = a * a + b * b;
        }

        if (maxSq == sumSq) {
            System.out.println("right");
        } else if (maxSq < sumSq) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}