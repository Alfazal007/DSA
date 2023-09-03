import java.util.Scanner;

public class sortedRotatedArraySearch {
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int searched(int arr[], int si, int ei, int key) {
        if (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (arr[mid] >= arr[si]) {
                // line 1 condition
                if (key < arr[mid] && key >= arr[si]) {
                    return searched(arr, si, mid - 1, key);
                } else {
                    return searched(arr, mid + 1, ei, key);
                }
            } else {
                if (key <= arr[ei] && key > arr[mid]) {
                    return searched(arr, mid + 1, ei, key);
                } else {
                    return searched(arr, si, mid - 1, key);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Enter the key to be searched :");
        int key = new Scanner(System.in).nextInt();
        System.out.println(searched(arr, 0, arr.length - 1, key));
    }
}
