public class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;
        int fn_1 = 1;
        int fn_2 = 1;
        int fn = fn_1 + fn_2;
        while(n > 2) {
        	fn_2 = fn_1;
            fn_1 = fn;
            fn = fn_1 + fn_2;
            n--;
        }
        return fn;
    }
}
