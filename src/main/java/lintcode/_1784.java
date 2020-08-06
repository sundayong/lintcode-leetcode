package lintcode;;

public class _1784 {

    public static int numberOfOperations(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int l = 0;
        if (chars.length % 2 == 0) {
            l = chars.length / 2;
        } else {
            l = chars.length / 2 + 1;
        }
        int sum = 0;
        for (int i = l; i < chars.length; i++) {
            sum += Math.abs(chars[i] - chars[chars.length - 1 - i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "qwertyuiop";
        System.out.println(numberOfOperations(s));
    }
}
