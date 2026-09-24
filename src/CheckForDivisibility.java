import java.util.Scanner;
public class CheckForDivisibility {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int check = ((a % b) * (b%a) + 1);
        System.out.println(check);
    }
}