import java.util.Scanner;

public class TaskC {

    static void printInvertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(' ');
            }
            // stars: 2*(n - i) - 1
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInvertedPyramid(n);
        sc.close();
    }
}