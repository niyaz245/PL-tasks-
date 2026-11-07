import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int petya = scanner.nextInt();
        int position = n + 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < petya) {
                position = i + 1;
                break;
            }
        }
        System.out.println(position);
    }
}