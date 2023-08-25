// Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };

import java.util.Scanner;

public class printNoOfKeys {
    public static void keyCounter(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be counted: ");
        int key = sc.nextInt();
        keyCounter(array, key);
    }
}