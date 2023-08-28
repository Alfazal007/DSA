import java.util.Scanner;

public class clearIthBit {
    public static int clearIthBit(int n, int i) {
        return (~(1 << i) & n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of i: ");
        int i = sc.nextInt();
        System.out.println(clearIthBit(n, i));
    }
}
