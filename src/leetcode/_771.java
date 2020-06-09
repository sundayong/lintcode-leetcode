package leetcode;

public class _771 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] chars1 = J.toCharArray();
        char[] chars = S.toCharArray();
        for (char c : chars1) {
            for (char aChar : chars) {
                if (c == aChar) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String J = "z", S = "ZZ";
        System.out.println(new _771().numJewelsInStones(J, S));
    }
}
