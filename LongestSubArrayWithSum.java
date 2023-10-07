public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 9 };
        int k = 10;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            int len = 0;
            for (int j = i + 1; j < arr.length; j++) {
                len++;
                sum = sum + arr[j];
                if (sum == k) {
                    max = Math.max(max, len);
                    System.out.println(i + " - > " + j);
                }
            }
        }
    }
}
