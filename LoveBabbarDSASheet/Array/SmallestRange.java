package LoveBabbarDSASheet.Array;

import java.util.Arrays;

public class SmallestRange {
    public int smallestRangeII(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[n - 1];
        int result = max - min;
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(nums[0] + k, nums[i + 1] - k);
            max = Math.max(nums[n - 1] - k, nums[i] + k);

            result = Math.min(result, max - min);
        }
        return result;
    }
}
