public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            result += (int)Math.pow(26, (s.length() - i - 1))*((int)s.charAt(i) - 64);
        }
        return result;
    }
}
