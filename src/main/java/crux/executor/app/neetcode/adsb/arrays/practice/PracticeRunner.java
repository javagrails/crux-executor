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
  }
}
