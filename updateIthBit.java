import java.util.Scanner;

public class updateIthBit {
    public static int updateIthBit(int n, int i, int f) {
        int bitmask = 1;
        if (f == 1) { // set
            bitmask = 1 << i;
            return n | bitmask;
        } else { // clear
            bitmask = ~(1 << i);
            return n & bitmask;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of i: ");
        int i = sc.nextInt();
        System.out.println("Enter the face value 0 or 1 to be updated: ");
        int f = sc.nextInt();
        int res = updateIthBit(n, i, f);
        System.out.println(res);
    }
}
