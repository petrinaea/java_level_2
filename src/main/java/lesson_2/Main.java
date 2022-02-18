package lesson_2;

import java.util.Arrays;

public class Main {

  public static void main(String[] args)  {

    String[][] array = {{"1", "2", "1", "2"},
            {"1", "2", "1", "2"},
            {"1", "5", "1", "2"},
            {"1", "2", "1", "2"},
            {"1", "2", "1", "2"}};

    String[][] array2 = {{"5", "2", "1", "2"},
            {"1", "2", "1", "2"},
            {"1", "5", "ll", "2"},
            {"1", "2", "1", "2"}};

    try {
      try {
        int output = twoArr(array2);
        System.out.println(output);
      } catch (MyArraySizeException e) {
        System.out.println(e.getMessage());
      }
    }
    catch (MyArrayDataException e) {
      int row = e.row;
      int col = e.col;
      System.out.println("Incorrect data type in " + '[' + row + ']' +  '[' +  col + ']');

    }

  }

  private static int twoArr(String[][] array) throws MyArrayDataException, MyArraySizeException {
    int sum = 0;
    if (array.length != 4) {throw new MyArraySizeException();}

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        try {
          sum += Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException(i, j);

        }
      }
    }
    return sum;
  }
}


