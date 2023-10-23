import java.util.HashSet;
import java.util.Set;

public class _4_DuplicateInArray {
    // Example 1:
    // Input: nums = [1,2,3,1]
    // Output: true

    // Example 2:
    // Input: nums = [1,2,3,4]
    // Output: false

    // time complexity: linear
    // space complexity: linear

    public boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}
