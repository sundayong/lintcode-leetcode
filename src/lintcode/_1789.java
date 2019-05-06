package lintcode;


import java.util.HashMap;
import java.util.Map;

public class _1789 {
    public static String[] DistinguishUsername(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            if (map.get(names[i]) == null) {
                map.put(names[i], 0);
            } else {
                map.put(names[i], map.get(names[i]) + 1);
            }
            names[i] = names[i] + (map.get(names[i]) == 0 ? "" : map.get(names[i]));
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"aa", "bb", "cc", "bb", "aa", "aa", "aa"};
        DistinguishUsername(names);
    }
}
