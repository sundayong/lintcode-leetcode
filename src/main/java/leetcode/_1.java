package leetcode;

public class _1 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (target - nums[i] == nums[i1]) {
                    return new int[]{i, i1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] a = twoSum(nums, target);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
