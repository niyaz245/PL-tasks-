import java.util.Scanner;
public class EndOfTheLessons {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = a * 45 + (a - 1) / 2 * 20 + (a-1) % 2 * 5;
        int d = 9 + (c / 60);
        int e = c % 60;
        System.out.println(d + " " + e );




    }
}