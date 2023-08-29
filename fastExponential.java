import java.util.Scanner;

public class fastExponential {
    public static int exponential(int n, int p) {
        int mul = 1;
        while (p != 0) {
            int temp = p & 1;
            if (temp == 1) {
                mul = mul * n;
                n = n * n;
            }
            p = p >> 1;
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int i = sc.nextInt();
        int res = exponential(n, i);
        System.out.println(res);
    }
}
