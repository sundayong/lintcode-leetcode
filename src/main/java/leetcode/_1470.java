package leetcode;

/**
 * Shuffle the Array
 * <p>
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * <p>
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class _1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int t = 0;
        for (int i = 0, j = n; j < nums.length; t++) {
            if (t % 2 == 0) {
                res[t] = nums[i++];
            } else {
                res[t] = nums[j++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        nums = new _1470().shuffle(nums, 3);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
