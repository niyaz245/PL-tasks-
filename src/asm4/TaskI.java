public class TaskI {

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}