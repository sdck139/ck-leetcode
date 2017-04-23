public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++) {
            if(!s.contains(nums1[i])) {
                for(int j = 0; j < nums2.length; j++) {
                    if(nums1[i] == nums2[j]) {
                        s.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        int[] result = new int[s.size()];
        int i = 0;
        for(Iterator iter = s.iterator();iter.hasNext();){
            result[i] = ((Integer)iter.next()).intValue();
            i++;
        }
        return result;
    }
}
