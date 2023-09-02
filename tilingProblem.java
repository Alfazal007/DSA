import java.util.Scanner;

public class tilingProblem {
    public static int tilingSolver(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int horizontal = tilingSolver(n - 2);
        int vertical = tilingSolver(n - 1);
        return horizontal + vertical;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int res = tilingSolver(n);
        System.out.println(res);
    }
}
