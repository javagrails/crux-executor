package crux.executor.app.neetcode.adsb.arrays.problem;

public class ProblemRunner {
  public static void main(String[] args) {
    fireLC26();
  }

  private static void fireLC26() {
    LC26 lc26 = new LC26();
    //int[] nums = {1, 1, 2}; // Output: 2, nums = [1,2,_]
    int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    int k = lc26.removeDuplicates(nums);
    System.out.println("k = " + k);
  }
}
