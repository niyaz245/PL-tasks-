import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if ((arr[i] > 0 && arr[i - 1] > 0) || (arr[i] < 0 && arr[i - 1] < 0)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}