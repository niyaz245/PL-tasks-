import java.util.Scanner;

public class RomanNumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int[] values =    {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (X >= values[i]) {
                result.append(symbols[i]);
                X -= values[i];
            }
        }

        System.out.println(result.toString());
    }
}