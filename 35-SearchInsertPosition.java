public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        int mid = (right + left) / 2;
        while(target != nums[mid]) {
            if(right - left == 1) {
                return right;
            }
            if(target > nums[mid]) {
                left = mid;
            } else {
                right = mid;
            }
            mid = (right + left) / 2;
        }
        return mid;
    }
}
