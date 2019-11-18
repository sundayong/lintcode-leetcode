package leetcode;

public class _8 {

    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        //1.去除开头和结尾的空格字符
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        //2.判断数字的符号
        int i = 0;
        int flag = 1;
        char ch = str.charAt(i);
        if (ch == '+') {
            i++;
        } else if (ch == '-') {
            i++;
            flag = -1;
        }
        //3.找出数字部分
        int res = 0;
        for (; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }
            //溢出判断
            if (flag > 0 && res > Integer.MAX_VALUE / 10) {
                return Integer.MAX_VALUE;
            }
            if (flag > 0 && res == Integer.MAX_VALUE / 10 && ch - '0' > Integer.MAX_VALUE % 10) {
                return Integer.MAX_VALUE;
            }
            if (flag < 0 && -res < Integer.MIN_VALUE / 10) {
                return Integer.MIN_VALUE;
            }
            if (flag < 0 && -res == Integer.MIN_VALUE / 10 && -(ch - '0') < Integer.MIN_VALUE % 10) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + ch - '0';
        }
        return res * flag;
    }

    public static void main(String[] args) {
        _8 c = new _8();//2147483647
        int n = 2147483646;
        String str = "2147483648";
        System.out.println(c.myAtoi(str));
    }
}
