import java.util.Scanner;

public class allOccurencesOfKey {
    public static void indexFinder(int arr[], int key, int cur) {
        if (cur == arr.length) {
            return;
        }
        if (arr[cur] == key) {
            System.out.print(cur + " ");
        }
        indexFinder(arr, key, cur + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        System.out.println("Enter the key to be searched :");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        indexFinder(arr, key, 0);
    }
}
