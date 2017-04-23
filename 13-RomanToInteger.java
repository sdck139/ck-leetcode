public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        boolean isAdd = true;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(i == s.length() - 1) result += romanChatToInt(s.charAt(i));
            else {
                if(romanChatToInt(s.charAt(i)) < romanChatToInt(s.charAt(i + 1))) isAdd = false;
                else if(romanChatToInt(s.charAt(i)) > romanChatToInt(s.charAt(i + 1))) isAdd = true;
                if(isAdd) result += romanChatToInt(s.charAt(i));
                else result -= romanChatToInt(s.charAt(i));
            }
        }
        return result;
    }

    public int romanChatToInt(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: break;
        }
        return 0;
    }
}
