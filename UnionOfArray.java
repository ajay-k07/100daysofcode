import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class UnionOfArray {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 6 };
        int[] nums2 = { 10, 9, 8, 7, 6, 5 };

        Set<Integer> set = new HashSet<>();

        for (int n : nums)
            set.add(n);
        for (int n : nums2) {
            set.add(n);
        }
        System.out.println(set);

    }

}
