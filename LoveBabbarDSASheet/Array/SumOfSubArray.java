package LoveBabbarDSASheet.Array;

/**
 * SumOfSubArray
 */
public class SumOfSubArray {

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int current = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            current = current + nums[i];
            if (current > max) {
                max = current;
            }
            if (current < 0) {
                current = 0;
            }

        }
        System.out.println(max);
    }
}