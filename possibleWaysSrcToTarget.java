// find total ways to reach from (0,0) to (n-1, m-1) in a n * m array

import java.util.Scanner;

public class possibleWaysSrcToTarget {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void possibleWays(int n, int m) {
        // it is = (n-1+m-1)! / ((n-1)!*(m-1)!)
        int total = (factorial(n - 1 + m - 1)) / (factorial(n - 1) * factorial(m - 1));
        System.out.println(total);
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Enter the value of m :");
        int m = new Scanner(System.in).nextInt();
        possibleWays(n, m);
    }
}