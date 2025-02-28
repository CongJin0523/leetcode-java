package array;

import java.util.function.Consumer;

public class sortedSquares977 {
  public static class Solution {
    public static int[] sortedSquares(int[] nums) {
      int leftIndex = 0;
      int rightIndex = nums.length - 1;
      int[] result = new int[nums.length];
      for (int i = result.length - 1; i >= 0; i--) {
        if (Math.abs(nums[leftIndex]) > Math.abs(nums[rightIndex])) {
          result[i] = Solution.square(nums[leftIndex]);
          leftIndex++;
        } else {
          result[i] = Solution.square(nums[rightIndex]);
          rightIndex--;
        }
      }
      return result;
    }
    private static int square(int x) {
      return x * x;
    }
  }
}
