import java.util.Scanner;

public class Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int lastDigit = n % 10;
        int lastTwo = n % 100;

        String word;

        if (lastTwo >= 11 && lastTwo <= 14) {
            word = "korov";
        } else if (lastDigit == 1) {
            word = "korova";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            word = "korovy";
        } else {
            word = "korov";
        }

        System.out.println(n + " " + word);
    }
}