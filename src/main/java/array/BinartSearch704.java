package array;

public class BinartSearch704 {
  public static void main(String[] args) {
    int[] arr = {-1,0,3,5,9,12};
    int target = 2;
    System.out.println(Solution.search(arr, target));
  }

  public static class Solution {
    public static int search(int[] nums, int target) {
      if (target < nums[0] || target > nums[nums.length - 1]) {
        return -1;
      }
      int left = 0;
      int right = nums.length - 1;
      while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
          return mid;
        } else if (nums[mid] < target) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
      return -1;
    }
  }
}
