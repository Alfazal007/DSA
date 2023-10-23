import java.util.ArrayList;
import java.util.Collections;

class Solution {
    // N = 8, M = 5
    // A = {3, 4, 1, 9, 56, 7, 9, 12}
    // Output: 6
    // Explanation: The minimum difference between maximum chocolates and minimum
    // chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.

    // space complexity: constant
    // time complexity: linear

    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        Collections.sort(a);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            minDifference = Math.min(minDifference, a.get(i + m - 1) - a.get(i));
        }
        return minDifference;
    }
}
