public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(!s.contains(nums[i])) s.add(nums[i]);
            else return true;
        }
        return false;
    }
}
