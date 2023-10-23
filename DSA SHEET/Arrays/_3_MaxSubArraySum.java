public class _3_MaxSubArraySum {
    // Input:nums=[-2,1,-3,4,-1,2,1,-5,4]Output:6 Explanation:The subarray[4,-1,2,1]
    // has the
    // largest sum 6.

    public int maxSubArray(int[] nums) {
        int curSum = 0, maxSum = 0;
        int maxItem = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxItem = Math.max(maxItem, nums[i]);
            curSum += nums[i];
            if (curSum < 0) {
                curSum = 0;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        if (maxSum == 0 && maxItem != 0) {
            return maxItem;
        }
        return maxSum;
    }
}
