public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        Map<Character, Integer> m2 = new HashMap<Character, Integer>();
        boolean result = true;
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(!m1.containsKey((s.charAt(i)))) {
                m1.put(s.charAt(i), 1);
            } else {
                int temp = m1.get(s.charAt(i)) + 1;
                m1.replace(s.charAt(i), temp);
            }
        }
        for(int i = 0; i < t.length(); i++) {
            if(!m2.containsKey(t.charAt(i))) {
                m2.put(t.charAt(i), 1);
            } else {
                int temp = m2.get(t.charAt(i)) + 1;
                m2.replace(t.charAt(i), temp);
            }
        }
        Iterator iter = m1.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            char key = (char)(entry.getKey());
            int val = (int)entry.getValue();
            if(!m2.containsKey(key) || m2.get(key) != val) {
                result = false;
            }
        }
        return result;
    }
}
