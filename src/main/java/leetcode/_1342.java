package leetcode;

public class _1342 {
    public int numberOfSteps(int num) {
        int count = 1;
        while ((num = cal(num)) != 0) {
            count++;
        }
        return count;
    }

    public int cal(int num) {
        return num % 2 == 0 ? num / 2 : num - 1;
    }


    public static void main(String[] args) {
        System.out.println(new _1342().numberOfSteps(123));
    }
}
