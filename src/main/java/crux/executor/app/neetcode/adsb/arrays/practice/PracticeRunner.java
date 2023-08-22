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
  }
}
