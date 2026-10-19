import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 0) {
                found = true;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}