
import java.util.Scanner;

public class Pawns {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a == 1 || a % 4 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}