import java.util.Scanner;

public class getIthBit {
    public static int getI(int num, int i) {
        int k = 1 << i;
        return (num & k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the value of i: ");
        int i = sc.nextInt();
        int res = getI(num, i);
        if (res == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
