package leetcode;

public class _1221 {
    public int balancedStringSplit(String s) {
        int count = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(new _1221().balancedStringSplit(s));
    }
}
