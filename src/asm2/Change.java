import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int total = (c * 100 + d) - (a * 100 + b);
        System.out.println(total / 100 + " " + total % 100);
    }
}