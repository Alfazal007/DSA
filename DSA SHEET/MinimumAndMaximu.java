public class MinimumAndMaximu {
    public static int sumFinder(int arr[]) {
        // finc the sum of minimum and maximum element in an array
        // constant space complexity and linear time complexity
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        return min + max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, -3, 2, -4, 7 };
        System.out.println(sumFinder(arr));
    }
}
