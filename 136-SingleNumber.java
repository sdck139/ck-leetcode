public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Boolean> m = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i])) {
                m.replace(nums[i], false);
            } else {
                m.put(nums[i], true);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(m.get(nums[i])) return nums[i];
        }
        return 0;
    }
}
