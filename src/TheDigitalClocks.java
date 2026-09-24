import java.util.Scanner;

public class TheDigitalClocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalMinutes = n % (24 * 60);
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.println(hours + " " + minutes);
    }
}