//Day 5 GFG

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 10, 20, 20, 30, 30, 30, 30 };

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void shiftleft(int[] nums, int forwordPointer, int endPointer) {
        for (int i = endPointer; i < nums.length - 1; i++) {
            nums[forwordPointer] = nums[i + 1];
        }
        nums[nums.length] = 0;
    }
}
