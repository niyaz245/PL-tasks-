import java.util.Scanner;

public class Horse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(); // строка коня
        int c1 = sc.nextInt(); // столбец коня
        int r2 = sc.nextInt(); // строка фигуры
        int c2 = sc.nextInt(); // столбец фигуры

        int dr = Math.abs(r1 - r2);
        int dc = Math.abs(c1 - c2);

        if ((dr == 1 && dc == 2) || (dr == 2 && dc == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}