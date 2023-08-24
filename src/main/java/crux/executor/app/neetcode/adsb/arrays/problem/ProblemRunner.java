package crux.executor.app.neetcode.adsb.arrays.problem;

public class ProblemRunner {
  public static void main(String[] args) {
    //fireLC26();
    fireLC27();
  }

  private static void fireLC27() {
    LC27 lc27 = new LC27();
    //int[] nums = {3,2,2,3}; // Input: nums = [3,2,2,3], val = 3 // Output: 2, nums = [2,2,_,_]
    //int elementToRemove = 3;

    int[] nums = {0,1,2,2,3,0,4,2}; // Input: nums = [0,1,2,2,3,0,4,2], val = 2 // Output: 5, nums = [0,1,4,0,3,_,_,_]
    int elementToRemove = 2;

    int numberOfNotMatched = lc27.removeElement(nums, elementToRemove);
    System.out.println("numberOfNotMatched = " + numberOfNotMatched);
  }

  private static void fireLC26() {
    LC26 lc26 = new LC26();
    //int[] nums = {1, 1, 2}; // Output: 2, nums = [1,2,_]
    int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    int k = lc26.removeDuplicates(nums);
    System.out.println("k = " + k);
  }
}
