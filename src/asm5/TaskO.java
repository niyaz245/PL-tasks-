import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> balls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            balls.add(scanner.nextInt());
        }

        int destroyed = 0;
        boolean changed = true;
        while (changed) {
            changed = false;
            int i = 0;
            while (i < balls.size()) {
                int j = i;
                while (j < balls.size() && balls.get(j).equals(balls.get(i))) {
                    j++;
                }
                int length = j - i;
                if (length >= 3) {
                    for (int k = i; k < j; k++) {
                        balls.remove(i);
                    }
                    destroyed += length;
                    changed = true;
                    break;
                } else {
                    i = j;
                }
            }
        }

        System.out.println(destroyed);
    }
}