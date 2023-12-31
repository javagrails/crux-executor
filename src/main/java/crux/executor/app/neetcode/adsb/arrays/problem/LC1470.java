package crux.executor.app.neetcode.adsb.arrays.problem;

/**
 * <strong>Easy</strong> Problem here
 *
 * <p><a href="https://leetcode.com/problems/shuffle-the-array">1470. Shuffle the Array</a>
 */
public class LC1470 {

  // Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
  // int[] nums = {2,5,1,3,4,7}; // Input: nums = [2,5,1,3,4,7], n = 3 // Output: [2,3,5,4,1,7]
  // int[] nums = {1,2,3,4,4,3,2,1}; // Input: nums = [1,2,3,4,4,3,2,1], n = 4 // Output:
  // [1,4,2,3,3,2,4,1]
  // int[] nums = {1,1,2,2}; // Input: nums = [1,1,2,2], n = 2 // Output: [1,2,1,2]

  // Use two pointers to create the new array of 2n elements.
  // The first starting at the beginning and the other starting at (n+1)th position.
  // Alternate between them and create the new array.

  /**
   * Time complexity: O(n) Space complexity: O(n)
   * https://leetcode.com/problems/shuffle-the-array/solutions/3956445/analysis
   *
   * @param nums
   * @param n
   * @return answer - the new array where data places according to the given instructions
   */
  public int[] shuffle(int[] nums, int n) {
    int[] answer = new int[2 * n];
    // Solution one
    /*for (int index = 0; index < n; index++) {
      answer[2*index] = nums[index];
      answer[(2*index)+1] = nums[index+n];
    }*/

    // Solution 2
    int position = 0;
    for (int index = 0; index < n; index++) {
      answer[position++] = nums[index];
      answer[position++] = nums[index + n];
    }
    return answer;
  }
}
