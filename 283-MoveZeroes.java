public class Solution {
    public void moveZeroes(int[] nums) {
        int last = nums.length - 1;
    	for(int i = 0 ; i < nums.length ; i++) {
        	if(nums[i] == 0) {
        		while(nums[last] == 0 && last != 0) {
        			last--;
        			if(last == i) break;
        		}
        		if(last == i) break;
        		int temp = nums[i];
        		for(int j = i ; j < last ; j++) {
        			nums[j] = nums[j+1];
        		}
        		nums[last] = temp;
        		i--;
        	}
        	if(i == last-1) break;
        }
    }
}
