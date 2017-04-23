public class Solution {
    public String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}
