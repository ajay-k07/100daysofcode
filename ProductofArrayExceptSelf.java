import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product *= nums[j];
                }
            }
            nums[i] = product;
        }

        System.out.println(Arrays.toString(nums));
    }
}
