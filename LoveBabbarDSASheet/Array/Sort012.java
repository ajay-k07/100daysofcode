package LoveBabbarDSASheet.Array;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 0, 2, 1, 2, 2, 0 };
        int i = 0;
        int left = 0;
        int right = nums.length - 1;

        while (i < right) {
            if (nums[i] == 0) {
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                i++;
                left++;

            } else if (nums[i] == 2) {
                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;

            } else {
                i++;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
