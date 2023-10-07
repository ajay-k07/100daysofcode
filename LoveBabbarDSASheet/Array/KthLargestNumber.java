package LoveBabbarDSASheet.Array;

import java.util.PriorityQueue;

public class KthLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 20, 15 };
        int k = 2;
        System.out.println(MaxHeap(arr, k));
        System.out.println(quickSelect(arr, 0, arr.length - 1, arr.length - k));
    }

    public static int MaxHeap(int nums[], int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);

        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        System.out.println(queue);
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = queue.poll();
        }
        return result;
    }

    public static int quickSelect(int[] nums, int left, int right, int k) {
        int piviot = nums[right];
        int lastSorted = left;

        for (int i = left; i < right; i++) {
            if (nums[i] <= piviot) {
                int temp = nums[i];
                nums[i] = nums[lastSorted];
                nums[lastSorted] = temp;
                lastSorted++;
            }
        }
        int temp = nums[lastSorted];
        nums[lastSorted] = nums[right];
        nums[right] = temp;

        if (lastSorted < k) {
            return quickSelect(nums, lastSorted + 1, right, k);
        } else if (lastSorted > k) {
            return quickSelect(nums, left, lastSorted - 1, k);
        } else {
            return nums[lastSorted];
        }
    }
}
