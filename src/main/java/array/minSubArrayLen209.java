package array;

import java.util.Arrays;

public class minSubArrayLen209 {
  public static void main(String[] args) {
    int[] nums = {2,3,1,2,4,3};
    int target = 7;
    System.out.println(Solution.minSubArrayLen(target, nums));
  }
  public class Solution {
    public static int minSubArrayLen(int target, int[] nums) {

      // check if it has subarray



      int result = Integer.MAX_VALUE;
      int left = 0;
      int sum = 0;
      for (int right = 0; right < nums.length; right++) {
        sum += nums[right];
        while (sum >= target) {
          result = Math.min(result, right - left + 1);
          sum -= nums[left++];
        }
      }

      return result == Integer.MAX_VALUE ? 0 : result;
    }
  }
}
