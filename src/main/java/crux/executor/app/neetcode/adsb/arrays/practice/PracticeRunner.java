package crux.executor.app.neetcode.adsb.arrays.practice;

import static crux.executor.app.neetcode.utils.Util.*;

public class PracticeRunner {
  public static void main(String[] args) {
    fireStaticArrayOperations();
  }

  private static void fireStaticArrayOperations() {
    StaticArrayOperations operations = new StaticArrayOperations();
    int[] readArray = {3, 2, 4, 5, 2, 8};
    int readIndex = 2;

    line();
    heading("Read or get an element by index 2");
    console(readArray);
    int value = operations.getElementOfIndex(readArray, readIndex);
    console(String.format("Array Index %s has Value %s\n", readIndex, value));

    line();
    heading("Remove an element by index 3, so value 5 will be zero");
    readIndex = 3;
    operations.removeElementOfIndex(readArray, readIndex);
    console(readArray);

    line();
    heading("Add element at the end of an array if empty space found");
    int[] endArray = new int[5];
    int length = endArray.length;
    int itemCount = 3;
    heading(
        "Let's consider we have already three elements in the array index 0,1,2 like below, so itemCount is 3 and array length is 5 as declared");
    endArray[0] = 1;
    endArray[1] = 2;
    endArray[2] = 3;

    console(endArray);
    heading("want to add 9 in the 3rd position of the array");
    operations.addElementAtTheEnd(endArray, length, itemCount, 9);
    console(endArray);

    line();
    heading("Remove element at the end of an array");
    int[] removeArray = {1, 2, 3, 4};
    int removeArrayLength = removeArray.length;
    console(removeArray);
    heading("Want to remove last item of the array, and it will be zero as default value");
    operations.removeElementAtTheEnd(removeArray, removeArrayLength);
    console(removeArray);

    line();
    heading("Add element at any valid index of the array");
    int[] anyArray = new int[6];
    anyArray[0] = 1;
    anyArray[1] = 2;
    anyArray[2] = 3;
    anyArray[3] = 4;
    anyArray[4] = 5;
    int anyArrayLength = anyArray.length;
    int targetIndex = 2;
    int itemWantToAdd = 9;
    console(anyArray);
    heading(
        "Want to add element 9 at index 2 which currently contains value 3 we will be 9 and remaining values will shift to the right");
    operations.addElementAtTargetIndex(anyArray, anyArrayLength, targetIndex, itemWantToAdd);
    console(anyArray);

    line();
    heading("Remove element at any valid index of the array");
    int[] deleteArray = {1, 2, 3, 4, 5};
    int deleteArrayLength = deleteArray.length;
    int deleteIndex = 1;
    console(deleteArray);
    heading(
        "Want to remove element 2 at index 1 and remaining values will shift to the left and blank indexes will fill with default value 0");
    operations.removeElementAtTargetIndex(deleteArray, deleteArrayLength, deleteIndex);
    console(deleteArray);
  }
}
