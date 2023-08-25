package crux.executor.app.neetcode.adsb.arrays.problem;

/**
 * <strong>Easy</strong> Problem here
 *
 * <p><a href="https://leetcode.com/problems/remove-element">27. Remove Element</a> Corner case test
 * with [] empty array or an array with one element like [3] or [2]
 */
public class LC27 {

  // int[] nums = {3,2,2,3}; // Input: nums = [3,2,2,3], val = 3 // Output: 2, nums = [2,2,_,_]
  // int elementToRemove = 3;

  // int[] nums = {0,1,2,2,3,0,4,2}; // Input: nums = [0,1,2,2,3,0,4,2], val = 2 // Output: 5, nums
  // = [0,1,4,0,3,_,_,_]
  // int elementToRemove = 2;

  /**
   * Time complexity: O(n) Space complexity: N\A
   *
   * @param nums
   * @param elementToRemove
   * @return first - number of not matched items of the array
   */
  public int removeElement(int[] nums, int elementToRemove) {
    int first = 0;
    for (int index = 0; index < nums.length; index++) {
      if (nums[index] != elementToRemove) {
        nums[first++] = nums[index];
      }
    }
    return first;
  }
}
