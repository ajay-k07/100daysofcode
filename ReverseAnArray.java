import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2 };
        int len = nums.length - 1;
        for (int i = 0; i <= len / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[len - i];
            nums[len - i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
