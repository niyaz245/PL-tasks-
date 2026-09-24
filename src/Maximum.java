import java.util.Scanner;
public class Maximum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a / b;
        int d = (c + 2) / (c + 1) % 2;
        int e = 1 - d;
        int max = a * d + b * e;
        System.out.println(max);
    }
}