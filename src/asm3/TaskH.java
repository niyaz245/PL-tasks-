import java.util.Scanner;

public class TaskH{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        StringBuilder low = new StringBuilder();
        StringBuilder high = new StringBuilder();
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                low.append(i).append(' ');
                long j = x / i;
                if (j != i) {
                    high.insert(0, j + " ");
                }
            }
        }
        System.out.print(low.toString() + high.toString());
    }
}