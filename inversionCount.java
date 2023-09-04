public class inversionCount {
    public static int inversion(int arr[]) {
        int inversionCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(inversion(arr));
    }
}
