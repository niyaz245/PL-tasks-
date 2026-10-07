import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество строк
        int m = sc.nextInt(); // количество столбцов
        int k = sc.nextInt(); // сколько долек нужно отломить

        // Можно отломить k долек, если k делится на n или на m,
        // и при этом k меньше общего количества долек
        if ((k % n == 0 || k % m == 0) && k < n * m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}