public class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].length() * words[j].length() > max) {
                  if(xorString(words[i], words[j]))  max = words[i].length() * words[j].length();
                }
            }
        }
        return max;
    }

    public boolean xorString(String s1, String s2) {
        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < s2.length(); j++) {
                if(s2.charAt(j) == s1.charAt(i)) return false;
            }
        }
        return true;
    }
}
