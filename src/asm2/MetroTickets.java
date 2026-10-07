import java.util.Scanner;

public class MetroTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int best60 = 0, best10 = 0, best1 = 0;
        int minCost = Integer.MAX_VALUE;

        int max60 = (n + 59) / 60;

        for (int k60 = 0; k60 <= max60; k60++) {
            int remaining = n - k60 * 60;
            if (remaining < 0) remaining = 0;

            int max10 = (remaining + 9) / 10;

            for (int k10 = 0; k10 <= max10; k10++) {
                int rem = remaining - k10 * 10;
                if (rem < 0) rem = 0;

                int k1 = rem;
                int cost = k60 * 440 + k10 * 125 + k1 * 15;

                if (cost < minCost) {
                    minCost = cost;
                    best60 = k60;
                    best10 = k10;
                    best1 = k1;
                }
            }
        }

        System.out.println(best1 + " " + best10 + " " + best60);
    }
}