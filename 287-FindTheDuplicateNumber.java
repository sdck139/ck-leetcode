public class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 2) return 1;
        int left = 0;
        int right = nums.length;
        for(int i = (left + right)/2;; i = (left + right)/2) {
            int big = 0;
            int small = 0;
            for(int j = 0; j < nums.length; j ++) {
                if(i < nums[j]) big++;
                else if(i > nums[j]) small++;
            }
            if(big + small < nums.length - 1) return i;
            else if(nums.length - i - 1 < big) left = i;
            else if(i - 1 < small) right = i;
        }
    }
}
