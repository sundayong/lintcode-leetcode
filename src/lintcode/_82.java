package lintcode;

import java.util.HashMap;
import java.util.Map;

public class _82 {

    public static int singleNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) == null) {
                map.put(A[i], 1);
            } else {
                map.remove(A[i]);
            }
        }
        int res = 0;
        for (Integer i : map.keySet()) {
            res = i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A= {1,1,2,2,3,4,4};
        System.out.println(singleNumber(A));
    }
}
