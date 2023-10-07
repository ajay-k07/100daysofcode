// day 7
public class NumberThatAppereOnce {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 3, 4 };
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        System.out.println(xor);
    }
}
