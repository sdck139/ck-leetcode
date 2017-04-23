public class Solution {
    public int uniquePaths(int m, int n) {
        long result = 1;
        int x = (m < n ? m : n) - 1;
        int sum = m + n - 2;
        for(int i = 0; i < x; i++) {
            result *= (sum - i);
            result /= i + 1;
        }
        return (int)result;
    }
}
