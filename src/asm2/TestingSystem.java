import java.util.Scanner;

public class TestingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correct = sc.nextInt();
        int student = sc.nextInt();

        if (correct == 1) {
            if (student == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (student != 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}