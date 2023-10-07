
// Day 6 
// Leetcode
import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArray {

    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int n : nums1) {
            map.put(n, false);
        }
        for (int n : nums2) {
            if (map.containsKey(n)) {
                map.put(n, true);
            }
        }
        map.forEach((k, v) -> {
            if (v) {
                result.add(k);
            }
        });
        int[] ans = new int[result.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

}
