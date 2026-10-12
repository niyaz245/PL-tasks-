import java.util.Scanner;

public class Patties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long m = sc.nextLong();
        long n = sc.nextLong();

        long rounds = (2 * n + k - 1) / k;

        if (n == 0) {
            rounds = 0;
        } else if (rounds < 2) {
            rounds = 2;
        }

        long time = rounds * m;
        System.out.println(time);
    }
}