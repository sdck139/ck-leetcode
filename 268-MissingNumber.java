public class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = (1 + nums.length)*nums.length/2;
        int sum2 = 0;
        for(int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }
        return sum1 - sum2;
    }
}
