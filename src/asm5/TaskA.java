import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i += 2) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}