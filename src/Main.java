import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " +b);
    }
}