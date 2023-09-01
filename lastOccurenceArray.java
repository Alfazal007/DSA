import java.util.Scanner;

public class lastOccurenceArray {
    public static int lastOccurence(int arr[], int i, int key) {
        if (i < 0) {
            return -1;
        } else if (arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, i - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 3, 2, 1, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key :");
        int key = sc.nextInt();
        System.out.println(lastOccurence(arr, arr.length - 1, key));
    }
}
