import java.util.Scanner;

public class Ошибка {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (n <= k) {
            System.out.println(2 * m);
        } else {
            System.out.println((2 * n * m + k - 1) / k);
        }
    }
}