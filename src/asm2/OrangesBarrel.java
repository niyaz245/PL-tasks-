import java.util.Scanner;

public class OrangesBarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int lastDigit = n % 10;
        int lastTwo = n % 100;

        String word;

        if (lastTwo >= 11 && lastTwo <= 14) {
            word = "bochek";
        } else if (lastDigit == 1) {
            word = "bochka";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            word = "bochki";
        } else {
            word = "bochek";
        }

        System.out.println(n + " " + word);
    }
}