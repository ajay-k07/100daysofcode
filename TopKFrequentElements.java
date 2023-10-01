// day 3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], (int) (map.getOrDefault(nums[i], 0)) + 1);
        }
        map.forEach((key, value) -> {
            if (value >= k) {
                result.add(key);
            }
        });
        System.out.println(Arrays.toString(result.toArray(new Integer[result.size()])));
    }
}
