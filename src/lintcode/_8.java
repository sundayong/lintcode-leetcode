package lintcode;

public class _8 {
    public static void rotateString(char[] str, int offset) {
        if (str.length == 0) {
            return;
        }
        char[] str1 = new char[str.length];
        int move = offset % str.length;
        int j = 0;
        for (int i = str.length - move; i < str.length; i++, j++) {
            str1[j] = str[i];
        }
        for (int i = 0; i < str.length - move; i++, j++) {
            str1[j] = str[i];
        }
        for (int i = 0; i < str.length; i++) {
            str[i] = str1[i];
        }
    }

    public static void main(String[] args) {

        rotateString("abcdefg".toCharArray(), 3);
    }
}
