package crux.executor.app.neetcode.utils;

public class Util {
  private static final String SET_PLAIN_TEXT = "\033[0;0m";
  private static final String SET_BOLD_TEXT = "\033[0;1m";

  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_YELLOW = "\u001B[33m";

  public static String printPrimitiveArrayInformation(int[] array) {
    StringBuilder builder = new StringBuilder();
    builder.append("Array   Length : " + array.length + "\n");
    builder.append("Array  Indexes : " + printIndexes(array) + "\n");
    // builder.append("Position Arrow : " + printArrow(array) + "\n");
    builder.append("Array Elements : [");
    for (int i = 0; i < array.length; i++) {
      builder.append(array[i]);
      if (i != (array.length - 1)) {
        builder.append(",");
      }
    }
    builder.append("]");
    builder.append("\n");
    return builder.toString();
  }

  private static String printArrow(int[] array) {
    StringBuilder builder = new StringBuilder();
    builder.append(" ");
    for (int i = 0; i < array.length; i++) {
      builder.append("↓");
      if (i != (array.length - 1)) {
        builder.append(",");
      }
    }
    builder.append(" ");
    return builder.toString();
  }

  private static String printIndexes(int[] array) {
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    for (int i = 0; i < array.length; i++) {
      builder.append(red(i + ""));
      if (i != (array.length - 1)) {
        builder.append(",");
      }
    }
    builder.append("]");
    return builder.toString();
  }

  public static void line() {
    System.out.println(bold("********************************************************************"));
  }

  public static void heading(String input) {
    System.out.println(bold(input));
  }

  public static void console(String input) {
    System.out.println(input);
  }

  public static void console(int[] inputArray) {
    console(printPrimitiveArrayInformation(inputArray));
  }

  public static String bold(String input) {
    // http://www.java2s.com/example/java-utility-method/terminal-bold-output/bold-string-str-6d96c.html
    // System.out.println("normal "+ SET_BOLD_TEXT + "salman 36" + SET_PLAIN_TEXT + " again
    // normal");
    return SET_BOLD_TEXT + input + SET_PLAIN_TEXT;
  }

  // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
  public static String red(String input) {
    return ANSI_RED + input + ANSI_RESET;
  }
}
