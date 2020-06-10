package leetcode;

import java.util.Arrays;

public class _1281 {
    public int subtractProductAndSum(int n) {
        int sum1 = 0;
        int sum2 = 1;

        char[] chars = String.valueOf(n).toCharArray();
        for (char aChar : chars) {
            sum1 += (aChar - 48);
            sum2 *= (aChar - 48);
        }
        return sum2 - sum1;
    }

    public static void main(String[] args) {
        System.out.println(new _1281().subtractProductAndSum(4421));
    }
}
