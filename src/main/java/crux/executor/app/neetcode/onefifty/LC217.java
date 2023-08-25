package crux.executor.app.neetcode.onefifty;

import java.util.HashSet;
import java.util.Set;

/**
 * <strong>Easy</strong> Problem here
 *
 * <p><a href="https://leetcode.com/problems/contains-duplicate">217. Contains Duplicate</a>
 */
public class LC217 {

  // int[] nums = {1,2,3,1}; Output: true
  // int[] nums = {1, 2, 3, 4}; Output: false
  // int[] nums = {1,1,1,3,3,4,3,2,4,2}; Output: true

  /**
   * Time complexity: O(n) Space complexity: O(n)
   *
   * @param nums
   * @return
   */
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int index = 0; index < nums.length; index++) {
      if (set.contains(nums[index])) {
        return true;
      }
      set.add(nums[index]);
    }
    return false;
  }
}
