package leetcode;

public class _1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int findNumbers1(int[] nums) {
        int c = 0;
        for(int i =0; i< nums.length;i++){
            int num = nums[i];
            if((num>=10 && num<=99) || (num>=1000 && num <= 9999) || num==100000)
                c+=1;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(new _1295().findNumbers(nums));
    }
}
