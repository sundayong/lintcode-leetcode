package lintcode;

public class _423 {

    public static boolean isValidParentheses(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        int num = s.length();
        while (num > 0) {
            s = s.replaceAll("\\(\\)", "").replaceAll("\\{\\}", "")
                    .replaceAll("\\[\\]", "");
            num--;
            if (s.length() == 0) {
                break;
            }
        }
        if (s.length() != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "()[]{}{}";
//        System.out.println(s.replaceAll("\\{\\}", ""));
        System.out.println(isValidParentheses(s));
    }
}
