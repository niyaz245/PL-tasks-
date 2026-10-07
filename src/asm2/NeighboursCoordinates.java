import java.util.Scanner;

public class NeighboursCoordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long M = sc.nextLong();
        long N = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        if (y > 1) System.out.println(x + " " + (y - 1));
        if (x > 1) System.out.println((x - 1) + " " + y);
        if (y < N) System.out.println(x + " " + (y + 1));
        if (x < M) System.out.println((x + 1) + " " + y);
    }
}