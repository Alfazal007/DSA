public class monotone {
    public static boolean monotone(int arr[]) {
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }
        if (i == arr.length - 1) {
            return true;
        }
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
        }
        if (i == arr.length - 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        boolean isMonotone = monotone(arr);
        System.out.println(isMonotone);
    }
}
