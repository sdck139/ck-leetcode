public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> l = new ArrayList<Integer>();
        if(n < 0) return l;
        if(n == 0) {
            l.add(0);
            return l;
        }
        back(l, n);
        return l;
    }

    public static void back(List<Integer> l, int n) {
        if(n == 1) {
            l.add(0);
            l.add(1);
        } else {
            back(l, n - 1);
            int p = (int)Math.pow(2, n - 1);
            for(int i = p - 1; i >= 0; i --) {
                l.add(l.get(i) + p);
            }
        }
    }
}
