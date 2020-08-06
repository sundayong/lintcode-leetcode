package lintcode;;

/**
 * Digit Counts
 */
public class _3 {
    public static int digitCounts(int k, int n) {
        // write your code here
        int[] a = new int[n + 1];
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += count(k, String.valueOf(i));
        }
        return sum;
    }

    public static int count(int k, String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c == k + 48) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitCounts(1, 12));
    }
}
