package lintcode;;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _56 {

    public static int[] twoSum(int[] numbers, int target) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(String.valueOf(numbers[i]))) {
                map.put(String.valueOf(numbers[i]), i);
            } else {
                map.put(numbers[i] + "#", i);
            }
        }
        int[] res = new int[2];
        for (String i : map.keySet()) {
            if (i.contains("#")) {
                i = i.replaceAll("#", "");
            }
            int n = Integer.parseInt(i);
            if (n * 2 == target && map.containsKey(String.valueOf(n))
                    && map.containsKey(n + "#") && map.get(String.valueOf(n)) != map.get(n + "#")) {
                res[0] = map.get(String.valueOf(n));
                res[1] = map.get(n + "#");
                break;
            }
            if (map.containsKey(String.valueOf(target - n)) && map.get(i) != map.get(String.valueOf(target - n))) {
                res[0] = map.get(i);
                res[1] = map.get(String.valueOf(target - n));
                break;
            } else if (map.containsKey(target - n + "") && map.get(i) != map.get(target - n + "")) {
                res[0] = map.get(i);
                res[1] = map.get(target - n + "");
                break;
            }
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 0, -1};
        int target = 0;
        int[] ints = twoSum(numbers, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
//        System.out.println("#".replaceAll("#",""));
    }
}
