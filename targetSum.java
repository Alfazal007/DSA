import java.util.Scanner;

public class targetSum {
    public static boolean pairsSummer(int arr[], int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("(" + arr[i] + ", " + arr[j] + " )");
                return true;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Enter the target sum :");
        int target = new Scanner(System.in).nextInt();
        boolean isPresent = pairsSummer(arr, target);
        System.out.println(isPresent);
    }
}
