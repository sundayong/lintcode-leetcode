package leetcode;

import java.util.*;

public class _18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if (nums == null || length < 4) {
            return res;
        }
        Arrays.sort(nums);
        int max = nums[length - 1];
        if (nums[0] * 4 > target || max * 4 < target) {
            return res;
        }
        Set<List<Integer>> set = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + 3 * max < target) {
                continue;
            }
            if (nums[i] * 4 > target) {
                continue;
            }
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                for (int i2 = i1 + 1; i2 < nums.length; i2++) {
                    for (int i3 = i2 + 1; i3 < nums.length; i3++) {
                        if (nums[i] + nums[i1] + nums[i2] + nums[i3] == target) {
                            if(!set.contains(Arrays.asList(nums[i],nums[i1],nums[i2],nums[i3]))){
                                res.add(Arrays.asList(nums[i],nums[i1],nums[i2],nums[i3]));
                                set.add(Arrays.asList(nums[i],nums[i1],nums[i2],nums[i3]));
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    /**
     *
     * [-3,-2,-1,0,0,1,2,3]
     * 0
     * @param args
     */

    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        int target = 0;
        List<List<Integer>> lists = fourSum(nums, target);
//        for (int i = 0; i < lists.size(); i++) {
//            List<Integer> integers = lists.get(i);
//            for (int i1 = 0; i1 < integers.size(); i1++) {
//                System.out.print(integers.get(i1));
//            }
//            System.out.println();
//        }
    }
}
