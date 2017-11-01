public class Solution {
  public int numTrees(int n) {
      long result = 1;
      for(int i = n + 1; i <= 2 * n; i ++) {
          result *= i;
          result /= (i - n);
      }
      result /= n + 1;
      return (int)result;
  }
}