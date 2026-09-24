import java.util.Scanner;

public class PurchaseCost {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int e = (b * c);
        int d = (a * c) + (e / 100)  ;
        System.out.println(d + " " + (e % 100));
    }
}