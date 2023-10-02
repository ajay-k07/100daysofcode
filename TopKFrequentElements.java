// day 3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Map.Entry;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], (int) (map.getOrDefault(nums[i], 0)) + 1);

        }
        Queue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<Map.Entry<Integer, Integer>>(
                (a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            priorityQueue.add(e);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        Iterator<Map.Entry<Integer, Integer>> i = priorityQueue.iterator();
        int[] result = new int[k];
        int index = 0;
        while (i.hasNext()) {
            result[index] = i.next().getKey();
            index++;
            if (index == k) {
                break;
            }
        }
        System.out.println(result);
    }
}
