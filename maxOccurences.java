public class maxOccurences {
    public static int maxArr(int arr[], int si, int ei) {
        int maxNum = Integer.MIN_VALUE;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            int curCount = 1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == cur) {
                    curCount++;
                }
            }
            if (maxCount < curCount) {
                maxCount = curCount;
                maxNum = cur;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2, 1, 1, 2, 1 };
        System.out.println(maxArr(arr, 0, arr.length - 1));
    }
}
