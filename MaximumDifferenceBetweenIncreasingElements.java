/**
 * MaximumDifferenceBetweenIncreasingElements
 */
public class MaximumDifferenceBetweenIncreasingElements {

    public static void main(String[] args) {
        int[] nums = new int[] { 87, 68, 91, 86, 58, 63, 43, 98, 6, 40 };
        int min = nums[0];
        int result = -1;
        for (int i = 1; i < nums.length; i++) {
            result = Math.max(result, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        System.out.println(result);
    }
}