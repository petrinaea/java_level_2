package lesson_2;

public class MyArrayDataException extends Exception{

  public int row;
  public int col;

  MyArrayDataException(int row, int col) {
    this.row = row;
    this.col = col;

  }

}

