import java.util.Scanner;

public class binaryStringPrinter {

    public static void binaryPrinterUtility(int n, String str, int lastPlace) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }
        binaryPrinterUtility(n, str + "0", 0);
        if (lastPlace != 1) {
            binaryPrinterUtility(n, str + "1", 1);
        }
    }

    public static void binaryPrinter(int n) {
        binaryPrinterUtility(n, "0", 0);
        binaryPrinterUtility(n, "1", 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        binaryPrinter(n);
    }
}
