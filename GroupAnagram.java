import java.lang.reflect.Array;
import java.util.ArrayList;
// day 3 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
        ArrayList<ArrayList<String>> nestedList = new ArrayList<>(5000);
        for (int i = 0; i < 5000; i++) {
            nestedList.add(new ArrayList<>());
        }
        for (String s : strs) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += c;
            }

            nestedList.get(sum).add(s);

        }
        nestedList = (ArrayList<ArrayList<String>>) nestedList.stream().filter(e -> !e.isEmpty())
                .collect(Collectors.toList());
        System.out.println(nestedList);
    }
}
