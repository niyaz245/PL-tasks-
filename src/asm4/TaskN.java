import java.util.Scanner;

public class TaskN {

    static String transformDigits(long n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int digit = (int) (n % 10);
            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }
            sb.append(digit);
            n /= 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(transformDigits(n));
        sc.close();
    }
}