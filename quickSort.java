public class quickSort {
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si < ei) {
            int partition = partition(arr, si, ei);
            quicksort(arr, si, partition - 1);
            quicksort(arr, partition + 1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        int j = si;
        for (j = si; j < ei; j++) {
            if (arr[j] > pivot) {
                // do nothing
            } else {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        printArr(arr);
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
