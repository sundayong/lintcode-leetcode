package lintcode;

import java.util.ArrayList;
import java.util.List;

public class _9 {

    public static List<String> fizzBuzz(int n) {
        List<String> str = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str.add("fizz buzz");
            } else if (i % 5 == 0) {
                str.add("buzz");
            } else if (i % 3 == 0) {
                str.add("fizz");
            } else {
                str.add(String.valueOf(i));
            }
        }
        return str;
    }

    public static void main(String[] args) {

    }
}
