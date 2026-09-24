import java.util.Scanner;

public class MKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        int s = v * t;
        int result = ((s % 109) + 109) % 109;
        System.out.println(result);
    }
}