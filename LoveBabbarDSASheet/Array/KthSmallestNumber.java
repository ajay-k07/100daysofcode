package LoveBabbarDSASheet.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestNumber {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 20, 15 };
        int[] a1 = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] a2 = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(5 / 2);

    }

}
