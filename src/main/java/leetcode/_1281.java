package leetcode;

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

    public int subtractProductAndSum1(int n) {
        int product = 1, sum = 0;
        while (n > 0) {
            int cur = n % 10;
            product *= cur;
            sum += cur;
            n /= 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(new _1281().subtractProductAndSum(4421));
    }
}
