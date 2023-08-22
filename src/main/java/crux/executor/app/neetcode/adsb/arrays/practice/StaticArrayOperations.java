package crux.executor.app.neetcode.adsb.arrays.practice;

/**
 * Basic Array Operations
 *
 * <p>Read an array item like anyArray[index] Time Complexity is O(1) means constant time operation
 * & very efficient
 */
public class StaticArrayOperations {

  /**
   * Read/get an array item like anyArray[index] Time Complexity is O(1) means constant time
   * operation & very efficient
   *
   * @param readArray given array
   * @param readIndex the index to read data from given array
   * @return value of the given index if not found it returns 0
   */
  public int getElementOfIndex(int[] readArray, int readIndex) {
    if (readIndex < readArray.length) {
      return readArray[readIndex];
    }
    return 0;
  }

  /**
   * Remove an array item like anyArray[index]=0 Time Complexity is O(1) means constant time
   * operation & very efficient
   *
   * @param readArray given array
   * @param readIndex the index to blank the value and it's default set zero
   */
  public void removeElementOfIndex(int[] readArray, int readIndex) {
    if (readIndex < readArray.length) {
      readArray[readIndex] = 0;
    }
  }
}
