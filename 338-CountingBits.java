public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for(int i = 1; i <= num; i++) {
            int temp = i ^ (i - 1);
            temp++;
            int bit = 0;
            while(temp != 1) {
                temp /= 2;
                bit++;
            }
            result[i] = result[i - 1] + (2 - bit);
        }
        return result;
    }
}
