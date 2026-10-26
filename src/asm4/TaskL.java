import java.util.Scanner;

public class TaskL {

    static long reverseNumber(int n) {
        long num = Math.abs((long) n);
        long rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return n < 0 ? -rev : rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseNumber(n));
        sc.close();
    }
}