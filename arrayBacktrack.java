public class arrayBacktrack {
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void backtrack(int arr[], int cur) {
        if (cur == arr.length) {
            printArr(arr);
            return;
        }
        arr[cur] = cur + 1;
        backtrack(arr, cur + 1);
        arr[cur] -= 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        printArr(arr);
        backtrack(arr, 0);
        printArr(arr);
    }
}
