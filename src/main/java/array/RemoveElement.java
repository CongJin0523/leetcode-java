package array;

public class RemoveElement {
  public static void main(String[] args) {
    int[] nums =  {3,2,2,3};
    int val = 3;
    int result = Solution.removeElement(nums, val);
    for (int i = 0; i < result; i++) System.out.println(nums[i]);
  }

  public static class Solution {
    public static int removeElement(int[] nums, int val) {
      int slowIndex = 0;
      int fastIndex = 0;
      while (fastIndex < nums.length) {
        if (nums[fastIndex] != val) {
          nums[slowIndex] = nums[fastIndex];
          slowIndex++;
        }
        fastIndex++;
      }

      return slowIndex;
    }
  }
}
