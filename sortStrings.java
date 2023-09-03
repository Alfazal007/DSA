public class sortStrings {
    public static void printArr(String arr[]) {
        for (String string : arr) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String arr[], int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            mergeSort(arr, si, mid);
            mergeSort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[si + (ei - si) + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
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
        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        printArr(arr);
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
