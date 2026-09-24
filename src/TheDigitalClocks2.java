import java.util.Scanner;

public class TheDigitalClocks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalSeconds = n % (24 * 60 * 60);
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
    }
}