package lintcode;;

/**
 * 水仙花
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = "";
        String s2 = "";
        while (n > 0) {
            s1 += "9";
            s2 += "1";
            n--;
        }
        int max1 = Integer.parseInt(s1);
        int max2 = Integer.parseInt(s2);
//        System.out.println(s);
        List<Integer> resList = new ArrayList<>();
        for (int i = max2; i <= max1; i++) {
            if (cal(i)) {
                resList.add(i);
            }
        }
        System.out.println(resList);
    }

    public static boolean cal(int t) {
        int length = String.valueOf(t).length();
        int n = t;
        int num = 0;
        int l = length;
        while (length > 0) {
            num += Math.pow((n % 10), l);
            n /= 10;
            length--;
        }
        if (num == t) {
            return true;
        }
        return false;
    }

}
