public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrayLength = nums.length;
        int[] output = new int[arrayLength];
        output[0] = 1;
        for(int i = 1; i < arrayLength; i++) {
            output[i] = output[i-1]*nums[i-1];
        }
        int acc = nums[arrayLength - 1];
        for(int i = arrayLength - 2; i >= 0; i--) {
            output[i] *= acc;
            acc *= nums[i];
        }
        return output;
    }
}
