import java.util.Scanner;

public class TaskO {

    static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        long original = n;
        long rev = 0;
        long num = n;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}