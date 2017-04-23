public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(!m.containsKey(nums[i])) {
                m.put(nums[i], 1);
            } else {
                int temp = m.get(nums[i]) + 1;
                m.replace(nums[i], temp);
            }
            if( m.get(nums[i]) > nums.length / 2) return nums[i];
        }
        return 0;
    }
}
