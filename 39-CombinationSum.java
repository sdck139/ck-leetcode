public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	int sum = 0;
        List<List<Integer>> l = new LinkedList<List<Integer>>();
        LinkedList<Integer> result = new LinkedList<Integer>();
        LinkedList<LinkedList<Integer>> error = new LinkedList<LinkedList<Integer>>();
        error.add(new LinkedList<Integer>());
        while(error.size() > 1 || error.getFirst().size() != candidates.length) {
            for(int candidate : candidates) {
                if(!error.getLast().contains(candidate)) {
                	if(!result.isEmpty()) {
                		if(candidate < result.getLast()) {
                			error.getLast().add(candidate);
                			continue;
                		}
                	}
                    if(sum + candidate < target) {
                        result.add(candidate);
                        sum += candidate;
                        error.add(new LinkedList<Integer>());
                        break;
                    } else if(sum + candidate == target) {
                        result.add(candidate);
                        LinkedList<Integer> temp = new LinkedList<Integer>();
                        temp = (LinkedList<Integer>) result.clone();
                        l.add(temp);
                        result.removeLast();
                        error.getLast().add(candidate);
                    } else {
                        error.getLast().add(candidate);
                    }
                }
                if(error.getLast().size() == candidates.length && error.size() > 1) {
                    error.removeLast();
                    int temp = result.removeLast();
                    sum -= temp;
                    error.getLast().add(temp);
                    break;
                }
            }
        }
        return l;
    }
}
