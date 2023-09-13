public class nextGreater {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void next(int arr[]) {
        int newArr[] = new int[arr.length];
        newArr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int cur = i + 1;
            while (cur < arr.length) {
                if (arr[cur] > arr[i]) {
                    newArr[i] = cur;
                    break;
                }
                cur++;
            }
            if (cur == arr.length) {
                newArr[i] = -1;
            }
        }
        printArr(newArr);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        next(arr);
    }
}
