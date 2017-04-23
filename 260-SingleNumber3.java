public class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Boolean> m = new HashMap<Integer, Boolean>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i])) {
                m.replace(nums[i], false);
            } else {
                m.put(nums[i], true);
            }
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(m.get(nums[i])) {
                result[count] = nums[i];
                count++;
            }
            if(count > 1) break;
        }
        return result;
    }
}
