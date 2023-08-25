package crux.executor.app.neetcode.onefifty;

public class OneFiftyRunner {
  public static void main(String[] args) {
    fireLC217();
  }

  private static void fireLC217() {
    LC217 lc217 = new LC217();
    // int[] nums = {1,2,3,1};
    //int[] nums = {1, 2, 3, 4};
    int[] nums = {1,1,1,3,3,4,3,2,4,2};
    boolean found = lc217.containsDuplicate(nums);
    System.out.println("found = " + found);
  }
}
