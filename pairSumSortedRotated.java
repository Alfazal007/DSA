import java.util.Scanner;

public class pairSumSortedRotated {
    public static boolean sumPresent(int arr[], int key) {
        // find the pivot point
        int pivot = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i + 1;
                break;
            }
        }
        int i = pivot;
        int j = pivot - 1;
        while (i != j) {
            if (arr[i] + arr[j] == key) {
                return true;
            } else if (arr[i] + arr[j] > key) {
                j--;
                if (j == -1) {
                    j = arr.length - 1;
                }
            } else if (arr[i] + arr[j] < key) {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        System.out.println("Enter the target sum :");
        int key = new Scanner(System.in).nextInt();
        boolean isSumPresent = sumPresent(arr, key);
        System.out.println(isSumPresent);
    }
}
