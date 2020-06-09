package leetcode;

public class _1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int i : nums) {
                if (i < nums[j]) {
                    count++;
                }
            }
            res[j] = count;
        }
        return res;
    }

    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] store = new int[101];
        for(int num : nums) {
            store[num]++;
        }
        for(int i = 1; i < 101; i++)
            store[i] += store[i-1];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                nums[i] = store[nums[i] - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
//        nums = new _1365().smallerNumbersThanCurrent(nums);
//        for (int num : nums) {
//            System.out.println(num);
//        }
        nums = new _1365().smallerNumbersThanCurrent1(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
