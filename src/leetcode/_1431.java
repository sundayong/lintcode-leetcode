package leetcode;

import java.util.*;

public class _1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>(candies.length);
        for (int i = 0; i < n; i++) {
            res.add(candies[i] + extraCandies >= max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println(new _1431().kidsWithCandies(candies, 3));
    }
}
