package lesson_5;

public class Main {

  static final int size = 10000000;
  static final int h = size / 2;


  public static void main(String[] args) {
    firstMethod(size);
    secondMethod(size);
  }

  private static void firstMethod(int size) {
    float[] arr = new float[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 1;
    }
    long a = System.currentTimeMillis();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }

    System.out.println("One thread time: " + (System.currentTimeMillis() - a) + " ms.");

  }

  private static void secondMethod(int size) {
    float[] arr = new float[size];
    float[] a1 = new float[h];
    float[] a2 = new float[h];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = 1;
    }
    long a = System.currentTimeMillis();

    System.arraycopy(arr, 0, a1, 0, h);
    System.arraycopy(arr, h, a2, 0, h);

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < a1.length; i++) {
        arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 0; i < a2.length; i++) {
        arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

      }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.arraycopy(a1, 0, arr, 0, h);
    System.arraycopy(a2, 0, arr, h, h);


    System.out.println("Two thread time: " + (System.currentTimeMillis() - a) + " ms.");



  }
}
