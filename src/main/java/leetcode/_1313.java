package leetcode;

public class _1313 {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }
        int[] res = new int[length];
        int t = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            int count = nums[i];
            while (count-- > 0) {
                res[t++] = nums[i + 1];
            }
        }
        //Arrays.fill(res,start_index,end_index,val);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        nums = new _1313().decompressRLElist(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
