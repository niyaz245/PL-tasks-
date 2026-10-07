import java.util.Scanner;

public class Bishop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(); // строка слона
        int c1 = sc.nextInt(); // столбец слона
        int r2 = sc.nextInt(); // строка фигуры
        int c2 = sc.nextInt(); // столбец фигуры

        if (Math.abs(r1 - r2) == Math.abs(c1 - c2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}