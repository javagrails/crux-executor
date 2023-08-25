package crux.executor.app.neetcode.adsb.arrays.problem;

/**
 * <strong>Easy</strong> Problem here
 *
 * <p><a href="https://leetcode.com/problems/concatenation-of-array">1929. Concatenation of
 * Array</a>
 */
public class LC1929 {

  // Example 1:
  // Input: nums = [1,2,1] // Output: [1,2,1,1,2,1]
  // Explanation: The array ans is formed as follows: ans =
  // [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]] ans = [1,2,1,1,2,1]

  // Example 2:
  // Input: nums = [1,3,2,1] Output: [1,3,2,1,1,3,2,1]
  // Explanation: The array ans is formed as follows: ans =
  // [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]] ans = [1,3,2,1,1,3,2,1]

  // Build an array of size 2 * n and assign num[i] to ans[i] and ans[i + n]

  /**
   * Time complexity: O(n) Space complexity: O(n)
   *
   * @param nums
   * @return ans - the new build array
   */
  public int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length * 2];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[i];
      ans[i + nums.length] = nums[i];
    }
    return ans;
  }
}
