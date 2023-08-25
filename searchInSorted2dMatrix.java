import java.util.Scanner;

public class searchInSorted2dMatrix {
    public static boolean search(int arr[][], int key) {
        int row = arr.length - 1;
        int col = 0;
        while (row >= 0 && col < arr[0].length) {
            if (arr[row][col] == key) {
                return true;
            } else if (arr[row][col] < key) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be searched");
        int key = sc.nextInt();
        System.out.println(search(arr, key));
    }
}
