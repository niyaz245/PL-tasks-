import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        boolean even = (A % 2 == 0) || (B % 2 == 0) || (C % 2 == 0);
        boolean odd = (A % 2 != 0) || (B % 2 != 0) || (C % 2 != 0);

        if (even && odd) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}