package lintcode;

import java.math.BigInteger;

public class _2 {
    public static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long ans = 0;
        while (n >= 5) {
            ans += n / 5;
            n /= 5;
        }

//        BigInteger sum = BigInteger.valueOf(1);
//
//        System.out.println(sum.longValue());
//        for (BigInteger i = BigInteger.valueOf(1); i.compareTo(BigInteger.valueOf(n)) <= 0; i = i.add(BigInteger.valueOf(1))) {
//            sum = sum.multiply(i);
//        }
//        System.out.println(sum.toString());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeros(25));
    }
}
