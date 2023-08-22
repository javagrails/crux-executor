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

  /**
   * Time complexity is O(1) because it put/write data in targeted index
   *
   * @param inputArray is the given array
   * @param length is the total allocated sequential memory of given array
   * @param itemCount is the number of item already in the array
   * @param itemWantToAdd
   */
  public void addElementAtTheEnd(int[] inputArray, int length, int itemCount, int itemWantToAdd) {
    if (itemCount < length) {
      inputArray[itemCount] = itemWantToAdd;
    }
  }

  /**
   * Time complexity is O(1)
   *
   * @param readArray given array
   * @param removeArrayLength length of given array
   */
  public void removeElementAtTheEnd(int[] readArray, int removeArrayLength) {
    if (removeArrayLength > 0) {
      readArray[removeArrayLength - 1] = 0;
    }
  }
}
