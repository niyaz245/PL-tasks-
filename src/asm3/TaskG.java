import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int ans = x;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}