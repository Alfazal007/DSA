public class mergeSort {
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            mergesort(arr, si, mid);
            mergesort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[si + (ei - si) + 1];
        int i = si, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = 0, i = si; i <= ei; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        printArr(arr);
        mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
