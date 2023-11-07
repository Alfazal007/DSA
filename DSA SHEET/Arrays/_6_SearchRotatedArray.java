public class _6_SearchRotatedArray {
    // Example 1:
    // Input: nums = [4,5,6,7,0,1,2], target = 0
    // Output: 4

    // Example 2:
    // Input: nums = [4,5,6,7,0,1,2], target = 3
    // Output: -1
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find mid
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // track the line
            else if (arr[mid] >= arr[start] && arr[mid] >= arr[end]) {
                // line 1
                if (target < arr[mid] && target > arr[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
