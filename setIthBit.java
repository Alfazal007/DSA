import java.util.Scanner;

public class setIthBit {
    public static int setter(int n, int i) {
        int k = 1 << i;
        return n | k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of i: ");
        int i = sc.nextInt();
        int res = setter(n, i);
        System.out.println(res);
    }
}