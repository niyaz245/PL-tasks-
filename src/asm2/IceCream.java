import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        if (k == 1 || k == 2 || k == 4 || k == 7) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}