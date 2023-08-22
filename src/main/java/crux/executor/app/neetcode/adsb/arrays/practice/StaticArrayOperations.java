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

  /**
   * Time complexity is O(n)
   *
   * @param anyArray given array
   * @param anyArrayLength given arry length
   * @param targetIndex the index where we want to add the element
   * @param itemWantToAdd the item we want to insert
   */
  public void addElementAtTargetIndex(
      int[] anyArray, int anyArrayLength, int targetIndex, int itemWantToAdd) {
    // length 6 target index 2
    // index       {0,1,2,3,4,5}
    // inputArray  {1,2,3,4,5,0}
    // outputArray {1,2,9,3,4,5}

    // Reverse loop way EASY
    for (int index = anyArrayLength - 1; index > targetIndex - 1; index--) {
      anyArray[index] = anyArray[index - 1];
    }

    // Forward loop way HARD but complexity sanme
    /*int currentValue = anyArray[targetIndex];
    for (int index = targetIndex; index < anyArrayLength - 1; index++) {
      int nextValue = anyArray[index + 1];
      anyArray[index + 1] = currentValue;
      currentValue = nextValue;
    }*/

    anyArray[targetIndex] = itemWantToAdd;
  }

  /**
   * Time complexity is O(n)
   *
   * @param deleteArray is an array where we apply the operation
   * @param deleteArrayLength is the length of the given array
   * @param deleteIndex the targeted index which element we will delete or remove
   */
  public void removeElementAtTargetIndex(
      int[] deleteArray, int deleteArrayLength, int deleteIndex) {
    // length 5 target index 1
    // index       {0,1,2,3,4}
    // inputArray  {1,2,3,4,5}
    // outputArray {1,3,4,5,5} or {1,3,4,5,0}

    for (int index = deleteIndex; index < deleteArrayLength - 1; index++) {
      deleteArray[index] = deleteArray[index + 1];
    }
    if (deleteIndex != deleteArrayLength - 1) {
      deleteArray[deleteArrayLength - 1] = 0;
    }
  }
}
