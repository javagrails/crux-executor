package crux.executor.app.neetcode.adsb.arrays.problem;

public class LC26 {

  // int[] nums = {1, 1, 2}; // Output: 2, nums = [1,2,_]
  // int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

  // {0,0,1,1,1,2,2,3,3,4}
  // {0,0,1,1,1,2,2,3,3,4}
  // {0,0,1,1,1,2,2,3,3,4}

  // {1, 1, 2}
  // {1, 1, 2}
  // {1, 1, 2}

  public int removeDuplicates(int[] nums) {
    int count = 1;
    int next = 0;
    for (int index = 0; index < nums.length - 1; index++) {
      if (nums[index] != nums[index + 1]) {
        nums[next++] = nums[index];
        count++;
      }
    }
    nums[next++] = nums[nums.length - 1];
    return count;
  }
}
