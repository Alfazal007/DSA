public class _7_PermutingArray {
    // For example,for arr=[1,2,3],
    // the following
    // are all
    // the permutations
    // of arr:[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1].
    // The next
    // permutation of
    // an array
    // of integers
    // is the
    // next lexicographically
    // greater permutation
    // of its
    // integer.More formally,if
    // all the
    // permutations of
    // the array
    // are sorted
    // in one
    // container according
    // to their
    // lexicographical order, then
    // the next
    // permutation of
    // that array
    // is the
    // permutation that
    // follows it
    // in the
    // sorted container.
    // If such
    // arrangement is
    // not possible, the
    // array must
    // be rearranged
    // as the
    // lowest possible
    // order (i.e., sorted in ascending order).

    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        } else {
            int i = nums.length - 2;
            while (i >= 0) {
                if (nums[i] < nums[i + 1]) {
                    break;
                }
                i--;
            }
            if (i == -1) {
                reverse(nums);
                return;
            }
            int j = nums.length - 1;
            while (i != j) {
                if (nums[j] > nums[i]) {
                    break;
                } else {
                    j--;
                }
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            reverser(nums, i + 1, nums.length - 1);
        }
    }

    public static void reverser(int nums[], int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverse(int nums[]) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
