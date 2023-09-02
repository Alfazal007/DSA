import java.util.Scanner;

public class friendPaired {
    public static int friendsPairedUp(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int single = friendsPairedUp(n - 1);
        int paired = (n - 1) * friendsPairedUp(n - 2);
        return single + paired;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int n = sc.nextInt();
        System.out.println(friendsPairedUp(n));
    }
}
