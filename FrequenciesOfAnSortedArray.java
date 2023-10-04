/**
 * FrequenciesOfAnSortedArray
 * GFG Day 6
 */
public class FrequenciesOfAnSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 40, 50, 50, 50 };
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            } else {
                System.out.println(num + "->" + count);
                num = nums[i];
                count = 1;
            }
        }
        System.out.println(num + "->" + count);
    }
}