import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int printed = 0;
        int k = 1;
        while (printed < n) {
            int j = 0;
            while (j < k && printed < n) {
                sb.append(k).append(' ');
                printed++;
                j++;
            }
            k++;
        }
        System.out.print(sb);
    }
}