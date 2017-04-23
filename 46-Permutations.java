public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new LinkedList<List<Integer>>();
        if(nums.length == 0) {
            l.add(new LinkedList<Integer>());
            return l;
        }
        for(int n : nums) {
            List<Integer> temp = new LinkedList<Integer>();
            temp.add(n);
            l.add(temp);
        }
        back(l, nums);
        return l;
    }

    public void back(List<List<Integer>> tol, int[] nums) {
    	List<List<Integer>> ll = new LinkedList<List<Integer>>();
    	ll.addAll(tol);
        for(List<Integer> t : ll) {
        	List<Integer> tt = new LinkedList<Integer>();
        	tt.addAll(t);
            int count = 0;
            for(int n : nums) {
                if(!t.contains(n)) {
                    count ++;
                    if(count == 1) {
                        t.add(n);
                    } else {
                        List<Integer> temp = new LinkedList<Integer>();
                        temp.addAll(tt);
                        temp.add(n);
                        tol.add(tol.indexOf(t) + count - 1, temp);
                    }
                }
            }
        }
        if(tol.get(0).size() != nums.length) back(tol, nums);
    }
}
