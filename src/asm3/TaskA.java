import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}