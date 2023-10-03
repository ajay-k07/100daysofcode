import java.util.Arrays;

public class MoveZeroToRight {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 0, 2, 0, 3, 4 };

        int lastNumberIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastNumberIndex];
                nums[lastNumberIndex] = temp;
                lastNumberIndex++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
