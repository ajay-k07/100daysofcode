import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        ArrayList<Integer> result = new ArrayList<>();
        int[] rotated = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] main = Arrays.copyOfRange(nums, 0, nums.length - k);
        int i = 0;

        for (int num : rotated) {
            result.add(num);
        }
        for (int num : main) {
            result.add(num);
        }

        System.out.println(Arrays.toString(result.toArray()));
    }
}
