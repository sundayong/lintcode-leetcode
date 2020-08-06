package lintcode;;

import java.util.Scanner;

public class _1790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ss = str.split(",");
        if (ss.length != 3) {
            return;
        }
        str = ss[0].split("=")[1].replaceAll("\"", "").replaceAll(" ", "");
        int left = Integer.parseInt(ss[1].split("=")[1].replaceAll(" ", ""));
        int right = Integer.parseInt(ss[2].split("=")[1].replaceAll(" ", ""));
        int move = right - left;
        int _move = Math.abs(move);
        char[] chars = str.toCharArray();
        _move = _move % chars.length;
        System.out.print("\"");
        if (move > 0) {
            for (int i = chars.length - _move; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            for (int i = 0; i < chars.length - _move; i++) {
                System.out.print(chars[i]);
            }
        } else {

            for (int i = _move; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            for (int i = 0; i < _move; i++) {
                System.out.print(chars[i]);
            }
        }
        System.out.println("\"");
    }
}
