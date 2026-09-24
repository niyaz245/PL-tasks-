import java.util.Scanner;
public class SymmetricNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a / 1000;
        int c = (a / 100) % 10;
        int d = (a / 10) % 10;
        int e = a % 10;
        int dif1 = (b - e) * (b-e);
        int dif2 = (c - d) * (c-d);
        int total = dif1+dif2;
        int ans = 1 / (total +1);
        System.out.println(ans);

    }
}