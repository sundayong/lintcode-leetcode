package lintcode;;

public class _534 {

    public static int houseRobber2(int[] nums) {
        // write your code here
        if (nums.length == 0 || nums.length == 2 || nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] DP_1 = new int[nums.length - 1];
        int[] DP_2 = new int[nums.length - 1];
        //不打劫最后一所房子则从第一所房子开始打劫
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                DP_1[i] = nums[0];
            }
            if (i == 1) {
                DP_1[i] = Math.max(nums[1], DP_1[0]);
            }
            if (i > 1) {
                DP_1[i] = Math.max(DP_1[i - 2] + nums[i], DP_1[i - 1]);
            }
        }
        //打劫最后一所房子则从第二所房子开始打劫
        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                DP_2[i - 1] = nums[1];
            }
            if (i == 2) {
                DP_2[i - 1] = Math.max(nums[2], DP_2[0]);
            }
            if (i > 2) {
                DP_2[i - 1] = Math.max(DP_2[i - 3] + nums[i], DP_2[i - 2]);
            }
        }
        return Math.max(DP_1[nums.length - 2], DP_2[nums.length - 2]);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 3};
        System.out.println(houseRobber2(nums));
    }
}
