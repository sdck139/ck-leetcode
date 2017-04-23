public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        if(nums1.length >= nums2.length) {
            for(int i = 0; i < nums2.length; i++) {
                for(int j = 0; j < nums1.length; j++) {
                    if(nums2[i] == nums1[j] && !s.contains(j)) {
                        s.add(j);
                        result.add(nums1[j]);
                        break;
                    }
                }
            }
        } else {
           for(int i = 0; i < nums1.length; i++) {
                for(int j = 0; j < nums2.length; j++) {
                    if(nums1[i] == nums2[j] && !s.contains(j)) {
                        s.add(j);
                        result.add(nums2[j]);
                        break;
                    }
                }
            }
        }

        Integer[] toArray = (Integer[]) result.toArray(new Integer[0]);
        int[] intArray = new int[toArray.length];
        for(int i = 0; i < toArray.length; i++) {
            intArray[i] = toArray[i].intValue();
        }
        return intArray;
    }
}
