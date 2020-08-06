package leetcode;

import java.util.*;

/**
 * Longest Substring Without Repeating Characters
 */
public class _3 {

    public static int lengthOfLongestSubstring(String s) {

//        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        int t = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                sum++;
            } else {
                int index = map.get(chars[i]);
                if (sum > max) {
                    max = sum;
                }
                sum = i - index;
                Iterator<Character> iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    if (map.get(iterator.next()) <= index) {
                        iterator.remove();
                    }
                }
            }
            map.put(chars[i], i);
        }
        if (max < sum) {
            max = sum;
        }
        return max;
    }


    public static int lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "bbtablud";
        System.out.println(lengthOfLongestSubstring1(str));
    }
}
