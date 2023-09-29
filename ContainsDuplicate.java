// Day 1

import java.util.HashSet;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(input));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> tree = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!(tree.add(nums[i]))) {
                return true;
            }
        }
        return false;
    }
}