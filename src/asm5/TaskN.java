import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[n];
        Scanner lineScanner = new Scanner(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            a[i] = lineScanner.nextInt();
        }

        int k = Integer.parseInt(scanner.nextLine().trim());

        int absK = Math.abs(k) % n;
        int shift;
        if (k >= 0) {
            shift = absK;
        } else {
            shift = (n - absK) % n;
        }

        reverse(a, 0, n - 1);
        reverse(a, 0, shift - 1);
        reverse(a, shift, n - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]);
            if (i != n - 1) sb.append(' ');
        }
        System.out.println(sb.toString());

        scanner.close();
    }

    private static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}