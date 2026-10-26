import java.util.Scanner;

public class TaskK {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (long) a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM = " + lcm(a, b));
        sc.close();
    }
}