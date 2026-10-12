import java.util.Scanner;

public class MetroTickets2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int a = 0, b = 0, c = 0, d = 0, e = 0;

        for (int i = 0; i <= n / 60 + 1; i++) {
            for (int j = 0; j <= n / 20 + 1; j++) {
                for (int k = 0; k <= n / 10 + 1; k++) {
                    for (int l = 0; l <= n / 5 + 1; l++) {
                        int m = Math.max(0, n - 60 * i - 20 * j - 10 * k - 5 * l);
                        int cost = 440 * i + 230 * j + 125 * k + 70 * l + 15 * m;
                        int trips = 60 * i + 20 * j + 10 * k + 5 * l + m;

                        if (cost < min || (cost == min && trips > n)) {
                            min = cost;
                            a = m;
                            b = l;
                            c = k;
                            d = j;
                            e = i;
                        }
                    }
                }
            }
        }

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}