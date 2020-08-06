package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] res = new int[index.length];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        nums = new _1389().createTargetArray(nums, index);
        for (int num : nums) {
            System.out.println(num);
        }
        /*int[] a= new int[10];
        for (int i : a) {
            System.out.println(i);
        }*/
    }
}
