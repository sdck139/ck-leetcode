public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(!ht.containsKey(nums[i])) {
                ht.put(nums[i], 1);
            } else {
                int temp = ht.get(nums[i]) + 1;
                ht.replace(nums[i], temp);
            }
        }
        System.out.println("here");
        Iterator iter = ht.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            int key = (int)(entry.getKey());
            int val = (int)entry.getValue();
            if(l.size() == 0) {
                l.add(key);
            } else {
                int listLength = l.size();
                for(int j = 0; j < listLength; j++) {
                    if(ht.get(l.get(j)) <= val) {
                        l.add(j, key);
                        break;
                    }
                    if(j == listLength - 1) l.add(key);
                }
            }
        }
        System.out.println("here");
        System.out.println(l);
        l = l.subList(0, k);

        return l;
    }
}
