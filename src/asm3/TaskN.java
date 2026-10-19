import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zero = 0;
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                zero++;
            } else if (x > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println(zero + " " + pos + " " + neg);
    }
}