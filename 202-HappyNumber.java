public class Solution {
    public boolean isHappy(int n) {
        List<Integer> last = new ArrayList<Integer>();
        if(n <= 0) return false;
        while(n != 1) {
            last.add(n);
            List<Integer> ls = new ArrayList<Integer>();
            while(n != 0) {
                ls.add(n%10);
                n /= 10;
            }
            for(int l : ls) {
                n += l*l;
            }
            if(last.contains(n)) {
                return false;
            }
        }
        return true;
    }
}
