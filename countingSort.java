public class countingSort {
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(int arr[]) {
        // find max
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int newArr[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i];
            newArr[idx]++;
        }
        // now edit the original array
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            while (newArr[j] <= 0) {
                j++;
            }
            while (newArr[j] != 0) {
                int item = j;
                arr[i] = j;
                i--;
                newArr[j]--;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        printArr(arr);
        sort(arr);
        printArr(arr);
    }
}
