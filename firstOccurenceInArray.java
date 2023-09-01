import java.util.Scanner;

public class firstOccurenceInArray {
    public static int firstOccurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        } else if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 2, 1, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key :");
        int key = sc.nextInt();
        System.out.println(firstOccurence(arr, 0, key));
    }
}
