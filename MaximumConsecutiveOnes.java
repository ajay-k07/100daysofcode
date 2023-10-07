// day 7 takeUforward

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1, 1 };
        int max = 0;
        int currentCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
            } else {
                max = Math.max(max, currentCount);
                currentCount = 0;
            }
        }
        max = Math.max(max, currentCount);
        System.out.println(max);
    }
}
